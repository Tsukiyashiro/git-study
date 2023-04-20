package com.homework;

import java.io.*;

public class Homework2 {
    public static void main(String[] args) throws IOException {
        File file = new File("day08\\src\\com\\test.txt");
        System.out.println(file.createNewFile());
        BufferedWriter bw = new BufferedWriter(new FileWriter("day08\\src\\com\\test.txt"));
        bw.write("First");
        bw.newLine();
        bw.write("Second");
        bw.newLine();
        bw.write("Third");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("day08\\src\\com\\test.txt"));
        String line;
        while ((line = br.readLine())!= null) {
            System.out.println(line);
        }
        br.close();
    }
}
