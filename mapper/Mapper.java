import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;
import java.util.Queue;

/**
 * The Mapper class accepts two subsystems and moves data between the two
 * without the subsystems knowing about each other.
 * 
 * @author Steven Kroh skk8768(at)rit.edu
 */
public class Mapper implements Observer
{
	public static void main(String[] args) 
	{
		// Create two subsystems. They don't know about each other
		Subsystem foo = new Subsystem("foo");
		Subsystem bar = new Subsystem("bar");
	
		// Mapper will listen to foo
		Mapper m = new Mapper(foo, bar, foo);
		
		// Do work on one subsystem. The Mapper will take care of 
		// moving data from foo to bar.
		foo.put(1);
		foo.put(2);
		foo.put(3);
	}
	
	private Subsystem foo, bar;
	
	/**
	 * Map data between two subsystems, where we listen for changes on
	 * the third subsystem (which must be the same as either foo or bar
	 * 
	 * @param foo The first subsystem
	 * @param bar The second subsystem
	 * @param orig The subsystem the mapper will listen to changes on
	 */
	public Mapper(Subsystem foo, Subsystem bar, Subsystem orig) {
		this.foo = foo;
		this.bar = bar;
		
		System.out.println("Starting mapper");
		orig.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object obj)
	{
		if(obs instanceof Subsystem) {
			Subsystem sub = (Subsystem)obs;
			
			// Something happened in a subsystem. Get the data
			int result = sub.get(); 
			
			// Map the data to the opposite subsystem
			if(sub == foo) {
				System.out.printf("map %s -> %s%n", foo.name, bar.name);
				bar.put(result);
			} else {
				System.out.printf("map %s -> %s%n", bar.name, foo.name);
				foo.put(result);
			}
		}
	}
	
	/**
	 * The Subsystem accepts data, does fake work, then notifies all
	 * observers.
	 * 
	 * @author Steven Kroh skk8768(at)rit.edu
	 */
	public static class Subsystem extends Observable
	{
		private final Queue<Integer> q;
		public String name;
		
		/**
		 * @param name The name of the subsystem (foo or bar)
		 */
		public Subsystem(String name)
		{
			this.name = name;
			q = new LinkedList<Integer>();
		}
		
		/**
		 * Accept fake work
		 * @param i the fake data packet
		 */
		public void put(int i)
		{
			System.out.printf("%s put %d%n", name, i);
			
			q.add(i);
			this.setChanged();
			this.notifyObservers();
		}
		
		public int get()
		{
			return q.poll();
		}
	}
}
