public class Automovil {
    String marca;
    int modelo;
    int motor;
    public enum tipoCom{GASOLINA, BIOETANO, DIESEL, BIODISESEL, GAS_NATURAL}
    tipoCom tipoCombustible;
    public enum tipoA{CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
    tipoA tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    public enum color{BLANCO,NEGRO,ROJO,NARANJA,AMARILLO,VERDE,AZUL,VIOLETA}
    color colorAutomovil;
    int velocidadActual;
    //Ejercicio propuesto
    boolean automatico;
    int multas;
    int valMultas;

    Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil, int numeroPuertas, int cantidadAsientos, int velocidadMaxima, color colorAutomovil, boolean automatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.colorAutomovil = colorAutomovil;
        //Ejercicio propuesto
        this.automatico = automatico;
        this.multas = 0;
        this.valMultas = 0;
    }
    String getMarca(){
        return marca;
    }
    int getModelo(){
        return modelo;
    }
    int getMotor(){
        return motor;
    }
    tipoCom getTipoCombustible(){
        return tipoCombustible;
    }
    tipoA getTipoAutomovil(){
        return tipoAutomovil;
    }
    int getNumeroPuertas(){
        return numeroPuertas;
    }
    int getCantidadAsientos(){
        return cantidadAsientos;
    }
    int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    color getColorAutomovil(){
        return colorAutomovil;
    }
    int getVelocidadActual(){
        return velocidadActual;
    }
    boolean getAutomatico(){
        return automatico;
    }
    void setMarca(String marca){
        this.marca = marca;
    }
    void setModelo(int modelo){
        this.modelo = modelo;
    }
    void setMotor(int motor){
        this.motor = motor;
    }
    void setTipoCombustible(tipoCom tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
    void setTipoAutomovil(tipoA tipoAutomovil){
        this.tipoAutomovil = tipoAutomovil;
    }
    void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
    void setCantidadAsientos(int cantidadAsientos){
        this.cantidadAsientos = cantidadAsientos;
    }
    void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    void setColorAutomovil(color colorAutomovil){
        this.colorAutomovil = colorAutomovil;
    }
    void setVelocidadActual(int velocidadActual){
        this.velocidadActual = velocidadActual;
    }
    void setAutomatico(boolean Automatico){
        this.automatico= Automatico;
    }
    
    void acelerar(int incrementoVelocidad) {

    if (velocidadActual + incrementoVelocidad > velocidadMaxima) {
        velocidadActual = velocidadMaxima;
        multas++;
        valMultas += 100;
    } else {
        velocidadActual += incrementoVelocidad;
    }
}

    void desacelerar(int decrementoVelocidad){
        if(velocidadActual - decrementoVelocidad > 0){
            velocidadActual -= decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa");
        }
    }
    void frenar(){
        velocidadActual = 0;
    }
    double calcularTiempoLlegada(int distancia){
        return distancia / velocidadActual;
    }
    //ejercicio propuesto
    public boolean tieneMultas() {
        return this.multas > 0;
    }
    public int valMultas() {
    return this.valMultas;
}
    void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor);
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Tipo de automovil: " + tipoAutomovil);
        System.out.println("Numero de puertas: " + numeroPuertas);
        System.out.println("Cantidad de asientos: " + cantidadAsientos);
        System.out.println("Velocidad maxima: " + velocidadMaxima);
        System.out.println("Color del automovil: " + colorAutomovil);
    }
}