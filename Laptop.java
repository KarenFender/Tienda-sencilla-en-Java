package Articles;

public class Laptop extends Articulos {
	public String procesador;
	public int ram;
	
	
	
	public Laptop(String a, int b, int c,int d, String e,boolean f)
	{
		
		super(c,d,e,f);
		procesador = a;
		ram = b;
	}


}

