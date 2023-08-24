import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SimpleSteps {

        @Parameterized.Parameter(0)
        public int operand1;

        @Parameterized.Parameter(1)
        public int operand2;

        @Parameterized.Parameter(2)
        public int expectedResult;

        @Parameterized.Parameters(name = "operand1 = {0} | operand2 = {1} | expectedResult = {2}")
        public static Collection<Object[]> dataProvide() {
                return Arrays.asList(new Object[][]{
                        {13, 2, 4},
                        {5, 4, 1},
                        {30, 20, 30}
                });
        }

        @Test
        public void checkSum() {
                int actualResult = operand1 - operand2;
                Assert.assertEquals("Sum should be equal to expectedResult", expectedResult, actualResult);
        }
}