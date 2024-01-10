package 创建型模式.建造者模式;

import lombok.Data;
import lombok.ToString;

/**
 * 产品类-自行车
 */
@Data
@ToString
public class Bike {
    private String frame;//车架
    private String seat;//车座
}
