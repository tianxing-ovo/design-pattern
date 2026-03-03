package principle.isp;

/**
 * 防水
 *
 * @author tianxing
 */
public interface Waterproof {
    default void waterproof() {
        System.out.println("防水");
    }
}
