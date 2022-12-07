package edu.global.common;

public class Constant {
    public static final String CONNECT_POOL = "java:comp/env/jdbc/oracle/vote";
    public static final String QUERY_MEMBER_LIST = "SELECT M_NO, M_NAME, P_NAME, P_SCHOOL, M_JUMIN, M_CITY, TO_CHAR(P_TEL1, 'FM909')||'-'||P_TEL2||'-'||P_TEL3 AS TEL\n" +
            "            FROM TBL_MEMBER_202005 M, TBL_PARTY_202005 P\n" +
            "            WHERE M.P_CODE = P.P_CODE";
    public static final String QUERY_INSERT_VOTE = "INSERT INTO TBL_VOTE_202005\n" +
            "                (V_JUMIN, V_NAME, M_NO, V_TIME, V_AREA, V_CONFIRM)\n" +
            "            VALUES (?, ?, ?, ?, ?, ?)";
    public static final String QUERY_VOTE_LIST = "SELECT\n" +
            "                V_NAME AS NAME,\n" +
            "                '19'||SUBSTR(V_JUMIN, 1, 2)||'년'||SUBSTR(V_JUMIN, 3, 2)||'월'||SUBSTR(V_JUMIN, 5, 2)||'일생' AS BIRTH_DATE,\n" +
            "                TRUNC(MONTHS_BETWEEN(TO_DATE(SYSDATE), TO_DATE(19||SUBSTR(V_JUMIN, 1, 6))) / 12) AS AGE,\n" +
            "                CASE SUBSTR(V_JUMIN, 7, 1)\n" +
            "                    WHEN '1' THEN '남자'\n" +
            "                    WHEN '2' THEN '여자' END AS GENDER,\n" +
            "                V_TIME AS TIME,\n" +
            "                V_CONFIRM AS CONFIRM\n" +
            "            FROM TBL_VOTE_202005";
    public static final String QUERY_MEMBER_RANK = "SELECT M.M_NO, M_NAME, COUNT\n" +
            "            FROM TBL_MEMBER_202005 M, (\n" +
            "                SELECT M_NO, COUNT(*) AS COUNT\n" +
            "                FROM TBL_VOTE_202005\n" +
            "                WHERE V_CONFIRM = 'Y'\n" +
            "                GROUP BY M_NO) V\n" +
            "            WHERE M.M_NO = V.M_NO\n" +
            "            ORDER BY COUNT DESC";
}
