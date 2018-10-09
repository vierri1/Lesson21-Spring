package ru.innopolis.stc13.test.IO;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationContext {

    @Bean
    public DataHandler dataHandler() {
        return new DataHandler();
    }

    @Bean
    public FileUploader fileUploader() {
        return new FileUploader();
    }

    @Bean
    public DBDownloader dbDownloader() {
        return new DBDownloader();
    }

    @Bean
    public FileDownloader fileDownloader() {
        return new FileDownloader();
    }
}