/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nsoft.fb;

import com.viettel.mmserver.base.ProcessThreadMX;
import java.util.List;

/**
 *
 * @author quangdh
 */
public class FacebookReader extends ProcessThreadMX {

    private List<String> pages;

    public FacebookReader(String threadName, List<String> pages) {
        super(threadName);
        this.pages = pages;
    }

    @Override
    protected void process() {
        if (pages.size() > 0) {
            for (String page : pages) {
                logger.info("crawler page " + page);
                System.out.println("page=" + page);
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            logger.error(ex);
        }
    }

}
