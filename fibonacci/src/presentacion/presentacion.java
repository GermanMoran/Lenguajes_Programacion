package presentacion;

import logica.logica;
import java.util.Scanner;

public class presentacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner consola= new Scanner(System.in);
		int n;
		System.out.println("ingrese valor ");
		n=consola.nextInt();
		logica fibo=new logica();
		System.out.println("el resultado es " +fibo.fibonaci(n));
		consola.close();
			}

		}
