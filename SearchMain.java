 /**
 * SearchMain is the starting point for execution.
 * Contains the code to intitialize the frame
 * 
 * @author GrayKnight 10/10/10, GK CPM 9/14/18
 * 
   DO NOT MODIFY THIS CLASS*/

 import javax.swing.JFrame;

public class SearchMain
{

	public static void main(String[] ArgsgrA)
	{
	    JFrame frame = new JFrame("Student Search");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(new SearchGUI());
	    frame.pack();
	    frame.setVisible(true);
	}

}
