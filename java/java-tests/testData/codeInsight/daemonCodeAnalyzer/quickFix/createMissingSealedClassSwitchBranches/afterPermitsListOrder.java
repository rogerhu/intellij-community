// "Create missing branches: 'A', 'AA', 'AB', and 'AC'" "true-preview"
sealed class A permits AC, AA, AB {}
final class AA extends A {}
sealed class AB extends A permits ABC, ABA {}
non-sealed class AC extends A {}
final class ABA extends AB {}
non-sealed class ABC extends AB {}

class Test {
  void test(A a) {
    switch (a) {
        case AC ac -> {
        }
        case AA aa -> {
        }
        case AB ab -> {
        }
        case A a1 -> {
        }
    }
  }
}