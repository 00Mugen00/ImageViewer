package prImageViewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;

public class ImageViewerCtr implements ActionListener{
	private ImageViewerView imageViewerView;
	private File file;
	public ImageViewerCtr(ImageViewerView imageViewerView){
		this.imageViewerView=imageViewerView;
		this.file=null;
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch(command){
		case "OPEN":
			file = imageViewerView.selectFile();
			imageViewerView.setLabelImage(new ImageIcon(file.toString()));
			break;
		case "CLOSE":
			imageViewerView.setLabelImage(new ImageIcon());
			break;
		}
	}

}
