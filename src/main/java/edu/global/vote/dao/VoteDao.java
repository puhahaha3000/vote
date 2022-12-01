package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.VoteDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Function;

public class VoteDao implements Function<ResultSet, ArrayList<VoteDto>> {

    public ArrayList<?> getDtoList() {
        String query = Constant.SELECT_FROM_TBL_VOTE_202005;
        return CommonDao.getArrayListFromQuery(query, (this));
    }

    @Override
    public ArrayList<VoteDto> apply(ResultSet resultSet) {
        ArrayList<VoteDto> voteDtoArrayList = new ArrayList<>();
        try {
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return voteDtoArrayList;
    }
}
