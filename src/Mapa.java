public class Mapa {
	private int index = 0;
	private double[][] trajetoria = new double[2][99999];
	private double[][] trajetoFinal;
	private int constante = 0;
	private int tamanho = 0;
	private boolean volta = false;

	void adicionarPonto(double x_coord, double y_coord) {
		if (x_coord == trajetoria[0][0] && y_coord == trajetoria[1][0]) {
			volta = true;
		} else {
			trajetoria[0][index] = x_coord;
			trajetoria[1][index] = y_coord;
			index++;
		}
	}

	public double[][] getTrajetoria() {
		cataçao();
		return trajetoFinal;
	}

	private void cataçao() {
		for (int i = 0; i < 99999; i++) {
			double[][] vazia = new double[2][99999];
			if (trajetoria[0][i] == vazia[0][i]) {
				constante++;
			} else {
				constante = 0;
			}
			if (constante > 5) {
				tamanho = i - 5;
				break;
			}
		}
		trajetoFinal = new double[2][tamanho];
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < 2; j++) {
				trajetoFinal[j][i] = trajetoria[j][i];
			}
		}
	}

	public boolean volta() {
		// TODO Auto-generated method stub
		return volta;
	}
}
