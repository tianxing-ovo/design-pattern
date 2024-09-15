package principle.OCP;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 搜狗输入法
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class SogouKeyboard {

    private AbstractSkin skin;

    public void display() {
        skin.display();
    }
}
