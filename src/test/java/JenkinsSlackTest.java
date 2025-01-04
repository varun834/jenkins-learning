import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JenkinsSlackTest {

    @Test
    @Parameters({"num1", "num2"})
    public void test(String num1, String num2){
        System.out.println("Addition answer is :: "+(num1+num2));
    }
}
