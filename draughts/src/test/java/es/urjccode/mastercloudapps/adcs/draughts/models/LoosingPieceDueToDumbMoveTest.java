package es.urjccode.mastercloudapps.adcs.draughts.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LoosingPieceDueToDumbMoveTest extends GameTest {

    @Test
    void testLoosingRandomPieceAfterWhitePlayerNotEating() {
        this.setGame(Color.WHITE,
            "        ",
            "        ",
            "        ",
            "        ",
            "   n    ",
            "  b     ",
            "        ",
            "        ");
        this.setExpectedGame(Color.BLACK,
            "        ",
            "        ",
            "        ",
            "        ",
            "   n    ",
            "        ",
            "        ",
            "        ");
        this.assertMove(
            new Coordinate(5, 2),
            new Coordinate(4, 1)
        );
    }

    @Test
    void testLoosingRandomPieceAfterBlackPlayerNotEating() {
        this.setGame(Color.BLACK,
            "        ",
            "        ",
            "        ",
            "    n   ",
            "   b    ",
            "        ",
            "        ",
            "        ");

        this.setExpectedGame(Color.WHITE,
            "        ",
            "        ",
            "        ",
            "        ",
            "   b    ",
            "        ",
            "        ",
            "        ");
        this.assertMove(
            new Coordinate(3, 4),
            new Coordinate(4, 5)
        );
    }

    private void assertMove(Coordinate... coordinates) {
        assertNull(this.game.move(coordinates));
        assertEquals(this.game, this.expectedGame);
    }
}
