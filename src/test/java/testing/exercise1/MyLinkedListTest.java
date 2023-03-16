package testing.exercise1;

import com.exercise1.MyLinkedList;
import com.exercise1.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class MyLinkedListTest {
    static Random random = new Random();
    @Test
    public void testReverse_1000() {
        // Arrange
        int max = 10;
        int[] numbers = new int[max];

        MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>(new MyNode<>(random.nextInt(100)));

        numbers[0] = linkedList.getRoot().getData();
        MyNode<Integer> current = linkedList.getRoot();

        for (int i = 1; i < max; i++) {
            numbers[i] = random.nextInt(100);
            current.setNext(new MyNode<>(numbers[i]));
            current = current.getNext();
        }

        // Activate
        linkedList.print_reverse_LinkedList();

        // Assert
        current = linkedList.getRoot();
        int i = max - 1;
        while (i >= 0) {
            int expected = numbers[i];
            int actual = current.getData();
            Assertions.assertEquals(expected , actual);
            current = current.getNext();
            i--;
        }

    }
}
