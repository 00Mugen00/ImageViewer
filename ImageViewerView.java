package prImageViewer;

import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;

public interface ImageViewerView {
	String OPEN = "OPEN";
	String CLOSE = "CLOSE";
	void setLabelImage(ImageIcon image);
	void controller(ActionListener ctr);
	File selectFile();
}
