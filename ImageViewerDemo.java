package prImageViewer;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageViewerDemo {
	public static void main(String[] args){
		ImageViewerView imageViewerView = new ImageViewerPanel1();
		ActionListener textEditorCtr = new ImageViewerCtr(imageViewerView);
		imageViewerView.controller(textEditorCtr);
		JFrame window = new JFrame("Image Viewer");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane((JPanel) imageViewerView);		 
		window.pack();
		window.setMinimumSize(new Dimension(350,350));
		window.setVisible(true);
		
		ImageIcon img = new ImageIcon("icon.png");
		window.setIconImage(img.getImage());
	}
}
