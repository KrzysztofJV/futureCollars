package com.futurecollars.taskTwo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OwnQueueImplementationTest {

    @Test
    public void shouldInsertIntoQueue() {
        OwnQueueImplementation queue = new OwnQueueImplementation();

        queue.add(1);

        assertEquals(1, queue.element());
    }

    @Test
    public void shouldRemoveFromQueue() {
        OwnQueueImplementation queue = new OwnQueueImplementation();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.remove();

        assertEquals(2, queue.element());
    }

    @Test
    public void shouldReturnQueueSizeWhenAdded() {
        OwnQueueImplementation queue = new OwnQueueImplementation();

        queue.add(1);

        assertEquals(1, queue.getSize());
    }

    @Test
    public void shouldReturnFalseWhenEmptyQueue() {
        OwnQueueImplementation queue = new OwnQueueImplementation();

        assertTrue(queue.isEmpty());
    }
}