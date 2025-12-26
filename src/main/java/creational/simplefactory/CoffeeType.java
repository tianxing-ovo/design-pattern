package creational.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 咖啡类型
 *
 * @author tianxing
 */
@AllArgsConstructor
@Getter
public enum CoffeeType {
    AMERICAN("美式咖啡"), LATTE("拿铁咖啡");
    private final String name;
}
