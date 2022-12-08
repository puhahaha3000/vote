package edu.global.vote.command;

import edu.global.vote.dao.VoteViewDao;
import edu.global.vote.dto.VoteViewDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class VoteListCommand implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        VoteViewDao voteViewDao = new VoteViewDao();
        ArrayList<VoteViewDto> voteViewDtoArrayList = voteViewDao.getList();
        for (VoteViewDto item : voteViewDtoArrayList) {
            System.out.println(item);
        }
        request.setAttribute("list", voteViewDtoArrayList);
    }
}
