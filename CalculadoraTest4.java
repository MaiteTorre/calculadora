package pruebaCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("PRUEBAS DE LA CLASE Calculadora con BeforeAll y AfterAll")
class CalculadoraTest4 {
 /* La calculadora se crea una única vez y 
	se utiliza en cada método para ello debe ser static*/
	private static Calculadora cal=null;
	private static int resultado;
	
	@BeforeAll
	static void creaCalculadora ()
	{
	System.out.println("Creacion Calculadora");
	cal=new Calculadora(10,30);

	}
	@AfterAll
	static void borraCalculadora ()
	{
		System.out.println("Eliminación Calculadora");
		cal=null;

	}

	@Test
	void testSuma() {
		resultado=cal.suma();
		Integer num1=40;
		Integer num2=40;
		boolean var=true;
		System.out.println("\t\tEn metodo suma()");
		assertNotEquals(60,resultado,"ERROR EN suma()");
		//assertSame((Object)num1,(Object)num2,"No es el mismo objeto!!");
		assertTrue(var,"No es TRUE");
	}

	@Test
	@DisplayName("Test del metodo producto")

		void testProducto() {
		int resultado=cal.producto();
		System.out.println("\t\tEn metodo producto()");
		assertEquals(300,resultado,"ERROR EN producto()");
	}

	@Test
	void testResta() {
		int resultado=cal.resta();
		System.out.println("\t\tEn metodo resta()");
		assertEquals(-20,resultado,"ERROR EN resta()");
		
	}

	@Test
	void testDivision() {
		int resultado=cal.division();
		System.out.println("\t\tEn metodo division()");
		assertEquals(0,resultado,"ERROR EN division()");
	}


}
