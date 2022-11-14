
package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void bishopBlackPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell expected = bishopBlack.position();
        Cell actual = Cell.A1;
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void bishopBlackCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Figure actual = bishopBlack.copy(Cell.A3);
        assertThat(bishopBlack.position()).isEqualTo(actual.position());
    }

    @Test
    public void bishopBlackWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(actual).isEqualTo(expected);
    }
}