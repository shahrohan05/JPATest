package com.rohandev.model;

import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(name = "employee_seq")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private Long salary;

    @Column(name = "age")
    private Integer age;

    @OneToMany(mappedBy = "employee")
    private Set<EmployeeAddress> employeeAddresses;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany(mappedBy = "employees")
    private Set<Course> courses = new LinkedHashSet<>();

    /*public Set<Course> getCourses() {
        return courses;
    }*/

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Set<EmployeeAddress> getEmployeeAddresses() {
        return employeeAddresses;
    }

    public void setEmployeeAddresses(Set<EmployeeAddress> employeeAddress) {
        this.employeeAddresses = employeeAddress;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Employee employee = (Employee) o;
        return id != null && Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}