package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.VoteDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class VoteDao implements Function<ResultSet, ArrayList<VoteDto>> {

    public ArrayList<VoteDto> getList() {
        String query = Constant.SELECT_FROM_TBL_VOTE_202005;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    public void insertVote(HttpServletRequest request, HttpServletResponse response) {
        String query = Constant.QUERY_INSERT_VOTE;
        VoteDto voteDto = new VoteDto(
                request.getParameter("V_JUMIN"),
                request.getParameter("V_NAME"),
                request.getParameter("M_NO"),
                request.getParameter("V_TIME"),
                request.getParameter("V_AREA"),
                request.getParameter("V_CONFIRM")
        );
        CommonDao.insert(query, voteDto);
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
