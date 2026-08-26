package me.tigerhixtang.lib.scoreboard.common.animate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HighlightedStringTest {

    @Test
    void highlightsEachCharacterAndPreservesFormatting() {
        HighlightedString animation = new HighlightedString("A B", "&7", "&e", "[", "]");

        assertEquals(3, animation.getTotalLength());
        assertEquals("[&7&eA&7 B]", animation.next());
        assertEquals("[&7A B]", animation.next());
        assertEquals("[&7A &eB&7]", animation.next());
        assertEquals("[&7&eA&7 B]", animation.next());
    }
}
