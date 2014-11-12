package Articles;

public class Articulos {
	public float  peso;
	public int tamaño;
	public String color;
	public boolean existencia;
	
	public Articulos(float p, int tam, String col, boolean ex)
	{
		peso = p;
		tamaño = tam;
		color = col;
		existencia = ex;
	}

	public float obtenerPrecio(){
		float precio = tamaño * peso;
		return precio;
	}
	
}
