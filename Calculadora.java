class Calculadora 
{
	public static void main(String[] args) throws Exception
	{float x, y, r; String o;
		System.out.println("Calculadora!");
		System.out.println("Digite um numero: ");
		x = JUtil.readFloat();
		System.out.println("Digite um operador: ");
		o = JUtil.readString();
		System.out.println("Digite um numero: ");
		y = JUtil.readFloat();
		
		if (o.equals("+"))
		{r = x + y;
		System.out.println("Soma = " + r);
 		}else
		if (o.equals("-"))
		{r = x - y;
		System.out.println("Subtração = " + r);
		}else
		if (o.equals("*"))
		{r = x * y;
		System.out.println("Multiplicação = " + r);
 		}else
		if (o.equals("/"))
		{r = x / y;
		System.out.println("Divisão = " + r);
		}else
		{System.out.println("Operador Invalido");}

		JUtil.pause();
	}
}