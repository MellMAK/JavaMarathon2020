package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Roman Andriiv");
        User user2 = new User("Alina Vorobets");
        User user3 = new User("Stella Vorobets");

        user1.sendMessage(user2,"Hello Alina");
        user1.sendMessage(user2,"How are you?");

        user2.sendMessage(user1,"Hi, Roman.");
        user2.sendMessage(user1,"Thanks, I`m fine");
        user2.sendMessage(user1,"And You?");


        user3.sendMessage(user1,"Hello, Roman. It`s Stella.");
        user3.sendMessage(user1,"I saw you yesterday in the library.");
        user3.sendMessage(user1,"How are you?");


        user1.sendMessage(user3,"Hi Stella");
        user1.sendMessage(user3,"Yes, I was in the library yesterday. I was looking for some books about Java.");
        user1.sendMessage(user3,"And what about You? What did you looking for there?");

        user3.sendMessage(user1,"Something about neurosurgery");

        MessageDatabase.showDialog(user1, user3);


    }
}
