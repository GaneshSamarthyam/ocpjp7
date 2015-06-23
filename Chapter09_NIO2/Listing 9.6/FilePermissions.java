import java.nio.file.*;

class FilePermissions {
	public static void main(String[] args) {
		Path path = Paths.get(args[0]);
		System.out.printf( "Readable: %b, Writable: %b, Executable: %b ", 
				Files.isReadable(path), Files.isWritable(path), Files.isExecutable(path)); 
	}
}
