import javax.swing.*;
public class mensaje {
	public void saludar() {
		String nombre = JOptionPane.showInputDialog("Por favor introduce tu nombre");
		if(nombre != null) {
			JOptionPane.showMessageDialog(null,"Hola " + nombre);
		}
	}
}
