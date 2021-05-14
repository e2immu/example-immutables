package org.e2immu.example.immutables.object;

import org.immutables.value.Value;

@Value.Immutable
public interface Primitive {
    int value();

    class Builder extends ImmutablePrimitive.Builder {}
}