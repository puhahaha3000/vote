package edu.global.vote.command;

import edu.global.vote.dao.MemberDao;
import edu.global.vote.dto.MemberDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class VoteSubmitViewCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        MemberDao memberDao = new MemberDao();
        ArrayList<MemberDto> memberDtoArrayList = memberDao.getList();
        request.setAttribute("list", memberDtoArrayList);
    }
}
