import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Prueba de la clase Calculadora")
class CalculadoraTest {

	@Test
	void testCalculadora() {
		System.out.println("Not yet implemented");
	}

	@Test
	void testSumar() {
		Calculadora cal=new Calculadora(5,7);
		int res=cal.sumar();
		System.out.println(" sumar()");
		assertEquals(12,res,"Error al sumar");
	}
	@DisplayName("Prueba de diferencia")
	@Test
	void testRestar() {
		Calculadora cal=new Calculadora(5,7);
		assertEquals(-2,cal.restar(),"Error al restar");
		System.out.println("metodo restar()");
	}

	@Test
	void testMultiplicar() {
		Calculadora cal=new Calculadora(5,7);
		assertEquals(35,cal.multiplicar(),"Error al multiplicarar");
	
		System.out.println("multiplicar");
	}
    
	@Test
	void testDividir() {
		System.out.println("dividir");
		Calculadora cal=new Calculadora(5,10);
		assertEquals(0,cal.dividir(),"Error al dividir");
	
	}

}
