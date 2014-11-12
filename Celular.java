package Articles;

public class Celular extends Articulos {
	public String marca;
	public int saldo;
	
	public Celular(String a, int b, int c, int d, String e,boolean f)
	{
		super(c,d,e,f);
		marca = a;
		saldo = b;
	}
}
