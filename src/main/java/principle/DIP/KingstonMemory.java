package principle.DIP;

/**
 * 金士顿内存
 */
public class KingstonMemory implements Memory {

    @Override
    public void save() {
        System.out.println("使用金士顿内存条");
    }
}
