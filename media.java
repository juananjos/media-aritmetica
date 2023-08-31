package mediaAritmetica;

import java.util.Scanner;

public class media {
   
    public static void main(String[] args) {
      
     Scanner entrada = new Scanner(System.in);
     
      
     /* Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
     números 4, 5 e 6. A soma das duas médias. A média das médias. */
     
     // Solicita os 3 primeiros números ao usuário
     System.out.print("Entre com os tres primeiros numeros separados por espaços: ");
     double num1 = entrada.nextDouble();
     double num2 = entrada.nextDouble();
     double num3 = entrada.nextDouble();
     
    // Calcula a primeira média
     double media1 = (num1 + num2 + num3) / 3.0;
     
     // Solicita os 3 próximos números ao usuário 
     System.out.print("Entre com os proximos tres numeros separados por espacos: ");
     
     double num4 = entrada.nextDouble();
     double num5 = entrada.nextDouble();
     double num6 = entrada.nextDouble();
     
     // Calcula a segunda média
     double media2 = (num4 + num5 + num6) / 3.0;
     
     // Calcula a soma das médias
     double soma = media1 + media2;
     
     // Calcula a média das médias
     double mediaFinal = soma / 2.0;
     
     // Exibe a primeira média
     System.out.println("A media dos 3 primeiros numeros e: " + media1);
     
     // Exibe a segunda média
     System.out.println("A segunda media numeros e: " + media2);
     
     // Exibe a soma das médias
     System.out.println("A soma das medias e: " +soma);
     
     // Exibe a média final
     System.out.println("A media final é: " + mediaFinal);
     
       

    }
    
}
