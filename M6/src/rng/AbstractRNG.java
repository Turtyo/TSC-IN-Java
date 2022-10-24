package rng;
import java.util.Random;
import java.util.ArrayList;

abstract class AbstractRNG {
    protected Random rand;
    
    protected AbstractRNG(){
        this.rand = new Random();
    }

    public abstract double genSample();

    public ArrayList<Double> genSampleList(int nb)
    {
        ArrayList<Double> listToReturn = new ArrayList<Double>();
        for(int index = 0; index < nb; index++){
            listToReturn.add(this.genSample());
        }
        return listToReturn;
    }

}
