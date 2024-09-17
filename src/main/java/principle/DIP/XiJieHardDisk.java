package principle.DIP;

/**
 * 希捷硬盘
 */
public class XiJieHardDisk implements HardDisk {

    private String data;

    @Override
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据");
        this.data = data;
    }

    @Override
    public String get() {
        return "使用希捷硬盘获取数据:" + data;
    }
}
