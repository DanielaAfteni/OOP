public class Lab2_part2 {

    public static void main(String[] args) {

        // First object created by the constructor
        // Without parameters

        Queue q1 = new Queue();
        q1.push(111);
        q1.push(11);
        q1.push(1);
        // System.out.println(q1.getLung());

        System.out.println("Extracted value from the first queue is: ");
        System.out.println(q1.pop());
        q1.isEmpty();
        q1.isNeverEmpty();
        //System.out.println(q1.getLung());
        System.out.println("\n");

        // Second object created by the constructor
        // With parameters

        Queue q2 = new Queue(3);
        q2.push(222);
        q2.push(22);
        q2.push(2);
        // System.out.println(q2.getLung());

        System.out.println("Extracted value from the second queue is: ");
        System.out.println(q2.pop());
        q2.isEmpty();
        q2.isNeverEmpty();
        //System.out.println(q2.getLung());

    }
}
