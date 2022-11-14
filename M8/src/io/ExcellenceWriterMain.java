package io;
import java.io.PrintWriter;

public class ExcellenceWriterMain {
    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter("./toto/isae.txt");
        out.println("Excellence with passion");
        out.close();
    }
}
