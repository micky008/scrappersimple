package com.msc.epsi.petittpbis.bdd;

import com.msc.epsi.petittpbis.bdd.mysql.Crudtable1Impl;
import com.msc.epsi.petittpbis.bdd.mysql.Crudtable2Impl;

/**
 *
 * @author mchinchole
 */
public class FactoryBdd {

    public static CrudTable1 getInstanceTable1(){
        return new Crudtable1Impl();
    }
    
    public static CrudTable2 getInstanceTable2(){
        return new Crudtable2Impl();
    }
    
    
}
