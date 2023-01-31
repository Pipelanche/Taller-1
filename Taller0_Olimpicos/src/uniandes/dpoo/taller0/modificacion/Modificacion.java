package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

import uniandes.dpoo.taller0.consola.ConsolaOlimpicos;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;

public class Modificacion { 

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		System.out.println("Hola, mundo!"); 
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println(calc.paisConMasMedallistas());
	}

}
