package gmail.smoljarn.lesson30_interfaces;

public class Main {
    public static void main(String[] args) {

        Stackable stack = new Stack(10);

        try {
            stack.pop();
        } catch (StackIsEmptyException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            stack.push(133);
        } catch (StackIsFullException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        System.out.println("Стек пуст? " + stack.isEmpty());

        try {
            stack.push(28);
            stack.push(49);
            stack.push(106);
        }catch (StackIsFullException e) {
            System.out.println("Помилка при додаванні: " + e.getMessage());
        }
        try {
            System.out.println("Верхній елемент: " + stack.peek());
        } catch (StackIsEmptyException e) {
            System.out.println("Помилка при перегляді верхнього елементу: " + e.getMessage());
        }

        try {
            System.out.println("Дістали: " + stack.pop());
            System.out.println("Дістали: " + stack.pop());
            System.out.println("Дістали: " + stack.pop());
            stack.pop();
        } catch (StackIsEmptyException e) {
            System.out.println("Помилка при видаленні: " + e.getMessage());

        }
        System.out.println("Стек пуст? " + stack.isEmpty());
    }
}
