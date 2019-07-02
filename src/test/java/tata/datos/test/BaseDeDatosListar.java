package tata.datos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import tata.datos.modelo.BaseDeDatos;
import tata.datos.modelo.Dato;



public class BaseDeDatosListar {

	private BaseDeDatos base;
	
	
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cuandoNoAgregaEntoncesListaSize0() {
		int largo = this.base.listar().size();
		assertTrue("ES " + largo + " PERO DEBERIA SER 0", largo == 0);
	}
	@Test
	public void cuandoAgrega1EntoncesListaSize1() {
		this.base.agregar(new Dato("A2","DATOSS"));
		int largo = this.base.listar().size();
		assertTrue("ES " + largo + " PERO DEBERIA SER 1", largo == 1);
	}
	@Test
	public void cuandoAgrega5EntoncesListaSize5() {
		this.base.agregar(new Dato("A1","DATOSS"));
		this.base.agregar(new Dato("A2","DATOSS"));
		this.base.agregar(new Dato("A3","DATOSS"));
		this.base.agregar(new Dato("A4","DATOSS"));
		this.base.agregar(new Dato("A5","DATOSS"));
		int largo = this.base.listar().size();
		assertTrue("ES " + largo + " PERO DEBERIA SER 5", largo == 5);
	}

}
