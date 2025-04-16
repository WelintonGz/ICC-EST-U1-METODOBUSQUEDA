import java.util.Scanner;
import controllers.MetodosBusqueda;
import controllers.MetodosBusquedaBinaria;
import models.Persona;

public class App {

    //MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

    public static void main(String[] args) {
        Persona[] personas = new Persona[7];
        personas[0] = new Persona(121, "Flavia");
        personas[1] = new Persona(122, "David");
        personas[2] = new Persona(123, "Felipe");
        personas[3] = new Persona(124, "Meredith");
        personas[4] = new Persona(125, "Herta");
        personas[5] = new Persona(126, "Marcelo");
        personas[6] = new Persona(127, "Miguel");

        MetodosBusquedaBinaria mBB = new MetodosBusquedaBinaria(personas);

        mBB.showPersonByName();
        //mBB.findPersonaBycODE(6);

        /*MetodosBusqueda metodos = new MetodosBusqueda(personas);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese (nombre) para buscar por el nombre o (codigo) para buscar por codigo: ");
        String opcion = sc.nextLine();

        if (opcion.equalsIgnoreCase("nombre")) {
            metodos.showPersonByName();
        } else if (opcion.equalsIgnoreCase("codigo")) {
            metodos.showPerson();
        } else {
            System.out.println("Opción no válida");
        }*/
            //App app = new App();
            //app.ejecutar();
    }

    /*public void ejecutar() {
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
    }*/

    
}