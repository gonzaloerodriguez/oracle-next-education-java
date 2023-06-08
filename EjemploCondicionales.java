public class EjemploCondicionales {
    public static void main(String[] args) {

        // aclaro que las flags estan puestas para seguir al pie de la letra el
        // ejercicio del curso
        int edad = 13;
        int edadAcompañante = 25;
        int cantidadDePersonas = 2;
        boolean abierto = true;

        if (abierto == true && (edad >= 18 || cantidadDePersonas >= 2 && edadAcompañante >= 18)) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("No puede ingresar");
        }

        // while
        int contador = 0;
        int acumulador = 0;

        while (contador < 10) {
            acumulador += contador;
            System.out.println("El contador esta en: " + contador++);
        }
        System.out.println("La suma de todos los valores es: " + acumulador);

        // for

        for (int cont = 0; cont < 10; cont++) {

            System.out.println("El valor de i es: " + cont);

        }

        // condicionales anidados

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del: " + i);
            for (int j = 0; j <= 10; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
