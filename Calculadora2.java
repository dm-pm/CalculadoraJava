class Calculadora 
{
	public static void main(String[] args) throws Exception
	{float x, y, r; char op1, op2, op3, op4, op5, o;
		op1 = '+';
		op2 = '-';
		op3 = '*';
		op4 = '/';
		op5 = '%';
		Scanner entrada = new Scanner(System.in);
		System.out.println("Calculadora!");
		System.out.println("Digite um numero: ");
		x = JUtil.readFloat();
		System.out.println("Digite um operador: ");
		o = entrada.nextLine().charAt(0);
		System.out.println("Digite um numero: ");
		y = JUtil.readFloat();
		
		if (op1 == '+')
		{r = x + y;
		System.out.print(r);
		System.out.print("Soma");
 		}
		JUtil.pause();
	}
}