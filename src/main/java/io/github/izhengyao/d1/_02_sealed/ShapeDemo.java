package io.github.izhengyao.d1._02_sealed;
public class ShapeDemo {}
 sealed interface Shape permits Circle,Square,Triangle{}

record Circle(String x) implements Shape {}
final class Square implements Shape {}
non-sealed class Triangle implements Shape{}
