package com.msc.epsi.petittp.utilis;

import com.msc.epsi.petittp.entity.Site;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author mchinchole
 */
public class SiteUtilities {

    public static List<Site> convert(File config) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader(config));
        int i = 1;
        List<Site> sites = new ArrayList<>();
        Site site = null;
        while(prop.getProperty("nom."+i)!= null){
            site = new Site();
            site.setId(i);
            site.setLien(prop.getProperty("lien."+i));
            site.setNom(prop.getProperty("nom."+i));
            site.setPattern(prop.getProperty("pattern."+i));
            site.setVersion(prop.getProperty("version."+i));
            i++;
            sites.add(site);
        }
        return sites;
    }
    
    
}
