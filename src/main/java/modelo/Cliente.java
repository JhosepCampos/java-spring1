package modelo;

public class Cliente {

	private int id;
	private String nombre;
	private String ciudad;
	private double credito;
	private String email;
	private TipoCliente tipo;
	
	
	public Cliente(int id, String nombre, String ciudad, double credito,String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.credito = credito;
		this.email = email;
	}

	public Cliente() {
		super();
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public double getCredito() {
		return credito;
	}


	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	
	
	
}
