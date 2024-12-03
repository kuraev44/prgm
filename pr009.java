//основы наследования
abstract class TwoDShape {
	double width;
	double height;
	private String name;
	int common;
	//без параметров
	TwoDShape() {
		width = height = 0.0;
		name = "";
	}
	//конструктор с двумя параметрами
	TwoDShape(double w, double h) {
		width = w;
		height = h;
		System.out.println("Внутри конструктора TwoDShape(double w, double h)");
	}
	//конструктор с одинаковыми высотой и шириной
	TwoDShape(double x) {
		width = height = x;
	}
	//Конструктор объекта на базе сущ объекта
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	void showDim() {
		System.out.println("Ширина и высота: " + width + " и " + height);
	}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w) {
		if(w>200)
			width = 200;
		else width = w;

	}
	void setHeight(double h) {
                if(h>290)
                        height = 290;
                else height = h;

        }
	abstract double area();

	String getName() {
		return name;
	}
}
class Triangle extends TwoDShape {
	String style;
	int common;

	//конструктор по умолчанию
	Triangle() {
		super();
		style = "отсутствует";
	}
	//конструктор с тремя параметрами
	Triangle(String s, double w, double h) {
		//
		super(w, h);
		//
		style = s;
		System.out.println("Внутри конструктора TwoDShape(double w, double h)");

	}
	//КОнструктор с одним пар.
	Triangle(double x) {
		super(x);
		style = "Закрашенный";
	}
	//конструктор объекта 
	Triangle(Triangle ob) {
		super(ob);
		style = ob.style;
	}
	//конструктор с демонстрацией
	Triangle(int a, int b) {
		super.common = a;
		common = b;
		System.out.println("Значение common в суперклассе" + super.common);
		System.out.println("Значение common в подклассе" + common);

	}
	double area() {
		return getWidth()*getHeight()/2;
	}
	void showStyle() {
		System.out.println("Стиль: " + style);
	}
}
class X {
	int a;
	X(int i) {
		a = i;
	}
	void show() {
		System.out.println("Значение a: " + a);
	}
	void show(String msg) {
	}
}
class Y {
	int a;
	Y(int i) {
		a = i;
	}
}
class Z extends X {
	int b;
       	Z(int i, int j) {
		super(j);
		b = i;
	}
/*
	void show() {
		super.show();
		System.out.println("Значение a и b: " + a + " " + b);
	}*/
	void show(String msg) {
		System.out.println(msg + b);
	}
}
class ColorTriangle extends Triangle {
	private String color;

	ColorTriangle (String c, String s, double w, double h) {
		super(s, w, h);
		color = c;
		System.out.println("Внутри конструктора ColorTriangle");

	}
	ColorTriangle(ColorTriangle ob) {
		super(ob);
		color = ob.color;
	}	

	String getColor() {
		return color;
	}

	void shoeColor() {
		System.out.println("Цвет" + color);
	}
	public String toString() {
		return "Описывает цветной треугольник и вычисляет его площадь";
	}

}
class Rectangle extends TwoDShape {
	String outline;
	int common;
	
	Rectangle(int a, int b) {
                super.common = a;
                common = b;
	}
	Rectangle() {
		super();
		outline = "отсутствует";
		
	}
	Rectangle(double x) {
		super(x);
		outline = "сплошная";

	}
	Rectangle(String o, double w, double h) {

		//
		super(w, h);
		//
		outline = o;
	}
	double area() {
		return getWidth()*getHeight();
	}
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	void showOutline() {
                System.out.println("Рамка: " + outline);
        }

}
class A {
	final void meth() {
		System.out.println("Фин версия метода");
	}
}
class B extends A {
	/*void meth() {
		System.out.println("Ошибочная попытка");
	}
	*/
}

//Использоование final для определения констант

