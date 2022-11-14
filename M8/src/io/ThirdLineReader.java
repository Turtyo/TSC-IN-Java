package io;
import java.io.BufferedReader;
import java.io.FileReader;

public class ThirdLineReader {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new FileReader("src/io/ThirdLineReader.java"));
        String str = in.readLine(); // stores first line in str
        for(int i = 0; i < 2; i ++){
            str = in.readLine();
        }
        System.out.println(str);
        in.close();
        }
    
}
