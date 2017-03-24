/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Estudiantes
 */
public class Calculadora extends Interfaz {
    double resultado;
    public double sumar(){
        resultado = num1 + num2;
        return resultado;
    }
   public double restar(){
        resultado = num1 - num2;
        return resultado;
    } 
   public double multiplicar(){
        resultado = num1 *num2;
        return resultado;
    }
   public double dividir(){
        resultado = num1 / num2;
        return resultado;
    }
}
