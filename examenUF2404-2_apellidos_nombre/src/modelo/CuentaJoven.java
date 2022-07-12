package modelo;

public class CuentaJoven extends Cuenta {

	private double bonificacion;
	private boolean estudiante;
	
	private static final double bonifEstudiate=0.07;
	
	
	public CuentaJoven(Persona titular, double saldo, double bonificacion, boolean estudiante) {
		super(titular, saldo);
		if (titular.getEdad()<26) {
			this.bonificacion = bonificacion;
			this.estudiante = estudiante;
		} else {
			this.bonificacion=0;
			this.estudiante=false;
		}
		
	}


	public double getBonificacion() {
		return bonificacion;
	}


	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}


	public boolean isEstudiante() {
		return estudiante;
	}


	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}


	@Override
	public String toString() {
		return "CuentaJoven [nombre=" + super.toString() + ", bonificacion=" + bonificacion + ", estudiante="
				+ estudiante + "]";
	}


	@Override
	public double calculaIntereses() {
		double intereses = super.calculaIntereses();
		
		intereses = intereses - intereses * this.bonificacion;
		if (estudiante) {
			intereses = intereses - intereses * bonifEstudiate;
		}
		return intereses;
	}


	@Override
	public boolean transferir(Cuenta cDestino, double cantidad) {
		if( super.transferir(cDestino, cantidad)) {
			ingresar(Cuenta.comision);
			return true;
		}
		return false;
	}
	
	
	
	


	
	
	
	
	
	
}
