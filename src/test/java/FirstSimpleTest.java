import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Первый тест")
public class FirstSimpleTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("@BeforeAll method!");
    }
    @DisplayName("Простой тест на assertEquals")
    @Test
    void firstTest(){
        Assertions.assertEquals(1,1);
    }
    @DisplayName("Простой тест на assertTrue")
    @Test
    void secondTest(){
        Assertions.assertTrue(7>6);
    }

}
