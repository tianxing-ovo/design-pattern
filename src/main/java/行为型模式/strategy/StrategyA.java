package 行为型模式.策略模式;

/**
 * 策略实现类
 */
public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
