import java.util.ArrayList;
import java.util.List;


public class Table
{
	private final List<Row> rows = new ArrayList<Row>();
	
	public void fillTableFromDatabaseStub()
	{
		for(int i = 0; i < 5; i++)
		{
			rows.add(new Row(i, 2.0, "Hammer"));
		}
	}
	
	public Row get(int id)
	{
		return rows.get(id);
	}
	
	public static class Row
	{
		public final int id;
		public final double price;
		public final String name;
		
		public Row(int id, double price, String name)
		{
			this.id = id;
			this.price = price;
			this.name = name;
		}
	}
	
	public static void main(String[] args)
	{
		Table t = new Table();
		t.fillTableFromDatabaseStub();
		
		System.out.println("row 0 id: " + t.get(0).id);
		System.out.println("row 1 price: " + t.get(1).price);
		System.out.println("row 2 name: " + t.get(2).name);
	}
}
