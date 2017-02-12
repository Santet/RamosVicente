import java.io.*;
/**
 * Clase Fecha que indica a partir de un dia, mes y año, si la fecha introducida es una fecha valida o no valida.
 * @author Vicente Ramos
 * @param dia es el dia intrducido por teclado para calcular  si la fecha es valida o no
 * @param mes es el mes introducido por teclado para calcular si la fecha es valida o no
 * @param anio es el año introducido por teclado para calcular si la fecha es valida o no
 * @param diasMes es el numero maximo de dias que tiene un mes, segun meses este valor puede variar.
 */
public class validarFecha {
	private int dia, mes, anio;
	
	public validarFecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	private boolean bisiesto(){
		if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0)))
			return true;
		else return false;
	}
	private int diasMes(){
		int diasMes = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: diasMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11: diasMes = 30;
			break;
		case 2: if (bisiesto()) diasMes = 29;
				else diasMes = 28;
			break;
		}
		return diasMes;
	}
	public boolean valida() {
		if (dia < 1 || dia > 31) return false;
		if (mes < 1 || mes > 12) return false;
		if (anio < 0) return false;
		if (dia > diasMes()) return false;
			else return true;
	}
		

	public static void main(String[] args) throws IOException {
		int dia, mes, anyo;
		System.out.println("Introduce un día: ");
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		dia = Integer.parseInt(entrada.readLine());
		
		System.out.println("Introduce un mes: ");
		mes = Integer.parseInt(entrada.readLine());
		
		System.out.println("Introduce un año: ");
		anyo = Integer.parseInt(entrada.readLine());
		
		validarFecha f1 = new validarFecha(dia, mes, anyo);
		if (f1.valida())
			System.out.println("La fecha: " + dia + "/" + mes + "/" + anyo+ " es válida");
		else
			System.out.println("La fecha: " + dia + "/" + mes + "/" + anyo+ " NO es válida");
	}
}
