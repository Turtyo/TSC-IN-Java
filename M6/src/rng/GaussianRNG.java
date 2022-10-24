package rng;

public class GaussianRNG extends AbstractRNG{
    private Double mu;
    private Double sigma;

    public GaussianRNG(Double mu, Double sigma){
        super();
        this.mu = mu;
        this.sigma = sigma;
    }
    
    public Double genSample(){
        return mu + sigma * rand.nextGaussian();
    }

    @Override
    public String toString(){
        return "N(" + mu + "," + sigma + ")";
    }
}
