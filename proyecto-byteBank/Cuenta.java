public class Cuenta {
    private double saldo;
    private int agencia;
    private static int numero;
    private Cliente titular = new Cliente();

    // variables estaticas

    private static int totalDeCuentasCreadas = 0;

    // constructor

    public Cuenta(int agencia, int numero, int saldo) {
        if (agencia <= 0) {
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        System.out.println("Estoy creando una cuenta");
        totalDeCuentasCreadas++;
        System.out.println("fueron creadas " + totalDeCuentasCreadas + " cuentas en total");
    }

    // métodos
    public void depositar(double valor) {
        this.saldo += valor;
    };

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    };

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }

    // getters and setters

    public double getSaldo() {
        return this.saldo;
    }

    public double getAgencia() {
        return this.agencia;
    }

    public double getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotalDeCuentasCreadas() {
        return totalDeCuentasCreadas;
    }
}
