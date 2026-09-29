package petcare;
public class MedicineReminder extends PetReminder {
    public MedicineReminder(ReminderSender sender) {
        super(sender);
    }
    @Override
    public void remind(int petId)
            throws ReminderException {
        sender.send(
                "Time to give medicine",
                petId
        );
    }
}