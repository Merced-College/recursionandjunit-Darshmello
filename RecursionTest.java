//Darsh Gangakhedkar November 8 2024
//Nov 8 2024
//Junit Testing
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursionTest {

    @Test
    public void testCount8() {
        assertEquals(1, Recursion.count8(8));
        assertEquals(2, Recursion.count8(818));
        assertEquals(4, Recursion.count8(8818));
        assertEquals(0, Recursion.count8(123));
        assertEquals(5, Recursion.count8(88888));
    }

    @Test
    public void testCountHi() {
        assertEquals(1, Recursion.countHi("xxhixx"));
        assertEquals(2, Recursion.countHi("xhixhix"));
        assertEquals(1, Recursion.countHi("hi"));
        assertEquals(0, Recursion.countHi("hello"));
        assertEquals(3, Recursion.countHi("hihihi"));
    }

    @Test
    public void testCountHi2() {
        assertEquals(1, Recursion.countHi2("ahixhi"));
        assertEquals(2, Recursion.countHi2("ahibhi"));
        assertEquals(0, Recursion.countHi2("xhixhi"));
        assertEquals(1, Recursion.countHi2("hi"));
        assertEquals(0, Recursion.countHi2("xhi"));
    }

    @Test
    public void testStrCount() {
        assertEquals(2, Recursion.strCount("catcowcat", "cat"));
        assertEquals(1, Recursion.strCount("catcowcat", "cow"));
        assertEquals(0, Recursion.strCount("catcowcat", "dog"));
        assertEquals(3, Recursion.strCount("catcatcat", "cat"));
        assertEquals(1, Recursion.strCount("hellohello", "hello"));
    }

    @Test
    public void testStringClean() {
        assertEquals("yza", Recursion.stringClean("yyzzza"));
        assertEquals("abcd", Recursion.stringClean("abbbcdd"));
        assertEquals("Helo", Recursion.stringClean("Hello"));
        assertEquals("a", Recursion.stringClean("aaaaa"));
        assertEquals("abc", Recursion.stringClean("aabbcc"));
    }
}
