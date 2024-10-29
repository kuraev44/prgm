class queue {
	private char[] q;
	private int putloc, getloc; //указатели на элементы очереди
	
	queue (int size) {
		q = new char[size];
		putloc = getloc = 0;
	
	}

	//метод для помещения символа в очередь
	public void put(char ch) {
		if(putloc==q.length) {
			System.out.println("очередь переполнена");
			return;
		}

		q[putloc++] = ch;
		

	}

	//метод дл извлечения
	public char get() {
		if(getloc == putloc) {
			System.out.println("Невозможно извлечь символ так как очередь пуста");
			return (char) 0;

		}
		return q[getloc++];
	}
	

}

class QDemo {
	public static void main(String[] args) {
		queue bigQ = new queue(100);
		queue smallQ = new queue(4);
		char ch;
		int i;

		System.out.println("использование очереди");
		for(i=0; i < 26; i++)
			bigQ.put((char) ('A' + i));

		//извлкаем элементы из очереджи bigQ
		System.out.print("Содержимое bigQ:");
		for(i=0; i < 25; i++) {
			ch = bigQ.get();
			if(ch != (char) 0)
				System.out.print(ch);

		}
		System.out.println("\n");

		//использование мал очереди
		for(i=0; i < 5; i++) {
			System.out.println("Пытаемся сохранить " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();

		}
		System.out.println();
		System.out.print("Содержимое smallQ: ");
		for(i=0; i < 5; i++) {
			ch = smallQ.get();
			if(ch != (char) 0)System.out.print(ch);

		}


	}
}
