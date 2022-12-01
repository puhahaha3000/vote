package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.PartyDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Function;

public class PartyDao implements Function<ResultSet, ArrayList<PartyDto>> {

    public ArrayList<?> getDtoList() {
        String query = Constant.SELECT_FROM_TBL_PARTY_202005;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    @Override
    public ArrayList<PartyDto> apply(ResultSet resultSet) {
        ArrayList<PartyDto> partyDtoArrayList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                partyDtoArrayList.add(
                        new PartyDto(
                                resultSet.getString("P_CODE"),
                                resultSet.getString("P_NAME"),
                                resultSet.getString("P_INDATE"),
                                resultSet.getString("P_READER"),
                                resultSet.getString("P_TEL1"),
                                resultSet.getString("P_TEL2"),
                                resultSet.getString("P_TEL3")
                        )
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return partyDtoArrayList;
    }
}
