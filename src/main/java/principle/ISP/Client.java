package principle.ISP;

public class Client {
    public static void main(String[] args) {
        SafetyDoor safetyDoor = new SafetyDoor();
        safetyDoor.antiTheft();
        safetyDoor.fireproof();
        safetyDoor.waterproof();
    }
}
