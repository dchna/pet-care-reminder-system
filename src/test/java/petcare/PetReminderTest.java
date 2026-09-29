package petcare;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PetReminderTest {
    static class FakeSender implements ReminderSender {
        String message;
        int petId;
        @Override
        public void send(String message, int petId) {
            this.message = message;
            this.petId = petId;
        }
    }
    @Test
    void feedingReminderDelegatesToSender()
            throws ReminderException {
        FakeSender sender = new FakeSender();
        PetReminder reminder = new FeedingReminder(sender);
        reminder.remind(5);
        assertEquals("Time to feed your pet", sender.message);
        assertEquals(5, sender.petId);
    }
    @Test
    void medicineReminderDelegatesToSender()
            throws ReminderException {
        FakeSender sender = new FakeSender();
        PetReminder reminder = new MedicineReminder(sender);
        reminder.remind(10);
        assertEquals("Time to give medicine", sender.message);
        assertEquals(10, sender.petId);
    }
}