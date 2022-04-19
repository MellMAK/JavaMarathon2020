package Tests.day13;

import day13.MessageDatabase;
import day13.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day13UserTest {

    @Test
    void subscribe() {
        User a = new User("a");
        User b = new User("b");
        a.subscribe(b);
        Assertions.assertEquals(1, a.getSubscriptions().size(), "User1 in "
                + "subscription list has 1 subscription");
    }

    @Test
    void isSubscribedTrue() {
        User a = new User("a");
        User b = new User("b");
        a.subscribe(b);
        Assertions.assertTrue(a.isSubscribed(b), "Is User1 following user2?");
    }

    @Test
    void isSubscribedFalse() {
        User a = new User("a");
        User b = new User("b");
        Assertions.assertFalse(a.isSubscribed(b), "User1 is not following user2?");
    }

    @Test
    void isFriendTrue() {
        User a = new User("a");
        User b = new User("b");
        a.subscribe(b);
        b.subscribe(a);
        Assertions.assertTrue(a.isFriend(b), "Users 1 and 2 are friends");
    }

    @Test
    void isFriendFalse() {
        User a = new User("a");
        User b = new User("b");
        a.subscribe(b);
        Assertions.assertFalse(a.isFriend(b), "Users 1 and 2 are not friends");
    }

    @Test
    void sendMessage() {
        User a = new User("a");
        User b = new User("b");
        a.sendMessage(b, "hi");
        Assertions.assertEquals(1, MessageDatabase.getMessages().size(),
                "User 1 sends a message to user 2. Number of messages in the database");
    }
}