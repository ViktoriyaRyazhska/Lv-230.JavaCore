package com.home;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        String fileName = "file1.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        BufferedReader br = null;
//        String data = "About my career.\n Bla bla bla1.\n Bla bla bla2.";
//        try{
//            fw = new FileWriter(fileName);
//            bw = new BufferedWriter(fw);} catch (IOException e) {
//        }
//        bw.write(data);
//        bw.close();

//        fr = new FileReader(fileName);
//        br = new BufferedReader(fr);

        String s = "";
        ArrayList<String> arr  = new ArrayList();
        String fileName2 = "file2.txt";
        String name = "Mariia Novytska";
        Integer max=-1;
        String t="";

        fr = new FileReader(fileName);
        br = new BufferedReader(fr);

        try{
            fw = new FileWriter(fileName2);
            bw = new BufferedWriter(fw);}
        catch (IOException e) {
        }


        while((s = br.readLine())!= null){

            arr.add(s);
        }


        bw.write("" + arr.size());
        bw.write(name);

        for (int i=0; i<arr.size();++i ){
            if(arr.get(i).length()> max){
                max=arr.get(i).length();
                t=arr.get(i);
            }
        }
        bw.write(t);
        bw.close();
    }

}


