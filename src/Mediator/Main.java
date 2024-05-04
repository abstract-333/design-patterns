package Mediator;

public class Main {
    public static void main(String[] args) throws Exception {
        IChatMediator mediator = new ChatMediator();
        User userMark = new UserImpl(mediator, "Mark");
        User userJohn = new UserImpl(mediator, "John");
        User userAbraham = new UserImpl(mediator, "Abraham");
        mediator.addUser(userMark);
        mediator.addUser(userJohn);
        mediator.addUser(userAbraham);

        userMark.send("Hi by Mark");
        userJohn.send("Hi by John");

    }
}
