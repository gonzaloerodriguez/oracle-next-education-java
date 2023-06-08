public class PracticaCondicionales {
    public static void main(String[] args) {
        // if if else
        double valorCompra = 250.0;
        double valorCondescuento = 0;
        if (valorCompra >= 100 && valorCompra <= 199.99) {
            valorCondescuento = valorCompra - valorCompra * 0.1;
        } else if (valorCompra >= 200 && valorCompra <= 299.99) {
            valorCondescuento = valorCompra - valorCompra * 0.15;
        } else if (valorCompra > 300) {
            valorCondescuento = valorCompra - valorCompra * 0.2;
        }
        if (valorCompra >= 100) {
            System.out.println("El monto a pagar es: " + valorCondescuento);
        } else {
            System.out.println("El monto a pagar es: " + valorCompra);

        }

        for (int cont = 0; cont <= 100; cont++) {

            if (cont % 3 == 0) {
                System.out.println("El valor " + cont + " es multiplo de 3");
            }

        }

        int factorial = 1;
        for (int i = 1; i < 11; i++) {
            factorial *= i;
            System.out.println("Factorial de " + i + " = " + factorial);
        }

    }
}
