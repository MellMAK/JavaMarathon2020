package Tests.day13;

import Tests.AbstractTest;
import day13.MessageDatabase;
import day13.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day13MessageDatabaseTest extends AbstractTest {

    @AfterEach
    public void init() {
        MessageDatabase.getMessages().clear();
    }

    @Test
    void addNewMessage() {
        User a = new User("a");
        User b = new User("b");
        MessageDatabase.sendMessage(a, b, "hi");
        Assertions.assertEquals(1, MessageDatabase.getMessages().size(),
                "User1 sends a message to user2. Number of messages in the database");
    }

    @Test
    void showDialog() {
        User user1 = new User("user1");
        User user2 = new User("user2");

        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "Hi, user1!");
        MessageDatabase.showDialog(user1, user2);

        Assertions.assertEquals("user1: How are you?" + System.lineSeparator()
                        + "user2: Hi, user1!" + System.lineSeparator(), getOutput(),
                "user1: How are you? user2: Hi, user1!");
    }

}