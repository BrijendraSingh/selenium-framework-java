package bps.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    static Config config;
    static Properties properties = null;
    static Properties envProperties=null;

    private Config(){
        properties = new Properties();
        envProperties = new Properties();
        FileInputStream file, envFile; 
        try {
            file = new FileInputStream(System.getProperty("user.dir") + "/src/test/config.properties");
            properties.load(file);
            envFile = new FileInputStream(System.getProperty("user.dir") + "/src/test/config-"+properties.getProperty("env")+".properties");
            envProperties.load(envFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getConfig(String key){    
        if (properties ==null) config = new Config();
        return properties.getProperty(key);
    }

    public static String getEnvConfig(String key){
        if (envProperties==null) config = new Config();   
        return envProperties.getProperty(key);
    }
}
