package petcare;
public class LegacyReminderAdapter implements ReminderSender {
    private final LegacyPetNotifier legacyNotifier;
    public LegacyReminderAdapter(LegacyPetNotifier legacyNotifier) {
        this.legacyNotifier = legacyNotifier;
    }
    @Override
    public void send(String message, int petId)
            throws ReminderException {
        long time = System.currentTimeMillis();
        int result = legacyNotifier.sendOldAlert(
                petId,
                time,
                message
        );
        if (result == -1) {
            throw new ReminderException("Invalid pet id");
        }
        if (result == -2) {
            throw new ReminderException("Message is empty");
        }
        if (result != 0) {
            throw new ReminderException("Unknown legacy error");
        }
    }
}