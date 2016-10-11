package com.tobral.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * Created by SG0214842 on 10/11/2016.
 */
public class FileRead {

    public static void main(String[] args) throws IOException {
        String test = "testDzialaniaSubstringa";
        System.out.println(test.substring(1,21));

        Stream<String> lines = Files.lines(Paths.get("C://Users//sg0214842//Desktop//file.txt"));

        System.out.println(lines.count());
        Stream<String> lines2 = Files.lines(Paths.get("C://Users//sg0214842//Desktop//file.txt"));

        System.out.println(lines2.distinct().count());;


    }


}
