package behavioral.strategy;

/**
 * Concrete Strategy(具体策略类)
 */
public class ConcreteStrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
