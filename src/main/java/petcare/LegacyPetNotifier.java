package petcare;
public class LegacyPetNotifier {
    public int sendOldAlert(int petId, long time, String text) {
        if (petId <= 0) {
            return -1;
        }
        if (text == null || text.isEmpty()) {
            return -2;
        }
        System.out.println(
                "Legacy for pet "
                        + petId
                        + " at "
                        + time
                        + ": "
                        + text
        );
        return 0;
    }
}