class Avtomobil {
	int pass; //кол-во пассажиров
	int v; //объем бака
	double rash; //расход топлива в л. на 100 км.
}
class pr004 {
	public static void main(String args[]) {
		//создание экз класса
		Avtomobil lada = new Avtomobil();
		int rasst;

		//присваиваем значение
		lada.pass = 4;
		lada.v = 40;
		lada.rash = 9.5;

		//рассчет расстояния коорое лада проедет на полном баке

		rasst = (int) (lada.v/lada.rash) * 100;

		System.out.println("Lada проедет " + rasst + " км. на полном баке");
	}
}	
