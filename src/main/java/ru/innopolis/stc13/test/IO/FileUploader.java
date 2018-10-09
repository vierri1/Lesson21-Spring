package ru.innopolis.stc13.test.IO;

import org.springframework.stereotype.Component;

@Component
public class FileUploader implements Uploader {
    @Override
    public boolean upload(String path, Object content) {
        System.out.println(new StringBuilder("Content ")
                .append(content.toString())
                .append(" was upload to path ")
                .append(path)
                .toString());
        return true;
    }
}
