/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author lepo9
 */
public class PruebaAritmetica {
    
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        //Manejo de contructores y sobrecarga
        System.out.println("aritmetica1 a: "+aritmetica1.a);//Impresion de los valores por default
        System.out.println("aritmetica1 b: "+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        
        System.out.println("aritmetica2 a: "+aritmetica2.a);//Impresion de los valores por default
        System.out.println("aritmetica2 b: "+aritmetica2.b);
        
        //Manejo de atributos, parametros y argumentos
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la clase de prueba = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(5, 8);//Envio de informacion se le llama parametro
        System.out.println("resultado usuando argumentos = " + resultado);
        
        
    }
}
