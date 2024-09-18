package principle.CRP;

public class Client {
    public static void main(String[] args) {
        Red red = new Red();
        White white = new White();
        PetrolCar petrolCar = new PetrolCar(red);
        ElectricCar electricCar = new ElectricCar(red);
        // 红色汽油车移动
        petrolCar.move();
        // 红色电动汽车移动
        electricCar.move();
        // 白色汽油车移动
        petrolCar.setColor(white);
        petrolCar.move();
        // 白色电动汽车移动
        electricCar.setColor(white);
        electricCar.move();
    }
}
