package 创建型模式.建造者模式;

/**
 * 具体构建类-构建ofo单车
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}
