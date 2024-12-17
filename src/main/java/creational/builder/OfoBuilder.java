package creational.builder;

/**
 * 具体构建类
 *
 * @author tianxing
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
