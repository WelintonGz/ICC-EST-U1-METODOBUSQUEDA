import java.util.Scanner;

public class App {

    MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

    public static void main(String[] args) {
        App app = new App();
        app.ejecutar();
    }

    public void ejecutar() {
        int[] arreglo = {37, 22, 11, 5, 7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero a buscar: ");
        int valor = sc.nextInt();

        int posicion = metodosBusqueda.busquedaLineal(arreglo, valor);

        if (posicion != -1) {
            System.out.println("Numero se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El valor no se encuntra dentro del arreglo");
        }
    }
}
