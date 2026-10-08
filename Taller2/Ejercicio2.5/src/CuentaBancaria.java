public class CuentaBancaria {
    String NombresTitular;
    String ApellidosTitular;
    int Numero;
    public enum tipo {AHORROS, CORRIENTE}
    tipo tipoCuenta;
    float saldo = 0;
    //Ejercicio propuesto
    float interesMensual;

    CuentaBancaria(String NombresTitular, String ApellidosTitular, int Numero , tipo tipoCuenta){
        this.NombresTitular = NombresTitular;
        this.ApellidosTitular = ApellidosTitular;
        this.Numero = Numero;
        this.tipoCuenta = tipoCuenta;
    }

    void imprimir(){
        System.out.println("Nombres del titular = " + NombresTitular);
        System.out.println("Apellidos del titular = " + ApellidosTitular);
        System.out.println("Numero de cuenta = " + Numero);
        System.out.println("Tipo de cuenta = "+ tipoCuenta);
        System.out.println("Saldo = " + saldo);
    }

    void consultarSaldo(){
        System.out.println("El saldo actual es = " + saldo);
    }

    boolean consignar(int valor){
        if(valor>0){
            saldo =saldo + valor;
            System.out.println("Se ha consignado $ " + valor + "en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        }
        else{
            System.out.println("El valor a sonsignar debe ser mayor que cero.");
            return false;
        }
    }
    boolean retirar(int valor){
        if(valor>0 && valor<=saldo){
            saldo = saldo - valor;
            System.out.println("Se ha retirado $ " + valor + "de la cuenta. El nuevo saldo es $" + saldo);
            return true;
        }
        else{
            System.out.println("El valor a retirar debe ser mayor que cero y menor o igual al saldo actual.");
            return false;
        }
    }
    //Ejercicio propuesto
    void calcularNuevoSaldo(float tasaInteres){
        interesMensual = saldo * tasaInteres / 100;
        saldo += interesMensual;    
        System.out.println("El nuevo saldo es = " + saldo);
}
}
