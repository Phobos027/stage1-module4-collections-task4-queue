package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue <String> queue = new PriorityQueue<>(10, Comparator.reverseOrder());
        for (String wordFirst : firstList) {
            queue.offer(wordFirst);
        }
        for (String secondWord : secondList) {
            queue.offer(secondWord);
        }
        return queue;
    }


}
