public class Segment {

    private Position beg;
    private Position end;

    public Segment(Position pb, Position pe){
        this.beg = pb;
        this.end = pe;
    }

    public void moveTo(double xb, double yb, double xe, double ye){
        this.beg.moveTo(xb,yb);
        this.end.moveTo(xe,ye);
    }

    public double length(){
        return Position.distance(this.beg,this.end);
    }

    public void display(){
        System.out.print("beg = ");
        this.beg.display();
        System.out.print("end = ");
        this.end.display();
    }

    public void translate(double dx, double dy){
        this.beg.translate(dx, dy);
        this.end.translate(dx, dy);
    }
}
