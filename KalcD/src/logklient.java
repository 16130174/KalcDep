

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class logklient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logklient frame = new logklient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public logklient() {
		setTitle("\u0412\u0445\u043E\u0434 \u0432 \u0441\u0438\u0441\u0442\u0435\u043C\u0443");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0424\u0418\u041E");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 22, 95, 36);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u041B\u043E\u0433\u0438\u043D");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(10, 84, 95, 36);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u041F\u0430\u0440\u043E\u043B\u044C");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(10, 152, 95, 36);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(161, 22, 179, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(161, 84, 179, 36);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(161, 152, 179, 36);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("\u0412\u0445\u043E\u0434");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(107, 213, 172, 37);
		contentPane.add(btnNewButton);
	}
}
