
public class EjemploCondicional2 {
	public static void main(String[] args) {
        System.out.println("probando condicionales ");

        int edad = 17;
        int cantidadPersonas = 3;
        boolean acompañado = cantidadPersonas >= 2;
        boolean puedeEntrar = edad >=18 && acompañado;

        if (puedeEntrar) {
            System.out.println("Bienvenido"); 
        } else {
            System.out.println("Lamentablemente no puedes ingresar");
        }
    }
}
