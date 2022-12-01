package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.PartyDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PartyDao implements Dao{

    @Override
    public ArrayList<?> getDtoList() {
        String query = Constant.SELECT_FROM_TBL_PARTY_202005;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    @Override
    public ArrayList<PartyDto> getArrayListWithResultSet(ResultSet resultSet) throws SQLException {
        ArrayList<PartyDto> partyDtoArrayList = new ArrayList<>();
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
        return partyDtoArrayList;
    }
}
