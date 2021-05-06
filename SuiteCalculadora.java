package pruebaCalculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@DisplayName("Suite de Pruebas parametrizadas")
@RunWith(Suite.class)
@SuiteClasses({CalculadoraTestDivisionParametrizada.class,
	CalculadoraTestProductoParametrizada.class,
	CalculadoraTestSumaParametrizada.class,
	CalculadoraTestRestaParametrizada.class
})
public class SuiteCalculadora {

}


