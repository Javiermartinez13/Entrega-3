import java.util.*;
import java.util.stream.*;

public class operaciones {

    // 1
    public static int suma(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }

    // 2
    public static int factorial(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y);
    }

    // 3
    public static int potencia(int base, int exponente) {
        return IntStream.range(0, exponente).reduce(1, (acumulador, elemento) -> acumulador * base);
    }

    // 4
    public static int sumaLista(ArrayList<Integer> lista) {
        return lista.stream().reduce(0, Integer::sum);
    }

    // 5
    public static Double media(List<Double> lista) {
        double total = lista.stream().reduce(0.0, Double::sum);
        return total / lista.size();
    }

    // 6
    public static void desviacion(List<Double> lista) {
        double total = lista.stream().reduce(0.0, Double::sum);
        System.out.println("Desviación: " + total);
    }

    // 7
    public static int sumapares(int n) {
        return IntStream.rangeClosed(0, n).filter(x -> x % 2 == 0).sum();
    }

    // 8
    public static int listaenteros(List<Integer> lista) {
        return lista.stream().filter(e -> e % 2 == 0).reduce(0, Integer::sum);
    }

    // 9
    public static ArrayList<Integer> ListaPares(ArrayList<Integer> lista) {
        return lista.stream().filter(n -> n >= 2 && n % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    // 10
    public static ArrayList<Integer> listaPar(int n) {
        return IntStream.rangeClosed(2, n).filter(x -> x % 2 == 0).boxed().collect(Collectors.toCollection(ArrayList::new));
    }

    // 11
    public static int productoEscalar(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        return IntStream.range(0, lista1.size()).map(i -> lista1.get(i) * lista2.get(i)).sum();
    }

    // 12
    public static void main(String[] args) {
        int n = 10;

        long resultado = Stream.iterate(new long[]{0, 1},
                fib -> new long[]{fib[1], fib[0] + fib[1]})
                .limit(n)
                .reduce((first, second) -> second)
                .orElse(new long[]{0, 0})[0];

    }
}
