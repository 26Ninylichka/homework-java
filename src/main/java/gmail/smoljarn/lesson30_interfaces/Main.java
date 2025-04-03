package gmail.smoljarn.lesson30_interfaces;

public class Main {
    public static void main(String[] args) {

        Stackable stack = new Stack(10);
        System.out.println("Стек пуст? " + stack.isEmpty());

        stack.push(28);
        stack.push(49);
        stack.push(106);

        System.out.println("Верхній елемент: " + stack.peek());

        System.out.println("Дістали: " + stack.pop());
        System.out.println("Дістали: " + stack.pop());
        System.out.println("Дістали: " + stack.pop());
        stack.pop();

        System.out.println("Стек пуст? " + stack.isEmpty());

    }
}
