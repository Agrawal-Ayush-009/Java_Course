import java.util.*;

public class PriorityQueues {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }


    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// to [Reverse] the priority

        // pq.add(9);
        // pq.add(8);
        // pq.add(7);
        // pq.add(0);
        // pq.add(8);
        // pq.add(0);
        // pq.add(4);
        // pq.add(2);
        // pq.add(4);
        // pq.add(6);

        // while(!pq.isEmpty()){
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }


        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 45));
        pq.add(new Student("B", 40));
        pq.add(new Student("C", 1));
        pq.add(new Student("D", 15));


        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}
