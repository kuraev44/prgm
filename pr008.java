//рекурсия
class Factorial {
	int factr(int n) {
		int result;
		
		if(n==1) return 1;
		result = factr(n-1) * n;
		return result;
	}

	int factI(int n) {
		int t, result;
		result = 1;
		for(t=1; t<=n; t++)
			result *= t;
		return result;
	}
}
//
class StaticDemo {
	int x;
	static int y;

	int sum() {
		return x + y;
	}
}

class pr008 {
	public static void main(String[] args) {

		Factorial f = new Factorial();

		System.out.println("Вычисление факториала рекурсивным методом");
		System.out.println("Факториал 3 равен " + f.factr(3));
		System.out.println("Факториал 4 равен " + f.factr(4));
		System.out.println("Факториал 5 равен " + f.factr(5));

		System.out.println();

		System.out.println("Вычисление факториала итеративным методом");
                System.out.println("Факториал 3 равен " + f.factr(3));
                System.out.println("Факториал 4 равен " + f.factr(4));
                System.out.println("Факториал 5 равен " + f.factr(5));

		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();

		ob1.x = 10;
		ob2.x = 20;

		System.out.println("ob1.x и ob2.x независимы друг от друга");
		System.out.println("ob1.x: " + ob1.x + "\nob2.x " + ob2.x);
		StaticDemo.y = 19;
		System.out.println("Для y = 19");

		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());

		StaticDemo.y = 100;
                System.out.println("Для y = 100");

		System.out.println("ob1.sum(): " + ob1.sum());
                System.out.println("ob2.sum(): " + ob2.sum());





	}
}
