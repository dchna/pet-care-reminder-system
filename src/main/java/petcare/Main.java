package petcare;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Choose sender: console, email or legacy"
        );
        String type = scanner.nextLine().trim();
        try {
            ReminderSender sender =
                    ReminderSenderFactory.create(type);
            PetReminder feeding =
                    new FeedingReminder(sender);
            PetReminder medicine =
                    new MedicineReminder(sender);
            feeding.remind(1);
            medicine.remind(1);
        } catch (ReminderException |
                 IllegalArgumentException e) {
            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
        scanner.close();
    }
}