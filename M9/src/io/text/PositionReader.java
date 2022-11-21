package io.text;

import geometry.Position;

import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class PositionReader {
    public static List<Position> read(String filename) throws IOException {
        ArrayList<Position> positions = new ArrayList<Position>();
        FileReader in = new FileReader(filename);
        BufferedReader bin = new BufferedReader(in);

        while(bin.ready()){
            String line = bin.readLine();
            String[] values = line.split(",");
            double x = Double.parseDouble(values[0].trim());
            double y = Double.parseDouble(values[1].trim());
            positions.add(new Position(x,y));
        }

        bin.close();

        return positions;
    }
}
