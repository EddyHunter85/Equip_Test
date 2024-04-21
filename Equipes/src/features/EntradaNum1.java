package features;
import javax.swing.JOptionPane;

public class EntradaNum1 {
	private int num;
	private int mudança;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void painel() {
		String n;
		n = JOptionPane.showInputDialog(null, "Digite um número");
		this.num =  Integer.parseInt(n);
	}
	

}
