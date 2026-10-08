public class App {
    public static void main(String[] args) throws Exception {
        Automovil auto1 = new Automovil("Ford",2018,3, Automovil.tipoCom.DIESEL,Automovil.tipoA.EJECUTIVO,5,6,250,Automovil.color.NEGRO, false);
auto1.imprimir();
auto1.setVelocidadActual(100);
System.out.println("Velocidad actual = " + auto1.
velocidadActual);
auto1.acelerar(20);
System.out.println("Velocidad actual = " + auto1.
velocidadActual);
auto1.desacelerar(50);
System.out.println("Velocidad actual = " + auto1.
velocidadActual);
auto1.frenar();
System.out.println("Velocidad actual = " + auto1.
velocidadActual);
auto1.desacelerar(20);
    }
}
