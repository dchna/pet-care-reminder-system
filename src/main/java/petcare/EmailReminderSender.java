package petcare;
public class EmailReminderSender implements ReminderSender {
    @Override
    public void send(String message, int petId) {
        System.out.println("Email for pet "
                + petId + ": " + message);
    }
}