package com.validation;

import java.util.Arrays;
import java.util.List;

public class Validator {
    // Valid departments er list
    private static final List<String> VALID_DEPTS = Arrays.asList("CSE", "EEE", "BBA", "ENG");

    public static void validate(int age, String dept) throws InvalidAgeException, InvalidDeptException {
        // Age check: Age obossoi 18 er beshi hote hobe (Example logic)
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Error: Age must be between 18 and 60.");
        }

        // Department check: List e thakle valid, na thakle exception
        if (!VALID_DEPTS.contains(dept.toUpperCase())) {
            throw new InvalidDeptException("Error: Invalid Department name provided.");
        }
        
        System.out.println("Validation Successful! Age: " + age + ", Dept: " + dept);
    }
}
