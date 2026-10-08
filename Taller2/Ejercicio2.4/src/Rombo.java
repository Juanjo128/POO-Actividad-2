public class Rombo {
    int diagonalMayor;
    int diagonalMenor;
    Rombo(int diagonalMayor, int diagonalMenor){
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    double calcularArea(){
        return (diagonalMayor*diagonalMenor)/2;
    }

    double calcularPerimetro(){
        double lado = Math.sqrt(Math.pow(diagonalMayor / 2, 2) + Math.pow(diagonalMenor / 2, 2));
        return 4*lado;
    }

}
