package com.validation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Department (CSE, EEE, BBA, ENG): ");
            String dept = sc.nextLine();

            // Calling validation method
            Validator.validate(age, dept);

        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (InvalidDeptException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Validation process finished.");
        }
    }
}
