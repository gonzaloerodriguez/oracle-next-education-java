public class EjemploTipoNumericos {
    public static void main(String[] args) {
        // el tipo de dato int reserva 4 bytes en memoria

        int edad = 28;

        System.out.println(edad);

        edad = 31;

        System.out.println("Mi edad es " + edad);

        // el tipo de dato double reserva 8 bytes o sea el doble del tipo int

        double salario = 1254.75;

        double medioSalario = salario / 2;

        System.out.println("La mitad de mi salario es " + medioSalario);

        // Cast

        double precio = 15.5;

        int precioRedondeado = (int) precio;

        System.out.println("El precio redondeado es " + precioRedondeado);

        // tipo de dato long para expresiones numericas muy grandes que no son
        // soportadas por int es de 64 bits

        long segundosPorSiglo = 3153600000L;

        System.out.println("La cantidad de segundos por siglo es " + segundosPorSiglo);

        // tipo de dato short es de 16 bits

        short numShort = 12324;

        System.out.println("Tipo de dato short " + numShort);

        // tipo de dato byte es de 1 byte

        byte numByte = 123;

        System.out.println("Tipo de dato byte " + numByte);

        // tipo de dato float para decimales pequeños 4 bytes

        float numDecimalPequenio = 2.5F;

        System.out.println("Tipo de dato float " + numDecimalPequenio);
    }
}
