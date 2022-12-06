package edu.global.vote.command;

import edu.global.vote.dao.VoteDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoteSubmitCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        VoteDao voteDao = new VoteDao();
        voteDao.insertVote(request, response);
    }
}
