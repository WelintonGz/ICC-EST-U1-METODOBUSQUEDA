package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinaria {
    private Persona[] people;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria(Persona[] people){
        this.people = people;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodo de busqueda binaria");
    }

    private int findPersonaBycODE(int code){
        int bajo=0;
        int alto=people.length - 1;

        while (alto>=bajo) {
            int central = (alto + bajo) /2;

            if (people[central].getCode() == code){
                return central;
            }

            if (people[central].getCode()>code) {
                
            }else{
                bajo = central+1;
            }
        }
        return -1;
    }
    public void showPersonBycODE(){
        int codeToFind = pantalla.inputCode();
        int indexPerson = findPersonaBycODE(codeToFind);
        if (indexPerson == -1){
            pantalla.showMessage("Persona con codigo " + codeToFind + "no encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    public void showPersonByName(){
        String nameToFind = pantalla.inputName();
    }

    public int findPersonaByName(String name){
        if(people[0].getName().equals(name)){
            return central;
        }
        if(people[0].getName().compareTo(name) > 0){

        }
        return -1;
    }
    /*private int findPersonaByName(int code){
        int bajo=0;
        int alto=people.length - 1;

        while (alto>=bajo) {
            int central = (alto + bajo) /2;

            if (people[central].getName() == code){
                return central;
            }

            if (people[central].getName()>code) {
                
            }else{
                bajo = central+1;
            }
        }
        return -1;
    }
    public void showPersonByName(){
        int codeToFind = pantalla.inputName();
        int indexPerson = findPersonaByName(codeToFind);
        if (indexPerson == -1){
            pantalla.showMessage("Persona con codigo " +  + "no encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }*/
}