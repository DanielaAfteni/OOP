public class Box {

    // The instance variables -> height, width and depth

    int height;
    int width;
    int depth;


    // PART 1
    // The constructor without parameters (all the instance variables should have default value 1)

    Box() {
        height = 1;
        width = 1;
        depth = 1;
    }

    // The constructor with 1 parameter (all the instance variables should have same value)

    Box(int height_) {
        height = height_;
        width = height_;
        depth = height_;
    }

    // The constructor with 3 parameters (for each instance variable)

    Box(int height__, int width__, int depth__) {
        height = height__;
        width = width__;
        depth = depth__;
    }


    // PART 3
    // The method for surface area calculation

    public void surfaceArea(){
        int resultSurface = 2 * height * width + 2 * height * depth + 2 * width * depth;
        System.out.println("The surface area of this object is equal to " + resultSurface);
    }

    // The method for volume calculation

    public void volume(){
        int volumeObject = height * width * depth;
        System.out.println("The volume of this object is " + volumeObject);
    }

}
