import java.util.Date;
public class Fotografia {
	private int codigo;
	private String nombreAutor;
 	private String ubicacion;
	private Date fechaFoto;

	//getters
	public int getCodigo(){
		return this.codigo;
	}
	public String getNombreAutor(){
		return this.nombreAutor;
	}
	public String getUbicacion(){
		return this.ubicacion;
	}
	public Date getFechaFoto(){
		return this.fechaFoto;
	}
	//setters
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public void setNombreAutor(String nombreAutor){
		this.nombreAutor = nombreAutor;
	}
	public void setUbicacion(String ubicacion){
		this.ubicacion = ubicacion;
	}
	public void setFechaFoto(Date fechaFoto){
		this.fechaFoto = fechaFoto;
	}
}