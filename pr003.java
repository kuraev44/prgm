class pr003 {
	public static void main(String args[]) throws java.io.IOException {

		//чтение с клавы
	       char ch;
	       System.out.print("Нажмите клавишу на клавиатуре и ENTER ");
	       ch = (char) System.in.read();
	       System.out.println("Вы нажали клавишу: " + ch);

	       //угадывание буквы
	       //пример использования проверки условия
	       char answer = 'r';
	       if (ch == answer)
		       System.out.println("Буква указана верно");
	       else
		       System.out.println("Буква указана неверно");
	       System.out.println("/n");
	       //работа с вложенными операторами if
	       int i=10, j=10, k=110, a=5, b=15, c=25, d=35;
	       if(i==10) {
		       if(j < 20)
			       a = b;
		       if(k > 100)
			       c = d;
		       else 
			       a = c;
	       }	       
	       else a = d;
	       System.out.println(" a = " + a + " c= " + c + " d= " + d);

	       System.out.println("/n");
	       //цепочка if else if
	       int x;
	       for (x = 0; x < 6; x++) {
		       if (x == 1)
			       System.out.println("Значение равно 1");
		       else if (x == 2)
			       System.out.println("Значение равно 2");
		       else if (x == 3)
                               System.out.println("Значение равно 3");
		       else if (x == 4)
                               System.out.println("Значение равно 4");
		       else
			       System.out.println("Значение x не находится между 1 и 4");
		}

		//оператор switch
		System.out.println("\n");
		int ii;
		for (ii=0; ii<10; ii++)
			switch(ii) {
				case 0:
					System.out.println("ii равно 0");
					break;
				case 1:
					System.out.println("ii равно 1");
                                        break;

				case 2:
					System.out.println("ii равно 2");
                                        break;

				case 3:
					System.out.println("ii равно 3");
                                        break;

				case 4:
					System.out.println("ii равно 4");
                                        break;
				default:
					System.out.println("ii больше или равно 5");
			}
		//Пример вложенного свитч
		System.out.println();
		char ch1 = 'q', ch2 = 'h';
		switch(ch1) {
			case 'q':
				System.out.println("Внешний свитч");
				switch(ch2) {
					case 'q':
						System.out.println("Внешний свитч");
						break;
					case 'h':
						System.out.println("Внутренний свитч");
						break;
				}
				break;
			case 'h':
				System.out.println("Не выведется");
				break;
		}
		//Операто цикла for
		//
		System.out.println("\n");
		double num, sroot, rerr;

		for(num=1.0; num < 100.0; num++) {
			sroot = Math.sqrt(num);
			System.out.println("квадратный корень числа " + num + " Равен " + sroot);
			//Вычисление ошибки округления
			rerr = num - (sroot * sroot);
			System.out.println("Ошибка округления составляет " + rerr);
			System.out.println();
		}

		int x1;

		for (x1 = 100; x1 > -100; x1 -= 5)
			System.out.println(x1);

		System.out.println("\n");
		
		int i7, j7;
		for (i7 = 0, j7 = 10; i7 < j7; i7++, j7--)
			System.out.println("i7 и j7: " + i7 + " " + j7);

		System.out.println("\n");


		int i8;
		System.out.println("Для остановки цикла нажмите клавишу \"S\"");
		for (i8 = 0; (char) System.in.read() != 'S'; i8++)
			System.out.println("итерация №" + i8);

		System.out.println("\n");


		for (i8 = 0; i8 < 10;) {
			System.out.println("итерация №" + i8);
			i8++;
		}

		System.out.println("\n");
		for (; i8 < 20;) {
			System.out.println("итерация №" + i8);
                        i8++;
		}
		//бесконечный цикл
		//System.out.println("\n");
		//for (;;);

		System.out.println("\n");
		i8 = 0;
		int sum = 0;
		//вычисоление суммы чисел от 1 до 5
		for(i8 = 1; i8 <= 5; sum += i8++);
		System.out.println("Сумма чисел равна " + sum);

	}
}
