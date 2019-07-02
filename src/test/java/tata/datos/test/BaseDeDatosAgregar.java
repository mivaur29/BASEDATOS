package tata.datos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import tata.datos.modelo.BaseDeDatos;
import tata.datos.modelo.Dato;



public class BaseDeDatosAgregar {

	private BaseDeDatos base;
	
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cuandoAgrega1EntoncesTrue() {
		boolean retorno = this.base.agregar(new Dato("A1","DATOSSSSSSS"));
		assertTrue(retorno);
	}
	
	@Test
	public void cuandoAgregaDatoNullEntoncesFalse() {
		boolean retorno = this.base.agregar(null);
		System.out.println("retorna false si dato == nulo :"+retorno);
		assertFalse(retorno);
	}
	
	@Test
	public void cuandoAgregaDatoIDNullEntoncesFalse() {
		boolean retorno = this.base.agregar(new Dato(null,"DATOSSSSSSS"));
		System.out.println("retorna false si dato.getId() == null :"+retorno);
		assertFalse(retorno);
	}
	
	@Test
	public void cuandoAgregaDatoIDMenorIgual1EntoncesFalse() {
		
		Dato dato = new Dato("A1","Datosss");
		int largo = dato.getId().length();
		this.base.agregar(dato);
		boolean retorno = largo <=1 ;
		System.out.println("retorna false si largo de dato.getId() <=1 :"+retorno);
		assertFalse(retorno);
	}
	
	@Test
	public void cuandoAgregaOrdenaEntoncesTrue() {
		
		
		this.base.agregar(new Dato("A2","DATOSSSSSSS"));
		this.base.agregar(new Dato("A3","DATOSSSSSSS"));
		this.base.agregar(new Dato("A1","DATOSSSSSSS"));
		
		 boolean retorno =  base.listar().get(0).getId()=="A1" && base.listar().get(1).getId()=="A2" && base.listar().get(2).getId()=="A3";
		 System.out.println(retorno);
		 assertTrue(retorno);
		
		

		
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	

}
