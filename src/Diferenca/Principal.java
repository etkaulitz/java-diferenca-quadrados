package Diferenca;

import javax.naming.spi.DirStateFactory.Result;

public class Principal {

	public static void main(String[] args) {
			
		AreaDeVariosQuadrados quadradoUm = new AreaDeVariosQuadrados(5, 5);
		AreaDeVariosQuadrados quadradoDois = new AreaDeVariosQuadrados(2, 2);
		
		
		System.out.println("A area do quadrado � de: "+ quadradoUm.getArea());
		System.out.println("A area do quadrado � de: "+ quadradoDois.getArea());
		
		System.out.println("A diferen�a das areas � de: " +  quadradoUm.calcularAreaDaDiferenca(quadradoDois));

	}

}
