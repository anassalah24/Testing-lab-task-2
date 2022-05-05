import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

class problemsTest {


    /* Tests for EvenOddChecker */
  /*  @Test
    void checkEven1() {
        problems tester = new problems();
        assertEquals("even",tester.EvenOddChecker(44));
    }
    @Test
    void checkEven2() {
        problems tester = new problems();
        assertEquals("even",tester.EvenOddChecker(2));

    }
    @Test
    void checkEven3() {
        problems tester = new problems();
        assertEquals("even",tester.EvenOddChecker(1231432));
    }
    @Test
    void checkzero() {
        problems tester = new problems();
        assertEquals("even",tester.EvenOddChecker(0));
    }
    @Test
    void checkOdd1() {
        problems tester = new problems();
        assertEquals("odd",tester.EvenOddChecker(31));
    }
    @Test
    void checkOdd2() {
        problems tester = new problems();
        assertEquals("odd",tester.EvenOddChecker(1));
    }
    @Test
    void checkOdd3() {
        problems tester = new problems();
        assertEquals("odd",tester.EvenOddChecker(23451));
    }
    @Test
    void checkNegative1() {
        problems tester = new problems();
        assertThrows(IllegalArgumentException.class,() -> {
            tester.EvenOddChecker(-1);
        });
    }
    @Test
    void checkNegative2() {
        problems tester = new problems();
        assertThrows(IllegalArgumentException.class,() -> {
            tester.EvenOddChecker(-14);
        });
    }
    @Test
    void checkNegative3() {
        problems tester = new problems();
        assertThrows(IllegalArgumentException.class,() -> {
            tester.EvenOddChecker(-142141);
        });
    }*/


    /* Tests for maxAndmin */





    /*
    @Test
    void evenelements() {
        problems tester = new problems();
        int[] test={ 12,44,34,3,6,50,33,40 };
        int[] maxmin = {50,3};
        int[] actual = tester.maxAndmin(test);
        boolean result = Arrays.equals(maxmin,actual);
        assertTrue(result);

    }

    @Test
    void oddelements() {
        problems tester = new problems();
        int[] test={ 23,56,63,1,35,123,53 };
        int[] maxmin = {123,1};
        int[] actual = tester.maxAndmin(test);
        boolean result = Arrays.equals(maxmin,actual);
        assertTrue(result);
    }

    @Test
    void emptyarray() {
        problems tester = new problems();
        int[] test={};
        assertThrows(IllegalArgumentException.class,() -> {
            tester.maxAndmin(test);
        });

    }

    @Test
    void singleelements() {
        problems tester = new problems();
        int[] test={ 23 };
        int[] maxmin = {23,23};
        int[] actual = tester.maxAndmin(test);
        boolean result = Arrays.equals(maxmin,actual);
        assertTrue(result);
    }

    @Test
    void duplicateElements1() {
        problems tester = new problems();
        int[] test={23,16,13,10,15,23,23 };
        int[] maxmin = {23,10};
        int[] actual = tester.maxAndmin(test);
        boolean result = Arrays.equals(maxmin,actual);
        assertTrue(result);
    }

    @Test
    void duplicateElements2() {
        problems tester = new problems();
        int[] test={54,54,54,54,54};
        int[] maxmin = {54,54};
        int[] actual = tester.maxAndmin(test);
        boolean result = Arrays.equals(maxmin,actual);
        assertTrue(result);
    }

    @Test
    void Inorderelements() {
        problems tester = new problems();
        int[] test={1,2,3,4,5,6,7,8};
        int[] maxmin = {8,1};
        int[] actual = tester.maxAndmin(test);
        boolean result = Arrays.equals(maxmin,actual);
        assertTrue(result);
    }

    @Test
    void OutOfOrderElements() {
        problems tester = new problems();
        int[] test={8,7,6,5,4,3,2,1};
        int[] maxmin = {8,1};
        int[] actual = tester.maxAndmin(test);
        boolean result = Arrays.equals(maxmin,actual);
        assertTrue(result);
    }
     */

    /*Tests for question 3 */


    @Test
    public void Test1() throws IOException {
        State test = new State();
        test.setMyInput("abbcd");
        test.State();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test1.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    public void Test2() throws IOException {
        State test = new State();
        test.setMyInput("Aa");
        test.State();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test2.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    public void Test3() throws IOException {
        State test = new State();
        test.setMyInput("aaa");
        test.State();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test3.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    public void Test4() throws IOException {
        State test = new State();
        test.setMyInput("cdb");
        test.State();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test4.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);

    }

    @Test
    public void Test5() throws IOException {
        State test = new State();
        test.setMyInput("");
        test.State();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test5.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    public void Test6() throws IOException {
        State test = new State();
        test.setMyInput("caaaa");
        test.State();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test6.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    public void Test7() throws IOException {
        State test = new State();
        test.setMyInput("ba");
        test.State();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test7.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    public void Test8() throws IOException {
        State test = new State();
        test.setMyInput("cb");
        test.State();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test8.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    public void Test9() throws IOException {
        State test = new State();
        test.setMyInput("cab");
        test.State();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test9.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    public void Test10() throws IOException {
        State test = new State();
        test.setMyInput("caab");
        test.State();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test10.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    public void Test11() throws IOException {
        State test = new State();
        test.setMyInput("caaab");
        test.State();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test11.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    public void Test12() throws IOException {
        State test = new State();
        test.setMyInput("caaaab");
        test.State();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test12.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
}