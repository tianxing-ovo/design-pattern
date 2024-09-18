package principle.CRP;

/**
 * 电动汽车
 */
public class ElectricCar extends Car {

    public ElectricCar(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println(color.getColor() + "电动汽车移动");
    }
}
