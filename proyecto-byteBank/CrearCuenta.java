public class CrearCuenta {
    public static void main(String[] args) {

        Cuenta cuentaJose = new Cuenta(21, 12312, 213);
        Cuenta cuentaPedro = new Cuenta(22, 123412, 431);
        cuentaJose.setNumero(2123124);
        cuentaJose.depositar(1234);
        cuentaJose.getTitular().setNombre("Jose");
        cuentaJose.getTitular().setDocumento("12568465");
        cuentaJose.getTitular().setTelefono("1524684135");
        System.out.println(cuentaJose.getTitular().getNombre());
        System.out.println(Cuenta.getTotalDeCuentasCreadas());
    }
}
