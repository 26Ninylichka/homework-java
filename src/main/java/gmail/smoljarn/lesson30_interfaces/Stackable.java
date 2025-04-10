package gmail.smoljarn.lesson30_interfaces;

import java.util.Optional;

public interface Stackable {
    boolean  isEmpty();
    boolean  isFull() ;
    void push(int value) throws StackIsFullException;
    int pop() throws StackIsEmptyException;
    int  peek() throws StackIsEmptyException;
    Optional<Integer> safePop();
}
