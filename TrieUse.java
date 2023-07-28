package tries;

public class TrieUse {

	public static void main(String[] args) {
Tries t=new Tries();
t.add("ADD");
t.add("ADB");
t.add("CAP");
t.add("CAT");
t.add("MAHESH");
t.add("MAH");

System.out.println(t.search("MAH"));
t.remove("MAH");
System.out.println(t.search("MAH"));

	}

}
