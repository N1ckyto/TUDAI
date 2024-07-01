package PROG1.TP5;

public class senialesExtraterrestres {
	static final int N = 5, M = 20, K = 2, P = 2, MAXARR = 35;
	static final char L = 'F', SEP = ' ';

	public static void main(String[] args) {
		char[][] matriz = {
				{ ' ', '1', '2', 'G', 'H', ' ', '2', 'A', '3', ' ', '3', 'R', 'B', 'J', ' ', '6', '5', 'K', ' ', ' ' },
				{ ' ', ' ', '2', '1', '4', '5', ' ', 'R', 'P', ' ', 'D', '3', ' ', '7', 'M', 'N', 'W', ' ', ' ', ' ' },
				{ ' ', '4', 'G', '8', ' ', '3', '5', '7', '1', ' ', ' ', '2', 'X', ' ', 'D', '4', '1', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', '5', 'T', 'T', 'M', ' ', 'A', 'P', '1', '1', ' ', '2', '1', '3', ' ', '1', '3', ' ' },
				{ ' ', '6', '6', '4', ' ', '5', '4', ' ', ' ', 'A', '2', '1', '2', ' ', 'G', '4', '2', '1', '8', ' ' }
		};
		char[] intensidades = { ' ', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
				'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		System.out.println("La cantidad de señales extraterrestres es " + cantSenialesExtra(matriz, intensidades));
	}

	public static int cantSenialesExtra(char[][] matriz, char[] intensidades) {
		int cantSenialesExtra = 0;
		for (int i = 0; i < N; i++) {
			int ini = 0, fin = -1, contSenial = 0, contSec = 0, contFilasCosec = 0;
			while (ini < M) {
				ini = buscarIni(matriz[i], fin + 1);
				if (ini < M) {
					fin = buscarFin(matriz[i], ini);
					contSenial = contSenial(matriz[i], ini, fin, intensidades);
					if (contSenial >= K) {
						contSec++;
						if (contSec >= 1) {

						}
					}
				}
			}
			contFilasCosec++;
		}
		return cantSenialesExtra;
	}

	public static int buscarIni(char[] matriz, int pos) {
		while (pos < M && matriz[pos] == SEP) {
			pos++;
		}
		return pos;
	}

	public static int buscarFin(char[] matriz, int pos) {
		while (pos < M && matriz[pos] != SEP) {
			pos++;
		}
		return pos - 1;
	}

	public static int contSenial(char[] matriz, int ini, int fin, char[] intensidades) {
		int contSenial = 0;
		while (ini < fin) {
			if (ini > posL(intensidades)) {
				contSenial++;
			}
			ini++;
		}
		return contSenial;
	}

	public static int posL(char[] intensidades) {
		int pos = 0;
		while (pos < MAXARR && intensidades[pos] != L) {
			pos++;
		}
		return pos;

	}
}