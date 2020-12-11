package rocks.zipcode.io.quiz3.fundamentals.vowelutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.fundamentals.VowelUtils;

/**
 * @author leon on 09/12/2018.
 */
public class GetIndexOfFirstVowelTest {
    @Test
    public void test1() {
        // given
        String input = "Burp";
        Integer expected = 1;

        // when
        Integer actual = VowelUtils.getIndexOfFirstVowel(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String input = "Psych!";
        Integer expected = -1;

        // when
        Integer actual = VowelUtils.getIndexOfFirstVowel(input);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        String input = "Blooper";
        Integer expected = 2;

        // when
        Integer actual = VowelUtils.getIndexOfFirstVowel(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
