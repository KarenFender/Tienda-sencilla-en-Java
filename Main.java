package Articles;

import javax.swing.JOptionPane;


public class Main {
	public static void main(String[]args){
		int chico = 10;
		int mediano = 50;
		int grande = 100;
		boolean existencia;
		
		Laptop p = new Laptop("core 2 duo", 1, 2000, chico, "gris",true);
		Laptop p2 = new Laptop("corei-5", 2, 10000, mediano, "gris",true);
		Laptop p3 = new Laptop("pentium 3", 255, 5000, chico, "rosa",true);
		float pre = p.obtenerPrecio();
		float pre2 = p2.obtenerPrecio();
		float pre3 = p3.obtenerPrecio();
		
		
		Monitor m = new Monitor(20, 30, mediano, "negro",true);
		float pre4 = m.obtenerPrecio();
		
		Celular c = new Celular("Nokia", 100, 100, chico, "negro",true);
		Celular c2 = new Celular("Samsung", 200, 20, chico, "blanco",true);
		Celular c3 = new Celular("Sony", 50, 30, chico, "gris",true);
		float pre5 = c.obtenerPrecio();
		float pre6 = c2.obtenerPrecio();
		float pre7 = c3.obtenerPrecio();
		
		Teclado t = new Teclado(50, 50, mediano, "blanco",true);
		float pre8 = t.obtenerPrecio();
		
		Bocinas b = new Bocinas(20, 1, grande, "negro",true);
		Bocinas b2 = new Bocinas(25, 2, mediano, "blanco",true);
		float pre9 = b.obtenerPrecio();
		float pre10 = b2.obtenerPrecio();
		
		/*Articulos array[] = new Articulos[10];
		array [0] = p;
		array [1] = p2;
		array [2] = p3;
		array [3] = m;
		array [4] = c;
		array [5] = c2;
		array [6] = c3;
		array [7] = t;*/
		
		Articulos array[]={p,p2,p3,m,c,c2,c3,t,b,b2};
		
		
		float suma=0;
		String artic = "";
		while(true){
			try{
		String opcion = JOptionPane.showInputDialog(null,"Elige una opción\n" + "1.-Laptops\n" + "2.-Monitores\n" + "3.-Celulares\n" + "4.-Teclados\n" + "5.-Bocinas\n");
		if (opcion == null)
		{
			JOptionPane.showMessageDialog(null,"Compraste:\n" +  artic+    "\nEl total es: " + suma);
			System.exit(0);
		}
		else{
		int op = Integer.parseInt(opcion);
		
		
		switch(op)
		{
		
		
		case 1:
			boolean bandera=true;
			while(bandera){
			String opLaptop = JOptionPane.showInputDialog(null,"Selecciona una computadora:\n " + "1.-Asus\n"+"2.-Dell\n"+"3.-HP\n");
			if (opLaptop == null)
			{
				break;
			}
			else
			{
				int opcionLap = Integer.parseInt(opLaptop);
				
				
				switch(opcionLap)
				{
				case 1:
					JOptionPane.showMessageDialog(null, "Caracteristicas de la Laptop Asus:\n" + "Procesador: " + p.procesador + "\nMemoria Ram: "+ p.ram +" gb" +"\nPeso: "+ p.peso +" kg" + "\nTamaño: "+ p.tamaño+ "\nColor: " + p.color+ "\nDisponibilidad: " + p.existencia + "\nPrecio: " + pre);
					boolean ex = p.existencia;
					if(ex){
					
					int con = JOptionPane.showConfirmDialog(null, "¿Deseas comprar? ");
					if(con == 0)
					{
						
						JOptionPane.showMessageDialog(null, "Comprado");
						suma += pre; 
						artic += "Asus con procesador " + p.procesador + "\n";
						p.existencia = false;
					}
					
					}
					else 
					{
					  
					  JOptionPane.showMessageDialog(null, "No disponible");
					}
					
					
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, "Caracteristicas de la Laptop Dell:\n" + "Procesador: " + p2.procesador + "\nMemoria Ram: "+ p2.ram +" gb" +"\nPeso: "+ p2.peso +" kg" + "\nTamaño: "+ p2.tamaño+ "\nColor: " + p2.color+ "\nDisponibilidad: " + p2.existencia+ "\nPrecio: " + pre2);
					boolean ex2 = p2.existencia;
					if(ex2){
						int con2 = JOptionPane.showConfirmDialog(null, "¿Deseas comprar? ");
						if(con2 == 0)
						{
							JOptionPane.showMessageDialog(null, "Comprado");
							suma += pre2; 
							artic += "Del con procesador " + p2.procesador + "\n";
							p2.existencia = false;
							
						}
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No disponible");
					}
					
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Caracteristicas de la Laptop HP:\n" + "Procesador: " + p3.procesador + "\nMemoria Ram: "+ p3.ram +" gb" +"\nPeso: "+ p3.peso +" kg" + "\nTamaño: "+ p3.tamaño+ "\nColor: " + p3.color+ "\nDisponibilidad: " + p3.existencia+ "\nPrecio: " + pre3);
					boolean ex3 = p3.existencia;
					if(ex3){
					int con3 = JOptionPane.showConfirmDialog(null, "¿Deseas comprar? ");
					if(con3 == 0)
					{
						JOptionPane.showMessageDialog(null, "Comprado");
						suma += pre3;
						artic += "HP con procesador " + p3.procesador + "\n";
						p3.existencia = false;
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No disponible");
					}
					break;
					
				}
			}
			
			//break;
			}
			break;
			
			
		case 2:
			boolean bandera2=true;
			while(bandera2){
			String opMonitor = JOptionPane.showInputDialog(null,"Elige Monitor\n" + "1.-Monitor Acer\n");
			if (opMonitor == null)
			{
				break;
			}
			else{
				int opcionMon = Integer.parseInt(opMonitor);
				
				switch(opcionMon)
				{
				case 1:
					JOptionPane.showMessageDialog(null, "Caracteristicas del monitor:\n" +"Resolucion: " + m.resolucion + " Pulgadas" + "\nPeso: " +m.peso +" kg" + "\nTamaño: " + m.tamaño +"\nColor: "+ m.color + "\nPrecio: "+pre4);
					boolean ex4 = m.existencia;
					if(ex4){
					int con4 = JOptionPane.showConfirmDialog(null, "¿Deseas comprar? ");
					if(con4 == 0)
					{
						JOptionPane.showMessageDialog(null, "Comprado");
						artic += "Monitor de " + m.resolucion + " Pixles" + "\n";
						suma += pre4;
						
						m.existencia = false;
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No disponible");
					}
					break;
				}
			}
			
			}
			break;
			
		case 3:
			boolean bandera3 = true;
			while(bandera3){
			String opCelular = JOptionPane.showInputDialog(null,"Elige un celular:\n" + "1.-Nokia\n" + "2.-Samsung\n"+"3.-Sony\n");
			if(opCelular == null)
			{
				break;
			}
			else
			{
				int opcionCel = Integer.parseInt(opCelular);
				
				switch(opcionCel)
				{
				case 1: 
					JOptionPane.showMessageDialog(null, "Caracteristicas de celular Nokia:\n" + "Marca: " + c.marca + "\nSaldo: " + c.saldo + "\nPeso: " + c.peso + " gr" + "\nTamaño: " + c.tamaño + "\nColor: " + c.color + "\nDisponibilidad: " + c.existencia + "\nPrecio: " + pre5);
					boolean ex5 = c.existencia;
					if(ex5){
					int con5 = JOptionPane.showConfirmDialog(null, "¿Deseas comprar? ");
					if(con5 == 0)
					{
						JOptionPane.showMessageDialog(null, "Comprado");
						suma += pre5;
						artic += "Celular " + c.marca + "\n";
						c.existencia = false;
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No disponible");
					}
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Caracteristicas de celular Samsung:\n" + "Marca: " + c2.marca + "\nSaldo: " + c2.saldo + "\nPeso: " + c2.peso + " gr" + "\nTamaño: " + c2.tamaño + "\nColor: " + c2.color + "\nDisponibilidad: " + c2.existencia+ "\nPrecio: " + pre6);
					boolean ex6 = c2.existencia;
					if(ex6){
					int con6 = JOptionPane.showConfirmDialog(null, "¿Deseas comprar? ");
					if(con6 == 0)
					{
						JOptionPane.showMessageDialog(null, "Comprado");
						suma += pre6;
						artic += "Celular " + c2.marca + "\n";
						c2.existencia = false;
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No disponible");
					}

					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Caracteristicas de celular Sony:\n" + "Marca: " + c3.marca + "\nSaldo: " + c3.saldo + "\nPeso: " + c3.peso + " gr" + "\nTamaño: " + c3.tamaño + "\nColor: " + c3.color + "\nDisponibilidad: " + c3.existencia+ "\nPrecio: " + pre7);
					boolean ex7 = c3.existencia;
					if(ex7){
					int con7 = JOptionPane.showConfirmDialog(null, "¿Deseas comprar? ");
					if(con7 == 0)
					{
						JOptionPane.showMessageDialog(null, "Comprado");
						suma += pre7;
						artic += "Celular "+ c3.marca + "\n";
						c3.existencia = false;
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No disponible");
					}
					break;
				}
			}
			
			}
			break;
			
		case 4:
			boolean bandera4 = true;
			while(bandera4){
			String opTeclado = JOptionPane.showInputDialog(null,"Elije Teclado:\n " + "1.-Teclado\n");
			if(opTeclado == null)
			{
				break;
			}
			else
			{
				int opcionTec = Integer.parseInt(opTeclado);
				
				switch (opcionTec)
				{
				case 1:
					JOptionPane.showMessageDialog(null, "Caracteristicas del teclado: \n" + "Teclas: " + t.numTeclas + "\nPeso: " + t.peso + "gr" + "\nTamaño: " + t.tamaño + "\nColor: " + t.color + "\nPrecio: " + pre8);
					boolean ex8 = c.existencia;
					if(ex8){
					int con8 = JOptionPane.showConfirmDialog(null, "¿Deseas comprar? ");
					if(con8 == 0)
					{
						JOptionPane.showMessageDialog(null, "Comprado");
						suma += pre8;
						artic += "Teclado Razer de " + t.numTeclas + " teclas" + "\n";
						t.existencia = false;
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No disponible");
					}
					break;
				}
			}
			
			}
			break;
			
		case 5:
			boolean bandera5 = true;
			while(bandera5){
			String opBocinas = JOptionPane.showInputDialog(null,"Elige Bocinas\n" + "1.-Bocinas Logitech\n" + "2.-Bocinas Sony\n");
			if(opBocinas == null)
			{
				break;
			}
			else
			{
				int opcionBoc = Integer.parseInt(opBocinas);
				
				switch(opcionBoc)
				{ 
				case 1:
					JOptionPane.showMessageDialog(null, "Caracteristicas de Bocinas Logitech: \n" + "Volumen: " + b.maxVolumen + " db" + "\nPeso: "+ b.peso + " kg" + "\nTamaño: " + b.tamaño + "\nColor: " + b.color + "\nDisponible: " + b.existencia + "\nPrecio: " + pre9);
					boolean ex9 = b.existencia;
					if(ex9){
					int con9 = JOptionPane.showConfirmDialog(null, "¿Deseas comprar? ");
					if(con9 == 0)
					{
						JOptionPane.showMessageDialog(null, "Comprado");
						suma += pre9;
						artic += "Bocinas Logitech de "+ b.maxVolumen + " db"+ "\n";
						b.existencia = false;
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No disponible");
					}
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Caracteristicas de Bocinas Sony: \n" + "Volumen: " + b2.maxVolumen + "db" + "\nPeso: " + b2.peso + " kg"  + "\nTamaño: " + b2.tamaño + "\nColor: " + b2.color + "\nDisponible: " + b.existencia + "\nPrecio: " + pre10);
					boolean ex10 = b2.existencia;
					if(ex10){
					int con10 = JOptionPane.showConfirmDialog(null, "¿Deseas comprar? ");
					if(con10 == 0)
					{
						JOptionPane.showMessageDialog(null, "Comprado");
						suma += pre10;
						artic += "Bocinas Sony de " + b2.maxVolumen +" db" + "\n";
						b2.existencia = false;
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No disponible");
					}
					break;
				}
			}
			
			}
			break;
		  
		}
		
	
		JOptionPane.showMessageDialog(null,"Compraste:\n"+ artic+ "\nEl total es de : " + suma);
		
		}
		
			} //llave del try
			catch(NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(null,"Introduce un número porfavor.");
			}
		
		
	} //llave de while
		
		
		

  }
}

