class Avtomobil {
	int pass; //кол-во пассажиров
	int v; //объем бака
	double rash; //расход топлива в л. на 100 км.
		     
	Avtomobil(int p, int V, double r) {
		pass = p;
		v = V;
		rash = r;
	}	

	void rasst() {
		System.out.println("Расстояние на полном баке: " + ((int)(v/rash * 100)));
	}

	int rasst2() {
		return (int)(v/rash * 100);

	}
	double fuelneeded(int km) {
		return ((double)km/100)*rash;
	
	}
}
class pr004 {
	public static void main(String args[]) {
		//создание экз класса
		Avtomobil lada = new Avtomobil(4, 40, 5.5);
		Avtomobil porshe = new Avtomobil(1, 100, 14.0);
		int rasst, rasst2;

		//присваиваем значение
		/*lada.pass = 4;
		lada.v = 40;
		lada.rash = 5.5;

		porshe.pass = 1;
		porshe.v = 100;
		porshe.rash = 14.0;
		*/

		System.out.println("Для расстояни в 10 км нужно " + lada.fuelneeded(10) + "литров бензина");
		rasst = 10;
		System.out.println("Для расстояни в 10 км нужно " + lada.fuelneeded(rasst) + "литров бензина");


		//рассчет расстояния коорое лада проедет на полном баке

		rasst = (int) (lada.v/lada.rash) * 100;
		rasst = (int) (porshe.v/porshe.rash) * 100;


		System.out.print("для Lada: " );
		lada.rasst();
		rasst = lada.rasst2();
		System.out.println("Результат rasst2():" + lada.rasst2() );


		System.out.println("Для Porshe: ");
		porshe.rasst();
		System.out.println("Результат rasst2():" + porshe.rasst2() );
		
		
	}
}	
