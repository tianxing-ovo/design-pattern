package principle.ISP;

/**
 * 防火
 */
public interface Fireproof {
    default void fireproof() {
        System.out.println("防火");
    }
}
