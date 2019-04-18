import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void numericMathBoxTest() {
        Number n = 5.0;

        Number arr[] = {4.0};

        MathBox tester = new MathBox(arr);

        assertEquals(4.0, tester.summator(), "Сумма не равна 4!");

        tester.addObject(n);

        assertEquals(9.0, tester.summator(), "Сумма не равна 9!");

        tester.remove(4.0);

        assertEquals(5.0, tester.summator(), "Сумма не равна 5!");

        tester.splitter(2.5);

        assertEquals(2.0, tester.summator(), "Сумма не равна 2!");
    }

    @Test
    public void equalityMathBoxTest() {
        Number n1 = 5;
        Number n2 = 5;

        Number arr1[] = {n1};
        Number arr2[] = {n2};

        MathBox m1 = new MathBox(arr1);
        MathBox m2 = new MathBox(arr2);

        assertEquals(m1.toString(), m2.toString(), "Неверная строковое представление");
        assertEquals(m1, m2, "Неправильное сравнение");
        assertEquals(m1.hashCode(), m2.hashCode(), "Несовпадение кодов");
    }
}
