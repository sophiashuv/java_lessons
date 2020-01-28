
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Methods {

	
	public static void serialize(File file, Serializable object) throws Exception {
		OutputStream fileIn = new FileOutputStream(file);
		ObjectOutputStream in = new ObjectOutputStream(fileIn);
		in.writeObject(object);
		in.close();
		fileIn.close();
	}

	public static Serializable deserealize(File file) throws Exception {
		InputStream fileOut = new FileInputStream(file);
		ObjectInputStream out = new ObjectInputStream(fileOut);
		Serializable object = (Serializable) out.readObject();
		out.close();
		fileOut.close();
		return object;
	}
}