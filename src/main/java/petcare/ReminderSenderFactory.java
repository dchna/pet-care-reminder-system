package petcare;

public class ReminderSenderFactory {
    public static ReminderSender create(String type) {
        if (type.equalsIgnoreCase("console")) {
            return new ConsoleReminderSender();
        }
        if (type.equalsIgnoreCase("email")) {
            return new EmailReminderSender();
        }
        if (type.equalsIgnoreCase("legacy")) {
            return new LegacyReminderAdapter(new LegacyPetNotifier());
        }
        throw new IllegalArgumentException("Unknown sender type");
    }
}