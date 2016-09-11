public class StackAsg01<T> implements StackInterfaceAsg01<T>
{
	// Declare a constant to represent the default initial capacity of the stack.
	// Values of the constant should be 
    // This will be used if the user does not specify a size in the construct.
	private final int DEFAULT_CAPACITY = 64;
	
	// Declare a variable to represent the next available position in the array
	private int top;
	
	// Declare and array of generic elements to represent the stack
	private T[] stack;
	
	// Your class will have two constructors, one to use the default capacity and the other to use a specified capacity.
	public StackAsg01()
	{
		top = 0;
		stack = (T[])(new Object[DEFAULT_CAPACITY]);
	}
	
	public StackAsg01 (int initialCapacity)
	{
		top = 0;
		stack = (T[])(new Object[initialCapacity]);
	}	
	



	// Return the string representation of the stack, 
	// that is comma separated values example: "5,3,6,2"
	public String toString();
	------
	
	// Implement the interface push method: Add an element to the top of the stack
	public void push (T element)
	{
		if (size() == stack.length)
		{
			resizeStack();
		}
		stack[top] = element;
		top++;
	}
	
	// Implement the interface pop method:  Remove and return the top element from the stack
	// Throw exception if the stack is empty with the message "Stack Empty Exception"
	public T pop() throws Exception
	{
		if (isEmpty())
			throw new Exception("Stack Empty Exception");
			top--;
		T result = stack[top];
		stack[top] = null;
		return result;
	}	
	
	// Implement the interface peek method: Return without removing the top element of this stack
    // Throw exception if the stack is empty with the message "Stack Empty Exception"	
	public T peek() throws Exception
	{
		if (isEmpty())
			throw new Exception("Stack Empty Exception");
		return stack[top-1];
	}	
	
	// Implement the interface isEmpty method: Return true if this stack contains no elements.
	public boolean isEmpty()
	{
		if( top == 0 )
		  return true;
		else
		  return false;
	}

	//  Implement the interface size method: Return the number of current elements in the stack.
	public int size()
	{
		return top+1;
	}
	
	// Implement the interface capacity method: Return the capacity of the stack.
	public int capacity()
	{
		return stack.length;
	}

	// Implement the interface capacity method: Return the string representation of the stack, that is comma separated values such as 1,2,3,4
	public String toString()
	{
		String output="";
		for(int i=top-1;i>-1;i--)
		{
			if(i==top-1)
			{
				output = output + stack[i];
			}
			else
			{
				output = output + "," + stack[i];
			}
		}
		return output;
	}
	
	// Define the method resizeStack which creates a new array to store the contents
	// of the stack with  twice the capacity of the old one.
	private void resizeStack()
	{
		T[] larger = (T[])(new Object[stack.length*2]);
		for (int index=0; index < stack.length; index++)
			larger[index] = stack[index];
		stack = larger;
	}	
		
}