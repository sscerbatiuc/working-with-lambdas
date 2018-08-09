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
@FunctionalInterface
public interface Validate {

    boolean check(Employee emp);
    
}
