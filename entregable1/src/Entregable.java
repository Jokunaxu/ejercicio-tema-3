public class Entregable {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;
        int operacion = sumatres(num1, num2, num3);
        System.out.println("vamos a sumar: " + num1 + " " + num2 + " " + num3);
        System.out.println("el resultado es: "+ operacion);

        Coche MiCoche = new Coche();
        System.out.println( "antes de sumar las puertas tiene: " + MiCoche.NumPuerta);
        MiCoche.DarPuerta();
        System.out.println("después de agregar las puertas tiene: " + MiCoche.NumPuerta);
    }

    public static int sumatres(int a, int b, int c){
        int resultado = a + b + c;
        return resultado;
    }

    public static class Coche {
        public int NumPuerta = 3;
        public void DarPuerta(){
            this.NumPuerta++;
        }
    }
}
