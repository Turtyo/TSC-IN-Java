package rng;

public class GaussianRNG extends AbstractRNG{
    private double mu;
    private double sigma;

    public GaussianRNG(double mu, double sigma){
        super();
        this.mu = mu;
        this.sigma = sigma;
    }
    
    public double genSample(){
        return mu + sigma * rand.nextGaussian();
    }

    @Override
    public String toString(){
        return "N(" + mu + "," + sigma + ")";
    }
}
