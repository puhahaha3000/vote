package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.MemberDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Function;

public class MemberDao implements Function<ResultSet, ArrayList<MemberDto>> {

    public ArrayList<MemberDto> getList() {
        String query = Constant.QUERY_MEMBER_LIST;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    @Override
    public ArrayList<MemberDto> apply(ResultSet resultSet) {
        ArrayList<MemberDto> memberDtoArrayList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                memberDtoArrayList.add(
                        new MemberDto(
                                resultSet.getString("M_NO"),
                                resultSet.getString("M_NAME"),
                                resultSet.getString("P_NAME"),
                                resultSet.getString("P_SCHOOL"),
                                resultSet.getString("M_JUMIN"),
                                resultSet.getString("M_CITY"),
                                resultSet.getString("TEL")
                        )
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return memberDtoArrayList;
    }
}
