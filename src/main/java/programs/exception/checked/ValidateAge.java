package programs.exception.checked;

public class ValidateAge {

    private static void validate(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Age must be above 18");
        }
    }

    public static void main(String[] args) throws InvalidAgeException{
        /*try {
            validate(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }*/

        validate(15);
    }
}

/*
Key Points
    Compiler forces handling
    Must use:
        try-catch OR
        throws
*/
