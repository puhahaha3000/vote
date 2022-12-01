package edu.global.vote.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface Dao {
    ArrayList<?> getDtoList();
    ArrayList<?> getArrayListWithResultSet(ResultSet resultSet) throws SQLException;
}
