public class Persona {

    int edad;
    String nombre;
    String telefono;

    public static void main(String[] args) {
        Cliente victor=new Cliente();
        victor.edad=35;
        victor.nombre="Victor Villaseñor";
        victor.telefono="01800";

        System.out.println(victor.edad);
        System.out.println(victor.nombre);
        System.out.println(victor.telefono);
        System.out.println(victor.credito);


        System.out.println(victor.toString());


        Trabajador daniel=new Trabajador();

        daniel.edad=20;
        daniel.nombre="Dani Zavala";
        daniel.telefono="01900";

        System.out.println(daniel.toString());


    }
}

class Cliente extends Persona{
    double credito=1500.30;


    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

class Trabajador extends Persona{

    double salario=8000;


    public String toString() {
        return "Trabajador{" +
                "salario=" + salario +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}