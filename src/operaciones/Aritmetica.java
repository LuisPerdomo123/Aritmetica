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
    
    int a;//El valor primitivo por defoult es 0
    int b;
    
    //Metodos
    
    public void sumar(){
    
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
    
//        int resultado = a + b;
//        return resultado;
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){//Recepcion de informacion es argumentos
    
        a = arg1;
        b = arg2;
        //return a + b;
        return sumarConRetorno();//Se esta reutilizando el metodo prevuamewnte creado
    }
    
}
