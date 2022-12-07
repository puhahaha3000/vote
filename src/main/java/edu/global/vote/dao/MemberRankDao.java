package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.MemberRankDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberRankDao implements ConvertableFromResultSet<MemberRankDto> {
    public ArrayList<MemberRankDto> getList() {
        String query = Constant.QUERY_MEMBER_RANK;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    @Override
    public MemberRankDto convertToOneRecord(ResultSet resultSet) {
        MemberRankDto memberRankDto;
        try {
            memberRankDto = new MemberRankDto(
                    resultSet.getString("M_NO"),
                    resultSet.getString("M_NAME"),
                    resultSet.getString("COUNT")
            );
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return memberRankDto;
    }
}
