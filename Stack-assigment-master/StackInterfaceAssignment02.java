public interface StackInterfaceAssignment02
{
	// Add an element to the top of the stack
	public void push (int element);
	
	// Remove and return the top element from the stack
	// Throw exception if the stack is empty with the message "Stack Empty Exception"
	public int pop() throws Exception;
	
	// Return without removing the top element of this stack
    // Throw exception if the stack is empty with the message "Stack Empty Exception"
	public int peek() throws Exception;
	
	// Return true if this stack contains no elements
	public boolean isEmpty();

	// Return the number of current elements in the stack
	public int size();
	
	// Return the capacity of the stack
	public int capacity();

	// Return the string representation of the stack, 
	// that is comma separated values example: "5,3,6,2"
	public String toString();
}