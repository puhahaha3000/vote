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
    private static final DataSource dataSource;
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    static {
        try {
            Context context = new InitialContext();
            dataSource = (DataSource) context.lookup(Constant.CONNECT_POOL);
        } catch (NamingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    static <T> ArrayList<T> getArrayListFromQuery(String query, ConvertableFromResultSet<T> convertableFromResultSet) {
        ArrayList<T> resultArrayList = new ArrayList<>();

        try {
            getConnection(query);
            resultSet = preparedStatement.executeQuery();
            resultArrayList = convertableFromResultSet.convertToList(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }

        return resultArrayList;
    }

    static void execute(String query, String[] params) {
        try {
            getConnection(query);
            setParameter(preparedStatement, params);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    static <T> T getOneDto(String query, String[] params, ConvertableFromResultSet<T> convertableFromResultSet) {
        T dto = null;
        try {
            getConnection(query);
            setParameter(preparedStatement, params);
            resultSet = preparedStatement.executeQuery();
            dto = convertableFromResultSet.convertToOneRecord(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return dto;
    }

    private static void getConnection(String query) throws SQLException {
        connection = dataSource.getConnection();
        preparedStatement = connection.prepareStatement(query);
    }

    private static void closeConnection() {
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

    private static void setParameter(PreparedStatement preparedStatement, String[] params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setString(i + 1, params[i]);
        }
    }
}
