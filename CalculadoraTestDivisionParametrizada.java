package pruebaCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@DisplayName("PRUEBAS PARAMETRIZADAS DEL METODO division DE LA CLASE Calculadora ")
@RunWith(value=Parameterized.class)
public class CalculadoraTestDivisionParametrizada {
	private int a,b,esperado;
	public CalculadoraTestDivisionParametrizada(int a,int b,int esp)
	{
		this.a=a;
		this.b=b;
		this.esperado=esp;
	}

@Parameters
public static Collection <Object[]> datosPruebas()
{
	
	return Arrays.asList(new Object[][] {{10,2,5},{20,-2,-10},
		{30,3,10},{-30,3,-10}});
}
	
	@Test
	
	public void test() {
		Calculadora cal=new Calculadora(a,b);
		System.out.println("\t\tEn metodo division()");
		int res=cal.division();
		assertEquals(esperado,res);
	}

}
