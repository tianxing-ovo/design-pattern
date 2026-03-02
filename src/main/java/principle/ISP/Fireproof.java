package principle.ISP;

/**
 * 防火
 *
 * @author tianxing
 */
public interface Fireproof {
    default void fireproof() {
        System.out.println("防火");
    }
}
