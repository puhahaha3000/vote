package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.VoteViewDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Function;

public class VoteViewDao implements Function<ResultSet, ArrayList<VoteViewDto>> {
    public ArrayList<VoteViewDto> getList() {
        String query = Constant.QUERY_VOTE_LIST;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    @Override
    public ArrayList<VoteViewDto> apply(ResultSet resultSet) {
        ArrayList<VoteViewDto> voteViewDtoArrayList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                voteViewDtoArrayList.add(
                        new VoteViewDto(
                                resultSet.getString("NAME"),
                                resultSet.getString("BIRTH_DATE"),
                                resultSet.getString("AGE"),
                                resultSet.getString("GENDER"),
                                resultSet.getString("TIME"),
                                resultSet.getString("CONFIRM")
                        )
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return voteViewDtoArrayList;
    }
}
