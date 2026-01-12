import java.util.Optional;

public class metodos {
    // un método no puede estar viviendo en otro método
    //Pero si es posible invocar un metodo dentro del método main

    //Métodos que si retornan
    public int sumar (int num1, int num2){
        return num1 + num2;
    }
    public static String info (String nombre, int edad){
        return "Nombre: " + nombre  + ". Edad: " + edad;
    }
    public static double sumarDecimales(int num1, int num2) {
        return num1 + num2;
    }

    // Método que no retorna}

    public static void asteriscos(){
        System.out.println("******");
    }
    public static void convertir(String mensaje){
        System.out.println(mensaje.toLowerCase());
    }
    public static void aumentar (int num1 ){
        System.out.println(num1 +=num1);
    }

    //Método main poara invocar los métodos
    public static void main (String[] args){
        metodos instancia = new metodos();
        System.out.println(instancia.sumar(4,5)); //9
        System.out.println(info("Daniel",  39));
        System.out.println(sumarDecimales(5,5));
        asteriscos();
        convertir("El gEnAS");
        aumentar(5);

        // -- Class String
        String nombre = "Genas";
        String name = "genas";

        System.out.println((nombre.charAt(0)));
        System.out.println(nombre.length());
        System.out.println(nombre.charAt(nombre.length()-1));
        System.out.println(nombre.replace('i','1'));
        System.out.println(nombre.isBlank());
        System.out.println(nombre.isEmpty());
        System.out.println(nombre.equals(name));
        System.out.println(name.equalsIgnoreCase(name));


    }
}
