import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

                int opcaoescolhida = 0;


                while (opcaoescolhida != 7) {

                        Scanner scan = new Scanner(System.in);
                        System.out.println("Lista de Designs");
                        System.out.println("1- Corrente of Responsability");
                        System.out.println("2- State");
                        System.out.println("3- Visitor");
                        System.out.println("4- Interpreter");
                        System.out.println("5- Composite");
                        System.out.println("6- Prototype");
                        System.out.println("7- Sair");
                        System.out.print("Digite o numero referente a sua escolha: ");
                        int opcao = scan.nextInt();
                        opcaoescolhida = opcao;


                        if (opcaoescolhida == 1) {
                                // Corrente of Responsability
                                System.out.println("Design pattern comportamental que permite que cada pedido passe por uma corrente de handers aé ser processo.");

                        } else if (opcaoescolhida == 2) {
                                // State
                                System.out.println("Design pattern comportamental que permite que um objeto altere seu comportamento quando seu estado for alterado");

                        } else if (opcaoescolhida == 3) {
                                // Visitor
                                System.out.println("Design pattern comportamental que permite separar os algoritmos dos objetos que estão operando");

                        } else if (opcaoescolhida == 4) {
                                //Interpreter
                                System.out.println("Design pattern comportamental que serve para interpretar instrucoes, como um tradutor");

                        } else if (opcaoescolhida == 5) {
                                // Composite
                                System.out.println("Design pattern estrutural utilizado para representar um objeto formado a partir da composicao de objetos semelhantes");

                        } else if (opcaoescolhida == 6) {
                                // Prototype
                                System.out.println("Design pattern criacional que possibilita a criação de novos objetos a partir de um modelo original (protótipo) que é clonado.");
                        } else if (opcaoescolhida == 7) {
                                System.out.println("SAIU!");
                                opcaoescolhida = 8;
                        } else {
                                System.out.println("Opcao invalida");

                        }


                }
        }
}