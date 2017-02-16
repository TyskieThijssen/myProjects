package oose.dea;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Thijs on 16-2-2017.
 */
public class StringKataTest {
    @Test
    public void testEmptyString(){
        StringKata sut = new StringKata();
        int expected = 0;
        int actual = sut.add("");
        assertEquals(expected, actual);
    }

}