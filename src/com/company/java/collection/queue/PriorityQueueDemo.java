package com.company.java.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);

        System.out.println(pq);

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
