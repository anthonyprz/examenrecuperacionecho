import java.util.ArrayList;
public class  Calendario {
	private int año;
	private ArrayList<Fotografia> fotografias;
	private String patrocinador;
	//getters
	public int getAño(){
		return this.año;
	}
	public ArrayList<Fotografia> getFotografias(){
		return this.fotografias;
	}
	public String getPatrocinador(){
		return this.patrocinador;
	}
	//setters
	public void setAño(int año){
		this.año = año;
	}
	public void setFotografias(ArrayList<Fotografia> fotografias){
		this.fotografias = fotografias;
	}
	public void setPatrocinador(String patrocinador){
		this.patrocinador = patrocinador;
	}
	
}