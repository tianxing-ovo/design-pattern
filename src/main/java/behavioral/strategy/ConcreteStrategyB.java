package behavioral.strategy;

/**
 * Concrete Strategy(具体策略类)
 */
public class ConcreteStrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200减50");
    }
}
