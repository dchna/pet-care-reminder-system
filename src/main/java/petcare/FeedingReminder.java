package petcare;
public class FeedingReminder extends PetReminder {
    public FeedingReminder(ReminderSender sender) {
        super(sender);
    }
    @Override
    public void remind(int petId)
            throws ReminderException {
        sender.send(
                "Time to feed your pet",
                petId
        );
    }
}