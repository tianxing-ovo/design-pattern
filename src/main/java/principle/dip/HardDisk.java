package principle.dip;

/**
 * 硬盘
 *
 * @author tianxing
 */
public interface HardDisk {

    void save(String data);

    String get();
}
