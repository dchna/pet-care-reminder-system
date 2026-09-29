package petcare;
public interface ReminderSender {
    void send(String message, int petId) throws ReminderException;
}