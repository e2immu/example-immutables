package org.e2immu.example.immutables.use;

import org.e2immu.annotation.E2Container;
import org.e2immu.annotation.NotNull;
import org.e2immu.example.immutables.object.StringList;

import java.util.List;

public class Example {

    @NotNull
    @E2Container
    public static List<String> asList(int i, String j) {
        StringList stringList = new StringList.Builder().addList(i + "").addList(j).build();
        return stringList.list();
    }
}
