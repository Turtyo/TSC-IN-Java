package rng;

public class UniformRNG extends AbstractRNG{
    private double a;
    private double b;

    public UniformRNG(double a, double b){
        super();
        this.a = a;
        this.b = b;
    }
    
    public Double genSample(){
        return a + (b-a) * rand.nextDouble();
    }

    @Override
    public String toString(){
        return "U(" + this.a + "," + this.b + ")";
    }
}
