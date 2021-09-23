import java.util.Objects;

public class LAB1 {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor();
        monitor1.Color = "black";
        monitor1.Width = 60;
        monitor1.Height = 40;
        monitor1.Rezolution = monitor1.Width * monitor1.Height;
        monitor1.printMe();

        System.out.println();

        Monitor monitor2 = new Monitor();
        monitor2.Color = "white";
        monitor2.Width = 50;
        monitor2.Height = 50;
        monitor2.Rezolution = monitor2.Width * monitor2.Height;
        monitor2.printMe();

        System.out.println();

        System.out.println("Objects are not equal, hence it returns " + monitor1.equals(monitor2));

    }
}

class Monitor {
    String Color;
    double Width;
    double Height;
    double Rezolution;

    void printMe(){
        System.out.println("Color is:" + Color);
        System.out.println("Width is:" + Width);
        System.out.println("Height is:" + Height);
        System.out.println("Resolution is:" + Rezolution);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        Monitor monitor = (Monitor) o;
        return Double.compare(monitor.Width, Width) == 0 && Double.compare(monitor.Height, Height) == 0 && Double.compare(monitor.Rezolution, Rezolution) == 0 && Objects.equals(Color, monitor.Color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Color, Width, Height, Rezolution);
    }
}
