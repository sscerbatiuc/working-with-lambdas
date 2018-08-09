/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithlamdas;

import data.Employee;
import data.validator.Validate;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author sscerbatiuc
 */
public class WorkingWithPredicates {
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

        Predicate<Employee> performaceValidator = employee -> employee.getPerformanceRating() >= 5;
        Predicate salaryValidator = employee -> ((Employee) employee).getSalary()>= 4200;
        System.out.println("----------------------- Performance validator ---------------------");
        filter(empArrList, performaceValidator, "performance validation (>=5)");
        System.out.println("------------------------ Salary validation ------------------------");
        filter(empArrList, salaryValidator, "avg salary validation (>=4200)");
        System.out.println("------------------------ Remove if name starts with A -------------");
        testRemoveIfNameStartWithA(empArrList);
        System.out.println("------------------------ Other predicates examples   --------------");
        otherFunctionalOperators(empArrList);
        
    }

    public static void filter(ArrayList<Employee> arrList, Predicate predicate, String message) {
        for (Employee emp : arrList) {
            if (predicate.test(emp)) {
                System.out.println(emp + " passed " + message);
            } else {
                System.err.println(emp + " did not pass " + message);
            }
        }
    }
    
    public static void testRemoveIfNameStartWithA(ArrayList<Employee> empArrList){
        ArrayList<Employee> copy = new ArrayList<>(empArrList);
        for(Employee emp: copy){
            System.out.println(emp);
        }
        copy.removeIf(e -> e.getName().startsWith("A"));
        System.out.println("After removing-----");
         for(Employee emp: copy){
            System.out.println(emp);
        }
    }
    
    public static void otherFunctionalOperators(ArrayList<Employee> empArrList){
        for (int i = 0; i < empArrList.size(); i++) {
            System.out.println(empArrList.get(i));
            
        }
        for(Employee emp: empArrList){
            System.out.println(emp);
        }
        empArrList.forEach(emp -> {
            System.out.println(emp);
                });
    }
}
