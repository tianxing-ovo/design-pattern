package principle.crp;

/**
 * 汽油车
 *
 * @author tianxing
 */
public class PetrolCar extends Car {

    public PetrolCar(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println(color.getColor() + "汽油车移动");
    }
}
