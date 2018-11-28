/**
 * 
 */

/**
 * @author Little Busters!
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="0120-111-2345";
		taro.address="東京都";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		
		Person jirou = new Person();
		jirou.name="木村次郎";
		jirou.age=18;
		jirou.phoneNumber="000-1111-2345";
		jirou.address="埼玉県";
		System.out.println(jirou.name);
		System.out.println(jirou.age);
		System.out.println(jirou.phoneNumber);
		System.out.println(jirou.address);
		
		
		Person hanako = new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="000-1234-5678";
		hanako.address="神奈川県";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		
		Person harutaka = new Person();
		harutaka.name="福田相孝";
		harutaka.age=28;
		harutaka.phoneNumber="000-2345-6789";
		harutaka.address="東京都";
		System.out.println(harutaka.name);
		System.out.println(harutaka.age);
		System.out.println(harutaka.phoneNumber);
		System.out.println(harutaka.address);
		
		harutaka.talk();
		harutaka.walk();
		harutaka.run();
		
		
		
		Robot aibo = new Robot();
		aibo.name="アイボ";
		aibo.age=20;
		System.out.println(aibo.name);
		System.out.println(aibo.age+"歳");
		aibo.run();
		
		Robot asimo = new Robot();
		asimo.name="アシモ";
		asimo.age=20;
		System.out.println(asimo.name);
		System.out.println(asimo.age+"歳");
		asimo.walk();
		
		Robot pepper = new Robot();
		pepper.name="ペッパー";
		pepper.age=10;
		System.out.println(pepper.name);
		System.out.println(pepper.age+"歳");
		pepper.talk();
		
		Robot doraemon = new Robot();
		doraemon.name="ドラえもん";
		doraemon.age=100;
		System.out.println(doraemon.name);
		System.out.println(doraemon.age+"歳");
		doraemon.walk();
	}
	
}
