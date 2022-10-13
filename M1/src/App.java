public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, M1");
        Position position1 = new Position(1,-1);
        position1.display();
        position1.moveTo(-2, 3);
        position1.display();
        position1.moveTo(0, 0);
        position1.display();
        position1.moveTo(3, 3);
        System.out.println("The distance is " + position1.distanceToOrigin());
        Position position2 = new Position(1,1);
        Position position3 = new Position(2, -10);
        position2.moveTo(0, 0);
        position3.moveTo(-2, -1);
        position1.display();
        position2.display();
        position3.display();

        System.out.println("Memory manipulation");
        Position newPos = new Position(3,14);
        Position otherPos = newPos;
        otherPos.moveTo(10, 42);
        newPos.display();
    }
}
