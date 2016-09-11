class CircularArrayQueue
{
  private final int INITIAL_CAPACITY = 64;
  // the value of front represents the location 
  // where the first element in the queue is stored
  private int front;
  // the value of rear represents the next available slot
  //  in the array (not where the last element is stored)
  private int rear;
  // keep a count of the elements
  private int count;
  
  private int[] queue;
  
  public CircularArrayQueue()
  {
    front = 0;
	rear  = 0;
	count = 0;
	queue = new int[INITIAL_CAPACITY];
  }
  
  public CircularArrayQueue (int initialCapacity)
  {
    front = 0;
	rear  = 0;
	count = 0;  
	queue = new int[initialCapacity];
  }
  public int size()
  {
    return count;
  }
  public void enqueue (int element)
  {
    if (size() == queue.length)
	{
	  expandCapacity();
	}
    queue[rear] = element;
    rear = (rear+1) % queue.length;
    count++;
  }  
  public void expandCapacity()
  {
    int[] larger = new int[queue.length *2];
    for(int scan=0; scan < count; scan++)
    {
      larger[scan] = queue[front];
      front=(front+1) % queue.length;
    }
    front = 0;
    rear  = count;
    queue = larger;
  }  
  public boolean isEmpty()
  {
    if(count==0)
	{
	  return true;
	}
	else
	{
	  return false;
	}
  }
  public int dequeue() throws Exception
  {
    if (isEmpty())
    {
      throw new Exception ("empty queue");
    }
    int result = queue[front];
    front = (front+1) % queue.length;
    count--;
    return result;
  }
  public String toString()
  {
    String output ="";
	for(int scan=0; scan < count; scan++)
	{
	  output =  output + queue[scan] + ",";
	}
	return output;
  }

}
