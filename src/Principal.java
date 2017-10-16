import java.util.Scanner;

public class Principal {
	private static Mapa mapa;
	private static Scanner in;

	public static void main(String[] args) {
		mapa = new Mapa();
		in = new Scanner(System.in);

		while (!mapa.volta()) {
			target();
		}
		trajetoria(mapa.getTrajetoria());
	}

	static void target() {
		System.out.println("digite a coordenada x:");
		double x_coord = in.nextDouble();
		System.out.println("digite a coordenada y:");
		double y_coord = in.nextDouble();

		mapa.adicionarPonto(x_coord, y_coord);
	}

	static void trajetoria(double[][] pontos) {
		for (int i = 0; i < pontos[0].length; i++) {
			System.out.println(String.valueOf(pontos[0][i]) + ";" + String.valueOf(pontos[1][i]));
		}
	}
}
