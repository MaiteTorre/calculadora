package pruebaCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class CalculadoraTestSumaParametrizada {
	private int a,b,esperado;
	public CalculadoraTestSumaParametrizada(int a,int b,int esp)
	{
		this.a=a;
		this.b=b;
		this.esperado=esp;
	}

@Parameters
public static Collection <Object[]> datosPruebas()
{
	return Arrays.asList(new Object[][] {{10,2,12},{20,-2,18},
		{30,3,33},{-30,3,-27}});
}
	
	@Test
	
	public void test() {
		Calculadora cal=new Calculadora(a,b);
		int res=cal.suma();
		System.out.println("\t\tProbando metodo suma()");
		assertEquals(esperado,res);
	}

}
