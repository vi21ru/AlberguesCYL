package beans;

import java.util.Arrays;

public class Albergue {

	private int id;
	private String tipo;
	private String nombre;
	private String direccion;
	private int codigoPostal;
	private String provincia;
	private String municipio;
	private String localidad;
	private String nucleo;
	private String[] telefono=new String[3];
	private String fax;
	private String email;
	private String web;
	private String Qcalidad;
	private String centralReservas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getNucleo() {
		return nucleo;
	}
	public void setNucleo(String nucleo) {
		this.nucleo = nucleo;
	}
	public String[] getTelefono() {
		return telefono;
	}
	public void setTelefono(String[] telefono) {
		this.telefono = telefono;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getQcalidad() {
		return Qcalidad;
	}
	public void setQcalidad(String qcalidad) {
		Qcalidad = qcalidad;
	}
	public String getCentralReservas() {
		return centralReservas;
	}
	public void setCentralReservas(String centralReservas) {
		this.centralReservas = centralReservas;
	}
	@Override
	public String toString() {
		return "Albergue [tipo=" + tipo + ", nombre=" + nombre + ", direccion=" + direccion + ", codigoPostal="
				+ codigoPostal + ", provincia=" + provincia + ", municipio=" + municipio + ", localidad=" + localidad
				+ ", nucleo=" + nucleo + ", telefono=" + Arrays.toString(telefono) + ", fax=" + fax + ", email=" + email
				+ ", web=" + web + ", Qcalidad=" + Qcalidad + ", centralReservas=" + centralReservas + "]";
	}
	
	public String toCSVString(){
		return tipo + ";" + nombre + ";" + direccion + ";"
				+ codigoPostal + ";" + provincia + ";" + municipio + ";" + localidad
				+ ";" + nucleo + ";" + Arrays.toString(telefono) + ";" + fax + ";" + email
				+ ";" + web + ";" + Qcalidad + ";" + centralReservas;
		
	}

}
