import java.io.*;

class UnCheckedExceptionExample1 {
	public static void main(String []args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(args[0]);
	}
}
