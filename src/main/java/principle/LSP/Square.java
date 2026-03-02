package principle.LSP;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 正方形
 *
 * @author tianxing
 */
@Data
@AllArgsConstructor
public class Square implements Quadrilateral {

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