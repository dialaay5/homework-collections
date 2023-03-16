package testing.exercise2;

import com.exercise2.MySet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MySetTest {
    @Test
    public void checks_if_the_element_appears_once(){
        MySet<Integer> integer_arrayList = new MySet<>(new ArrayList<>(List.of(1,10,9,7)));
        integer_arrayList.insertItem(2);
        integer_arrayList.insertItem(1);

        int expected = 5;
        Number actual = integer_arrayList.listSize();

        Assertions.assertEquals(expected, actual);
    }

}
