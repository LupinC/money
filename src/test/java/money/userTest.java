package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class userTest {

    @Test
    public void test1(){

        user user = new user();
        user.addUser("Jimmy");
        user.addUser("Lily");
        user.addUser("Macro");

        int a = user.numberOfUsers();

        user.removeUser("Jimmy");

        int b = user.numberOfUsers();

        assertEquals(3,a);
        assertEquals(2,b);

        assertEquals(false,user.isEmpty());

    }


    @Test
    public void test2(){

        user user = new user();

        assertEquals(0, user.numberOfUsers());

        assertEquals(true, user.isEmpty());

    }
}
