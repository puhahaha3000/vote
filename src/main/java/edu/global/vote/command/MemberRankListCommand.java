package edu.global.vote.command;

import edu.global.vote.dao.MemberRankDao;
import edu.global.vote.dto.MemberRankDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class MemberRankListCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        MemberRankDao memberRankDao = new MemberRankDao();
        ArrayList<MemberRankDto> memberRankDtoArrayList = memberRankDao.getList();
        request.setAttribute("list", memberRankDtoArrayList);
    }
}
