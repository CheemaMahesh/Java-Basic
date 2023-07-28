package tries;
class TrieNode{
	char data;
	boolean isTerminal;
	TrieNode children[];


	public TrieNode(char data) {
		this.data=data;
		this.isTerminal=false;
		this.children=new TrieNode[26];
	}
}
public class Tries {
private TrieNode root;

public Tries() {
	root=new TrieNode('\0');
}
private void helper(TrieNode root,String word) {
	if(word.length()==0) {
		root.isTerminal=true;
		return;
	}
	int childindex=word.charAt(0)-'A';
	TrieNode child=root.children[childindex];
	if(child==null) {
		child=new TrieNode(word.charAt(0));
		root.children[childindex]=child;
	}
	helper(child,word.substring(1));
}
public void add(String word) {
helper(root,word);	
}
private boolean searchhelper(TrieNode root,String word) {
	if(word.length()==0) {
		return root.isTerminal;
	}
int childindex=word.charAt(0)-'A';
TrieNode child=root.children[childindex];
if(child==null) {
	return false;
}
return searchhelper(child,word.substring(1));
}
public boolean search(String word) {
	return searchhelper(root,word);
}
public void remove(String word) {
hremove(root,word);
}
private void hremove(TrieNode root,String word) {
	if(word.length()==0) {
		root.isTerminal=false;
		return;
	}
	int childindex=word.charAt(0)-'A';
	TrieNode child=root.children[childindex];
	if(child ==null) {
		return ;
	}
	hremove(child,word.substring(1));
}

}
