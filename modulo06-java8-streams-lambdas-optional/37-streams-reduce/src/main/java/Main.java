import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Funcionario> str = new ArrayList<>(
					Arrays.asList(
								new Funcionario(1200.00),
								new Funcionario(340.00),
								new Funcionario(32.0)
							)
				);
		double sum = str.stream()
				.map(Funcionario::getSalario)
				.reduce(0.0, Double::sum);
		System.out.print(sum);
	}

}