package principle.LSP;

public class Client {
    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle rectangle = new Rectangle(20, 10);
        // 调用方法进行扩宽操作
        resize(rectangle);
        System.out.println(rectangle);
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
