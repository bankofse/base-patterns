import java.awt.Point;

/**
 * The LayerSupertype is used when each object in a layer needs to share 
 * common functionality. In the case of a view layer, perhaps each form UI
 * element needs to know where it is placed on the screen. This example allows
 * each component in the view LayerSupertype to have this information.
 * 
 * @author Steven Kroh skk8768(at)rit.edu
 */
public class LayerSupertype
{
	public static void main(String[] args)
	{
		// Create two form UI elements
		Button b = new Button(new Point(1, 2));
		TextInput ti = new TextInput(new Point(1, 3));
	}
	
	private Point anchor;
	public LayerSupertype(Point anchor)
	{
		this.anchor = anchor;
	}
	
	public void setAnchor(Point anchor)
	{
		this.anchor = anchor;
	}
	
	public Point getAnchor()
	{
		return anchor;
	}
	
	/**
	 * The Button needs to know where it is anchored on screen
	 * 
	 * @author Steven Kroh skk8768(at)rit.edu
	 */
	public static class Button extends LayerSupertype
	{
		public Button(Point anchor)
		{
			super(anchor);
			System.out.printf("Made Button at %s%n", anchor);
		}
	}
	
	/**
	 * The TextInput needs to know where it is anchored on screen
	 * 
	 * @author Steven Kroh skk8768(at)rit.edu
	 */
	public static class TextInput extends LayerSupertype
	{
		public TextInput(Point anchor)
		{
			super(anchor);
			System.out.printf("Made TextInput at %s%n", anchor);
		}
	}
}
