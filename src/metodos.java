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

    //Método main poara invocar los métodos
    public static void main (String[] args){
        metodos instancia = new metodos();
        System.out.println(instancia.sumar(4,5)); //9
        System.out.println(info("Daniel",  39));
        System.out.println(sumarDecimales(5,5));
        asteriscos();
        convertir("El gEnAS");


    }
}
