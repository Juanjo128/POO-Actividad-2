public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro","Pérez",123456789,CuentaBancaria.tipo.AHORROS);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
    }
}
