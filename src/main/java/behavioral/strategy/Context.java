package behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * Context(环境类)
 *
 * @author tianxing
 */
@AllArgsConstructor
@Setter
public class Context {
    private Strategy strategy;

    /**
     * 成员变量方式调用
     */
    public void show() {
        strategy.show();
    }

    /**
     * 方法参数方式调用
     *
     * @param strategy strategy 策略接口
     */
    public void show(Strategy strategy) {
        strategy.show();
    }
}
