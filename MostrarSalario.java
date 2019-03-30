
public class MostrarSalario {
	
	public static void main(String[] args) {
		
		CalculoSalario calculandosalario = new CalculoSalario(40, 150.0, 3);
		
		System.out.println("Salário Bruto: "+calculandosalario.SalarioBruto());
		System.out.println("Desconto INSS: "+calculandosalario.DescontoInss());
		System.out.println("Desconto IR: "+calculandosalario.DescontoIR());
		System.out.println("Salário Líquido: "+calculandosalario.SalarioLiquido());
	}
}
