package principle.LSP;

/**
 * @author tianxing
 */
public class Client {
    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle rectangle = new Rectangle(20, 10);
        // 调用方法进行扩宽操作
        resize(rectangle);
        // Rectangle(length=20.0, width=21.0)
        System.out.println(rectangle);
        // 创建正方形对象
        Square square = new Square(10);
        // Square(side=10.0)
        System.out.println(square);
    }

    /**
     * 扩宽
     *
     * @param rectangle 长方形
     */
    public static void resize(Rectangle rectangle) {
        // 如果宽比长小则进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
}
