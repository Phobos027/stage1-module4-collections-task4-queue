package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> cardDeck = new ArrayDeque<>();
        //по очереди кладут в общую колоду по 2 карты
        cardDeck.offer(firstQueue.remove());
        cardDeck.offer(firstQueue.remove());
        cardDeck.offer(secondQueue.remove());
        cardDeck.offer(secondQueue.remove());
//
        while (firstQueue.peek() != null && secondQueue.peek() != null) {
            //первый игрок делает ход
            firstQueue.offer(cardDeck.removeLast());
            cardDeck.offerLast(firstQueue.remove());
            cardDeck.offerLast(firstQueue.remove());
            //второй игрок делает ход
            secondQueue.offer(cardDeck.removeLast());
            cardDeck.offerLast(secondQueue.remove());
            cardDeck.offerLast(secondQueue.remove());
        }
        return cardDeck;
    }
}
