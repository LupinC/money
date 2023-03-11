package money.paid;

import money.user;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class createBillsPaidTest extends user {


    @Test
    public void test1() {

        user user = new user();

        user.addUser("Jimmy");
        user.addUser("Lily");
        user.addUser("Marco");

        createBillsPaid paid = new createBillsPaid();

        paid.storePaid("Jimmy", 1000);
        assertEquals(1000, paid.total());

    }
}