package gmail.smoljarn.lesson30_interfaces;

public interface Stackable {
    boolean  isEmpty();
    boolean  isFull();
    void push(int value);
    int pop();
    int  peek();
}
