/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithlamdas;

import data.Employee;
import data.validator.PerformanceRatingValidator;
import data.validator.Validate;
import java.util.ArrayList;

/**
 *
 * @author sscerbatiuc
 */
public class WorkingWithLamdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1 = new Employee("Ion", 2, 2000);
        Employee e2 = new Employee("Petru", 6, 5000);
        Employee e3 = new Employee("Vasile", 4, 4320);
        Employee e4 = new Employee("Adela", 8, 6500);

        ArrayList<Employee> empArrList = new ArrayList<>();
        empArrList.add(e1);
        empArrList.add(e2);
        empArrList.add(e3);
        empArrList.add(e4);

        Validate performaceValidator = (Employee e) -> e.getPerformanceRating() >= 5;
        Validate avgSalaryValidator = employee -> employee.getSalary() >= 4200;
        System.out.println("----------------------- Performance validator ---------------------");
        filter(empArrList, performaceValidator, "performance validation (>=5)");
        System.out.println("------------------------ Salary validation ------------------------");
        filter(empArrList, avgSalaryValidator, "avg salary validation (>=4200)");
    }

    public static void filter(ArrayList<Employee> arrList, Validate rule, String message) {
        for (Employee emp : arrList) {
            if (rule.check(emp)) {
                System.out.println(emp + " passed " + message);
            } else {
                System.err.println(emp + " did not pass " + message);
            }
        }
    }

}
