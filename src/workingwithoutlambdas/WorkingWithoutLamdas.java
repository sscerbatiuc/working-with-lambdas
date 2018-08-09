/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithoutlambdas;

import data.Employee;
import data.validator.SalaryValidator;
import data.validator.PerformanceRatingValidator;
import data.validator.Validate;
import java.util.ArrayList;

/**
 *
 * @author sscerbatiuc
 */
public class WorkingWithoutLamdas {

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
        System.out.println("----------------------- Performance validator ---------------------");
        filter(empArrList, new PerformanceRatingValidator());
        System.out.println("------------------------ Salary validation ------------------------");
        filter(empArrList, new SalaryValidator());
    }

    public static void filter(ArrayList<Employee> arrList, Validate rule) {
        for (Employee emp : arrList) {
            if (rule.check(emp)) {
                System.out.println(emp + " passed validation");
            } else {
                System.err.println(emp + " did not pass validation ");
            }
        }
    }

}
