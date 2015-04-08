package foo.bar.day2.lab05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by giylmi on 07.04.2015.
 */
@Configuration
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public FileLengthRetriever fileLengthRetriever(){
        return new FileLengthRetriever();
    }

    @Bean
    public FileCreator fileCreator(){
        return new FileCreator();
    }


}
