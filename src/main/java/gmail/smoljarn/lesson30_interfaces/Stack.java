package gmail.smoljarn.lesson30_interfaces;

import java.util.Optional;

public class Stack implements Stackable {
    private int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == stack.length - 1;
    }

    @Override
    public void push(int value) throws StackIsFullException {
        if (isFull()) {
           throw new StackIsFullException("Помилка: стек повний");
        }
        stack[++top] = value;
        System.out.println("Додано: " + value);
    }

    @Override
    public int pop() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException("Помилка: стек пустий!");
        }
        return stack[top--];
    }

    @Override
    public int peek() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException("Помилка: стек пустий!");
        }
        return stack[top];
    }
    @Override
    public Optional<Integer> safePop() {
        if (isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(stack[top--]);
    }
}
