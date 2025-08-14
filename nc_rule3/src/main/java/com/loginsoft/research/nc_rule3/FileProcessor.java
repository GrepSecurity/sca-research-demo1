package com.loginsoft.research.nc_rule3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor {

    public String readFile(String path) throws IOException {
        System.out.println("Reading file from: " + path);
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            return reader.readLine();
        }
    }

    public void writeFile(String path, String content) throws IOException {
        System.out.println("Writing file to: " + path);
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
        }
    }

    public String processFile(String inputPath, String outputPath) throws IOException {
        String content = readFile(inputPath);
        writeFile(outputPath, content);
        return content;
    }
}
