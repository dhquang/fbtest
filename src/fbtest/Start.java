/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbtest;

import java.io.File;
import java.util.Locale;
import org.apache.log4j.PropertyConfigurator;
import utils.Config;

/**
 *
 * @author quangdh
 */
public class Start {

    public static void main(String args[]) throws Exception {
        String os = System.getProperty("os.name");
        os = os.toLowerCase(Locale.getDefault());
        System.out.println("os=" + os);
        if (os.contains("windows")) {
            Config.config("etc", "log");
        } else {
            Config.config("../etc", "../log");
        }
        PropertyConfigurator.configure(Config.configDir + File.separator + "log4j.properties");
        Main instance = Main.getInstance();
        instance.start();
    }
}
