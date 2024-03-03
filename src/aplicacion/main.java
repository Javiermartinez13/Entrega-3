package aplicacion;

public class main {
    



    public static void main(String[] args) {
        // 1
        System.out.println("Suma: " + suma(5));

        // 2
        System.out.println("Factorial: " + factorial(5));

        // 3
        System.out.println("Potencia: " + potencia(2, 3));

        // 4
        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Suma de lista: " + sumaLista(lista1));

        // 5
        List<Double> lista2 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println("Media: " + media(lista2));

        // 6
        List<Double> lista3 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        desviacion(lista3);

        // 7
        System.out.println("Suma de pares hasta 10: " + sumapares(10));

        // 8
        ArrayList<Integer> lista4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Suma de enteros pares: " + listaenteros(lista4));

        // 9
        ArrayList<Integer> lista5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Lista de pares mayores o iguales a 2: " + ListaPares(lista5));

        // 10
        System.out.println("Lista de pares hasta 10: " + listaPar(10));

        // 11
        ArrayList<Integer> lista6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> lista7 = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        System.out.println("Producto Escalar: " + productoEscalar(lista6, lista7));

        // 12
        int n = 10;
        System.out.println("Elemento " + n + "-ésimo de la sucesión de Fibonacci: " +
                Stream.iterate(new long[]{0, 1},
                        fib -> new long[]{fib[1], fib[0] + fib[1]})
                        .limit(n)
                        .reduce((first, second) -> second)
                        .orElse(new long[]{0, 0})[0]);
    }
}