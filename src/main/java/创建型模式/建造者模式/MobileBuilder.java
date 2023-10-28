package 创建型模式.建造者模式;

/**
 * 具体构建类-构建摩拜单车
 */
public class MobileBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}
