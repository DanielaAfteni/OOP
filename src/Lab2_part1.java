public class Lab2_part1 {

    public static void main(String[] args) {

        // First 3 objects created by the constructor
        // Without parameters (all the instance variables should have default value 1)

        Box b1 = new Box();
        b1.surfaceArea();
        b1.volume();
        Box b2 = new Box();
        b2.surfaceArea();
        b2.volume();
        Box b3 = new Box();
        b3.surfaceArea();
        b3.volume();

        System.out.println("\n");

        // Other 3 objects created by the constructor
        // With 1 parameter (all the instance variables should have same value)

        Box b4 = new Box(30);
        b4.surfaceArea();
        b4.volume();
        Box b5 = new Box(50);
        b5.surfaceArea();
        b5.volume();
        Box b6 = new Box(10);
        b6.surfaceArea();
        b6.volume();

        System.out.println("\n");

        // Other 3 objects created by the constructor
        // With 3 parameters (for each instance variable)

        Box b7 = new Box(40, 50, 30);
        b7.surfaceArea();
        b7.volume();
        Box b8 = new Box(20, 25, 20);
        b8.surfaceArea();
        b8.volume();
        Box b9 = new Box(15, 35, 40);
        b9.surfaceArea();
        b9.volume();
    }
}
