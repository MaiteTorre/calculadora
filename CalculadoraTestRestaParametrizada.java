package pruebaCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class CalculadoraTestRestaParametrizada {
	private int a,b,esperado;
	public CalculadoraTestRestaParametrizada(int a,int b,int esp)
	{
		this.a=a;
		this.b=b;
		this.esperado=esp;
	}

@Parameters
public static Collection <Object[]> datosPruebas()
{
	return Arrays.asList(new Object[][] {{10,2,8},{20,-2,22},
		{30,3,27},{-30,3,-33}});
}
	
	@Test
	
	public void test() {
		Calculadora cal=new Calculadora(a,b);
		int res=cal.resta();
		System.out.println("\t\tProbando metodo resta");
		assertEquals(esperado,res);
	}

}
