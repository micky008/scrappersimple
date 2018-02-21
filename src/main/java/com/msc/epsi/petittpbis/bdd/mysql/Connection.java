package com.msc.epsi.petittpbis.bdd.mysql;

import java.io.IOException;
import java.sql.DriverManager;

/**
 *
 * @author mchinchole
 */
public class Connection {

    private static java.sql.Connection con;

    public static java.sql.Connection getConnection() throws Exception {
        if (con == null) {
            Class.forName("com.");
            con = DriverManager.getConnection("...", "prof", "prof");
        }
        return con;
    }

}
