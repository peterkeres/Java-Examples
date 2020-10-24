package Double_Linked_List;

import Base_Code.GameEntry;

/**
 * Class definition for a Base_Code.Node of a singly linked list of Game Entries.
 */
public class DNode {

	/* Note: these fields are public so that they can be directly accessed
	 * from outside this class.  For example, if v is a Base_Code.Node object,
	 * then v.entry and v.next can be used to access these fields. */
	public GameEntry entry;	//the high score entry 
	public DNode next;		//refers to the next node in the list
	public DNode prev;              //refers to the previous node in the list
	/** 
	 * Constructor: creates a node with the given entry and next Base_Code.Node.
	 */
	public DNode(GameEntry e, DNode n, DNode x) {
		this.entry = e;
		this.next = n;
                this.prev = x;
	}
}