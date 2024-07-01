package PROG1.TP5;
// Un supermercado almacena los importes de sus ventas anuales en una matriz de NxM, en

// donde cada fila representa las ventas de cada mes. Dentro de un mes, la información es
// almacenada en secuencias separadas por 0 donde cada secuencia representa las ventas
// realizadas dentro de un día. Por ejemplo, en la siguiente tabla, en el mes 1 se realizaron 3
// ventas el primer día por $150, $200 y $165.

// 0 0 150 200 165 0 154 352 240 256 0 900 750 0 0
// 0 940 105 265 845 215 0 245 765 348 0 741 125 541 0
// 0 851 543 625 845 914 0 754 184 452 637 917 0 0 0

// El gerente desea solicitar distintas estadísticas según el mes que se quiere analizar. En
// algunos casos le interesa conocer el promedio mensual de las ventas de mayor importe
// registradas en cada día y en otros casos, necesita saber si el promedio diario de ventas
// fue todos los días superior a X durante el mes. Para ello informa en un arreglo A1 los
// meses que desea la primera estadística y en un arreglo A2 los de la segunda. A1 y A2 son
// de tamaño N, rellenados con 0.
// Por ejemplo, si A1 = {1,2,0} y A2 = {3,0,0} para los meses 1 y 2 se informará que el
// promedio es $484 (200 + 352 + 900 / 3) y 815.33 (940 + 765 + 741 / 3), respectivamente.
// Para el mes 3, dado un X = 600, informará que no se cumplió.

// fila=mes
// secuencia=ventas diarias
// A1 promedio mensual de las ventas de mayor importe registradas en cada día
// A2 el promedio diario de ventas fue todos los días superior a X durante el mes

public class ventasAnuales {
	static final int MAXF = 3, MAXC = 15, SEP = 0, MAXARR = 3, X = 600;

	public static void main(String[] args) {
		int[][] ventasAnuales = { { 0, 0, 150, 200, 165, 0, 154, 352, 240, 256, 0, 900, 750, 0, 0 },
				{ 0, 940, 105, 265, 845, 215, 0, 245, 765, 348, 0, 741, 125, 541, 0 },
				{ 0, 851, 543, 625, 845, 914, 0, 754, 184, 452, 637, 917, 0, 0, 0 } };
		int[] A1 = { 1, 2, 0 };
		int[] A2 = { 3, 0, 0 };

		for (int i = 0; i < MAXF; i++) {
			if (A1[i] != SEP) {
				System.out.println("El promedio de las ventas de mayor importe registradas en cada dia del mes "
						+ (i + 1) + " es " + promedioMensual(ventasAnuales[i], i, A1));
			}
		}

		if (promedioDiario(ventasAnuales, A2) > X) {
			System.out.println("El promedio diario de ventas fue todos los dias superior a " + X + " durante el mes.");
		} else {
			System.out
					.println("El promedio diario de ventas NO fue todos los dias superior a " + X + " durante el mes.");
		}
	}

	public static double promedioMensual(int[] ventasAnuales, int i, int[] A1) {
		double promedioMensual = 0, sumarVentas = 0;
		int sumarSec = 0;
		int ini = 0, fin = -1;
		while (ini < MAXC) {
			ini = buscarIni(ventasAnuales, fin + 1);
			if (ini < MAXC) {
				fin = buscarFin(ventasAnuales, ini);
				if (estaEnA1(i + 1, A1)) {
					sumarVentas += esMayor(ventasAnuales, ini, fin);
					sumarSec++;
				}
			}
		}
		return promedioMensual = sumarVentas / sumarSec;
	}

	public static int buscarIni(int[] ventasAnuales, int pos) {
		while (pos < MAXC && ventasAnuales[pos] == SEP) {
			pos++;
		}
		return pos;
	}

	public static int buscarFin(int[] ventasAnuales, int pos) {
		while (pos < MAXC && ventasAnuales[pos] != SEP) {
			pos++;
		}
		return pos - 1;
	}

	public static boolean estaEnA1(int fila, int[] A1) {
		boolean estaEnA1 = false;
		int pos = 0;
		while (pos < MAXARR && !estaEnA1) {
			if (fila == A1[pos]) {
				estaEnA1 = true;
			} else {
				pos++;
			}
		}
		return estaEnA1;
	}

	public static boolean estaEnA2(int fila, int[] A2) {
		boolean estaEnA2 = false;
		int pos = 0;
		while (pos < MAXARR && !estaEnA2) {
			if (fila == A2[pos]) {
				estaEnA2 = true;
			} else {
				pos++;
			}
		}
		return estaEnA2;
	}

	public static double esMayor(int[] ventasAnuales, int ini, int fin) {
		double esMayor = 0, esMenor = 0;
		while (ini <= fin) {
			if (ventasAnuales[ini] > esMayor) {
				esMayor = ventasAnuales[ini];
			}
			ini++;
		}
		return esMayor;
	}

	public static double promedioDiario(int[][] ventasAnuales, int[] A2) {
		double promedioDiario = 0;
		int sumarVentas = 0, cantVentas = 0;
		for (int i = 0; i < MAXF; i++) {
			int ini = 0, fin = -1;
			while (ini < MAXC) {
				ini = buscarIni(ventasAnuales[i], fin + 1);
				if (ini < MAXC) {
					fin = buscarFin(ventasAnuales[i], ini);
					if (estaEnA2(i + 1, A2)) {
						sumarVentas += ventasAnuales[i][ini];
					}
				}
				cantVentas++;
			}
		}
		return promedioDiario = sumarVentas / cantVentas;
	}
}