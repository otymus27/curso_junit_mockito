package br.otymus.testes.parametros;

import br.otymus.testes.math.CalculadoraAPP;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraAPPTest {

    CalculadoraAPP calc;

    @BeforeEach
    void BeforeEach() {
        calc = new CalculadoraAPP();
        System.out.println("BeforeEach rodando!");
    }

    @DisplayName("Test com parametros")
    @ParameterizedTest
    //@MethodSource("testDividirInputParameters")

//    @CsvSource({
//            "6.0, 2, 3.0",
//            "71.0, 14.0, 5.07",
//            "18.3, 3.1, 5.90"
//    })

    @CsvFileSource(resources = "/testDivision.csv")

    void testDividir(double a, double b, double expected) {
        // Arrange

        // Act
        Double actual = calc.dividir(a,b);

        // Assertion
        assertEquals(expected,actual,2D,
                () -> a + " / " + b +
                        "O teste não produziu "+expected+ " como era esperado");
    }

//    public static Stream<Arguments> testDividirInputParameters() {
//        return Stream.of(
//                Arguments.of(6.2D,2d,3.0D),
//                Arguments.of(71D, 14D, 5.07D),
//                Arguments.of(18D, 3.1D, 5.90D)
//        );
//    }

    @ParameterizedTest
    @ValueSource(strings = {"Pelé", "Senna", "Ronaldo"})
    void testValueSource(String firstName){
        System.out.println(firstName);
        assertNotNull(firstName);
    }

}