package programs.threadlocal;

public class UserContext {
    private static ThreadLocal<String> user = new ThreadLocal<>();

    public static void setUser(String username) {
        user.set(username);
    }

    public static String getUser() {
        return user.get();
    }

    public static void clear() {
        user.remove();
    }
}

/*
Problem:
Each request has a different user → don’t want to pass userId everywhere.

Solution:
Solution using ThreadLocal

Usage in filter - AuthFilter
 */
