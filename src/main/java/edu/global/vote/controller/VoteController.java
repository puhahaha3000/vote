package edu.global.vote.controller;

import edu.global.vote.command.*;

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

        String uri = request.getRequestURI();
        String conPath = request.getContextPath();
        String com = uri.substring(conPath.length());

        CommandList command = null;
        for (CommandList item : CommandList.values()) {
            if (item.getCom().equals(com)) {
                command = item;
                break;
            }
        }
        if (command != null) {
            command.getCommand().execute(request, response);
            RequestDispatcher dispatcher = request.getRequestDispatcher(command.getViewPage());
            dispatcher.forward(request, response);
        }
    }
}
