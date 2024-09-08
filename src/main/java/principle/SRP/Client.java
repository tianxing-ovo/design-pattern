package principle.SRP;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) throws SQLException {
        DBUtil util = new DBUtil();
        CustomerDAO dao = new CustomerDAO(util);
        CustomerDataChart customerDataChart = new CustomerDataChart(dao);
        customerDataChart.createChart();
        customerDataChart.displayChart();
    }
}
