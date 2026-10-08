public class Persona {
    String nombre;
    String apellido;
    String numeroDocumentoIdentidad;
    int añoNacimiento;
    String paisNacimiento;
    char genero;

    Persona(String nombre, String apellido, String numeroDocumentoIdentidad, int añoNacimiento, String paisNacimiento, char genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellido);
        System.out.println("Número de documento de identidad = " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("Pais de nacimiento = " + paisNacimiento );
        System.out.println("Genero = " + genero);
}



}
