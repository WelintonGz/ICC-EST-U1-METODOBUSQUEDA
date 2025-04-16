package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Persona [] people;
    
    public MetodosBusqueda(Persona[] personas){
        showConsole = new ShowConsole();
        this.people = personas;
    }

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

    public int findPersonaBycODE(int code){
        for (int i = 0; i < people.length; i++){
            if(people[i].getCode() == code){
                return i;
            }
        }
        return -1;
    }

    public void showPerson(){
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonaBycODE(codeToFind);
        if (indexPerson >= 0){
            showConsole.showMessage("Persona con codigo "+ codeToFind+ " encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        }else{
            showConsole.showMessage("Persona no encontrada");
        }

    }//Deber Se tiene  que buscar por nombre

    public int findPersonaByName(String name){
        for (int i = 0; i < people.length; i++){
            if (people[i].getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }

    public void showPersonByName(){
        String nameToFind = showConsole.inputName();
        int indexPerson = findPersonaByName(nameToFind);
        if (indexPerson >= 0){
            showConsole.showMessage("Persona con nombre " + nameToFind + " encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona no encontrada");
    }
    }

}
