
public class FileTreeWalk {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("usage: FileWalkTree <source-path>");
			System.exit(-1);
		}
		Path pathSource = Paths.get(args[0]);
		try {
			Files.walkFileTree(pathSource, new MyFileVisitor());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
