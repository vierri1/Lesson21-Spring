package ru.innopolis.stc13.test.IO;

import org.springframework.stereotype.Component;

@Component
public class FileDownloader implements Downloader {

    private int count;

    @Override
    public String download(String path) {
        System.out.println(new StringBuilder("Resource from file")
                .append(path)
                .append(" was downloaded ")
                .append(++count)
                .append(" times")
                .toString());
        return "SOME CoTndatlnad";
    }
}
