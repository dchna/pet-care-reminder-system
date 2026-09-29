package petcare;
public class ConsoleReminderSender implements ReminderSender {
    @Override
    public void send(String message, int petId) {
        System.out.println("Console for pet "
                + petId + ": " + message);
    }
}