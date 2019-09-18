package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadResource {
     void loadProps(){
        Properties properties = new Properties();
        try(InputStream inputStream = ReadResource.class.getResourceAsStream("application.properties")){
            if(inputStream != null){
                properties.load(inputStream);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Name : "+properties.getProperty("name"));

    }

    public static void main(String[] args) {
        ReadResource readResource = new ReadResource();
        readResource.loadProps();
    }
}
