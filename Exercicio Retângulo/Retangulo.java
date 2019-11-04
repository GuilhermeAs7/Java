import java.util.InputMismatchException;
import java.util.Scanner;

public class Retangulo implements IShape, IShow {
	
	private float base;
	private float altura;
	
	public Retangulo()
	{

	}
	
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public float getArea() {
		return this.base * this.altura;
	}

	@Override
	public float getPerimetro() {
		return this.base*2 + this.altura*2 ;
	}

	@Override
	public void imprimir() {
		System.out.println( "Area = " + getArea()  );
		System.out.println( "Perimetro = " + getPerimetro()  );
	}
	
	public void calcular() {
		try{
			System.out.println("Entre com a base: ");
			Scanner in = new Scanner(System.in);
			float base = in.nextFloat();
			System.out.println("Entre com a Altura: ");
			float altura = in.nextFloat();
			float area = base * altura;
			float perimetro = base*2 + altura*2;
			System.out.println("Area = " + area);	
			System.out.println("Perimetro = " + perimetro);
		}
		catch (InputMismatchException e)
		{
			System.out.println("----------------------------\n"
					+ "Tipo de informação errada"
					+ "\n----------------------------");
			calcular(); // Entrar com dados novamente
		}
	}
}