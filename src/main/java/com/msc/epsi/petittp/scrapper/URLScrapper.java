package com.msc.epsi.petittp.scrapper;

import com.msc.epsi.petittp.entity.Site;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author mchinchole
 */
public class URLScrapper {

    private final Site site;
    private String newVersion;
    private List<String> lines;

    public URLScrapper(Site site) {
        this.site = site;
    }

    public void scrappe() {
        try {
            lines = IOUtils.readLines(site.getURL().openStream(), "UTF-8");
        } catch (IOException ex) {
            Logger.getLogger(URLScrapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean haveChangement() {
        Pattern pattern = Pattern.compile(site.getPattern());
        Matcher mat = null;
        for (String line : this.lines) {
            mat = pattern.matcher(line);
            if (mat.find()){
                String result = mat.group(1);
                newVersion = result;
                return !result.equals(site.getVersion());
            }
        }
        return false;
    }

    public String getNewVersion() {
        return newVersion;
    }

}
