package principle.SRP;

import lombok.AllArgsConstructor;

import java.sql.SQLException;

/**
 * 负责图表的生成和显示
 */
@AllArgsConstructor
public class CustomerDataChart {

    private CustomerDAO dao;

    /**
     * 创建图表
     */
    public void createChart() throws SQLException {
        dao.createCustomers();
    }

    /**
     * 显示图表
     */
    public void displayChart() throws SQLException {
        System.out.println(dao.findCustomers());
    }
}
