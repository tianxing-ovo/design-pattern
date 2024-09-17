package principle.ISP;

/**
 * 防盗
 */
public interface AntiTheft {
    default void antiTheft() {
        System.out.println("防盗");
    }
}
