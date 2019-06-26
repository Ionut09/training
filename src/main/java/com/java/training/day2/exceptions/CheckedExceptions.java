package com.java.training.day2.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

public class CheckedExceptions {

    public static void main(String[] args) throws IOException {

        try {
            dangerousMethod();

        } catch (IOException | NumberFormatException e) { //exceptiile din multi-catct tb sa nu fie in acceasi ieararhie
            System.out.println("Exceptions message:" + e.getMessage());
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        try{ //nu poate exista fara catch sau finally
//            Resource r = new Resource();
//        }
//

        try{

        }finally {

        }

        try(Resource r = new Resource()){ //se poate si fara catch sau finally

        }


    }

    static void dangerousMethod() throws IOException, IllegalArgumentException, SQLException {
        //a lot of business logic
        System.out.println("inside dangerousMethod");
        throw new IOException("Cannot read a file!");
    }

    static void fileExceptionMethod(){
        File file = new File("/dog.txt");
        try {
            InputStream in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //throw new FileNonExistentException("The file" + file.getName() +" could not be opened.");
            throw new FileNonExistentException(e);
        }
        //heavy logic

       try(InputStream in = new FileInputStream(file)){//exceptiile aruncate de resurse e necesar
           // sa fie gestionate in continuare

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }


}
