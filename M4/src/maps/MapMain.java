package maps;
import java.util.HashMap;

import geometry.Position;

public class MapMain {
    public static void main(String[] args) {
        HashMap<String,Position> posHashMap = new HashMap<>();
        posHashMap.put("origin", new Position(0,0));
        posHashMap.put("zero rad",new Position(1,0));
        posHashMap.put("pi/2 rad",new Position(0,1));
        posHashMap.put("pi rad",new Position(-1,0));
        posHashMap.put("3pi/2 rad",new Position(0,-1));
        System.out.println(posHashMap);
        
    }
}
