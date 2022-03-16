import javax.swing.*;
public class mensaje {
	public void saludar() {
		
		String nombre = JOptionPane.showInputDialog("Por favor introduce tu nombre");
		try {
			if(!nombre.isEmpty()) {
				JOptionPane.showMessageDialog(null,"Hola " + nombre);
			}else {
				JOptionPane.showMessageDialog(null, "Hola extrañ@");
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Saludo cancelado");
		}
	}	// SALUDAR()
}
