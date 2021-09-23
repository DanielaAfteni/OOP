public class LAB1_part2 {

    public static void main(String[] args) {

        Universitate universitate1 = new Universitate();
        universitate1.name = "USM";
        universitate1.foundationYear = 1950;

        universitate1.printUniv();

        universitate1.studentul1.firstName = "Maria";
        universitate1.studentul1.lastName = "Ursu";
        universitate1.studentul1.age = 20;
        universitate1.studentul1.mark = 9;
        universitate1.studentul1.printMe();

        System.out.println();

        universitate1.printUniv();

        universitate1.studentul2.firstName = "Iulian";
        universitate1.studentul2.lastName = "Prodan";
        universitate1.studentul2.age = 19;
        universitate1.studentul2.mark = 8;
        universitate1.studentul2.printMe();

        System.out.println();

        universitate1.printUniv();

        universitate1.studentul3.firstName = "Silvia";
        universitate1.studentul3.lastName = "Cristea";
        universitate1.studentul3.age = 19;
        universitate1.studentul3.mark = 10;
        universitate1.studentul3.printMe();


        System.out.println();

        Universitate universitate2 = new Universitate();
        universitate2.name = "ASEM";
        universitate2.foundationYear = 1962;

        universitate2.printUniv();

        universitate2.studentul1.firstName = "Ion";
        universitate2.studentul1.lastName = "Ciobanu";
        universitate2.studentul1.age = 18;
        universitate2.studentul1.mark = 7;
        universitate2.studentul1.printMe();

        System.out.println();

        universitate2.printUniv();

        universitate2.studentul2.firstName = "Mircea";
        universitate2.studentul2.lastName = "Volentir";
        universitate2.studentul2.age = 20;
        universitate2.studentul2.mark = 10;
        universitate2.studentul2.printMe();

        System.out.println();

        universitate2.printUniv();

        universitate2.studentul3.firstName = "Alexandra";
        universitate2.studentul3.lastName = "Sumarga";
        universitate2.studentul3.age = 19;
        universitate2.studentul3.mark = 10;
        universitate2.studentul3.printMe();


        System.out.println();

        Universitate universitate3 = new Universitate();
        universitate3.name = "Oxford";
        universitate3.foundationYear = 1832;

        universitate3.printUniv();

        universitate3.studentul1.firstName = "Alina";
        universitate3.studentul1.lastName = "Cerchez";
        universitate3.studentul1.age = 19;
        universitate3.studentul1.mark = 8;
        universitate3.studentul1.printMe();

        System.out.println();

        universitate3.printUniv();

        universitate3.studentul2.firstName = "Laura";
        universitate3.studentul2.lastName = "Manole";
        universitate3.studentul2.age = 20;
        universitate3.studentul2.mark = 8;
        universitate3.studentul2.printMe();

        System.out.println();

        universitate3.printUniv();

        universitate3.studentul3.firstName = "Dorin";
        universitate3.studentul3.lastName = "Pascal";
        universitate3.studentul3.age = 20;
        universitate3.studentul3.mark = 9;
        universitate3.studentul3.printMe();
    }

}

class Universitate {
    String name;
    int foundationYear;
    Studentul studentul1 = new Studentul();
    Studentul studentul2 = new Studentul();
    Studentul studentul3 = new Studentul();


    void printUniv () {
        System.out.println("Student is at " + name);
    }

}

class Studentul {
    String firstName;
    String lastName;
    int age;
    double mark;

    void printMe () {
        System.out.println("Student's first name is: " + firstName);
        System.out.println("Student's last name is: " + lastName);
        System.out.println("Student's age is: " + age);
        System.out.println("Student's mark is: " + mark);
    }
}


