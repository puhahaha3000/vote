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
    public static final String QUERY_VOTE_LIST = """
            SELECT
                V_NAME AS NAME,
                '19'||SUBSTR(V_JUMIN, 1, 2)||'년'||SUBSTR(V_JUMIN, 3, 2)||'월'||SUBSTR(V_JUMIN, 5, 2)||'일생' AS BIRTH_DATE,
                TRUNC(MONTHS_BETWEEN(TO_DATE(SYSDATE), TO_DATE(19||SUBSTR(V_JUMIN, 1, 6))) / 12) AS AGE,
                CASE SUBSTR(V_JUMIN, 7, 1)
                    WHEN '1' THEN '남자'
                    WHEN '2' THEN '여자' END AS GENDER,
                V_TIME AS TIME,
                V_CONFIRM AS CONFIRM
            FROM TBL_VOTE_202005""";
    public static final String QUERY_MEMBER_RANK = """
            SELECT M.M_NO, M_NAME, COUNT
            FROM TBL_MEMBER_202005 M, (
                SELECT M_NO, COUNT(*) AS COUNT
                FROM TBL_VOTE_202005
                WHERE V_CONFIRM = 'Y'
                GROUP BY M_NO) V
            WHERE M.M_NO = V.M_NO
            ORDER BY COUNT DESC""";
    public static final String SELECT_FROM_TBL_VOTE_202005 = "SELECT * FROM TBL_VOTE_202005";
    public static final String SELECT_FROM_TBL_PARTY_202005 = "SELECT * FROM TBL_PARTY_202005";
    public static final String SELECT_FROM_TBL_MEMBER_202005 = "SELECT * FROM TBL_MEMBER_202005";
}
