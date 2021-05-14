package org.e2immu.example.immutables.object;

import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

/* taken from their website as first example */

@Value.Immutable
public interface ValueObject extends WithValueObject {
    // WithValueObject is not yet generated, We extend With* to inherit `with*` method signatures
    String getName();
    List<Integer> getCounts();
    Optional<String> getDescription();

    class Builder extends ImmutableValueObject.Builder {}
    // ImmutableValueObject.Builder will be generated and
    // our builder will inherit and reexport methods as it's own.
    // Static nested Builder will inherit all the public method
    // signatures of ImmutableValueObject.Builder
}