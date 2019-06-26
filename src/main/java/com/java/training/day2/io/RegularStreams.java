package com.java.training.day2.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class RegularStreams {
    private int[] content = new int[10000000];
    /*
    BufferedReader, BufferedWriter, FileReader, FileWriter,
    FileInputStream, FileOutputStream, ObjectOutputStream, ObjectInputStream
     */

    private void read(File inputFile) {
        try (InputStream inputStream = new FileInputStream(inputFile)) {
            int bytesRead, i = 0;
            while ((bytesRead = inputStream.read()) > 0) {
                content[i] = bytesRead;
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void write(File outputFile) {
        try (OutputStream outputStream = new FileOutputStream(outputFile)) {
            for (int i = 0; i < content.length; i++) {
                outputStream.write(content[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void readWrite(File inputFile, File outputFile) {
        try (InputStream inputStream = new FileInputStream(inputFile);
             OutputStream outputStream = new FileOutputStream(outputFile)) {
            int bytesRead, i = 0;
            while ((bytesRead = inputStream.read()) > 0) {
                outputStream.write(bytesRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readWriteWithBuffers(File inputFile, File outputFile) {
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(inputFile), 10*1024);
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile), 10*1024)) {

            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer,0,lengthRead);
                String str = new String(buffer);
                outputStream.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void readWriteWithReaderAndWriter(File inputFile, File outputFile){
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))){

            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        RegularStreams regularStreams = new RegularStreams();
//        regularStreams.read(new File("cat.txt"));
//        regularStreams.write(new File("kitie.txt"));
       // regularStreams.readWriteWithBuffers(new File("cat.txt"), new File("kitie.txt"));
       // regularStreams.readWriteWithReaderAndWriter(new File("cat.txt"), new File("kitie.txt"));

        File file = new File("cat.txt");
        List<String> stringList = Files.lines(file.toPath())
                                    .collect(Collectors.toList());


        int x = 10;
        stringList.forEach(line -> System.out.println(line));
        method(stringList, x);
        System.out.println("After method ----------------------------------------");
        stringList.forEach(line -> System.out.println(line));
        System.out.println(x);



    }

    static void method(List<String> list, int a){
        list.add("=============================");
        a++;
        System.out.println(a);

    }

}
