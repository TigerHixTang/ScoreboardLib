package me.tigerhixtang.lib.scoreboard.common.animate;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FrameAnimatedStringTest {

    @Test
    void cyclesForwardAndBackwardThroughFrames() {
        FrameAnimatedString animation = new FrameAnimatedString("first", "second", "third");

        assertNull(animation.current());
        assertEquals("first", animation.next());
        assertEquals("second", animation.next());
        assertEquals("first", animation.previous());
        assertEquals("first", animation.current());
    }

    @Test
    void acceptsAdditionalFramesFromBothConstructors() {
        FrameAnimatedString fromVarargs = new FrameAnimatedString("first");
        fromVarargs.addFrame("second");

        FrameAnimatedString fromList = new FrameAnimatedString(List.of("first"));
        fromList.addFrame("second");

        assertEquals(2, fromVarargs.getTotalLength());
        assertEquals("second", fromVarargs.getString(1));
        assertEquals(2, fromList.getTotalLength());
        assertEquals("second", fromList.getString(1));
    }
}
