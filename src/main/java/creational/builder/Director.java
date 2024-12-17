package creational.builder;

import lombok.AllArgsConstructor;

/**
 * 指挥者类
 *
 * @author tianxing
 */
@AllArgsConstructor
public class Director {

    private Builder builder;

    /**
     * 构建自行车
     */
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.getBike();
    }
}
