package edu.global.vote.dao;

import edu.global.common.Constant;
import edu.global.vote.dto.VoteDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.function.Consumer;

public class VoteDao implements Consumer<Map.Entry<PreparedStatement, VoteDto>> {

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
        CommonDao.insert(query, voteDto, this);
    }

    @Override
    public void accept(Map.Entry<PreparedStatement, VoteDto> preparedStatementVoteDtoEntry) {
        PreparedStatement preparedStatement = preparedStatementVoteDtoEntry.getKey();
        VoteDto voteDto = preparedStatementVoteDtoEntry.getValue();
        try {
            preparedStatement.setString(1, voteDto.getVoteJumin());
            preparedStatement.setString(2, voteDto.getVoteName());
            preparedStatement.setString(3, voteDto.getMember_No());
            preparedStatement.setString(4, voteDto.getVoteTime());
            preparedStatement.setString(5, voteDto.getVoteArea());
            preparedStatement.setString(6, voteDto.getVoteConfirm());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
