package principle.LOD;

import lombok.Setter;

/**
 * 经纪人
 */
@Setter
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public void meeting() {
        System.out.printf("%s与%s见面\n", fans.getName(), star.getName());
    }

    public void business() {
        System.out.printf("%s与%s洽谈业务\n", company.getName(), star.getName());
    }
}
