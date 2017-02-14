/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbtest;

import com.nsoft.fb.FacebookReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author quangdh
 */
public class Main {

    private final Logger logger = Logger.getLogger(Main.class);
    private static Main instance = null;
    private FacebookReader facebookReader;

    public static Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }

    private Main() {
        init();
    }

    private void init() {
        try {
            logger.info("init start...");
            initConfig();
            initDatabase();
            initFacebookReader();
            logger.info("init success...");
        } catch (Exception ex) {
            logger.error("init falure...");
            logger.error(ex);
        }
    }

    private void initConfig() {
        logger.info("init config");
    }

    private void initDatabase() {
        logger.info("init database");
    }

    private void initFacebookReader() {
        List<String> pages = new ArrayList<>();
        pages.add("fb_page_1");
        pages.add("fb_page_2");
        pages.add("fb_page_3");
        facebookReader = new FacebookReader("FB_Reader_1", pages);
    }

    public void start() {
        logger.info("start");
        facebookReader.start();

    }

    public void stop() {
        facebookReader.stop();
        logger.info("stop");
    }

}
