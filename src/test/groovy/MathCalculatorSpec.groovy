import spock.lang.Specification
import spock.lang.Unroll

import static com.prac.calculator.MathCalculator.factorialOf

class MathCalculatorSpec extends Specification {

    @Unroll
    def "Factorial of #number should be #expected_result"() {
        given:
            def result = factorialOf(number)

        expect:
            result == expected_result

        where:
            number | expected_result
            0      | 1
            1      | 1
            3      | 6
            4      | 24
    }
}
