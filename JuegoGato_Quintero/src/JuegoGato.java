import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Label;
import javax.swing.JDesktopPane;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.TextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JuegoGato extends JFrame {

	private JPanel contentPane;
	private static JTextField txtJugador1;
	private static JTextField txtJugador2;
	Boolean turno = true;// se inicia con el turno jugador1 por default CIRCULO
	int btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoGato frame = new JuegoGato();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}// FIN DE LA CLASE MAIN

	/**
	 * Create the frame.
	 */
	public JuegoGato() {

		setIconImage(Toolkit.getDefaultToolkit().getImage(JuegoGato.class.getResource("/Imagenes/TicTacToe.png")));
		setResizable(false);
		setTitle("  G A T O");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(525, 200, 290, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnCirculo = new JButton("");
		btnCirculo.setBackground(new Color(0, 0, 0));

		btnCirculo.setSelectedIcon(null);
		btnCirculo.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
		btnCirculo.setBounds(10, 67, 41, 43);
		contentPane.add(btnCirculo);

		JButton btnX = new JButton("");
		btnX.setBackground(new Color(220, 20, 60));

		btnX.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image.jpg")));
		btnX.setBounds(185, 67, 41, 43);
		contentPane.add(btnX);

		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurno.setForeground(new Color(0, 0, 0));
		lblTurno.setFont(new Font("SimHei", Font.BOLD, 25));
		lblTurno.setBounds(96, 11, 81, 30);
		contentPane.add(lblTurno);

		JButton boton7 = new JButton("");
		boton7.setBackground(new Color(245, 255, 250));
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*
				 * Como variable turno es true por default , esto es con la
				 * finalidad que se muestre un CIRCULO indicando el turno del
				 * jugador1 ,despues de ejecutar la variable turno cambia de
				 * valor a false para que el siguiente boton sin importar el
				 * lugar cambie a X indicando el turno del jugaro2. Cada boton
				 * tendra una variable por nombre btn(#boton)indicando un valor
				 * [1]= al turno 1; valor [2]= al turno 2; para validar en el
				 * metodo comprobacion el ganador del juego.
				 */

				if (turno == true) {
					boton7.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn7 = 1;

				} else {
					boton7.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn7 = 2;

				}
				System.out.println(turno + "" + btn7);
				Comprobacion();
			}
		});
		boton7.setBounds(55, 258, 50, 50);
		contentPane.add(boton7);

		JButton boton1 = new JButton("");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(turno + "" + btn1);
				if (turno == true) {
					boton1.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn1 = 1;
				} else {
					boton1.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn1 = 2;
				}
				System.out.println(turno + "" + btn1);
				Comprobacion();
			}

		});
		boton1.setBackground(new Color(245, 255, 250));
		boton1.setForeground(new Color(0, 0, 0));

		boton1.setBounds(55, 136, 50, 50);
		contentPane.add(boton1);

		JButton boton4 = new JButton("");
		boton4.setBackground(new Color(245, 255, 250));
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (turno == true) {
					boton4.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn4 = 1;
				} else {
					boton4.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn4 = 2;
				}
				System.out.println(turno + "" + btn4);
				Comprobacion();
			}
		});
		boton4.setBounds(55, 197, 50, 50);
		contentPane.add(boton4);

		JButton boton8 = new JButton("");
		boton8.setBackground(new Color(245, 255, 250));
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (turno == true) {
					boton8.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn8 = 1;
				} else {
					boton8.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn8 = 2;
				}
				Comprobacion();
			}
		});
		boton8.setBounds(121, 258, 50, 50);
		contentPane.add(boton8);

		JButton boton2 = new JButton("");
		boton2.setBackground(new Color(245, 255, 250));
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// cambio de imagen

				if (turno == true) {
					boton2.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn2 = 1;
				} else {
					boton2.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn2 = 2;
				}
				Comprobacion();
			}
		});
		boton2.setBounds(121, 136, 50, 50);
		contentPane.add(boton2);

		JButton boton5 = new JButton("");
		boton5.setBackground(new Color(245, 255, 250));
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (turno == true) {
					boton5.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn5 = 1;
				} else {
					boton5.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn5 = 2;
				}
				Comprobacion();
			}
		});
		boton5.setBounds(121, 197, 50, 50);
		contentPane.add(boton5);

		JButton boton3 = new JButton("");
		boton3.setBackground(new Color(245, 255, 250));
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (turno == true) {
					boton3.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn3 = 1;
				} else {
					boton3.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn3 = 2;
				}
				Comprobacion();
			}
		});
		boton3.setBounds(185, 136, 50, 50);
		contentPane.add(boton3);

		JButton boton6 = new JButton("");
		boton6.setBackground(new Color(245, 255, 250));
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (turno == true && btn6 == 0) {
					boton6.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn6 = 1;
				} else {
					boton6.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn6 = 2;
				}
				Comprobacion();
			}
		});
		boton6.setBounds(185, 197, 50, 50);
		contentPane.add(boton6);

		JButton boton9 = new JButton("");
		boton9.setBackground(new Color(245, 255, 250));
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (turno == true && btn9 == 0) {
					boton9.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn9 = 1;
				} else {
					boton9.setIcon(new ImageIcon(JuegoGato.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn9 = 2;
				}
				Comprobacion();
			}
		});
		boton9.setBounds(185, 258, 50, 50);
		contentPane.add(boton9);

		txtJugador1 = new JTextField();
		txtJugador1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		txtJugador1.setFont(new Font("Verdana", Font.BOLD, 15));
		txtJugador1.setBounds(61, 67, 41, 43);
		contentPane.add(txtJugador1);
		txtJugador1.setColumns(10);

		txtJugador2 = new JTextField();
		txtJugador2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		txtJugador2.setFont(new Font("Verdana", Font.BOLD, 15));
		txtJugador2.setBounds(236, 67, 43, 43);
		contentPane.add(txtJugador2);
		txtJugador2.setColumns(10);

		JLabel lblJugador = new JLabel("Jugador 1");
		lblJugador.setBounds(10, 42, 71, 14);
		contentPane.add(lblJugador);

		JLabel lblJugador_1 = new JLabel("Jugador 2");
		lblJugador_1.setBounds(185, 42, 71, 14);
		contentPane.add(lblJugador_1);

		// mostrar en pantalla marcador inicial

	}

	// comprobacion en forma horizontal ,vertical & Diagonal
	public void Comprobacion() {
		if ((btn1 == 1 && btn2 == 1 && btn3 == 1) || (btn4 == 1 && btn5 == 1 && btn6 == 1)
				|| (btn7 == 1 && btn8 == 1 && btn9 == 1)) {
			txtJugador1.setText(txtJugador1.getText() + ("1"));
			txtJugador2.setText("0");

			System.out.println("JUGADOR[2]-NEGRO");
			JOptionPane.showMessageDialog(this, "JUGADOR 1", "GANADOR", JOptionPane.INFORMATION_MESSAGE);
		} else if ((btn1 == 1 && btn4 == 1 && btn7 == 1) || (btn2 == 1 && btn5 == 1 && btn8 == 1)
				|| (btn3 == 1 && btn6 == 1 && btn9 == 1)) {
			txtJugador1.setText(txtJugador1.getText() + ("1"));
			txtJugador2.setText("0");

			System.out.println("JUGADOR[2]-NEGRO");
			JOptionPane.showMessageDialog(this, "JUGADOR 1", "GANADOR", JOptionPane.INFORMATION_MESSAGE);
		} else if ((btn1 == 1 && btn5 == 1 && btn9 == 1) || (btn3 == 1 && btn5 == 1 && btn7 == 1)) {
			txtJugador1.setText(txtJugador1.getText() + ("1"));
			;
			txtJugador2.setText("0");

			System.out.println("JUGADOR[2]-NEGRO");
			JOptionPane.showMessageDialog(this, "JUGADOR 1", "GANADOR", JOptionPane.INFORMATION_MESSAGE);
		} else if ((btn1 == 2 && btn2 == 2 && btn3 == 2) || (btn4 == 2 && btn5 == 2 && btn6 == 2)
				|| (btn7 == 2 && btn8 == 2 && btn9 == 2)) {
			txtJugador2.setText(txtJugador2.getText() + ("1"));
			txtJugador1.setText("0");

			System.out.println("JUGADOR[2]-ROJO");
			JOptionPane.showMessageDialog(this, "JUGADOR 2", "GANADOR", JOptionPane.INFORMATION_MESSAGE);
		} else if ((btn1 == 2 && btn4 == 2 && btn7 == 2) || (btn2 == 2 && btn5 == 2 && btn8 == 2)
				|| (btn3 == 2 && btn6 == 2 && btn9 == 2)) {
			txtJugador2.setText(txtJugador2.getText() + ("1"));
			txtJugador1.setText("0");

			System.out.println("JUGADOR[2]-ROJO");
			JOptionPane.showMessageDialog(this, "JUGADOR 2", "GANADOR", JOptionPane.INFORMATION_MESSAGE);
		} else if ((btn1 == 2 && btn5 == 2 && btn9 == 2) || (btn3 == 2 && btn5 == 2 && btn7 == 2)) {
			txtJugador2.setText(txtJugador2.getText() + ("1"));
			txtJugador1.setText("0");

			System.out.println("JUGADOR[2]-ROJO");
			JOptionPane.showMessageDialog(this, "JUGADOR 2", "GANADOR", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}// FIN clase JUEGO GATO
