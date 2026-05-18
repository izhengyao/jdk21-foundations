package io.github.izhengyao.d1._01_record
public record RangeWithCompactCtor(int low, int high) {
    public RangeWithCompactCtor {
        if (low > high) {
            throw new IllegalArgumentException("low > high");
        }
    }
}
