package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.MemberRankDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Function;

public class MemberRankDao implements Function<ResultSet, ArrayList<MemberRankDto>> {
    public ArrayList<MemberRankDto> getList() {
        String query = Constant.QUERY_MEMBER_RANK;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    @Override
    public ArrayList<MemberRankDto> apply(ResultSet resultSet) {
        ArrayList<MemberRankDto> memberRankDtoArrayList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                memberRankDtoArrayList.add(
                        new MemberRankDto(
                                resultSet.getString("M_NO"),
                                resultSet.getString("M_NAME"),
                                resultSet.getString("COUNT")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return memberRankDtoArrayList;
    }
}
