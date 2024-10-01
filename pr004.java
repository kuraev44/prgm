class Avtomobil {
	int pass; //кол-во пассажиров
	int v; //объем бака
	double rash; //расход топлива в л. на 100 км.
		     

	void rasst() {
		System.out.println("Расстояние на полном баке: " + ((int)(v/rash * 100)));
	}
}
class pr004 {
	public static void main(String args[]) {
		//создание экз класса
		Avtomobil lada = new Avtomobil();
		Avtomobil porshe = new Avtomobil();
		int rasst, rasst2;

		//присваиваем значение
		lada.pass = 4;
		lada.v = 40;
		lada.rash = 9.5;

		porshe.pass = 1;
		porshe.v = 100;
		porshe.rash = 14.0;

		//рассчет расстояния коорое лада проедет на полном баке

		rasst = (int) (lada.v/lada.rash) * 100;
		rasst = (int) (porshe.v/porshe.rash) * 100;


		System.out.print("для Lada: " );
		lada.rasst();

		System.out.println("Для Porshe: ");
		porshe.rasst();

	}
}	
