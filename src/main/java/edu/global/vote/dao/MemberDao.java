package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.MemberDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao implements ConvertableFromResultSet<MemberDto> {

    public ArrayList<MemberDto> getList() {
        String query = Constant.QUERY_MEMBER_LIST;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    @Override
    public MemberDto convertToOneRecord(ResultSet resultSet) {
        MemberDto memberDto = null;
        try {
            if (resultSet.next()) {
                memberDto = new MemberDto(
                        resultSet.getString("M_NO"),
                        resultSet.getString("M_NAME"),
                        resultSet.getString("P_NAME"),
                        resultSet.getString("P_SCHOOL"),
                        resultSet.getString("M_JUMIN"),
                        resultSet.getString("M_CITY"),
                        resultSet.getString("TEL")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return memberDto;
    }
}
