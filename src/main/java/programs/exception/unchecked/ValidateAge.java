package programs.exception.unchecked;

public class ValidateAge {

    private static void validate(int age) {
        if(age < 18) {
            throw new InvalidAgeRuntimeException("Age must be above 18");
        }
    }

    public static void main(String[] args) {
        validate(17);
    }
}

/*
Key Points
    No need to handle explicitly
    Compiler does NOT enforce handling
*/