class ErrorMsg {
	//
	static final int OUTERR = 0;
	static final int INERR = 1;
	static final int DISKERR = 2;
	static final int INDEXERR = 3;
	static String[] msgs = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Диск переполнен",
		"Индекс вышел за пределы массива"
	};
	static String getErrorMsg(int i) {
		if(i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Код ошибки не существует";
	}
}
class pr009 {
	public static void main(String[] args) {
		//ErrorMsg err = new ErrorMsg();
		System.out.println(ErrorMsg.getErrorMsg(ErrorMsg.OUTERR));
		System.out.println(ErrorMsg.getErrorMsg(ErrorMsg.DISKERR));
		System.out.println();
		Triangle t1 = new Triangle("Закрашенный", 4.0, 4.0);
		Triangle t2 = new Triangle("конутрный", 8.0, 12.0);
		Triangle t3 = new Triangle(4.0);
		Triangle t4 = new Triangle(5, 10);
		Triangle t7 = new Triangle(t2);
		Rectangle r1 = new Rectangle("сплошная", 4.0, 4.0);
		Rectangle r2 = new Rectangle("пунктирная", 8.0, 12.0);

/*		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = "закрашенный";
		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = "конутрный";
		r1.setWidth(4.0);
		r1.setHeight(4.0);
		r1.outline = "сплошная";
		r2.setWidth(8.0);
                r2.setHeight(12.0);
                r2.outline = "Пунктирная";
*/		
		t1 = t2;

		System.out.println("Информация об объекте t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Площадь: " + t1.area());
		System.out.println();

		System.out.println("Информация об объекте t2: ");
                t2.showStyle();
                t2.showDim();
                System.out.println("Площадь: " + t2.area());
                System.out.println();

		System.out.println("Информация об объекте t3: ");
                t3.showStyle();
                t3.showDim();
		System.out.println("Площадь: " + t3.area());
		System.out.println();

		System.out.println("Информация об объекте t7: ");
                t7.showStyle();
                t7.showDim();
                System.out.println("Площадь: " + t7.area());
                System.out.println();



		System.out.println("Информация об объекте r1: ");
		r1.showOutline();
                r1.showDim();
		if(r1.isSquare())
			System.out.println("Является квадратом");
		else
			System.out.println("Не является квадратом");
		System.out.println("Площадь: " + r1.area());
		System.out.println();
                System.out.println("Информация об объекте r2: ");
		r2.showOutline();
                r2.showDim();
		if(r2.isSquare())
                        System.out.println("Является квадратом");
                else
                        System.out.println("Не является квадратом");
		System.out.println("Площадь: " + r2.area());
                System.out.println();

		X x = new X(10);
		X x2;
		Y y = new Y(5);
		Z z = new Z(5,6);
		x2 = x;
		x2 = z; //Допустимое присваивание 
			
		x.show();
		System.out.println("Выполение show");
		x2.show();
		x2.show("Перегруженная версия");
		z.show();
		x2 = x;
		System.out.println();
		x2.show();

		System.out.println("x2.a: " + x2.a);
		//System.out.println("x2.b: " + x2.b); Переменная подкласса недоступна  

		//x2 = y; Недопустимое присваивание на объект другого типа
		
		TwoDShape[] shapes = new TwoDShape[5];
		shapes[0] = new Triangle("контурный", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle("сплошная", 10, 4);
		shapes[3] = new Triangle(7.0);
		

		for (int i = 0; i<shapes.length-1; i++) {
			System.out.println("имя объекта: ");
		}
		Object obj;
		obj = shapes[3];
		System.out.println("Класс объекта: " + obj.getClass() + "\nОписание" + obj.toString());
		System.out.println("obj и shapes[3] равны друг ругу: "+ shapes[3].equals(obj));
		System.out.println("Хэш-код объекта: " + obj.hashCode());
		ColorTriangle t10 = new ColorTriangle("Строка 1","Строка 2", 10,10);
		obj = t10;
		System.out.println("КЛасс объекта: " + obj.getClass() + "\nОписание" + obj.toString());
		 System.out.println("obj и shapes[3] равны друг ругу: "+ shapes[3].equals(obj));
                System.out.println("Хэш-код объекта: " + obj.hashCode());


		System.out.println("t12 и t11 равны друг ругу: "+ shapes[3].equals(obj));
                System.out.println("Хэш-код объекта: " + obj.hashCode());

	}
}



