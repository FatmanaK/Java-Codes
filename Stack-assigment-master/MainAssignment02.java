public class MainAssignment02
{
	public static void main(String[] args)
	{
		try
		{
			StackAssignment02 myStack = new StackAssignment02(2);
			System.out.println("Capacity=" + myStack.capacity());
			myStack.push(10);
			myStack.push(23);
			myStack.push(56);
			myStack.push(25);
			myStack.push(15);
			System.out.println(myStack);
			System.out.println("Capacity=" + myStack.capacity());
			myStack.pop();
			myStack.pop();
			System.out.println(myStack.peek());
			myStack.pop();
			myStack.pop();
			myStack.pop();
			myStack.pop();
		}
		catch( Exception exp )
		{
			System.out.println(exp.getMessage());
		}
		
	}
}