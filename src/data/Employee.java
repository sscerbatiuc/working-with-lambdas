/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author sscerbatiuc
 */
public class Employee extends Person{

    String name;
    int performanceRating;
    double salary;

    public Employee(String name, int performanceRating, double salary) {
        this.name = name;
        this.performanceRating = performanceRating;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" 
                + "name=" + name 
                + ", performanceRating=" + performanceRating 
                + ", salary=" + salary + "}";
    }

}
