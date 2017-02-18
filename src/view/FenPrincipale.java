package view;


import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Toolkit;

public class FenPrincipale extends JFrame{
	private JFrame frame;
	private JPanel header;
	private JPanel footer;
	private JPanel corps;
	
	public FenPrincipale(){
		
		initialize();
	}
	
	/**
	 * Initialise la fen�tre principale.
	 **/
	private void initialize() {
		try{
			this.setIconImage(Toolkit.getDefaultToolkit().getImage(FenPrincipale.class.getResource("/view/img/logo.png")));
			this.setBounds(100, 100, 400, 388);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.getContentPane().setLayout(null);
			this.setResizable(false);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public JFrame getFrame(){
		return frame;
	}
	public void setFrame(JFrame frame){
		this.frame = frame;
	}
	
	// Header
	public void header_content(){	
		this.getContentPane().add(header);
	}
	public JPanel getHeader(){
		return header;
	}
	public void setHeader(JPanel header){
		this.header = header;
	}	
	
	// Corps
	public void corps(){	
		this.getContentPane().add(corps);
	}
	public JPanel getCorps(){
		return corps;
	}
	public void setCorps(JPanel c){
		this.corps = c;
	}
	
	//Footer 
	public void footer_content(){	
		this.getContentPane().add(footer);
	}
	public JPanel getFooter(){
		return footer;
	}
	public void setFooter(JPanel footer){
		this.footer = footer;
	}
	
	//Creation de couleur a la vol�
	public Color couleur(int i, int j, int k) {
		return new Color(i, j, k);
	}
}
