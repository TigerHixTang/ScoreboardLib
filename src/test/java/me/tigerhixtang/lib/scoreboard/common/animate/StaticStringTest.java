package me.tigerhixtang.lib.scoreboard.common.animate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StaticStringTest {

    @Test
    void alwaysReturnsTheSameValue() {
        StaticString animation = new StaticString("static");

        assertEquals("static", animation.current());
        assertEquals("static", animation.next());
        assertEquals("static", animation.previous());
    }
}
