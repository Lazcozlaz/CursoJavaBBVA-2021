package repaso;

public class Triangulo extends Figura {
	
	public float altura;
	public float base;
	
	public Triangulo(String nombre,float altura, float base) {
		super(nombre);
		this.altura = altura;
		this.base = base;
	}
	public Triangulo(String nombre) {
		super(nombre);
	}
	
	public Triangulo() {
		super();
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
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
		Triangulo other = (Triangulo) obj;
		if (!super.equals(obj)||Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (Float.floatToIntBits(base) != Float.floatToIntBits(other.base))
			return false;
		return true;
	}
	@Override
	public float calcularPerimetro() {	
		float hipotenusa = (float) (Math.sqrt(base*base)+(altura*altura));
		return hipotenusa+base+altura;
	}
	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return base*altura/2;
	}
	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("l=");
		sb.append(base);
		sb.append(altura);
		
		return sb.toString();
	}
}
