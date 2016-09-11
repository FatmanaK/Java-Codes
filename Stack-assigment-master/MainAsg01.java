public class MainAsg01
{
	public static void main(String[] args)
	{
		try
		{
			StackAsg01<String> myStack = new StackAsg01<String>(2);
			System.out.println("Capacity=" + myStack.capacity());
			myStack.push("g");
			myStack.push("e");
			myStack.push("r");
			myStack.push("a");
			myStack.push("l");
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