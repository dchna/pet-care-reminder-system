package petcare;
public abstract class PetReminder {
    protected ReminderSender sender;
    public PetReminder(ReminderSender sender) {
        this.sender = sender;
    }
    public abstract void remind(int petId)
            throws ReminderException;
}