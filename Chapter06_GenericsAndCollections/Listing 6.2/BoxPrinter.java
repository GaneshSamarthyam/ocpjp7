// The program demonstrates “Object” based implementation and associated lack of type-safety 
class BoxPrinter {
	private Object val; 
	public BoxPrinter(Object arg) {
		val = arg; 
	}  
	public String toString() {
		return "[" + val + "]"; 
	} 
} 
