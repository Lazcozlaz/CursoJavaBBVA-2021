package repaso;

public class Circulo extends Figura {
	
	public float radio;
	
	
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public Circulo() {
		super();
	}

	public Circulo(String nombre,float radio) {
		super(nombre);
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return (float) (2*Math.PI*radio);
	}

	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return (float) (radio*radio*Math.PI);
	}

	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("l=");
		sb.append(radio);
		
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(radio);
		return result+super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (!super.equals(obj)||Float.floatToIntBits(radio) != Float.floatToIntBits(other.radio))
			return false;
		return true;
	}
	
	
	
}
