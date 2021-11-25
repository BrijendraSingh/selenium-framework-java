package bps.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    static Config config;
    static Properties properties = null;

    private Config(){
        properties = new Properties();
        FileInputStream file; 
        System.out.println(System.getProperty("user.dir") + "/src/test/config.properties");
        try {
            file = new FileInputStream(System.getProperty("user.dir") + "/src/test/config.properties");
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getConfig(String key){    
        if (properties ==null){
            config = new Config();
            return  properties.getProperty(key);
        } else{
            return properties.getProperty(key);
        }  
       
    }
}
