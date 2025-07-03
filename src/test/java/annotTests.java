import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class annotTests {
    private Example number;

    @BeforeAll
    static void startTest() {
        System.out.println("Начинаю прогон тестов");
    }
    @BeforeEach
    void beforeTest() {
        System.out.println("Тест запущен");
        number = new Example();
    }




    @Test    @Order(1)
    //тест на чётное число
    void even() {
        boolean even = number.number(2);
        Assertions.assertTrue(even);
    }

    //тест на нечётное число
    @Test    @Order(2)
    void odd() {
        boolean odd = number.number(3);
        Assertions.assertFalse(odd);
    }

    //тест на пустую строку
    @Test
    void notEmpty() {
        String testString = "Заглушка";
        Assertions.assertNotNull(testString);
        Assertions.assertNotEquals(0, testString.length());
    }





    @AfterEach
    void afterTest() {
        System.out.println("Тест окончен");
    }
    @AfterAll
    static void finishTest() {
        System.out.println("Прогон тестов успешно завершен");
    }
}
