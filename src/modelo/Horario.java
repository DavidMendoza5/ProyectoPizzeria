package modelo;

public class Horario {
	private String dia; //nombre del dia
	private String horaEntrada;
	private String horaSalida;
	
	//Constructor
	public Horario(String dia, String horaEntrada, String horaSalida){
		this.dia = dia;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}
	
	
	//métodos set
	public void setDia(String dia){
		this.dia = dia;
	}
	
	public void setHora_Inicio(String horaEntrada){
		this.horaEntrada = horaEntrada;
	}
	
	public void setHora_Termina(String horaSalida){
		this.horaSalida = horaSalida;
	}
	
	//métodos get
	public String getDia(){
		return dia;
	}
	
	public String getHoraEntrada(){
		return horaEntrada;
	}
	
	public String getHoraSalida(){
		return horaSalida;
	}
	
	
	//m�todo toString
	public String toString(){
		return getDia() + " .- " + getHoraEntrada() + " / " + getHoraSalida();
	}
}
