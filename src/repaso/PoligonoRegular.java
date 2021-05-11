package repaso;

public class PoligonoRegular extends Figura{
	
	public float apotema;
	public int cantidadDeLados;
	public int lado;
	
	
	
	public float getApotema() {
		return apotema;
	}

	public void setApotema(float apotema) {
		this.apotema = apotema;
	}

	public int getCantidadDeLados() {
		return cantidadDeLados;
	}

	public void setCantidadDeLados(int cantidadDeLados) {
		this.cantidadDeLados = cantidadDeLados;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public PoligonoRegular() {
		super();
	}

	public PoligonoRegular(String nombre) {
		super(nombre);
	}

	public PoligonoRegular(String nombre,float apotema, int cantidadDeLados, int lado) {
		super(nombre);
		this.apotema = apotema;
		this.cantidadDeLados = cantidadDeLados;
		this.lado = lado;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("l=");
		sb.append(lado);
		sb.append("-n="+cantidadDeLados+"-a="+apotema);
		
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(apotema);
		result = prime * result + cantidadDeLados;
		result = prime * result + lado;
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
		PoligonoRegular other = (PoligonoRegular) obj;
		if (Float.floatToIntBits(apotema) != Float.floatToIntBits(other.apotema))
			return false;
		if (cantidadDeLados != other.cantidadDeLados)
			return false;
		if (lado != other.lado)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PoligonoRegular [apotema=" + apotema + ", cantidadDeLados=" + cantidadDeLados + ", lado=" + lado + "]";
	}
	

}
