import goit.gojava2.javacore.project13.FibonacciSequence;
import goit.gojava2.javacore.project13.NegativeIntegerException;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequenceTest {
    private static FibonacciSequence fibonacciSequence;

    @BeforeClass
    public static void setUp() {
        fibonacciSequence= new FibonacciSequence();
    }

    @Test
    public void testStart() throws Exception {
    }

    @Test(expected = NegativeIntegerException.class)
    public void testMaxLimitNumber() throws Exception {
        final int number = -5;
        fibonacciSequence.checkInteger(number);
    }

    @Test
    public void testGetFibSeq()  {
        int number = 5;
        final List<Integer> result  = fibonacciSequence.getFibSeq(number);

        List<Integer> sequence = new ArrayList<>();

        sequence.add(1);
        sequence.add(1);
        sequence.add(2);
        sequence.add(3);

        Assert.assertEquals(sequence,result);
    }
}
