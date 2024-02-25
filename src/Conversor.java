import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) throws Exception {
       
        
        Scanner scan = new Scanner( System.in);
        int escolha;
        
        System.out.println("Selecione a conversão:");
        System.out.println("1- Converter Decimal");
        System.out.println("2- Converter Binário");
        System.out.println("3- Converter Hexadecimal");

        escolha = scan.nextInt();

        switch (escolha) {
            case 1:
               String binario;
               int decimal;
               int resto;
               String hexadecimal = "";
               char hexa[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

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
               String binario2;
               int decimal2;
               int resto2;
               String hexadecimal2 = "";
               char hexa2[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

               System.out.println("Digite o número...");
               binario2 = scan.next(); 

               decimal2 = Integer.parseInt(binario2, 2);
               System.out.println("Em Decimal: " + decimal2);

               while(decimal2 > 0) {
                resto2 = decimal2 % 16;
                hexadecimal2 = hexa2[resto2] + hexadecimal2;
                decimal2 = decimal2/16;
               }
               System.out.println("Em Hexadecimal: " + hexadecimal2);
            break;

            case 3:
            
            String binario3 = "";
            int decimal3;
            String hexadecimal3 = "";

            System.out.println("Digite o número...");
            hexadecimal3 = scan.next(); 
            
            decimal3 = Integer.parseInt(hexadecimal3, 16);
            System.out.println("Em Decimal: " + decimal3);

            binario3 = Integer.toBinaryString(decimal3);
            System.out.println("Em Binário: " + binario3);
            break;
        
            default:
                System.out.println("Inválido...");
        }
        scan.close();
    }
}
