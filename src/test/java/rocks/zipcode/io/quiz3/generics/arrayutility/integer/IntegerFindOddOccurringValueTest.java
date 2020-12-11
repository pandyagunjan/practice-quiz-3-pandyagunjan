package rocks.zipcode.io.quiz3.generics.arrayutility.integer;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.generics.ArrayUtility;

/**
 * @author leon on 09/12/2018.
 */
public class IntegerFindOddOccurringValueTest {
    @Test
    public void test1Test() {
        // given
        Integer expected = 15;
        Integer[] array = new Integer[]{1, 1, 2, 2, 3, 3, expected, expected, expected};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.findOddOccurringValue();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2Test() {
        // given
        Integer expected = 118;
        Integer[] array = new Integer[]{1, 1, 6, 6, 9, 9, expected, expected, expected, expected, expected};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.findOddOccurringValue();

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3Test() {
        // given
        Integer expected = 130;
        Integer[] array = new Integer[]{11, 11, 11, 11, 20, 20, 27, 27, 27, 27, expected, expected, expected, expected, expected, expected, expected};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.findOddOccurringValue();

        // then
        Assert.assertEquals(expected, actual);
    }
}
