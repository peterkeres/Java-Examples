package Base_Code;

/**
 * Class definition for a Base_Code.Node of a singly linked list of Game Entries.
 */
public class Node {

	/* Note: these fields are public so that they can be directly accessed
	 * from outside this class.  For example, if v is a Base_Code.Node object,
	 * then v.entry and v.next can be used to access these fields. */
	public GameEntry entry;	//the high score entry 
	public Node next;		//refers to the next node in the list
	
	/** 
	 * Constructor: creates a node with the given entry and next Base_Code.Node.
	 */
	public Node(GameEntry e, Node n) {
		entry = e;
		next = n;
	}
}