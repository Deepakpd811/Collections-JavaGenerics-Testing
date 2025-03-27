package com.brigelabz.testingbasic;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>(); // Create a new list before each test
    }

    @Test
    void testAddElement() {
        ListManager.addElement(list, 10);
        ListManager.addElement(list, 20);
        assertEquals(2, ListManager.getSize(list));
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() {
        ListManager.addElement(list, 10);
        ListManager.addElement(list, 20);
        assertTrue(ListManager.removeElement(list, 10), "10 should be removed");
        assertFalse(list.contains(10), "List should not contain 10 after removal");
        assertEquals(1, ListManager.getSize(list), "List should have 1 element after removal");
    }

    @Test
    void testRemoveNonExistentElement() {
        assertFalse(ListManager.removeElement(list, 30), "Removing non-existent element should return false");
    }

    @Test
    void testGetSize() {
        assertEquals(0, ListManager.getSize(list), "New list should be empty");
        ListManager.addElement(list, 5);
        assertEquals(1, ListManager.getSize(list), "List should have 1 element after adding");
    }
}