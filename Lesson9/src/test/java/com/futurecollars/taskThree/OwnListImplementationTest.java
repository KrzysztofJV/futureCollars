package com.futurecollars.taskThree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnListImplementationTest {

    @Test
    public void shouldAddDifferentTypesToList() {
        OwnListImplementation<String> stringList = new OwnListImplementation<>();
        stringList.add("1");

        OwnListImplementation<Integer> integerList = new OwnListImplementation<>();
        integerList.add(1);

        assertEquals("1", stringList.get(0));
        assertEquals(1, integerList.get(0));
    }

    @Test
    public void shouldRemoveObjectFromList() {
        OwnListImplementation<String> stringList = new OwnListImplementation<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        stringList.remove("2");

        assertEquals("3", stringList.get(1));
    }

    @Test
    public void shouldReturnListSize() {
        OwnListImplementation<String> stringList = new OwnListImplementation<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        assertEquals(3, stringList.size());
    }
}