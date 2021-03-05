
package calculadoraimc;

import java.util.Scanner;

/**
 *
 * @author ARTHUR CASTRO
 */
public class CalculadoraImc {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        String resp;
        String resultado_imc;
        
        /*ENTRADA DE DADOS*/
        
        do{
            
              
        System.out.println("*** CALCULADORA DE IMC ***\n\n");
        
        System.out.println("Nome: ");
        String nome = teclado.next();
        
        System.out.println("\nPeso: ");
        float peso = teclado.nextFloat();
        
        System.out.println("\nAltura: ");
        float altura = teclado.nextFloat();
                
        
       /*PROCESSAMENTO*/
    
    float imc = peso / (altura * altura);

    if (imc >= 30 && imc < 35) {
        resultado_imc = "ACIMA DO PESO";

    }else if(imc > 25 && imc < 30) {
        resultado_imc = "SOBREPESO";

    }else if(imc <= 25 && imc >18){
        resultado_imc = "PESO NORMAL";

    }else if(imc >18){
        resultado_imc = "ABAIXO DO PESO";

    }else{
        resultado_imc = "MUITO ACIMA DO PESO (OBESIDADE GRAU 2 OU ACIMA)";
    }
    
    /*SAIDA DE DADOS*/
        
        System.out.println("\n\nNome: "+nome+"  /  Peso:"+peso+"kg  /  Altura:"+altura+"m  /  IMC="+imc+"   /   RESULTADO:"+resultado_imc);
        System.out.printf("\n\n%s, de acordo com seus dados seu IMC é %.2f, estando classificado como: %s \n", nome, imc, resultado_imc );
        
         System.out.println("\nDeseja realizar um novo calculo? [S/N]");
         resp = teclado.next();
         
        }while (resp.equals("S"));
    }
        
}
