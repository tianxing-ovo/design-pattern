package behavioral.strategy;

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
        salesman.setStrategy(new StrategyC());
        salesman.show();
    }
}
