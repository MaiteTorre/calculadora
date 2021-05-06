import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Prueba de la clase Calculadora")
class CalculadoraTestBeforeAll {
	private static Calculadora cal;
	@BeforeAll
	static void crearObjeto() {
		 cal=new Calculadora(5,7);
		System.out.println("Objeto creado");
	}

	@AfterAll
	static void eliminarObjeto() {
		 cal=null;
		System.out.println("Objeto eliminado");
	}
@Test
	void testComparaObjetos() {
		String valor1=new String("hol");
		String valor2=new String("hola");
		
		assertSame(valor1,valor2,"Error distintos objetos");
		System.out.println("metodo multiplicar()");
	}
@Test
void testComparaContenidos() {
	String valor1=new String("hol");
	String valor2=new String("hola");
	assertEquals(valor1,valor2,"Error distinto contenido");
	
	System.out.println("metodo multiplicar()");
}	
@Test
	void testSumar() {
		
		int res=cal.sumar();
		System.out.println(" metodo sumar()");
		assertEquals(12,res,"Error al sumar");
	}
	@DisplayName("Prueba de diferencia")
	@Test
	void testRestar() {
		
		assertEquals(-2,cal.restar(),"Error al restar");
		System.out.println("metodo restar()");
	}

	@Test
	void testMultiplicar() {
		assertEquals(35,cal.multiplicar(),"Error al multiplicarar");
	
		System.out.println("metodo multiplicar()");
	}
    
	@Test
	void testDividir() {
		System.out.println("metodo dividir()");
		Calculadora cal=new Calculadora(5,10);
		assertEquals(0,cal.dividir(),"Error al dividir");
	
	}

}
