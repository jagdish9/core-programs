package programs.java17.record;

public record User(String name, int age) {
}

/*
Auto-generates:
constructor
getters
equals(), hashCode()
toString()

✅ Why important
Perfect for DTOs in microservices
Less boilerplate
 */