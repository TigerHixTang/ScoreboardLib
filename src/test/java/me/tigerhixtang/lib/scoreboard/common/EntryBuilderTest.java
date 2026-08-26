package me.tigerhixtang.lib.scoreboard.common;

import me.tigerhixtang.lib.scoreboard.type.Entry;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EntryBuilderTest {

    @Test
    void buildsFormattedEntriesWithDescendingPositions() {
        List<Entry> entries = new EntryBuilder()
                .next("&aOnline")
                .blank()
                .next(null)
                .build();

        assertEquals(3, entries.size());
        assertEquals("\u00a7aOnline", entries.get(0).getName());
        assertEquals("", entries.get(1).getName());
        assertEquals("", entries.get(2).getName());
        assertEquals(3, entries.get(0).getPosition());
        assertEquals(2, entries.get(1).getPosition());
        assertEquals(1, entries.get(2).getPosition());
    }

    @Test
    void truncatesEntriesToFortyEightCharacters() {
        String longEntry = "x".repeat(60);

        Entry entry = new EntryBuilder().next(longEntry).build().getFirst();

        assertEquals(48, entry.getName().length());
    }
}
