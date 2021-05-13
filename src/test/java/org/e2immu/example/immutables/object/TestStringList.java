package org.e2immu.example.immutables.object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringList {

    @Test
    public void test() {
        StringList stringList = new StringList.Builder().addList("a").addList("b").build();
        assertEquals("[a, b]", stringList.list().toString());
        assertEquals("StringList{list=[a, b]}", stringList.toString());
    }

    @Test
    public void test2() {
        StringList stringList = new StringList.Builder().addList("a").build();
        StringList list2 = stringList.withList("c");
        assertEquals("[c]", list2.list().toString());
    }
}
