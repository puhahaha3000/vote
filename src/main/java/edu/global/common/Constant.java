package edu.global.common;

public class Constant {
    public static final String CONNECT_POOL = "java:comp/env/jdbc/oracle/vote";
    public static final String QUERY_MEMBER_LIST = """
            SELECT M_NO, M_NAME, P_NAME, P_SCHOOL, M_JUMIN, M_CITY, TRIM(P_TEL1)||'-'||P_TEL2||'-'||P_TEL3
            FROM TBL_MEMBER_202005 M, TBL_PARTY_202005 P
            WHERE M.P_CODE = P.P_CODE""";
    public static final String QUERY_INSERT_VOTE = """
            INSERT INTO TBL_VOTE_202005
                (V_JUMIN, V_NAME, M_NO, V_TIME, V_AREA, V_CONFIRM)
            VALUES (?, ?, ?, ?, ?, ?)""";
    public static final String SELECT_FROM_TBL_VOTE_202005 = "SELECT * FROM TBL_VOTE_202005";
    public static final String SELECT_FROM_TBL_PARTY_202005 = "SELECT * FROM TBL_PARTY_202005";
    public static final String SELECT_FROM_TBL_MEMBER_202005 = "SELECT * FROM TBL_MEMBER_202005";
}
