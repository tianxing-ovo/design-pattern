package behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 售货员(context)
 */
@AllArgsConstructor
@Data
public class Salesman {
    private Strategy strategy;

    public void show() {
        strategy.show();
    }
}
