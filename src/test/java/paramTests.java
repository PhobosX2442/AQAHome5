import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;


public class paramTests {

    @ParameterizedTest
    @MethodSource("lineage")
    @DisplayName("Количество букв в строке")
    void testLineage(String word, int expected) throws InterruptedException {
        assertEquals(expected, word.length());
        Thread.sleep(500);
    }


    static Stream<Arguments> lineage() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("hello", 5),
                Arguments.of("аргумент", 8)
        );

    }
}