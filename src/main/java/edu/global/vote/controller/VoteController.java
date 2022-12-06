package edu.global.vote.controller;

import edu.global.vote.command.Command;
import edu.global.vote.command.MemberListCommand;
import edu.global.vote.command.VoteSubmitCommand;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "*.do")
public class VoteController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        actionDo(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        actionDo(request, response);
    }

    private void actionDo(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");

        String viewPage = null;
        Command command;

        String uri = request.getRequestURI();
        String conPath = request.getContextPath();
        String com = uri.substring(conPath.length());

        if (com.equals("/member_list.do")) {
            command = new MemberListCommand();
            command.execute(request, response);
            viewPage = "member_list.jsp";
        } else if (com.equals("/vote_submit.do")) {
            command = new VoteSubmitCommand();
            command.execute(request, response);
            viewPage = "vote_list.do";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
        dispatcher.forward(request, response);
    }
}
