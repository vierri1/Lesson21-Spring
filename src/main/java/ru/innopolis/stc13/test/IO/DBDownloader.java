package ru.innopolis.stc13.test.IO;

import org.springframework.stereotype.Component;

@Component
public class DBDownloader implements Downloader {

    @Override
    public String download(String path) {
        System.out.println(new StringBuilder("Resource from DB ")
                .append(path)
                .append(" was downloaded").toString());
        return "SOmeContEtnhsflKDf";
    }
}
