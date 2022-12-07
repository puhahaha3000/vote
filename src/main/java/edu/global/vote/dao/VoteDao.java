package edu.global.vote.dao;

import edu.global.common.Constant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoteDao {
    public void insertVote(HttpServletRequest request, HttpServletResponse response) {
        String query = Constant.QUERY_INSERT_VOTE;
        String[] params = {
                request.getParameter("V_JUMIN"),
                request.getParameter("V_NAME"),
                request.getParameter("M_NO"),
                request.getParameter("V_TIME"),
                request.getParameter("V_AREA"),
                request.getParameter("V_CONFIRM")
        };
        for (String item : params) {
            System.out.println("--------------------"+item+"----------------------");
        }
        CommonDao.execute(query, params);
    }
}
