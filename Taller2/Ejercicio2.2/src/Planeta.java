public class Planeta {
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaMediaAlSol = 0;
    public enum TipoPlaneta {GASEOSO, TERRESTRE, ENANO};
    TipoPlaneta tipo;
    Boolean esObservable = false;
    //ejercicio propuesto
    double periodoOrbital = 0;
    double periodoRotacion = 0;

    Planeta(String nombre, int cantidadSatelites, double masa, double volumen , int diametro, int distanciaMediaAlSol, TipoPlaneta tipo, Boolean esObservable, double periodoOrbital, double periodoRotacion){
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        //ejercicio propuesto
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;

    }

    void imprimir(){
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Cantidad de satelites: " + cantidadSatelites);
        System.out.println("Masa del planeta: " + masa);
        System.out.println("Volumen del planeta: " + volumen);
        System.out.println("Diametro del planeta: " + diametro);
        System.out.println("distancia al sol: " + distanciaMediaAlSol);
        System.out.println("tipo de planeta " + tipo);
        System.out.println("Es observable " + esObservable);
        //ejercicio propuesto
        System.out.println("Período orbital: " + periodoOrbital);
        System.out.println("Período de rotación: " + periodoRotacion);

    }
    double CalcularDensidad(){
        return masa/volumen;
    }
    boolean esPlanetaExterior(){
        float límite = (float) (149597870 * 3.4);
        if (distanciaMediaAlSol > límite) {
            return true;
        } 
        else 
            {
            return false;
        }
}
}
