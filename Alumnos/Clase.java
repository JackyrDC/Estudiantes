import java.util.Scanner;

public class Clase{
    private String code;
    private String name;
    private float nota;

    public Clase(String codigo, String nm, float note)
    {
        code=codigo; name= nm; nota=note;
    }

    public Clase()
    {
        String cc; String cn; float nt;
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el codigo de la clase");
        cc=scan.next();
        System.out.println("Ingrese el nombre de la clase");
        cc=scan.next();
        System.out.println("Ingrese la nota de la clase");
        cc=scan.nextFloat();
    }
}