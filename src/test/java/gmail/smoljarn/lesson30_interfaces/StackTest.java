package gmail.smoljarn.lesson30_interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void shouldPushElementToStack() throws StackIsFullException, StackIsEmptyException {
        // given
        Stack stack = new Stack(3);
        // when
        stack.push(10);
        stack.push(20);
        stack.push(20);
        // then
        assertEquals(20, stack.peek());
    }

    @Test
    void shouldThrowsFullException () throws StackIsFullException {
        // given
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(2);
        // when+then
        assertThrows(StackIsFullException.class, () -> stack.push(3));
    }

    @Test
    void shouldPeekReturnsTopElement() throws StackIsFullException, StackIsEmptyException {
        // given
        Stack stack = new Stack(3);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        // when + then
        assertEquals(5, stack.peek());

    }
    @Test
    void shouldPeekThrowsEmptyException() {
        // given
        Stack stack = new Stack(4);
        // when + then
        assertThrows(StackIsEmptyException.class, () -> stack.peek());
    }

}