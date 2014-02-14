package ejemplosets;

/**
 * @author Leticia Santana
 *
 */

public class MiArea {
	private double base,altura;

	public MiArea(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	

	public double calcularArea() {
		double area;
		area = (base * altura / 2.0);
		return area;
	}
}
