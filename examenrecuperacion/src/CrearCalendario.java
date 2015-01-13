import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class CrearCalendario {
	public static void main(String[] args) {
		
		//variables
		String nombreCalendario, nombAutor, direccion, nombrePatro;
		int añodecalendario, codigoFoto;
		int numFotografias = 12;
		Date fecha;
		

		Scanner sc = new Scanner (System.in);
		ArrayList<Calendario> calendar = new ArrayList<Calendario>();
		ArrayList<Fotografia> fotograf = new ArrayList<Fotografia>();
		
		System.out.println("dime el nombre del calendario");
		nombreCalendario = sc.next();

		Calendario calendario = new Calendario();
											
		System.out.println("dime el año");  //año
		añodecalendario = sc.nextInt();
		calendario.setAño(añodecalendario); //añadir año

		System.out.println("informacion de las fotografias"); //fotos
		System.out.println("añadimos 12 fotografias por mes"); 

			for (int f=0; f<numFotografias;f++ ) {
				Fotografia fotografias = new Fotografia();

				System.out.println("dime el codigo de la foto");
				codigoFoto = sc.nextInt();
				fotografias.setCodigo(codigoFoto);

				System.out.println("dime el nombre del autor");
				nombAutor = sc.next();
				fotografias.setNombreAutor(nombAutor);

				System.out.println("dime la ubicacion");
				direccion = sc.next();
				fotografias.setUbicacion(direccion);
				
				Date date = new Date();

				System.out.println("dime la fecha DD/MM/AA");
				fecha = sc.next();  //problem
				fotografias.setFechaFoto(fecha);

				fotograf.add(fotografias);
			}
			//fotograf.add(fotografias);
			calendario.setFotografias(fotograf); //añadir fotos

			System.out.println("quien patrocina");
			nombrePatro = sc.next();
			calendario.setPatrocinador(nombrePatro);

			calendar.add(calendario); //añadir calendario a array


		//-------------------------------crear y escribir-------------------------------

			try{
				
				File crear = new File("./DatosCalendario.txt");
				FileWriter escribir = new FileWriter(crear);

				for (int c=0; c < calendar.size(); c++) {
					fotograf = calendar.get(c).getFotografias();
					escribir.write(calendar.get(c).getAño()+"#");
					for (int inf; inf<fotograf.size();inf++ ) {
						escribir.write(fotograf.get(c).getCodigo()+",");
						escribir.write(fotograf.get(c).getNombreAutor()+",");
						escribir.write(fotograf.get(c).getUbicacion()+",");
						escribir.write(fotograf.get(c).getFechaFoto()+"#");
					}
					escribir.write(calendar.get(c).getPatrocinador()+"\n");
			}
				escribir.close();



			}
			catch(IOException e)
			{
			System.out.println("aqui hay un error: " + e);
			}
//-------------------------------visualizar-------------------------------

			Scanner linea = new Scanner("./DatosCalendario.txt");

	}
	
}