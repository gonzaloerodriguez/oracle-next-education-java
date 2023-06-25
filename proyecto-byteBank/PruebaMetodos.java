public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta cuentaGonzalo = new Cuenta(23, 2412, 2155);

        Cuenta cuentaMaria = new Cuenta(65, 4584, 147);

        cuentaGonzalo.depositar(1000);

        cuentaMaria.depositar(1000);

        System.out.println(cuentaGonzalo.getSaldo());

        cuentaGonzalo.depositar(500);

        System.out.println(cuentaGonzalo.getSaldo());

        cuentaGonzalo.retirar(1000);

        System.out.println(cuentaGonzalo.getSaldo());

        cuentaMaria.transferir(500, cuentaGonzalo);

        System.out.println(cuentaMaria.getSaldo());

        System.out.println(cuentaGonzalo.getSaldo());

    }
}
