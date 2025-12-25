package behavioral.strategy;

/**
 * Concrete Strategy(具体策略类)
 *
 * @author tianxing
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
