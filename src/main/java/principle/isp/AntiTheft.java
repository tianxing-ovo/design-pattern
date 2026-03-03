package principle.isp;

/**
 * 防盗
 *
 * @author tianxing
 */
public interface AntiTheft {
    default void antiTheft() {
        System.out.println("防盗");
    }
}
