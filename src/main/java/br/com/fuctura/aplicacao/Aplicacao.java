package br.com.fuctura.aplicacao;

import java.util.Scanner;

import br.com.fuctura.dao.ClienteDAO;
import br.com.fuctura.dao.factory.DAOFactory;
import br.com.fuctura.entidade.Cliente;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ClienteDAO clienteDAO = DAOFactory.criarClienteDAO();

		System.out.println("========== TESTE 01: Inserção de Cliente ==========");
		System.out.print("Digite o nome do cliente: ");
		String nome = sc.nextLine();
		System.out.print("Digite o cpf do cliente: ");
		String cpf = sc.next();
		System.out.print("Digite o número do celular do cliente: ");
		String celular = sc.next();
		Cliente novoCliente = new Cliente(nome, cpf, celular);
		clienteDAO.inserir(novoCliente);
		System.out.println("Inserido! Novo id = " + novoCliente.getCodigo());

		sc.close();
	}

}
