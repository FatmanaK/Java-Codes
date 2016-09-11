public class StackAssignment02 implements StackInterfaceAssignment02
{
	// Declare a constant to represent the default initial capacity of the stack.
	// Values of the constant should be 
    // This will be used if the user does not specify a size in the construct.
public final T data;
	// Declare a variable to represent the next available position in the array
private final  Node <T>next;
	// Declare and array of generic elements to represent the stack
public Node(T data){
	this.data=data;
}
	// Your class will have two (2) constructors, one to use the default capacity and the other to use a specified capacity.
private Node<T>first=null;
	// Implement the interface push method: Add an element to the top of the stack
public void addFirst(T data) {
         newFirst = new addFirst(T data);
         newFirst.next = first;
          
    }
	// Implement the interface pop method:  Remove and return the top element from the stack
	// Throw exception if the stack is empty with the message "Stack Empty Exception"
	public int pop() throws Exception;{
        PreviousFirst = first;
        first = first.next;
        return Previous.data;
    }
	// Implement the interface peek method: Return without removing the top element of this stack
    // Throw exception if the stack is empty with the message "Stack Empty Exception"
public int peek() throws Exception;	
current=first;
while(current!=null);
	current=current.next;
	// Implement the interface isEmpty method: Return true if this stack contains no elements.
public boolean isEmpty() {
    return (first == null);
}
	//  Implement the interface size method: Return the number of current elements in the stack.
public int size();
	node current = firstNode;
while(current !=null);{
	System.out.println(current.data);
	current=current.next;
}
	// Implement the interface capacity method: Return the capacity of the stack.
public int capacity();
System.out.println("Capacity=" + myStack.capacity());
	// Implement the interface toString method: Return the string representation of the stack, that is comma separated values such as "1,2,3,4"
	public String toString()
	{
		return(("Capacity=" + myStack.capacity());
	}	
	// Define the private void method resizeStack which creates a new array to store the contents
	// of the stack with  twice the capacity of the old one.
}private void resize(int capacity)
    {
         tmp =  new Stack[capacity];
        System.arraycopy();
        arr = tmp* 2 length;
	
	
}