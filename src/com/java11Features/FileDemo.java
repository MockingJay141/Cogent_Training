package com.java11Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        var path = "E:\\Cogent Training\\Week_1\\data.txt";
        Files.writeString(Path.of(path), "Hello this File Demo", StandardOpenOption.CREATE);
        String result = Files.readString(Path.of(path));
        System.out.println(result);
    }
}
