//побитовые операции: & | ^ >> >>> << -
class pr006 {
	public static void main(String[] args) {
		char ch;
		for (int i=0; i<26; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);
			ch = (char) ((int) ch & 65503);

			System.out.print(ch + " ");
		}
		System.out.println();

		//отображение битового представления числа байтa
		System.out.println();
		int t;
		byte val;
		val = (byte) 'A';
		for (t=128; t>0; t=t/2) {
			if((val&t) != 0) System.out.print("1 ");
			else System.out.print("0 ");
		}
		System.out.println();

		//Установление шестого бита в кодировке символа(побитовая операция или)
		System.out.println();

		for (int i=0; i<26; i++) {
                        ch = (char) ('A' + i);
                        System.out.print(ch);
                        ch = (char) ((int) ch | 32);

                        System.out.print(ch + " ");
                }
                System.out.println();

		//Примитивное шифрование (побитовая операция .исключающее или.)
		System.out.println();
		String msg = "Исходная тестовая строка";
		String encmsg = "";
		String decmsg = "";
		int key = 88;

		System.out.print("Печатаем незашифрованное сообщение: ");
		System.out.println(msg);

		//Шифрование сообщения
		for(int i=0; i<msg.length(); i++)
			encmsg = encmsg + (char) (msg.charAt(i) ^ key);
		System.out.print("Зашифрованное сообщение: ");
		System.out.print(encmsg);

		//дешифрованное сообщение
		for(int i=0; i<msg.length(); i++)
			decmsg = decmsg + (char)(encmsg.charAt(i)^ key);

		System.out.print("Зашифрованное сообщение: ");
		System.out.print(encmsg);





	}
}
