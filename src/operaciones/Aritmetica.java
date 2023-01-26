/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author lepo9
 */
public class Aritmetica {
    //Atributos de la clase

    int a;//El valor primitivo por defoult es 0. Pueden ser utilizadas en cualquier metodo
    int b;

    /*
    El constructor permite asignar diferentes valores 
     */
    //Constructor vacio

    public Aritmetica() {//Se esta omitiendo argumentos (constructor vacio)

        System.out.println("Ejecutando constructor");
    }

    public Aritmetica(int a, int b) {//Tiene presente argumentos. Sobrecarga de constructor

        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumento");

    }

    //Metodos
    public void sumar() {

        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {

//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;//Se esta trabajando con atributos y no con argumentos
    }

    public int sumarConArgumentos(int a, int b) {//Recepcion de informacion es argumentos

        this.a = a;//atributo de nuestra clase y no una variable local
        //El argumento a se asigna al atributo this.a
        this.b = b;//Los argumentos del metodo estan en negro y los atributos en morado
        //return a + b;
        return this.sumarConRetorno();//Se esta reutilizando el metodo prevuamewnte creado

    }

}
