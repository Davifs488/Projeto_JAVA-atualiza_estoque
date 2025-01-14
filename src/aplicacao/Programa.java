package aplicacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produtos pro = new Produtos();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Nome do produto deseja cadastra : \n ");
		pro.produto = sc.next();
;
		
		System.out.println(" Diga a quantidade do produto : \n ");
		pro.quantidade = sc.nextInt();
		
		System.out.println(" Informe o preço do produto individual : \n");
		pro.preco = sc.nextDouble();
		
		System.out.println(" CONFIRMAÇÃO :"+pro.produto+ ", Estoque :" +pro.quantidade+ " Preço :" +pro.preco + "\n");
		
		System.out.println(" Deseja acrescentar algum produto ao estoque ? \n ");
		int estoque = sc.nextInt();
		pro.addProdutos(estoque);
		
		System.out.println(" ATUALIZAÇÃO :"+pro.produto+ ", Estoque atual :" +pro.quantidade+ " Preço :" +pro.preco + "\n");
		
		System.out.println(" Foi feita alguma venda ? :  \n" );
		estoque = sc.nextInt();
		pro.subProdutos(estoque);
        System.out.println(" ATUALIZAÇÃO PÓS VENDAS :"+pro.produto+ ", Estoque atual :" +pro.quantidade+ " Preço :" +pro.preco +
		" Valor atual do estoque:$ " + pro.quantidade*pro.preco);
		
        
        JOptionPane.showMessageDialog(null, " ATUALIZAÇÃO PÓS VENDAS :"+pro.produto+ ", Estoque atual :" +pro.quantidade+ " Preço :" +pro.preco +
		" Valor atual do estoque:$ " + pro.quantidade*pro.preco);
		
		

		
		sc.close();

	}

}
