import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author FaceFeel
 * @Created 2018-05-06 10:42
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-*.xml")
public class UserTest {

    @Before
    private void run(){

    }

    @Test
    public void insertUser(){
    }
}
