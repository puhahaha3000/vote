package edu.global.vote.dao;

import edu.global.common.Constant;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CommonDao {

    static ArrayList<?> getArrayListFromQuery(String query, Dao dao) {
        ArrayList<?> resultArrayList = new ArrayList<>();

        try {
            Context context = new InitialContext();
            DataSource dataSource = (DataSource) context.lookup(Constant.CONNECT_POOL);

            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            try {
                connection = dataSource.getConnection();
                preparedStatement = connection.prepareStatement(query);
                resultSet = preparedStatement.executeQuery();

                resultArrayList = dao.getArrayListWithResultSet(resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }

        return resultArrayList;
    }
}
