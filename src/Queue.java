public class Queue {
    int max = 100000000;
    int first = 0;
    int last = 0;
    int lung = 0;
    int[] queue;

    // PART 2
    // The queue without parametres

    Queue() {
        queue = new int[100000000];

    }

    // The queue with parametres

    Queue(int max_) {
        max = max_;
        queue = new int[max];
    }

    // The needed function push, that make us be able to add to queue more elements

    public void push(int num_push){
        if(max > lung) {
            if (last <= 100) {
                queue[last] = num_push;
                lung++;
                last++;
                if (last >= 100) last = 0;

            }
        }
    }

    // The needed function pop, that make us be able to remove from queue first elements

    public int pop(){
        int element = 0;
        element = queue[first];
        lung--;
        first++;
        if(first >= 100) first = 0;
        return element;
    }

    // This function returns the value of the lenght of the queue

    public int getLung(){
        return lung;
    }


    // PART 3
    // The method for that checks if the object is never full and gives the difference of the lenght and maximum size of it

    public void isNeverEmpty(){
        int diff = max - lung;
        if(diff > 0) {
            if (diff >= 10000) System.out.println("The queue is never full.");
            if ((lung > 0) && (diff < 10000)) System.out.println("You can add " + diff + " more value.");
        }
    }

    // The method for that checks if the object is empty and gives the lenght of the queue

    public void isEmpty(){
        if(lung <= 0)  System.out.println("The queue is emplty.");
        if((lung > 0) && (lung <= max)) System.out.println("It is not full. The lenght of the queue is: " + lung);
    }

}
