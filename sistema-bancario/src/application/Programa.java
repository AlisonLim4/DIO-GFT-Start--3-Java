package application;

import java.util.Arrays;

import domain.Banco;
import domain.Cliente;
import domain.Conta;
import domain.ContaCorrente;
import domain.ContaPoupanca;
import domain.TipoDeConta;

public class Programa {

	public static void main(String[] args) {

		Banco banco1 = new Banco("Banco Pay+");
		Banco banco2 = new Banco("Banco SuperCash");

		Cliente cli1 = new Cliente("Ana Maria", "02/011/1990", "134.415.234-43", "21985687324", null);
		Cliente cli2 = new Cliente("Marcos Paulo", "10/09/1997", "126.223.817-61", "21987027595", null);
		Cliente cli3 = new Cliente("Julia Andrade", "25/03/1985", "111.869.976-76", "21938609478", null);

		Cliente cli4 = new Cliente("Soraya Antunes", "18/05/1975", "157.834.765-76", "21984745898", null);

		Conta con1 = new ContaCorrente(cli1, 100.00);
		Conta con2 = new ContaPoupanca(cli2, 0.0);
		Conta con3 = new ContaPoupanca(cli3, 1000.00);

		Conta con4 = new ContaCorrente(cli4, 2000.00);
		cli4.setConta(con4);

		cli1.setConta(con1);
		cli2.setConta(con2);
		cli3.setConta(con3);

		banco1.getContas().addAll(Arrays.asList(con1, con2, con3));
		banco2.getContas().addAll(Arrays.asList(con4));

		System.out.println("=== Informações ===");


		System.out.print("Deposito 01: ");
		con1.depositar(1000.00);
		System.out.println();
		
		System.out.print("Deposito 02: ");
		con2.depositar(200.00);
		System.out.println();
		
		System.out.print("Deposito 03: ");
		con3.depositar(50.00);
		System.out.println();
		
//		con1.imprimirExtrato();
//		con2.imprimirExtrato();
//		con3.imprimirExtrato();

//		System.out.print("Saque con1: ");
//		con1.sacar(300.00);
//		System.out.println();
		
		System.out.print("Transferência con2 -> con4 -> banco2: ");
		con2.transferir(100, con1,banco1);
		System.out.println();
		
//		System.out.print("Transferencia con3 -> con1 -> banco1: ");
//		con3.transferir(10.0, con1,banco1);
		System.out.println();
		
//		con1.imprimirExtrato();
		con2.imprimirExtrato();
//		con3.imprimirExtrato();
	}
}
