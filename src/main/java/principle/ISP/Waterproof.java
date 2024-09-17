package principle.ISP;

/**
 * 防水
 */
public interface Waterproof {
    default void waterproof() {
        System.out.println("防水");
    }
}
