package barclays;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class A implements Serializable{
	int i = 9;
	static int j = 2;
	transient int k = 8;
}
class B extends A{}
class InheritanceTest {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			FileInputStream fis = new FileInputStream("abc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			A a = new A();
			a.j=101;
			System.out.println(a.j);
			oos.writeObject(a);
			
			A a1 = new A();
			a1.j=201;
			System.out.println(a1.j);
			oos.writeObject(a1);
			oos.close();
			
			A.j=301;
			
			A aReturn = (A)ois.readObject();
			A a1Return = (A)ois.readObject();
			System.out.println(aReturn.j);
			System.out.println(a1Return.j);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
