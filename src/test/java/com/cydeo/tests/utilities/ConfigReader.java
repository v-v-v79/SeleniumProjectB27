package com.cydeo.tests.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
     private static Properties properties = new Properties();
     static {
         try {
             FileInputStream fileInputStream = new FileInputStream("slava_config.properties");
             properties.load(fileInputStream);
             fileInputStream.close();
         }
         catch (IOException e) {
             e.printStackTrace();
             System.out.println("File is not found");
         }
     }
     public static String getProperties(String key) {
         return properties.getProperty(key);
     }
}
