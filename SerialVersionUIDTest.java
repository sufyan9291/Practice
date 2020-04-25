package barclays;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Lion implements Serializable {
	private static final long serialVersionUID = 1L;
	  private String sound;
	  private int sum=8;

	  public Lion(String sound) {
	    this.sound = sound;
	  }

	  public String getSound() {
	    return sound;
	  }
	}

class SerialVersionUIDTest implements Serializable{
	public static void main(String args[]) throws IOException, ClassNotFoundException {
	    Lion leo = new Lion("roar");
	    // serialize
	    /*System.out.println("Serialization done.");
	    FileOutputStream fos = new FileOutputStream("serial.out");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(leo);*/
	    // deserialize
	    FileInputStream fis = new FileInputStream("serial.out");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Lion deserializedObj = (Lion) ois.readObject();
	    System.out.println("DeSerialization done. Lion: " + deserializedObj.getSound());
	  }
}
