package programs.interfaceandabstractclass;

public class DonationImpl extends Donation {
    @Override
    void pay() {
        System.out.println("pay implementation");
    }
}

/* [Not allowed, can not extend multiple classes]
public class DonationImpl extends Donation, Donation2 {
    @Override
    void pay() {

    }
}
 */
