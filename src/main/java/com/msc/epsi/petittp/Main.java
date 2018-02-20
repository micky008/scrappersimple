package com.msc.epsi.petittp;

import com.msc.epsi.petittp.entity.Site;
import com.msc.epsi.petittp.scrapper.URLScrapper;
import com.msc.epsi.petittp.utilis.SiteUtilities;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author mchinchole
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        List<Site> sites = SiteUtilities.convert(new File("liens.properties"));
        URLScrapper scrapper;
        for (Site site : sites) {
            scrapper = new URLScrapper(site);
            scrapper.scrappe();
            if (scrapper.haveChangement()) {
                System.out.println("Changement sur le site :" + site.getNom() + " old Version:" + site.getVersion() + " new Version:" + scrapper.getNewVersion());
            }
        }
    }

}
