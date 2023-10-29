package 行为型模式.策略模式;

public class Client {
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
