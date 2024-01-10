package creational.builder;

/**
 * 抽象构建类
 */
public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();//构建车架

    public abstract void buildSeat();//构建车座

    public abstract Bike getBike();//构建自行车

}
