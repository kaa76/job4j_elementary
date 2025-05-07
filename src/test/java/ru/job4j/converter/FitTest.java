package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman180Then80dot5() {
        short input = 180;
        double expected = 80.5;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenManHeight184ThenWeight95Point9() {
        int height = 184;
        double expected = (height - 100) * 1.15;
        double actual = Fit.manWeight(height);
        assertThat(actual).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenWomanHeight184ThenWeight83Point1() {
        int height = 184;
        double expected = (height - 110) * 1.15;
        double actual = Fit.womanWeight(height);
        assertThat(actual).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenManHeightZeroThenThrowException() {
        int height = 0;
        assertThatThrownBy(() -> Fit.manWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Рост должен быть положительным числом");
    }

    @Test
    void whenWomanHeightNegativeThenThrowException() {
        int height = -170;
        assertThatThrownBy(() -> Fit.womanWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Рост должен быть положительным числом");
    }
}