package behavioral.strategy;

import java.util.ServiceLoader;

/**
 * 应用场景: 支付系统 排序算法 图像处理 路由器设置 游戏开发
 *
 * @author tianxing
 */
public class Main {
    public static void main(String[] args) {
        // 构造方法设置具体策略类
        Context context = new Context(new ConcreteStrategyA());
        // 成员变量方式调用(输出: 买一送一)
        context.show();
        // Setter方法设置具体策略类
        context.setStrategy(new ConcreteStrategyB());
        // 成员变量方式调用(输出: 满200减50)
        context.show();
        // 方法参数方式调用(输出: 满1000元加一元换购任意200元以下商品)
        context.show(new ConcreteStrategyC());
        // 使用SPI(Service Provider Interface)机制加载所有Strategy实现类实例
        ServiceLoader<Strategy> loader = ServiceLoader.load(Strategy.class);
        for (Strategy strategy : loader) {
            context.show(strategy);
        }
    }
}
