class pr001 {
	public static void main(String args[]) {
		System.out.println("Первая программа на Java");
		//выводим строку на консоль
		int Var1 = 1024;
		int Var2;
		//System.out.println(Var2); ошибка: переменной не присвоено значение
		Var2 = 1337;
		System.out.println(Var1/2);
		System.out.println("Результат целочисленного деления:" + Var2/2);
		System.out.println("Результат деления с приведением типа данных:" + (double)Var2/2);
		double Var3 = (double)Var2/2;
		//if(Var1=0)
		//	System.out.println("Условие выполнено");
		if(Var1/2 == 512)
			System.out.println("Условие Var1/2==512 выполнено");
		if(true)
			System.out.println("Условие true выполнено ");
		System.out.println("проверяем");
		System.out.println();
		//Пример for
		for (int i=0; i<10; i++)
			System.out.println("номер:" + i);
		System.out.println();
		int j;
		for (j=0; j<10; j++)
                        System.out.println(j + " ");
		//i = 10; Переменная локальная и существует только во время выполнения цикла
		System.out.println();
	}
}
