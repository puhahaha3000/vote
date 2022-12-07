package edu.global.vote.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ConvertableFromResultSet<T> {
    default ArrayList<T> convertToList(ResultSet resultSet) {
        ArrayList<T> dtoArrayList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                dtoArrayList.add(convertToOneRecord(resultSet));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dtoArrayList;
    }

    T convertToOneRecord(ResultSet resultSet);
}
