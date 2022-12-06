package edu.global.vote.command;

public enum CommandList {
    MEMBER_LIST("/member_list.do", new MemberListCommand(), "member_list.jsp"),
    VOTE_SUBMIT("/vote_submit.do", new VoteSubmitCommand(), "index.jsp"),
    VOTE_LIST("/vote_list.do", new VoteListCommand(), "vote_list.jsp"),
    MEMBER_RANK_LIST("/member_rank_list.do", new MemberRankListCommand(), "member_rank_list.jsp");

    private final String com;
    private final Command command;
    private final String viewPage;

    CommandList(String com, Command command, String viewPage) {
        this.com = com;
        this.command = command;
        this.viewPage = viewPage;
    }

    public String getCom() {
        return com;
    }

    public Command getCommand() {
        return command;
    }

    public String getViewPage() {
        return viewPage;
    }
}
