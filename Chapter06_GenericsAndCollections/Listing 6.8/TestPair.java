class TestPair {
public static void main(String []args) {
Pair<Integer, String> worldCup = new Pair<>(2010, "South Africa");
System.out.println("World cup " +  worldCup.getFirst() + 
" in " + worldCup.getSecond());
}    
}