package application;

import java.util.Date;

import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {


		Departamento dp = new Departamento(2214, "Guitarras");
		
		Vendedor vendedor = new Vendedor(1, "Simone", "simone@gmail.com", new Date(), 3000, dp);
		
		System.out.println(vendedor);

	}

}
