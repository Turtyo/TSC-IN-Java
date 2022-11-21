package io;

import java.io.IOException;
import java.util.List;

import geometry.Position;
import io.text.PositionReader;
import io.text.PositionWriter;

public class BarycenterMain {
    public static void main(String[] args) throws IOException{
        String in = args[0];
        String out = args[1];
        boolean append = Boolean.parseBoolean(args[2]);
        List<Position> positions = PositionReader.read(in);
        Position barycenter = Position.barycenter(positions);
        PositionWriter.write(barycenter,out,append);
    }
}
