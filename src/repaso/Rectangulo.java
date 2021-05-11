package repaso;

public class Rectangulo extends Figura {
	
	public float base;
	public float altura;
	
	
	public Rectangulo() {
		super();
	}
	public Rectangulo(String nombre) {
		super(nombre);
	}

	public Rectangulo(String nombre, float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return base+base+altura+altura;
	}
	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("b=");
		sb.append(base);
		sb.append("-a="+altura);
		
		return sb.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(altura);
		result = prime * result + Float.floatToIntBits(base);
		result += super.hashCode();
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		if (!super.equals(obj)||Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (Float.floatToIntBits(base) != Float.floatToIntBits(other.base))
			return false;
		return true;
	}
	

}
