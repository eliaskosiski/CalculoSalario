
public class CalculoSalario {
	private int quantidade;
	private double salarioHora;
	private int numeroDependentes;
	private double descontoInss;
	private double descontoIR;
	

	public CalculoSalario(int quantidade, double salarioHora, int numeroDependentes) {
		this.quantidade = quantidade;
		this.salarioHora = salarioHora;
		this.numeroDependentes = numeroDependentes;
		this.descontoInss = descontoInss;
		this.descontoIR = descontoIR;
}
	
	
	
	public double SalarioBruto() {
		return quantidade*salarioHora + (50*numeroDependentes);
}
	
	public double DescontoInss() {
		if(SalarioBruto() <= 1000) {
			return descontoInss = SalarioBruto() * 8.5/100;
}
		
		if(SalarioBruto() > 1000) {
			return descontoInss = SalarioBruto() * 9/100;
}
		return descontoInss;
}
	
	public double DescontoIR() {
		if(SalarioBruto() <= 500) {
			return descontoIR = 0;
}
		
		if(SalarioBruto() > 500 && SalarioBruto() <= 1000) {
			return descontoIR = SalarioBruto() * 5/100;
}
		
		if(SalarioBruto() > 1000) {
			return descontoIR = SalarioBruto() * 7/100;
}
		return descontoIR;
}
	
	public double SalarioLiquido() {
		return SalarioBruto()- DescontoInss() - DescontoIR();
}
}
