package gmail.smoljarn.lesson30_interfaces;

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
    public void push(int value) {
        if (isFull()){
            System.out.println("Помилка: стек повний");
            return;
        }
        stack[++top] = value;
        System.out.println("Додано: " + value);
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Помилка: стек пустий! Повертаю " + Integer.MIN_VALUE);
            return Integer.MIN_VALUE;
        }
        return stack[top--];
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Помилка: стек пустий! Повертаю " + Integer.MIN_VALUE);
            return  Integer.MIN_VALUE;
        }
        return stack[top];
    }
}
