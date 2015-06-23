public class FileTreeWalkCopy {
	public static void main(String[] args) {
		if(args.length != 2) {
System.out.println("usage: FileTreeWalkCopy <source-path> <destination-path>");
			System.exit(1);
		}
		Path pathSource = Paths.get(args[0]);
		Path pathDestination = Paths.get(args[1]);
		try {
Files.walkFileTree(pathSource, new MyFileCopyVisitor(pathSource, pathDestination));
			System.out.println("Files copied successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
