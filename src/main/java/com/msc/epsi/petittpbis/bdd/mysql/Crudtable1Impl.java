package com.msc.epsi.petittpbis.bdd.mysql;

import com.msc.epsi.petittpbis.bdd.CrudTable1;
import com.msc.epsi.petittpbis.bdd.orm.Table1ORM;
import com.msc.epsi.petittpbis.entity.Table1;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mchinchole
 */
public class Crudtable1Impl implements CrudTable1 {

    @Override
    public Table1 selectById() {
        try {
            java.sql.Connection con  = Connection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from ... where id = ...");
            Table1 res = Table1ORM.convertSingle(rs);
            rs.close();
            return res;
            
        } catch (Exception ex) {
            Logger.getLogger(Crudtable1Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean insert(Table1 table2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(List<Table1> table2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Table1 table2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(List<Table1> table2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Table1 table2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(List<Table1> table2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
