package pruebaCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class CalculadoraTestProductoParametrizada {
	private int a,b,esperado;
	public CalculadoraTestProductoParametrizada(int a,int b,int esp)
	{
		this.a=a;
		this.b=b;
		this.esperado=esp;
	}

@Parameters
public static Collection <Object[]> datosPruebas()
{
	return Arrays.asList(new Object[][] {{10,2,20},{20,-2,-40},
		{30,3,90},{-30,3,-90}});
}
	
	@Test
	
	public void test() {
		Calculadora cal=new Calculadora(a,b);
		System.out.println("\t\tProbando metodo produco()");

		int res=cal.producto();
		assertEquals(esperado,res);
	}

}

