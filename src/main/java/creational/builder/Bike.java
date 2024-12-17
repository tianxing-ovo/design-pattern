package creational.builder;

import lombok.Data;
import lombok.ToString;

/**
 * 产品类
 *
 * @author tianxing
 */
@Data
@ToString
public class Bike {
    /**
     * 车架
     */
    private String frame;
    /**
     * 车座
     */
    private String seat;
}
