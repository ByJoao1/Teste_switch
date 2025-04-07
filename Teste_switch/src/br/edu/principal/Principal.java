package br.edu.principal;

import java.util.Scanner;

	public class Principal {
		public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um numero de 1 a 12: ");
		        int dia=scanner.nextInt();
		        switch (dia) {
		       
		        case 1: 
		        	System.out.println("janeiro ");
		        break;
		        
		        case 2:
		        	System.out.println("Fevereiro");
		        break;
		        case 3:
		        	System.out.print("Março");
		        break;	
		        case 4:
		        	System.out.print("Abril");
		        break;
		        case 5:
		        	System.out.print("maio");
		        break;
		        case 6:
		        	System.out.print("junho");
		        break;
		        case 7: 
		        	System.out.print("julho");
		        break;	
		        case 8:
		        	System.out.print("agosto");
		        break;
		        case 9:
		        	System.out.print("setembro");
		        break;
		        case 10:
		        	System.out.print("outobro");
		        case 11:
		        	System.out.print("novembro");
		        break;
		        case 12:
		        	System.out.print("dezembro");
		        break;
		        default: {
		        	System.out.print("Numero invalido");
		        }
		    }
		}
}