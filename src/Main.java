import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*
        Faça um programa que receba os produtos lançados em uma comanda de acordo com o menu: 
        * 1 - Almoço Self-Service - R$25
        * 2 - Prato Feito - R$20
        * 3 - Bebida Lata - R$8
        * 4 - Água - R$3
        * 5 - Doces - R$2,50
        * O usuário deverá digitar o código e a quantidade lançada, o programa deve mostrar 
        * o valor unitário e total em cada lançmento. Ao digitar 20, o programa  termina mostrando
        * toda comanda, valor unitário e total do item e o total da comanda
        */
        
        Scanner scanner = new Scanner(System.in);

        int qtdSelfService = 0, qtdPratoFeito = 0, qtdBebeida = 0, qtdAgua = 0, qtdDoce = 0;
        double precoSelfService = 0, precoPratoFeito = 0, precoBebida = 0, precoAgua = 0, precoDoce = 0;
        double precoLista = 0;
        String listaNome = new String();
        boolean exit = false;
        
        while(!exit) {
            System.out.println("# Digite uma ou mais opções: ");
            System.out.println("1. Almoço Self-Service => R$ 25,00");
            System.out.println("2. Prato Feito => R$ 20,00");
            System.out.println("3. Bebida lata => R$ 8,00");
            System.out.println("4. Água => R$ 3,00");
            System.out.println("5. Doces => R$ 2,50");
            System.out.println("20. Sair");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                //Self Service
                    System.out.println("Quantidade: ");
                    qtdSelfService = scanner.nextInt();

                    precoSelfService =+ 25.00 * qtdSelfService;
                
                    precoLista += precoSelfService;
                    listaNome += "Self-Service - ";
                    System.out.println("Self-Service adicionado.");
                    System.out.println("O valor unitário é: R$ "+precoSelfService);
                    System.out.println("O valor total é: R$ "+precoLista);
                    break;
                case 2:
                //Prato Feito
                    System.out.println("Quantidade: ");
                    qtdPratoFeito = scanner.nextInt();

                    precoPratoFeito = 20.00 * qtdPratoFeito;
                
                    precoLista += precoPratoFeito;
                    listaNome += "Prato feito - ";
                    System.out.println("Prato Feito adicionado.");
                    System.out.println("O valor unitário é: R$ "+precoPratoFeito);
                    System.out.println("O valor total é: R$ "+precoLista);
                    break;
                case 3:
                //Bebida
                    System.out.println("Quantidade: ");
                    qtdBebeida = scanner.nextInt();

                    precoBebida += 8.00 * qtdBebeida;
                
                    precoLista += precoBebida;
                    listaNome += "Bebida - ";
                    System.out.println("Bebida lata adicionado.");
                    System.out.println("O valor unitário é: R$ "+precoBebida);
                    System.out.println("O valor total é: R$ "+precoLista);
                    break;
                case 4:
                //Agua
                    System.out.println("Quantidade: ");
                    qtdAgua = scanner.nextInt();

                    precoAgua =+ 3.00 * qtdAgua;
                
                    precoLista += precoAgua;
                    listaNome += "Água - ";
                    System.out.println("Água adicionado.");
                    System.out.println("O valor unitário é: R$ "+precoAgua);
                    System.out.println("O valor total é: R$ "+precoLista);
                    break;
                case 5:
                    System.out.println("Quantidade: ");
                    qtdDoce = scanner.nextInt();

                    precoDoce = 3.50 * qtdDoce;
                
                    precoLista += precoDoce;
                    listaNome += "Doce - ";
                    System.out.println("Doces adicionado.");
                    System.out.println("O valor unitário é: R$ "+precoDoce);
                    System.out.println("O valor total é: R$ "+precoLista);
                    break;
                case 20:
                    exit = true;
                    System.out.println("Saiu");
                    break;
                default:
                    System.out.println("Valor inválido. Tente novamente.");
            }
        }
        
        System.out.println("=== MENU ===");

        System.out.println("Valor total: R$ "+precoLista);
        System.out.println("Os itens adicionados são: ");
        System.out.println(qtdSelfService+"x - Self-Service -> R$"+precoSelfService);
        System.out.println(qtdPratoFeito+"x - Prato feito -> R$"+precoPratoFeito);
        System.out.println(qtdBebeida+"x - Bebida -> R$"+precoBebida);
        System.out.println(qtdAgua+"x - Água -> R$"+precoAgua);
        System.out.println(qtdDoce+"x - Doce -> R$"+precoDoce);
            
        scanner.close();
        //valor unitário e total do item e o total da comanda

    }
}
