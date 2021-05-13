package org.e2immu.example.immutables.object;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface StringList extends WithStringList {
    List<String> list();

    class Builder extends ImmutableStringList.Builder {}
}