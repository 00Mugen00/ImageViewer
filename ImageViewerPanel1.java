package prImageViewer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class ImageViewerPanel1 extends JPanel implements ImageViewerView{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JMenuBar menuBar;
	private JMenu file;
	private JMenuItem open,close;
	private JScrollPane scrollPane;
	private JLabel image;
	public ImageViewerPanel1(){
		scrollPane = new JScrollPane();
		image = new JLabel();
		menuBar = new JMenuBar();
		file = new JMenu("File");
		open = new JMenuItem("Open");
		close = new JMenuItem("Close");
		
		image.setHorizontalAlignment(JLabel.CENTER);
		scrollPane = new JScrollPane(image,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		menuBar.add(file);
		file.add(open);
		file.add(close);
		
		setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new FlowLayout());
		northPanel.add(menuBar);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(scrollPane,BorderLayout.CENTER);
		
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel,BorderLayout.CENTER);
	}
	
	public File selectFile(){
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(this);
		return fileChooser.getSelectedFile();
	}
	
	public void controller(ActionListener ctr) {
		open.setActionCommand(OPEN);
		open.addActionListener(ctr);
		close.setActionCommand(CLOSE);
		close.addActionListener(ctr);
	}

	public void setLabelImage(ImageIcon image){
		this.image.setIcon(image);
	}
}
