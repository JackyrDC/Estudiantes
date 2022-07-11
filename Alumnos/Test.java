public class Test{

    public static void main(String [] args)
    {
        Clase español= new Clase();
        Clase matematica= new Clase();
        Clase filosofia= new Clase("FF101","Filosofia", 60.50);
        Estudiante es1=new Estudiante("20191901250", "Juanito Alimania",español, matematica, filosofia );
    }
}