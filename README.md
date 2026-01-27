package validation;

public class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}
package validation;

public class Validator {
    public static void validateAge(int age) throws InvalidDataException {
        if (age < 18 || age > 60) {
            throw new InvalidDataException("Error: Age must be between 18 and 60.");
        }
    }

    public static void validateDept(String dept) throws InvalidDataException {
        if (!(dept.equalsIgnoreCase("CSE") || dept.equalsIgnoreCase("EEE") || dept.equalsIgnoreCase("BBA"))) {
            throw new InvalidDataException("Error: Invalid Department. Only CSE, EEE, and BBA are allowed.");
        }
    }
}
