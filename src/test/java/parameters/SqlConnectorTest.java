package parameters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utilities.SqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlConnectorTest {
    private static final Logger LOGGER = LogManager.getLogger(SqlConnectorTest.class);

    @Test
    public void run() throws SQLException {
        ResultSet resultSet = SqlConnector.readData("Select * from monthly_mortgage");
        try {
            while (resultSet.next()) {
                LOGGER.info("Home Price:" + resultSet.getString("homevalue"));
                LOGGER.info("Down Payment:" + resultSet.getString("downpayment"));
                LOGGER.info("Loan amount:" + resultSet.getString("loanamount"));
            }
        } catch (SQLException e) {

            LOGGER.error("Read SQL data exception is:" + e.getMessage());
        }
    }
}