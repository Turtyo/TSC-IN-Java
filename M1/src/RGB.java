public class RGB {
    private double red;
    private double green;
    private double blue;

    public RGB () {
        this(1.0,1.0,1.0);
    }

    public RGB (double r0, double g0, double b0) {
        this.red = r0;
        this.green = g0;
        this.blue = b0;
    }

    public void display() {
        System.out.println("[" + this.red + ", " + this.green + ", " + this.blue + "]");
    }

    public double greyLevel() {
        return (this.red + this.green + this.blue)/3;
    }

    public void turnToGrey() {
        double currentGrey = this.greyLevel();
        this.red = currentGrey;
        this.green = currentGrey;
        this.blue = currentGrey;
    }

    public void set (double r, double g, double b) {
        this.red = r;
        this.green = g;
        this.blue = b;
    }

    public void set (double grey) {
        set(grey,grey,grey);
    }
}
