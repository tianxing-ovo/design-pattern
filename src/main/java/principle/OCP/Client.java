package principle.OCP;

public class Client {
    public static void main(String[] args) {
        SogouKeyboard sogouKeyboard = new SogouKeyboard(new DefaultSkin());
        // 默认皮肤
        sogouKeyboard.display();
        sogouKeyboard.setSkin(new BlueSkin());
        // 云水蓝皮肤
        sogouKeyboard.display();
    }
}
