
public class Calculadora {
	private int op1;
	private int op2;
	
	Calculadora(int a, int b)
	{
		op1=a;
		op2=b;
	}
	public int sumar()
	{
		return op1+op2;
	}
	public int restar()
	{
		return op1-op2;
	}
	public int multiplicar()
	{
		return op1*op2;
	}
	public int dividir()
	{
		return op1/op2;
	}
	
	
	
}
