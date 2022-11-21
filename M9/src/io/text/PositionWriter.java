package io.text;

import java.io.PrintWriter;
import java.util.Collection;
import java.io.FileWriter;
import java.io.IOException;

import geometry.Position;

public class PositionWriter {
    public static void write(Position position, String filename, boolean append) throws IOException {
        PrintWriter fileToWrite = new PrintWriter(new FileWriter(filename,append));
        fileToWrite.append(position.getX() + "," + position.getY()+ "\n");
        fileToWrite.close();
    }

    public static void write(Collection<Position> positions, String filename, boolean append) throws IOException {
        PrintWriter fileToWrite = new PrintWriter(new FileWriter(filename,append));
        for(Position pos: positions){
            fileToWrite.append(pos.getX() + "," + pos.getY()+ "\n");
        }
        fileToWrite.close();
    }

}
