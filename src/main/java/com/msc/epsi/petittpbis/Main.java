package com.msc.epsi.petittpbis;

import com.msc.epsi.petittpbis.bdd.CrudTable1;
import com.msc.epsi.petittpbis.bdd.FactoryBdd;
import com.msc.epsi.petittpbis.entity.Table1;

/**
 *
 * @author mchinchole
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CrudTable1 ct1 = FactoryBdd.getInstanceTable1();
        Table1 t1 = ct1.selectById();
    }

}
