public class MetodosBusqueda {

    public int busquedaLineal(int[] arreglo, int valorBuscado) {
        return busquedaLineal(arreglo, valorBuscado, 0);
    }

    private int busquedaLineal(int[] arreglo, int valorBuscado, int indice) {
        if (indice >= arreglo.length) {
            return -1;
        }
        if (arreglo[indice] == valorBuscado) {
            return indice;
        }
        return busquedaLineal(arreglo, valorBuscado, indice + 1);
    }
}
