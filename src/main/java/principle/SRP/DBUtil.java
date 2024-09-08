package principle.SRP;

import java.sql.*;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * 负责连接数据库
 */
public class DBUtil {

    public Connection getConnection() {
        return new Connection() {
            @Override
            public Statement createStatement() {
                return null;
            }

            @Override
            public PreparedStatement prepareStatement(String sql) {
                return null;
            }

            @Override
            public CallableStatement prepareCall(String sql) {
                return null;
            }

            @Override
            public String nativeSQL(String sql) {
                return "";
            }

            @Override
            public boolean getAutoCommit() {
                return false;
            }

            @Override
            public void setAutoCommit(boolean autoCommit) {

            }

            @Override
            public void commit() {

            }

            @Override
            public void rollback() {

            }

            @Override
            public void close() {

            }

            @Override
            public boolean isClosed() {
                return false;
            }

            @Override
            public DatabaseMetaData getMetaData() {
                return null;
            }

            @Override
            public boolean isReadOnly() {
                return false;
            }

            @Override
            public void setReadOnly(boolean readOnly) {

            }

            @Override
            public String getCatalog() {
                return "";
            }

            @Override
            public void setCatalog(String catalog) {

            }

            @Override
            public int getTransactionIsolation() {
                return Connection.TRANSACTION_NONE;
            }

            @Override
            public void setTransactionIsolation(int level) {

            }

            @Override
            public SQLWarning getWarnings() {
                return null;
            }

            @Override
            public void clearWarnings() {

            }

            @Override
            public Statement createStatement(int resultSetType, int resultSetConcurrency) {
                return null;
            }

            @Override
            public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) {
                return null;
            }

            @Override
            public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) {
                return null;
            }

            @Override
            public Map<String, Class<?>> getTypeMap() {
                return Collections.emptyMap();
            }

            @Override
            public void setTypeMap(Map<String, Class<?>> map) {

            }

            @Override
            public int getHoldability() {
                return 0;
            }

            @Override
            public void setHoldability(int holdability) {

            }

            @Override
            public Savepoint setSavepoint() {
                return null;
            }

            @Override
            public Savepoint setSavepoint(String name) {
                return null;
            }

            @Override
            public void rollback(Savepoint savepoint) {

            }

            @Override
            public void releaseSavepoint(Savepoint savepoint) {

            }

            @Override
            public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
                return null;
            }

            @Override
            public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
                return null;
            }

            @Override
            public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
                return null;
            }

            @Override
            public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) {
                return null;
            }

            @Override
            public PreparedStatement prepareStatement(String sql, int[] columnIndexes) {
                return null;
            }

            @Override
            public PreparedStatement prepareStatement(String sql, String[] columnNames) {
                return null;
            }

            @Override
            public Clob createClob() {
                return null;
            }

            @Override
            public Blob createBlob() {
                return null;
            }

            @Override
            public NClob createNClob() {
                return null;
            }

            @Override
            public SQLXML createSQLXML() {
                return null;
            }

            @Override
            public boolean isValid(int timeout) {
                return false;
            }

            @Override
            public void setClientInfo(String name, String value) {

            }

            @Override
            public String getClientInfo(String name) {
                return "";
            }

            @Override
            public Properties getClientInfo() {
                return null;
            }

            @Override
            public void setClientInfo(Properties properties) {

            }

            @Override
            public Array createArrayOf(String typeName, Object[] elements) {
                return null;
            }

            @Override
            public Struct createStruct(String typeName, Object[] attributes) {
                return null;
            }

            @Override
            public String getSchema() {
                return "";
            }

            @Override
            public void setSchema(String schema) {

            }

            @Override
            public void abort(Executor executor) {

            }

            @Override
            public void setNetworkTimeout(Executor executor, int milliseconds) {

            }

            @Override
            public int getNetworkTimeout() {
                return 0;
            }

            @Override
            public <T> T unwrap(Class<T> iface) {
                return null;
            }

            @Override
            public boolean isWrapperFor(Class<?> iface) {
                return false;
            }
        };
    }
}
