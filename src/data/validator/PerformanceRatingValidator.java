/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.validator;

import data.Employee;

/**
 *
 * @author sscerbatiuc
 */
public class PerformanceRatingValidator implements Validate{

    @Override
    public boolean check(Employee emp) {
        return emp.getPerformanceRating() >= 5;
    }
    
}
