package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.VoteDto;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class CommonDao {

    static <T> ArrayList<T> getArrayListFromQuery(String query, Function<ResultSet, ArrayList<T>> function) {
        ArrayList<T> resultArrayList = new ArrayList<>();

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

                resultArrayList = function.apply(resultSet);
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

    static void insert(String query, VoteDto voteDto) {
        try {
            Context context = new InitialContext();
            DataSource dataSource = (DataSource) context.lookup(Constant.CONNECT_POOL);

            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                connection = dataSource.getConnection();
                preparedStatement = connection.prepareStatement(query);


            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
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
    }
}
