package array_list.Ex60;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        ArrayList<Cliente> listaClientes = new ArrayList<>();

        int opcao;
        int id;
        int indexCliente = -1;
        int indexClienteTo = -1;
        int id_cliente = -1;
        String numero_conta = "";

        do {
            System.out.printf("\n\n === Banco Macgyver - Ag 4422 === \n\n");
            System.out.printf("1 - Criar cliente/conta \n" +
                    "2 - Depósito \n" +
                    "3 - Saque \n" +
                    "4 - Transferência \n" +
                    "5 - Consulta de Saldo \n" +
                    "6 - Extrato \n" +
                    "7 - Sair \n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();

            if (opcao == 1) {
                Cliente cliente = new Cliente();

                if (listaClientes.size() > 0) {
                    id_cliente = listaClientes.get(listaClientes.size() - 1).getId() + 1;
                } else {
                    id_cliente = 1;
                }

                cliente.setId(id_cliente);

                System.out.printf("\nDigite o nome do cliente: ");
                cliente.setNome(ler.next());

                System.out.printf("Digite a idade do cliente: ");
                cliente.setIdade(ler.nextInt());

                ContaBancaria conta = new ContaBancaria();

                if (listaClientes.size() > 0) {
                    numero_conta = String.valueOf(listaClientes.get(listaClientes.size() - 1).getId() + 1);
                } else {
                    numero_conta = "1";
                }

                cliente.setConta(conta);

                listaClientes.add(cliente);

                System.out.printf("Cliente incluído com sucesso!");
                System.in.read();
            } else if (opcao == 2) {
                for (Cliente a : listaClientes) {
                    System.out.println("ID: " + a.getId() + " Nome: " + a.getNome());
                }

                System.out.printf("\nDigite o id do cliente que deseja realizar o depósito: ");
                id = ler.nextInt();

                for (Cliente a : listaClientes) {
                    if (a.getId() == id) {
                        indexCliente = listaClientes.indexOf(a);
                        break;
                    }
                }

                if (indexCliente != -1) {
                    Cliente cliente = listaClientes.get(indexCliente);

                    System.out.printf("Digite o valor do depósito: ");
                    double valor = ler.nextDouble();
                    cliente.getConta().Depositar(valor);
                    cliente.getConta().getExtrato().add("+ Depósito $" + valor);

                    System.out.printf("Valor depositado com sucesso!");
                    System.in.read();
                } else {
                    System.out.printf("Cliente não encontrado!");
                }
            } else if (opcao == 3) {
                for (Cliente a : listaClientes) {
                    System.out.println("ID: " + a.getId() + " Nome: " + a.getNome());
                }

                System.out.printf("\nDigite o id do cliente que deseja realizar o saque: ");
                id = ler.nextInt();

                for (Cliente a : listaClientes) {
                    if (a.getId() == id) {
                        indexCliente = listaClientes.indexOf(a);
                        break;
                    }
                }

                if (indexCliente != -1) {
                    Cliente cliente = listaClientes.get(indexCliente);

                    System.out.printf("Digite o valor do saque: ");
                    double value = ler.nextDouble();
                    if (value < cliente.getConta().getSaldo()) {
                        cliente.getConta().Sacar(value);
                        System.out.printf("Valor sacado com sucesso!");
                    } else {
                        System.out.printf("Saldo insuficiente!");
                    }

                    System.in.read();
                } else {
                    System.out.printf("Cliente não encontrado!");
                }
            } else if (opcao == 4) {
                for (Cliente a : listaClientes) {
                    System.out.println("ID: " + a.getId() + " Nome: " + a.getNome());
                }

                System.out.printf("\nDigite o id do cliente que vai enviar o valor: ");
                id = ler.nextInt();

                System.out.printf("Digite o id do cliente que vai receber o valor: ");
                int idTo = ler.nextInt();

                for (Cliente a : listaClientes) {
                    if (a.getId() == id) {
                        indexCliente = listaClientes.indexOf(a);
                        break;
                    }
                }

                for (Cliente a : listaClientes) {
                    if (a.getId() == idTo) {
                        indexClienteTo = listaClientes.indexOf(a);
                        break;
                    }
                }

                if (indexCliente != -1 && indexClienteTo != -1) {
                    Cliente cliente = listaClientes.get(indexCliente);
                    Cliente clienteTo = listaClientes.get(indexClienteTo);

                    System.out.printf("Digite o valor da transferência: ");
                    double value = ler.nextDouble();
                    if (value < cliente.getConta().getSaldo()) {
                        cliente.getConta().Transferir(value, clienteTo);
                        System.out.printf("Valor transferido com sucesso!");
                    } else {
                        System.out.printf("Saldo insuficiente!");
                    }

                    System.in.read();
                } else {
                    System.out.printf("Cliente não encontrado!");
                }
            } else if (opcao == 5) {
                for (Cliente a : listaClientes) {
                    System.out.println("ID: " + a.getId() + " Nome: " + a.getNome());
                }

                System.out.printf("\nDigite o id do cliente que deseja verificar saldo: ");
                id = ler.nextInt();

                for (Cliente a : listaClientes) {
                    if (a.getId() == id) {
                        indexCliente = listaClientes.indexOf(a);
                        break;
                    }
                }

                if (indexCliente != -1) {
                    Cliente cliente = listaClientes.get(indexCliente);

                    System.out.printf("Saldo atual: R$" + cliente.getConta().ConsultarSaldo());
                    System.in.read();
                } else {
                    System.out.printf("Cliente não encontrado!");
                }
            } else if (opcao == 6) {
                for (Cliente a : listaClientes) {
                    System.out.println("ID: " + a.getId() + " Nome: " + a.getNome());
                }

                System.out.printf("\nDigite o id do cliente que deseja verificar extrato: ");
                id = ler.nextInt();

                for (Cliente a : listaClientes) {
                    if (a.getId() == id) {
                        indexCliente = listaClientes.indexOf(a);
                        break;
                    }
                }

                if (indexCliente != -1) {
                    Cliente cliente = listaClientes.get(indexCliente);

                    System.out.printf("Extrato: \n" + cliente.getConta().ConsultarExtrato());
                    System.in.read();
                } else {
                    System.out.printf("Cliente não encontrado!");
                }
            }
        } while ((opcao >= 1) && (opcao <= 6));

    }

}
