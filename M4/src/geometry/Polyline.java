package geometry;

import java.util.ArrayList;

public class Polyline {
    private ArrayList<Position> edges;

    public Polyline(){
        this.edges = new ArrayList<Position>();    
    }

    public void addEdge(Position newSummit){
        this.edges.add(newSummit);
    }

    public void clearEdges(){
        this.edges = new ArrayList<>();
    }

    public int size(){
        return this.edges.size();
    }

    public double length(){
        double currentDistance = 0;
        for(int index = 0; index < this.edges.size() - 1; index++){
            currentDistance = currentDistance + Position.distance(edges.get(index), edges.get(index + 1));
        }
        return currentDistance;
    }

    public String toString(){
        String returnString = "edges=[";
        int sizeOfList = edges.size();
        for(int index = 0; index < sizeOfList - 1; index ++){
            returnString = returnString + this.edges.get(index) + ", ";
            // toString() defined for Position class
        }
        returnString = returnString + (sizeOfList == 0 ? "" : this.edges.get(sizeOfList - 1).toString()) + "] size=" + this.size() + " length=" + this.length();
        return returnString;
    }

}
