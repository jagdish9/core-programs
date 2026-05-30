package programs.company.bookingcom;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        List<EmpBooking> empBookingList = new ArrayList<>();
        empBookingList.add(new EmpBooking("Vijay", "vijay1@gmail.com"));
        empBookingList.add(new EmpBooking("Vijay", "vijay1@gmail.com"));

        System.out.println(empBookingList.size());
    }
}

class EmpBooking {
    private String name;
    private String email;

    public EmpBooking(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmpBooking that = (EmpBooking) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
