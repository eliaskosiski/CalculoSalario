
public class MostrarSalario {
	
	public static void main(String[] args) {
		
		CalculoSalario calculandosalario = new CalculoSalario(40, 150.0, 3);
		
		System.out.println("Sal�rio Bruto: "+calculandosalario.SalarioBruto());
		System.out.println("Desconto INSS: "+calculandosalario.DescontoInss());
		System.out.println("Desconto IR: "+calculandosalario.DescontoIR());
		System.out.println("Sal�rio L�quido: "+calculandosalario.SalarioLiquido());
	}
}
