package SeleniumExamples;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class imagereader {

	public static void main(String args[])
	{
	
		Image image = null;
		  try {
		      // Read from a file
		      File sourceimage = new File("C:\\Users\\aksaini\\Desktop\\source.gif");
		      image = ImageIO.read(sourceimage);
		   
		     /* // Read from an input stream
		      InputStream is = new BufferedInputStream(
		          new FileInputStream("C:\\Users\\aksaini\\Desktop\\source.gif"));
		      image = ImageIO.read(is);
		   
		      // Read from a URL
		      URL url = new URL("http://java-tips.org/source.gif");
		      image = ImageIO.read(url);*/
		  } catch (IOException e) {
		  }
		   
		  // Use a label to display the image
		  JFrame frame = new JFrame();
		  JLabel label = new JLabel(new ImageIcon(image));
		  frame.getContentPane().add(label, BorderLayout.CENTER);
		  frame.pack();
		  frame.setVisible(true);
	
	
	}
	
	
	
}


