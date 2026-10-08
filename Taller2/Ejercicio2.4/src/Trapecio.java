public class Trapecio {
    int baseMayor;
    int baseMenor;
    int altura; 

    Trapecio(int baseMayor, int baseMenor, int altura){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    double calcularArea(){
        return ((baseMayor+baseMenor)*altura)/2;
    }

    double calcularPerimetro(){
        double lado = Math.sqrt(Math.pow((baseMayor-baseMenor)/2, 2) + Math.pow(altura, 2));
        return baseMayor+baseMenor+2*lado;
    }
}
