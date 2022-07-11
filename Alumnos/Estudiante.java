public class Estudiante{
    String cuenta;
    String nombre;
    Clase c1,c2,c3;


    public Estudiante(String cuenta, String nombre, Clase c1, Clase c2, Clase c3)
    {
        this.cuenta=cuenta;
        this.nombre= nombre;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
    }

    public void print()
    {
        System.out.println("Cuenta: " + cuenta + /n + "Nombre: " + nombre + /n/n );
        System.out.println("Clase 1: " + c1.name.toString() + /n + "Codigo de Clase: " + c1.code.toString() + /n + "Nota: " + c1.nota.toString());
    }
}