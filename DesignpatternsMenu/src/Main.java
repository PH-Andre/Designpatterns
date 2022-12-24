
import ChainOfResponsability.mainChainReponsability;
import Composite.mainComposite;
import Interpreter.mainInterpreter;
import Prototype.mainPrototype;
import State.StateDemo;
import Visitor.mainVisitor;
import proxy.Mainproxy;

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
                        System.out.println("7- Proxy");
                        System.out.println("8- Sair");
                        System.out.print("Digite o numero referente a sua escolha: ");
                        int opcao = scan.nextInt();
                        opcaoescolhida = opcao;


                        if (opcaoescolhida == 1) {
                                // Corrente of Responsability
                                System.out.println("___________________________________________________________________________________________________________________");
                                System.out.println("Design pattern comportamental que permite que cada pedido passe por uma corrente de handers aé ser processo.");

                              mainChainReponsability.main(args);
                                System.out.println("___________________________________________________________________________________________________________________");

                        } else if (opcaoescolhida == 2) {
                                // State
                                System.out.println("___________________________________________________________________________________________________________________");
                                System.out.println("Design pattern comportamental que permite que um objeto altere seu comportamento quando seu estado for alterado");
                                StateDemo.main(args);
                                System.out.println("___________________________________________________________________________________________________________________");

                        } else if (opcaoescolhida == 3) {
                                // Visitor
                                System.out.println("___________________________________________________________________________________________________________________");
                                System.out.println("Design pattern comportamental que permite separar os algoritmos dos objetos que estão operando");

                                mainVisitor.main(args);
                                System.out.println("___________________________________________________________________________________________________________________");

                        } else if (opcaoescolhida == 4) {
                                //Interpreter
                                System.out.println("___________________________________________________________________________________________________________________");
                                System.out.println("Design pattern comportamental que serve para interpretar instrucoes, como um tradutor");

                                mainInterpreter.main(args);
                                System.out.println("___________________________________________________________________________________________________________________");

                        } else if (opcaoescolhida == 5) {
                                // Composite
                                System.out.println("___________________________________________________________________________________________________________________");
                                System.out.println("Design pattern estrutural utilizado para representar um objeto formado a partir da composicao de objetos semelhantes");
                                mainComposite.main(args);
                                System.out.println("___________________________________________________________________________________________________________________");

                        } else if (opcaoescolhida == 6) {
                                // Prototype
                                System.out.println("___________________________________________________________________________________________________________________");
                                System.out.println("Design pattern criacional que possibilita a criação de novos objetos a partir de um modelo original (protótipo) que é clonado.");
                                mainPrototype.main(args);
                                System.out.println("___________________________________________________________________________________________________________________");
                        } else if (opcaoescolhida == 7) {
                                //proxy
                                System.out.println("___________________________________________________________________________________________________________________");
                                System.out.println("Design pattern que nos permite criar um intermediário que atua como uma interface para outro recurso");
                                Mainproxy.main(args);
                                System.out.println("___________________________________________________________________________________________________________________");
                        } else if (opcaoescolhida == 8){
                                break;
                        }else {
                                System.out.println("Opcao invalida");
                        }


                }
        }
}