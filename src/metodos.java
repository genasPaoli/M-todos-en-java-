public class metodos {
    // un método no puede estar viviendo en otro método
    //Pero si es posible invocar un metodo dentro del método main

    //Métodos que si retornan
    public int sumar (int num1, int num2){
        return num1 + num2;
    }

    // Método que no retorna

    //Método main poara invocar los métodos
    public static void main (String[] args){
        metodos metodoSuma = new metodos();
        System.out.println(metodoSuma.sumar(4,5));

    }
}
