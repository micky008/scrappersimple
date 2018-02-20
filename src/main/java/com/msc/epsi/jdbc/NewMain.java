package com.msc.epsi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author mchinchole
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "prof", "prof");
        PreparedStatement st = con.prepareStatement("Select * from toto");
        ResultSet rs = st.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.println(rsmd.getColumnName(i));
        }
        while (rs.next()) {
            System.out.print(rs.getInt("toto1") + " - ");
            System.out.print(rs.getString("toto2") + " - ");
            System.out.print(rs.getInt("toto3") + " - ");
            System.out.print(rs.getInt("toto4") + " - ");
            System.out.print(rs.getString("toto5") + " - ");
            System.out.println(rs.getInt("toto6"));
            System.out.println(rs.getInt(1));
        }
        rs.close();
        st = con.prepareStatement("INSERT INTO toto (toto1, toto2, toto3, toto4, toto5, toto6) VALUES (?,?,?,?,?,?)");
        st.setObject(1, 4);
        st.setObject(2, "qweert");
        st.setObject(3, 4);
        st.setObject(4, 4);
        st.setObject(5, "zxcvb");
        st.setObject(6, 4);

        st.execute();

        st.close();

        String sql = "INSERT INTO toto (toto1, toto2, toto3, toto4, toto5, toto6) VALUES (1,'poi',3,3,'poi',6)";
        String sql2 = "INSERT INTO toto (toto1, toto2, toto3, toto4, toto5, toto6) VALUES (1,'poi2',4,4,'poi2',6)";
        st.addBatch(sql);
        st.addBatch(sql2);
        st.executeBatch();

    }

}
