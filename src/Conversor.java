import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) throws Exception {
       
        String binario;
        int decimal;
        int resto;
        String hexadecimal = "";
        char hexa[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner scan = new Scanner( System.in);
        int escolha;
        
        System.out.println("Selecione a conversão:");
        System.out.println("1- Converter Decimal");
        System.out.println("2- Converter Binário");
        System.out.println("3- Converter Hexadecimal");

        escolha = scan.nextInt();

        switch (escolha) {
            case 1:
               System.out.println("Digite o número...");
               decimal = scan.nextInt(); 

               binario = Integer.toBinaryString(decimal);
               System.out.println("Em Binário: " + binario);

               while(decimal > 0) {
                resto = decimal % 16;
                hexadecimal = hexa[resto] + hexadecimal;
                decimal = decimal/16;
               }
               System.out.println("Em Hexadecimal: " + hexadecimal);
            break;

            case 2:
               System.out.println("Digite o número...");
               binario = scan.next(); 

               decimal = Integer.parseInt(binario, 2);
               System.out.println("Em Decimal: " + decimal);

               while(decimal > 0) {
                resto = decimal % 16;
                hexadecimal = hexa[resto] + hexadecimal;
                decimal = decimal/16;
               }
               System.out.println("Em Hexadecimal: " + hexadecimal);
            break;

            case 3:
            System.out.println("Digite o número...");
            hexadecimal = scan.next(); 
            
            decimal = Integer.parseInt(hexadecimal, 16);
            System.out.println("Em Decimal: " + decimal);

            binario = Integer.toBinaryString(decimal);
            System.out.println("Em Binário: " + binario);
            break;
        
            default:
                System.out.println("Inválido...");
        }
        scan.close();
    }
}
