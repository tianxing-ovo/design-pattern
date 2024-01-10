package behavioral.strategy;

/**
 * 策略实现类
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200减50");
    }
}
