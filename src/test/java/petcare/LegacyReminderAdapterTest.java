package petcare;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LegacyReminderAdapterTest {
    @Test
    void adapterTranslatesLegacyError() {
        LegacyPetNotifier legacy = new LegacyPetNotifier();
        ReminderSender adapter = new LegacyReminderAdapter(legacy);
        ReminderException exception = assertThrows(
                ReminderException.class,
                () -> adapter.send("Feed pet", -1)
        );
        assertEquals(
                "Invalid pet id",
                exception.getMessage()
        );
    }
}