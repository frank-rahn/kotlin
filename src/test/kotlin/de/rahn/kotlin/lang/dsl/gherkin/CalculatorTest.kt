package de.rahn.kotlin.lang.dsl.gherkin

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    fun `adds up numbers (classic)`() {
        // given
        val subject = Calculator()

        // when
        val result = subject.add(2, 3)

        // then
        assertThat(result).isEqualTo(5)
    }

    @Test
    fun `adds up numbers (gherkin)`() {
        given {
            Calculator()
        }.on {
            add(2, 3)
        }.then {
            isEqualTo(5)
        }
    }
}
