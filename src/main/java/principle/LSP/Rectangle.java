package principle.LSP;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 长方形
 *
 * @author tianxing
 */
@Setter
@AllArgsConstructor
@ToString
public class Rectangle implements Quadrilateral {

    private double length;
    private double width;

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
