package com.futurecollars.taskTwo;

public class OwnQueueImplementation implements OwnQueue {

    private int size;
    private Node front, back;

    public OwnQueueImplementation() {
        size = 0;
        front = null;
        back = null;
    }

    public boolean add(Integer value) {
        Node node = new Node(value);
        if (isEmpty()) {
            front = node;
        } else {
            back.setNext(node);
        }
        back = node;
        size++;
        return true;
    }

    public Integer remove() {
        if (isEmpty()) {
            throw new RuntimeException("No elements");
        }
        int value = front.getValue();
        front = front.getNext();
        size--;
        if (isEmpty()) {
            back = null;
        }
        return value;
    }

    public Integer element() {
        if (isEmpty()) {
            throw new RuntimeException("No elements");
        }
        return front.getValue();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

