package principle.SRP;

import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * 负责操作数据库中的Customer表
 */
@AllArgsConstructor
public class CustomerDAO {

    private DBUtil util;


    /**
     * 查询所有的客户信息
     *
     * @return {@link List }<{@link String }>
     * @throws SQLException sqlexception
     */
    public List<String> findCustomers() throws SQLException {
        // 建立数据库连接
        Connection connection = util.getConnection();
        // 查询所有的客户信息
        List<String> customerList = Arrays.asList("客户1", "客户2");
        // 关闭数据库连接
        connection.close();
        return customerList;
    }


    /**
     * 创建客户信息
     *
     * @throws SQLException sqlexception
     */
    public void createCustomers() throws SQLException {
        // 建立数据库连接
        Connection connection = util.getConnection();
        // 创建客户信息
        System.out.println("创建客户信息");
        // 关闭数据库连接
        connection.close();
    }
}
