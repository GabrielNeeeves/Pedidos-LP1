import java.util.Arrays;
import java.util.Scanner;

public class Main_v2_pedidos {
    public static void main(String[] args) throws Exception {
        
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
        * +++
        * Mostrar o maior e o menor gastos, também a lista de produtos vendidos em ordem crescente de valor vendido
        */
        
        Scanner scanner = new Scanner(System.in);

        float valorTotal = 0;

        String produtos[] =  {"Self-Service", "Prato Feito", "Bebida", "Agua" ,"Doces"};
        double valorUnitario[] = new double[5];
        double vendas[] = new double[5];
        //String produtos[] = new String[5];

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
                    //produtos[0] = "Self-Service";
                    
                    System.out.println("Quantidade: ");
                    vendas[0] = scanner.nextInt();
                    
                    valorTotal += vendas[0]*25.00;
                    valorUnitario[0] = vendas[0]*25.00;
                    break;
                case 2:
                //Prato Feito
                   // produtos[1] = "Prato Feito";

                    System.out.println("Quantidade: ");
                    vendas[1] = scanner.nextInt();

                    valorTotal += vendas[1]*20.00;
                    valorUnitario[2] = vendas[1]*20.00;
                    break;
                case 3:
                //Bebida
                    //produtos[2] = "Bebida";

                    System.out.println("Quantidade: ");
                    vendas[2] = scanner.nextInt();
                    
                    valorTotal += vendas[2]*8.00;
                    valorUnitario[2] = vendas[2]*8.00;
                    break;
                case 4:
                //Agua
                    //produtos[3] = "Agua";
                    
                    System.out.println("Quantidade: ");
                    vendas[3] = scanner.nextInt();

                    valorTotal += vendas[3]*3.00;
                    valorUnitario[3] = vendas[3]*3.00;
                    break;
                case 5:
                    produtos[4] = "Doces";

                    System.out.println("Quantidade: ");
                    vendas[4] = scanner.nextInt();
                    
                    valorTotal += vendas[4]*2.50;
                    valorUnitario[4] = vendas[4]*2.50;
                    break;
                case 20:
                    exit = true;
                    System.out.println("Saiu");
                    break;
                default:
                    System.out.println("Valor inválido. Tente novamente.");
            }
        }

        // DEFINE O MAIOR GASTO
        double maiorGasto = valorUnitario[0];
        for(int i = 1; i < valorUnitario.length; i++) {
            if(valorUnitario[i] > maiorGasto) {
                maiorGasto = valorUnitario[i];
            }
        }

        // DEFINE O MENOR GASTO
        double menorGasto = valorUnitario[0];
        for(int i = 0; i < valorUnitario.length; i++) {
            if(valorUnitario[i] < menorGasto && valorUnitario[i] != 0) {
                menorGasto = valorUnitario[i];
            }
        }

        
        System.out.println("=== MENU ===");

        System.out.println("Valor total: R$ "+valorTotal);
        System.out.println("Os itens adicionados são: ");

        // QUANTIDADE e PRODUTOS
        for(int i = 0; i < 5; i++) {
            System.out.println(vendas[i]+" - "+produtos[i]+" R$ "+valorUnitario[i]);
        }

        //PRINTA MAIOR E MENOR GASTO
        System.out.println("Maior Gasto: "+maiorGasto);
        System.out.println("Menor Gasto: "+menorGasto);

        //MOSTRAR EM OREM CRESCENTE
        Arrays.sort(valorUnitario);
        for (double produtoTeste : valorUnitario) {
            System.out.println(produtoTeste);
        }

//         for (int i = 0; i < valorUnitario.length - 1; i++) {
//             double indiceMenor = i;
//             for (double j = i + 1; j < valorUnitario.length; j++) {
//                 if (valorUnitario[j] < valorUnitario[j]) {
//                     indiceMenor = j;
//                 }
//             }
//             double temp = valorUnitario[indiceMenor];
//             valorUnitario[0] = valorUnitario[i];
//             valorUnitario[i] = temp;
//         }
        
        scanner.close();
        //valor unitário e total do item e o total da comanda
        
    }
}
