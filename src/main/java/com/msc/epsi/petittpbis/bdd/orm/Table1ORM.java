package com.msc.epsi.petittpbis.bdd.orm;

import com.msc.epsi.petittpbis.entity.Table1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mchinchole
 */
public class Table1ORM {

    private static Table1 convert(ResultSet rs) throws SQLException {
        Table1 table1 = new Table1();
        table1.setColonne1(rs.getInt("colonne1"));
        table1.setColonne2(rs.getString("colonne2"));
        table1.setColonne3(rs.getInt("colonne3"));
        return table1;
    }

    public static Table1 convertSingle(ResultSet rs) throws SQLException {
        return convert(rs);
    }

    public static List<Table1> convertAll(ResultSet rs) throws SQLException {
        List<Table1> lt1 = new ArrayList<>();
        Table1 table1;
        while (rs.next()) {
            table1 = convert(rs);
            lt1.add(table1);
        }
        return lt1;
    }

}
