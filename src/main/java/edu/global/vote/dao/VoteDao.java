package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.VoteDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VoteDao implements Dao {

    public ArrayList<?> getDtoList() {
        String query = Constant.SELECT_FROM_TBL_VOTE_202005;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    public ArrayList<VoteDto> getArrayListWithResultSet(ResultSet resultSet) throws SQLException {
        ArrayList<VoteDto> voteDtoArrayList = new ArrayList<>();
        while (resultSet.next()) {
            voteDtoArrayList.add(
                    new VoteDto(
                            resultSet.getString("V_JUMIN"),
                            resultSet.getString("V_NAME"),
                            resultSet.getString("M_NO"),
                            resultSet.getString("V_TIME"),
                            resultSet.getString("V_AREA"),
                            resultSet.getString("V_CONFIRM")
                    )
            );
        }
        return voteDtoArrayList;
    }
}
