package behavioral.strategy;

import java.util.ServiceLoader;

/**
 * 应用场景: 支付系统 排序算法 图像处理 路由器设置 游戏开发
 */
public class Main {
    public static void main(String[] args) {
        // 买一送一
        Salesman salesman = new Salesman(new StrategyA());
        salesman.show();
        // 满200减50
        salesman.setStrategy(new StrategyB());
        salesman.show();
        // 满1000元加一元换购任意200元一下商品
        salesman.show(new StrategyC());
        // 使用SPI(Service Provider Interface)机制加载所有Strategy实现类实例
        ServiceLoader<Strategy> loader = ServiceLoader.load(Strategy.class);
        for (Strategy strategy : loader) {
            salesman.show(strategy);
        }
    }
}
