package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.VoteViewDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VoteViewDao implements ConvertableFromResultSet<VoteViewDto> {
    public ArrayList<VoteViewDto> getList() {
        String query = Constant.QUERY_VOTE_LIST;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    @Override
    public VoteViewDto convertToOneRecord(ResultSet resultSet) {
        VoteViewDto voteViewDto;
        try {
            voteViewDto = new VoteViewDto(
                    resultSet.getString("NAME"),
                    resultSet.getString("BIRTH_DATE"),
                    resultSet.getString("AGE"),
                    resultSet.getString("GENDER"),
                    resultSet.getString("TIME"),
                    resultSet.getString("CONFIRM")
            );
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return voteViewDto;
    }
}
