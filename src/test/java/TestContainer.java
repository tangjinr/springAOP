import com.tangz.springaop.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

    private ApplicationContext context = null;
    private Calculator calculator = null;

    @Before
    public void before() throws Exception {
        context = new ClassPathXmlApplicationContext("application-context.xml");
        calculator = context.getBean("calculator", Calculator.class);
    }

    @After
    public void after() throws Exception {
        ((ConfigurableApplicationContext) context).close();
    }


    @Test
    public void testAOP() {
        System.out.println(calculator.add(1, 1));
        System.out.println(calculator.sub(5, 2));
    }
}
