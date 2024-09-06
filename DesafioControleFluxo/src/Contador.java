import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite o numero um");
        int numeroUm = scanner.nextInt();

        System.out.println("Por favor digite o segundo numero");
        int numerDois = scanner.nextInt();

        try {
            contar(numeroUm, numerDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

        scanner.close();
    }

    static void contar (int numeroUm, int numeroDois) throws ParametrosInvalidosException{

        if (numeroUm > numeroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = numeroDois - numeroUm;
        
        for (int contador = 1; contador <= contagem; contador++) {
            System.out.println("Imprrimindo o numero " + contador);
        }
    }
}
