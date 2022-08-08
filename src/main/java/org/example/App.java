package org.example;

import lombok.Cleanup;
import org.example.model.Author;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException {
        @Cleanup
        InputStream input = Files.newInputStream(Paths.get(args[0]));

        @Cleanup
        OutputStream output = Files.newOutputStream(Paths.get(args[1]));

        byte[] b = new byte[10000];

        while (true) {
            int r = input.read(b);

            if (r == -1)
                break;

            output.write(b, 0, r);
        }
        Author author = new Author();
        Author.builder().id(11).birthPlace("").name("Aaa");
        System.out.println(author);
    }
}

