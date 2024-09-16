package principle.LSP;

import lombok.Data;

/**
 * 正方形
 */
@Data
public class Square implements Quadrilateral{

    private double side;

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
