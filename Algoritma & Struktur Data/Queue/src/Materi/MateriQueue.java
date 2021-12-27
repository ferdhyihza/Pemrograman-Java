package Materi;

import java.util.Collections;
import java.util.PriorityQueue;

public class MateriQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(100);
        pq.add(50);
        pq.add(75);
        pq.add(25);
        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.print(pq.remove() + " ");
        }
    }
}
