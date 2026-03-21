package SistemaAvaliativoFunc;

import java.util.ArrayList;
import java.util.Scanner;

import SistemaAvaliativoFunc.Exceptions.DadosInvalidosException;

public class Main {
    public static void main(String[] args) throws DadosInvalidosException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionarios> funcLista = new ArrayList<>();
        int escolha;
        try {
            do {
                System.out.println("Escolha qual funcionaria ira adicionar na lista:");
                System.out.println("1- Professor  2- Servidor  3- Mostrar Lista 0-  Sair");
                System.out.print("Resposta: ");
                escolha = sc.nextInt();
                switch (escolha) {
                    case 1:
                        Funcionarios prof = new Professor("Divo", 1, 50, 10, 40);
                        funcLista.add(prof);
                        break;
                    case 2:
                        Funcionarios serv = new Servidor("Serv1", 80, 70, "CCA", 8 );
                        funcLista.add(serv);
                        break;
                    case 3:
                        for (int i = 0; i < funcLista.size(); i++) {
                            System.out.println(funcLista.get(i));
                        }
                        break;
                    case 0:
                        break;
                    default:

                        break;
                }

            } while (escolha != 0);
        } catch (Exception e) {
            
        }
        sc.close();


    }
}
