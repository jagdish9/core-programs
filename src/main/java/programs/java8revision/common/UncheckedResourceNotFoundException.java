package programs.java8revision.common;

public class UncheckedResourceNotFoundException extends RuntimeException {
    public UncheckedResourceNotFoundException(String message) {
        super(message);
    }
}

class HandleUncheckExample {
    /*public User getUser(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> {
                    new UncheckedResourceNotFoundException("User not found with id: "+ id);
                });
    }*/
}

/*
✔ No need to declare throws
✔ Most common in Spring Boot
 */
