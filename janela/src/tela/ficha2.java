package tela;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class ficha2 extends JFrame implements ActionListener {
	
	ImageIcon fundo = new ImageIcon(getClass().getResource("final.png"));
	ImageIcon mais = new ImageIcon(getClass().getResource("mais.png"));
	ImageIcon menos = new ImageIcon(getClass().getResource("menos.png"));
	ImageIcon save = new ImageIcon(getClass().getResource("Mano_gui_Save.jpg"));
	ImageIcon lixo = new ImageIcon(getClass().getResource("Mano_Gui_Lixo.jpg"));
	ImageIcon reloud = new ImageIcon(getClass().getResource("Mano_Gui_Beckp.jpg"));
	
	// JCOMBO BOX OPIÇÕES DE ELEMENTO E DESVANTAGEM E VANTAGEM 
	
	JComboBox<String> elemento = new JComboBox<String>();
	JComboBox<String> Vantagem = new JComboBox<String>();
	JComboBox<String> Desvantagem = new JComboBox<String>();
	JComboBox<String> Raça = new JComboBox<String>();
	
	
	int XP = 0;
	int IntNivel = 0;
	JLabel NIVEL = new JLabel("Nivel");
	JLabel XP_A = new JLabel("XP Atual: ");
	
	
	
	JButton XP1 = new JButton();
	JButton XP10 = new JButton();
	JButton XP100 = new JButton();
	JButton XP1000 = new JButton();
	JButton XP_LIMP = new JButton();
	
	// ADICIONANDO TEXTO COM INFORMAÇÕES DO QUANTO DE PONTO E BONUS
	
		JLabel bonus1 = new JLabel("Bonus:");
		JLabel ponto1 = new JLabel("ponto:");
		
		JLabel bonus2 = new JLabel("Bonus:");
		JLabel ponto2 = new JLabel("ponto:");
		
		JLabel bonus3 = new JLabel("Bonus:");
		JLabel ponto3 = new JLabel("ponto:");
		
		JLabel bonus4 = new JLabel("Bonus:");
		JLabel ponto4 = new JLabel("ponto:");
		
		JLabel bonus5 = new JLabel("Bonus: 0");
		JLabel ponto5 = new JLabel("ponto: 0");
		
		JLabel bonus6 = new JLabel("Bonus: 0");
		JLabel ponto6 = new JLabel("ponto: 0");
		
		//==== 2  ====== VIDA E MANA MAXIMA E MINIMA
		
		int vidaM = 0;
		int vidaA = 0;
		
		int ManaM = 0;
		int ManaA = 0;
		
		
		JLabel Vida_M = new JLabel(""+vidaM);
		JLabel Vida_A = new JLabel(""+vidaA);
		
		JLabel Mana_M = new JLabel(""+ManaM);
		JLabel Mana_A = new JLabel(""+ManaA);
		
		JLabel RF = new JLabel("");
		JLabel RM = new JLabel("");
		JLabel DIS = new JLabel("");
		
		
		// BOTÕES DE AUMENTAR E DIMINUIR PONTO DO ATRIBUTO
		JButton jb1 = new JButton(mais);
		JButton jb2 = new JButton(menos);
		JButton jb3 = new JButton(mais);
		JButton jb4 = new JButton(menos);
		JButton jb5 = new JButton(mais);
		JButton jb6 = new JButton(menos);
		JButton jb7 = new JButton(mais);
		JButton jb8 = new JButton(menos);
		JButton jb9 = new JButton(mais);
		JButton jb10 = new JButton(menos);
		JButton jb11 = new JButton(mais);
		JButton jb12 = new JButton(menos);
		////
		// SAVE SISTEM
		
		JButton create_txt = new JButton(save);
		JButton delete_txt = new JButton(lixo);
		JButton backup_txt = new JButton(reloud);
		
		// VIDA E MANA ATUAL
		
		JButton Menos_Atual_Vida = new JButton(menos);
		JButton Mais_Atual_Vida = new JButton(mais);
		
		JButton Menos_MANA_Vida = new JButton(menos);
		JButton Mais_MANA_Vida = new JButton(mais);
		
		//========================================================
		// ADICIONANDO PERICIAS COM CHECBOX
		
		JCheckBox Melhoria = new JCheckBox();
		JCheckBox Artifice = new JCheckBox();
		JCheckBox Medicina = new JCheckBox();
		JCheckBox Liderança = new JCheckBox();
		JCheckBox Alquimista = new JCheckBox();
		JCheckBox Escudeiro = new JCheckBox();
		JCheckBox Atletismo = new JCheckBox();
		JCheckBox Furtividade = new JCheckBox();
		JCheckBox Interrogar = new JCheckBox();
		JCheckBox Percepção = new JCheckBox();
		JCheckBox História = new JCheckBox();
		JCheckBox Sobrevivência = new JCheckBox();
		
		
		
		
		// BOTÃO DE VERIFICAR
		
		JButton verifique = new JButton();
		
		
		JTextField nome = new JTextField(10);
		
		JTextArea Itens = new JTextArea();
		
		
		//ADICIONANDO TEXTOS DE ATRIBUTO
		int bonusJB1 = 0;
		int numeroJB1 = 0;
		
		int bonusJB2 = 0;
		int numeroJB2 = 0;
		
		int bonusJB3 = 0;
		int numeroJB3 = 0;
		
		int bonusJB4 = 0;
		int numeroJB4 = 0;
		
		int bonusJB5 = 0;
		int numeroJB5 = 0;
		
		int bonusJB6 = 0;
		int numeroJB6 = 0;
		
		
		// CAIXA DE TEXTO DE ARMAS EQUIPADAS
		
		JTextField Arma1Nome = new JTextField ("");
		JTextField Arma1Dado = new JTextField ("");
		JTextField Arma1Bonus = new JTextField ("");
		JTextField Arma1Teste = new JTextField ("");
		
		// Arma1Nome Arma1Dado Arma1Bonus Arma1Teste
		
		JTextField Arma2Nome = new JTextField ("");
		JTextField Arma2Dado = new JTextField ("");
		JTextField Arma2Bonus = new JTextField ("");
		JTextField Arma2Teste = new JTextField ("");

		JTextField Arma3Nome = new JTextField ("");
		JTextField Arma3Dado = new JTextField ("");
		JTextField Arma3Bonus = new JTextField ("");
		JTextField Arma3Teste = new JTextField ("");
		
		JTextField Arma4Nome = new JTextField ("");
		JTextField Arma4Dado = new JTextField ("");
		JTextField Arma4Bonus = new JTextField ("");
		JTextField Arma4Teste = new JTextField ("");

		
		
	// DESCRIÇÃO DE CADA JcOMBObOX
		
		
		JLabel JBoxElemento1 = new JLabel("");
		JLabel JBoxElemento2 = new JLabel("");
		JLabel JBoxElemento3 = new JLabel("");
		JLabel JBoxRaca1 = new JLabel("ESTOU AQUI!!!!");
		JLabel JBoxRaca2 = new JLabel("ESTOU AQUI!!!!");
		JLabel JBoxRaca3 = new JLabel("ESTOU AQUI!!!!");
		
				
		public ficha2() {
			
			
			
			
			setSize(580,850);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setVisible(true);
			setResizable(false);
			
			
			Painel painel = new Painel();
			painel.setPreferredSize(null);
			painel.setLayout(null);
			add(painel);
			
			// ADICIONANDO OS BOTÕES 
			
			painel.add(jb1);
			painel.add(jb2);
			
			painel.add(jb3);
			painel.add(jb4);
			
			painel.add(jb5);
			painel.add(jb6);
			
			painel.add(jb7);
			painel.add(jb8);
			
			painel.add(jb9);
			painel.add(jb10);
			
			painel.add(jb11);
			painel.add(jb12);
			
			painel.add(create_txt);
			painel.add(delete_txt);
			painel.add(backup_txt);

			
			jb1.setBounds(10,59,15,15);
			jb1.addActionListener(this);
			
			jb2.setBounds(10,76,15,15);
			jb2.addActionListener(this);
			
			jb3.setBounds(10,108,15,15);
			jb3.addActionListener(this);
			
			jb4.setBounds(10,125,15,15);
			jb4.addActionListener(this);
			
			jb5.setBounds(10,149,15,15);
			jb5.addActionListener(this);
			
			jb6.setBounds(10,166,15,15);
			jb6.addActionListener(this);
			
			jb7.setBounds(10,192,15,15);
			jb7.addActionListener(this);
			
			jb8.setBounds(10,209,15,15);
			jb8.addActionListener(this);
			
			jb9.setBounds(10,254,15,15);
			jb9.addActionListener(this);
			
			jb10.setBounds(10,270,15,15);
			jb10.addActionListener(this);
			
			jb11.setBounds(10,303,15,15);
			jb11.addActionListener(this);
			
			jb12.setBounds(10,320,15,15);
			jb12.addActionListener(this);
			
			// VIDA E MANA ATUAL
			
			painel.add(Menos_Atual_Vida);
			Menos_Atual_Vida.setBounds(340,270,15,15);
			Menos_Atual_Vida.addActionListener(this);
			
			
			
			painel.add(Mais_Atual_Vida);
			Mais_Atual_Vida.setBounds(340,252,15,15);
			Mais_Atual_Vida.addActionListener(this);
			
			painel.add(Menos_MANA_Vida);
			Menos_MANA_Vida.setBounds(340,400,15,15);
			Menos_MANA_Vida.addActionListener(this);
			
			
			painel.add(Mais_MANA_Vida);
			Mais_MANA_Vida.setBounds(340,385,15,15);
			Mais_MANA_Vida.addActionListener(this);
			
			
			////////////////////////////////////////////////////////////
			
			create_txt.setBounds(390,530,40,40);
			create_txt.addActionListener(this);

			delete_txt.setBounds(435,530,40,40);
			delete_txt.addActionListener(this);
			
			backup_txt.setBounds(485,530,40,40);
			backup_txt.addActionListener(this);
			
			// BOTÃO DO XP
			
			painel.add(XP1);
			XP1.setBounds(390,200,20,20);
			XP1.addActionListener(this);
			painel.add(XP10);
			XP10.setBounds(415,200,20,20);
			XP10.addActionListener(this);
			painel.add(XP100);
			XP100.setBounds(440,200,20,20);
			XP100.addActionListener(this);
			painel.add(XP1000);
			XP1000.setBounds(465,200,20,20);
			XP1000.addActionListener(this);
			
			painel.add(XP_LIMP);
			XP_LIMP.setBounds(495,200,30,20);
			XP_LIMP.addActionListener(this);
			
			
			
			
			
			//====================================================
			
			// ADD COMBO BOX
			
			painel.add(verifique);
			verifique.setBounds(400,480,100,22);
			verifique.addActionListener(this);
			
			painel.add(elemento);
			Color box1 = new Color(239,232,170);
			elemento.setBackground(box1);
			elemento.setBounds(390,15,140,22);
			elemento.addItem("          elemento");
			elemento.addItem("fogo");
			elemento.addItem("agua");
			elemento.addItem("terra");
			elemento.addItem("Ar");
			
			
			Color box21 = new Color( 205, 253, 55);
			painel.add(Raça);
			Raça.setBackground(box21);
			Raça.setBounds(390,80,140,22);
			Raça.addItem("               Raça");
			Raça.addItem("Humano");
			Raça.addItem("Meio Demonio");
			Raça.addItem("Vampiro");
			Raça.addItem("Asimar");
			Raça.addItem("Renacido");
			
			
			
			painel.add(Vantagem);
			Color box2 = new Color( 205, 253, 55);
			Vantagem.setBackground(box2);
			Vantagem.setBounds(390,150,140,22);
			painel.add(Desvantagem);
			Vantagem.addItem("Vantagem");
			Vantagem.addItem("Encantador");
			Vantagem.addItem("Conhecimento");
			Vantagem.addItem("Bardismo");
			Vantagem.addItem("Ligação Animal");
			Vantagem.addItem("Contrabandista");
			Vantagem.addItem("Mestre em fechaduras");
			Vantagem.addItem("Torcida");
			Vantagem.addItem("Asas");
			Vantagem.addItem("Sentidos Especiais");
			Vantagem.addItem("Montaria");
			Vantagem.addItem("mochileiro");
			Vantagem.addItem("Clericato");
			Vantagem.addItem("Inventor");
			Vantagem.addItem("Fama");
			Vantagem.addItem("Lárapio");
			Vantagem.addItem("Coletor");
			
			Color box3 = new Color( 210, 121, 133);
			Desvantagem.setBackground(box3);
			Desvantagem.setBounds(390,175,140,22);
			Desvantagem.addItem("Desvantagem");
			Desvantagem.addItem("Cultista Insano");
			Desvantagem.addItem("Doença Magica incuravel");
			Desvantagem.addItem("Complexo de Desvantagem");
			Desvantagem.addItem("Complexo de arma humana");
			Desvantagem.addItem("Azarado");
			Desvantagem.addItem("Exibido");
			Desvantagem.addItem("Confusão");
			Desvantagem.addItem("Alcolatra");
			Desvantagem.addItem("Cóadigo de honra");
			Desvantagem.addItem("Complexo de abandono");
			Desvantagem.addItem("Brigão");
			Desvantagem.addItem("Procurado");
			Desvantagem.addItem("Desordenado");
			Desvantagem.addItem("Dependente quimico");
			Desvantagem.addItem("Psicopata");
			Desvantagem.addItem("Entidade esquisofrenica");
			
			
			// ADICIONANDO ESLOTES DE ARMAS
			
			Arma1Nome.setFont(new Font("Serif", Font.BOLD, 15));
			painel.add(Arma1Nome);
			Arma1Nome.setBounds(5,490,140,25);
						
			painel.add(Arma1Dado);
			Arma1Dado.setBounds(150,490,48,25);
			
			painel.add(Arma1Bonus);
			Arma1Bonus.setBounds(200,490,55,25);
			
			painel.add(Arma1Teste);
			Arma1Teste.setBounds(260,490,110,25);
			
			Arma2Nome.setFont(new Font("Serif", Font.BOLD, 15));
			painel.add(Arma2Nome);
			Arma2Nome.setBounds(5,525,140,25);
			
			painel.add(Arma2Dado);
			Arma2Dado.setBounds(150,525,48,25);
			
			painel.add(Arma2Bonus);
			Arma2Bonus.setBounds(200,525,55,25);
			
			painel.add(Arma2Teste);
			Arma2Teste.setBounds(260,525,110,25);
			

			Arma3Nome.setFont(new Font("Serif", Font.BOLD, 15));
			painel.add(Arma3Nome);
			Arma3Nome.setBounds(5,560,140,25);
			
			painel.add(Arma3Dado);
			Arma3Dado.setBounds(150,560,48,25);
			
			painel.add(Arma3Bonus);
			Arma3Bonus.setBounds(200,560,55,25);
			
			painel.add(Arma3Teste);
			Arma3Teste.setBounds(260,560,110,25);
			
			Arma4Nome.setFont(new Font("Serif", Font.BOLD, 15));
			painel.add(Arma4Nome);
			Arma4Nome.setBounds(5,600,140,25);
			
			painel.add(Arma4Dado);
			Arma4Dado.setBounds(150,600,48,25);
			
			painel.add(Arma4Bonus);
			Arma4Bonus.setBounds(200,600,55,25);
			
			painel.add(Arma4Teste);
			Arma4Teste.setBounds(260,600,110,25);
			
			
			
			
			
			
			
			//ADICIONANDO TEXTOS E COR 
			painel.add(bonus1);
			painel.add(ponto1);
			
			bonus1.setForeground(Color.WHITE);
			ponto1.setForeground(Color.WHITE);
			
			bonus1.setBounds(40,55,100,20);
			ponto1.setBounds(40,70,100,20);
			
			painel.add(bonus2);
			painel.add(ponto2);
			
			bonus2.setForeground(Color.WHITE);
			ponto2.setForeground(Color.WHITE);
			
			bonus2.setBounds(40,104,100,20);
			ponto2.setBounds(40,119,100,20);
			
			painel.add(bonus3);
			painel.add(ponto3);
			
			bonus3.setForeground(Color.WHITE);
			ponto3.setForeground(Color.WHITE);

			bonus3.setBounds(40,145,100,20);
			ponto3.setBounds(40,159,100,20);
			
			painel.add(bonus4);
			painel.add(ponto4);
			
			bonus4.setForeground(Color.WHITE);
			ponto4.setForeground(Color.WHITE);
			
			bonus4.setBounds(40,189,100,20);
			ponto4.setBounds(40,205,100,20);
			
			painel.add(bonus5);
			painel.add(ponto5);
			
			bonus5.setForeground(Color.WHITE);
			ponto5.setForeground(Color.WHITE);
			
			bonus5.setBounds(40,249,100,20);
			ponto5.setBounds(40,265,100,20);
			
			painel.add(bonus6);
			painel.add(ponto6);
			
			bonus6.setForeground(Color.WHITE);
			ponto6.setForeground(Color.WHITE);
			
			bonus6.setBounds(40,298,100,20);
			ponto6.setBounds(40,316,100,20);
			
			// ==== 2
			
			painel.add(Vida_M);
			painel.add(Vida_A);
			
			Vida_M.setBounds(280,190,100,30);
			Vida_A.setBounds(280,250,100,30);
			

			Vida_M.setForeground(Color.RED);
			Vida_A.setForeground(Color.RED);
			
			Vida_M.setFont(new Font("Serif", Font.BOLD, 35));
			Vida_A.setFont(new Font("Serif", Font.BOLD, 35));
			
			
			painel.add(Mana_M);
			painel.add(Mana_A);
			
			Mana_M.setBounds(280,329,100,30);
			Mana_A.setBounds(280,380,100,30);
			

			Mana_M.setForeground(Color.BLUE);
			Mana_A.setForeground(Color.BLUE);
			
			Mana_M.setFont(new Font("Serif", Font.BOLD, 35));
			Mana_A.setFont(new Font("Serif", Font.BOLD, 35));
			
			
			//=================================================
			
			
			painel.add(nome);
			painel.add(RF);
			painel.add(RM);
			painel.add(DIS);
			//painel.add(Painel2);
			
			
			// teste 
			painel.add(Itens);
			Itens.getText();
			Itens.setBounds(10,665,530,140);
			
			
			
			Itens.getFont();
			//

			
			nome.getText();
			nome.setBounds(3,25,150,20);
			nome.getFont();
			
			RF.getText();
			RF.setBounds(225,107,25,23);
			RF.getFont();
			
			RM.getText();
			RM.setBounds(290,107,25,23);
			RM.getFont();
			
			DIS.getText();
			DIS.setBounds(348,107,30,23);
			DIS.getFont();
			
			//bonus.setText("bonus");
			System.out.println();
			
			// COMBO BOX CAIXA DE OPIÇÕES 
			
			JBoxElemento1.setFont(new Font("Serif", Font.BOLD, 12));
			painel.add(JBoxElemento1);
			JBoxElemento1.setBounds(400,28,200,30);
			
			JBoxElemento2.setFont(new Font("Serif", Font.BOLD, 12));
			painel.add(JBoxElemento2);
			JBoxElemento2.setBounds(400,42,200,30);
			
			JBoxElemento3.setFont(new Font("Serif", Font.BOLD, 12));
			painel.add(JBoxElemento3);
			JBoxElemento3.setBounds(400,55,200,30);
			
			JBoxRaca1.setFont(new Font("Serif", Font.BOLD, 13));
			painel.add(JBoxRaca1);
			JBoxRaca1.setText("");
			JBoxRaca1.setBounds(390,88,200,50);
			
			JBoxRaca2.setFont(new Font("Serif", Font.BOLD, 13));
			painel.add(JBoxRaca2);
			JBoxRaca2.setText("");
			JBoxRaca2.setBounds(390,102,200,50);
			
			JBoxRaca3.setFont(new Font("Serif", Font.BOLD, 13));
			painel.add(JBoxRaca3);
			JBoxRaca3.setText("");
			JBoxRaca3.setBounds(390,115,200,50);
			
			// NIVEL
			
			painel.add(NIVEL);
			NIVEL.setText("NIVEL ATUAL" + IntNivel);
			NIVEL.setBounds(390,205,200,50);
			
			painel.add(XP_A);
			XP_A.setBounds(390,220,200,50);
			
			
			// PERICIAS 
			
			painel.add(Melhoria);
			Melhoria.setText("Melhoria");
			Melhoria.setBounds(390,265,80,15);
			
			painel.add(Artifice);
			Artifice.setText("Artifice");
			Artifice.setBounds(390,285,80,15);
			
			painel.add(Medicina);
			Medicina.setText("Medicina");
			Medicina.setBounds(390,305,80,15);
			
			painel.add(Liderança);
			Liderança.setText("Liderança");
			Liderança.setBounds(390,325,90,15);
			
			painel.add(Alquimista);
			Alquimista.setText("Alquimista");
			Alquimista.setBounds(390,325,90,15);
			
			painel.add(Escudeiro);
			Escudeiro.setText("Escudeiro");
			Escudeiro.setBounds(390,345,90,15);
			
			painel.add(Furtividade);
			Furtividade.setText("Furtividade");
			Furtividade.setBounds(390,365,90,15);
			
			painel.add(Interrogar);
			Interrogar.setText("Interrogar");
			Interrogar.setBounds(390,385,90,15);
			
			painel.add(Percepção);
			Percepção.setText("Percepção");
			Percepção.setBounds(390,405,90,15);
			
			painel.add(História);
			História.setText("História");
			História.setBounds(390,425,90,15);
			
			painel.add(Sobrevivência);
			Sobrevivência.setText("Sobrevivência");
			Sobrevivência.setBounds(390,445,90,15);

		}
		
		
		public class Painel extends JPanel{
			
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Image img = fundo.getImage();
				g.drawImage(img,0,0,this);
			}
		}
		
		
		
	
	public void actionPerformed(ActionEvent e) {
		


		// PONTOS 
		
		
		if(e.getSource()== create_txt ) {
			
			// CAPITURANDO VALORES DA FICHA E TRANSFORMANDO EM TXT
			
			
					Path texto = Path.of("C:\\teste\\texto.txt");
					
					
					// BONUS DOS ATRIBUTOS 
					String Destreza_String = Integer.toString(bonusJB1 / 5);
					String Resistencia_String = Integer.toString(bonusJB2 / 5);
					String Inteligencia_String = Integer.toString(+bonusJB3 / 5);
					String Força_String = Integer.toString(+bonusJB4 / 5);
					String Vida_String = Integer.toString(+bonusJB5 );
					String Mana_String = Integer.toString(bonusJB6 );
					
					// PONTOS GASTOS
					
					String Destreza_Points = Integer.toString(numeroJB1);
					String Resistencia_Points = Integer.toString(numeroJB2);
					String Inteligencia_Points = Integer.toString(numeroJB3);
					String Força_Points = Integer.toString(numeroJB4);
					
					String Vida_Points = Integer.toString(numeroJB5);
					String Mana_Points = Integer.toString(numeroJB6);
					
					String Elemento = elemento.getSelectedItem().toString();
					String Raca = Raça.getSelectedItem().toString();
					String vantagem = Vantagem.getSelectedItem().toString();
					String desvantagem = Desvantagem.getSelectedItem().toString();
					
					
					
					String XP_SAVE = Integer.toString(XP);
					
					
					// Arma1Nome Arma1Dado Arma1Bonus Arma1Teste
					
					String Recu_Arma1Nome =Arma1Nome.getText();
					String Recu_Arma1Dad =Arma1Dado.getText();
					String Recu_Arma1Bonus =Arma1Bonus.getText();
					String Recu_Arma1Teste =Arma1Teste.getText();
					
					
					String Recu_Arma2Nome =Arma2Nome.getText();
					String Recu_Arma2Dad =Arma2Dado.getText();
					String Recu_Arma2Bonus =Arma2Bonus.getText();
					String Recu_Arma2Teste =Arma2Teste.getText();
					

					String Recu_Arma3Nome =Arma3Nome.getText();
					String Recu_Arma3Dad =Arma3Dado.getText();
					String Recu_Arma3Bonus =Arma3Bonus.getText();
					String Recu_Arma3Teste =Arma3Teste.getText();
					
					String Recu_Arma4Nome =Arma4Nome.getText();
					String Recu_Arma4Dad =Arma4Dado.getText();
					String Recu_Arma4Bonus =Arma4Bonus.getText();
					String Recu_Arma4Teste =Arma4Teste.getText();
					
						
					String Recu_Itens = Itens.getText();
					
					
					String pontos = Destreza_String + "\n" + Resistencia_String + "\n" + Inteligencia_String +
							      "\n" + Força_String + "\n" + Vida_String + "\n" + Mana_String + "\n" + Destreza_Points +
							      "\n" + Resistencia_Points + "\n" + Inteligencia_Points + "\n" + Força_Points +
							      "\n" + Vida_Points + "\n" + Mana_Points + "\n" + Elemento
							      + "\n" + Raca + "\n" + vantagem  + "\n" + desvantagem  + "\n" + XP_SAVE 
							      + "\n" + Recu_Arma1Nome + "\n" + Recu_Arma1Dad + "\n" + Recu_Arma1Bonus 
							      + "\n" + Recu_Arma1Teste + "\n" + Recu_Arma2Nome + "\n" + Recu_Arma2Dad  
							      + "\n" + Recu_Arma2Bonus + "\n" + Recu_Arma2Teste 
							      + "\n"+ Recu_Arma3Nome  + "\n" +Recu_Arma3Dad + "\n" +Recu_Arma3Bonus
							      + "\n" + Recu_Arma3Teste + "\n" + Recu_Arma4Nome + "\n" + Recu_Arma4Dad
							      + "\n" +Recu_Arma4Bonus + "\n"+ Recu_Arma4Teste + "\n" + Recu_Itens ;
								  	
						try {
							if(Files.notExists(texto)){
							Files.createFile(texto);
							Files.writeString(texto,pontos);
							
							System.out.println("O ARQUIVO TXT FOI CRIADO");
														
							}else {
								System.out.println("O ARQUIVO TXT JÁ EXITES OU NÃO PODE SER CRIADO");
							}
						} catch (IOException e1) {
							System.out.println("um erro inesperado ocorreu");
						}
						
					
		}if(e.getSource()== delete_txt) {
			
			Path texto = Path.of("C:\\teste\\texto.txt");
			
			try {
				Files.delete(texto);
				System.out.println("O Arquivo foi deletado com susesso");
			} catch (IOException e1) {
				System.out.println("O arquivo não existe ou não pode ser deletado");
			}
		}if(e.getSource()== backup_txt) {
			
			
			Path texto = Path.of("C:\\teste\\texto.txt");

			try {
				
				
				System.out.println("Arquivo encontrado \n");
			/*	
				for(String pontos: string) {
					System.out.println(pontos);
					
				
				
				
					
				}*/	
				
				// COLETANDO VALORES 
				
				String Destreza= Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(0);
				System.out.println("DESTREZA");
				System.out.println(Destreza);
				
				String Resistencia = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(1);
				System.out.println("RESISTENCIA");
				System.out.println(Resistencia);
				
				String inteligencia = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(2);
				System.out.println("Inteligencia");
				System.out.println(inteligencia);
				
				String força = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(3);
				System.out.println("Força");
				System.out.println(força);
				
				String Vida = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(4);
				System.out.println("Vida");
				System.out.println(Vida);
				
				String Mana = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(5);
				System.out.println("Mana");
				System.out.println(Mana);
				
				// CAPTURANDOS PONTOS
				
				System.out.println("PONTOS");
				
				String Destreza_Points = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(6);
				System.out.println("Destreza poits");
				System.out.println(Destreza_Points);
				
				String Resistencia_Points = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(7);
				System.out.println("Resistencia poits");
				System.out.println(Resistencia_Points);
				
				String Inteligencia_Points = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(8);
				System.out.println("Resistencia poits");
				System.out.println(Inteligencia_Points);
				
				String Força_Points = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(9);
				System.out.println("Força poits");
				System.out.println(Força_Points);
				
				String Vida_Points = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(10);
				System.out.println("Vida poits");
				System.out.println(Vida_Points);
				
				String Mana_Points = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(11);
				System.out.println("Mana poits");
				System.out.println(Mana_Points);
				
				String Elemento = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(12);
				System.out.println("Elemento escolhido");
				System.out.println(Elemento);
				

				String Raca = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(13);
				System.out.println("Raça escolhido");
				System.out.println(Raca);
				
				String vantagem = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(14);
				System.out.println("Vantagem escolhido");
				System.out.println(vantagem);
				
				String desvantagem = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(15);
				System.out.println("Desvantagem escolhido");
				System.out.println(desvantagem);
				
				String XP_SAVE = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(16);
				System.out.println("Desvantagem escolhido");
				System.out.println(XP_SAVE);
				
				// Arma1Nome Arma1Dado Arma1Bonus Arma1Teste ntnjnrg
				
				String arma1Nome = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(17);
				System.out.println("Arma1Nome");
				System.out.println(arma1Nome);
				
				String arma1Dado = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(18);
				System.out.println("Arma1Dado");
				System.out.println(arma1Dado);
				
				String arma1Bonus = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(19);
				System.out.println("Arma1Bonus");
				System.out.println(arma1Bonus);
				
				String arma1Teste = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(20);
				System.out.println("Arma1Teste");
				System.out.println(arma1Teste);
				
				String arma2Nome = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(21);
				System.out.println("Arma2Nome");
				System.out.println(arma2Nome);
				
				String arma2Dado = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(22);
				System.out.println("Arma2Dado");
				System.out.println(arma2Dado);
				
				String arma2Bonus = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(23);
				System.out.println("Arma2Bonus");
				System.out.println(arma2Bonus);
				
				String arma2Teste = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(24);
				System.out.println("Arma2Teste");
				System.out.println(arma2Teste);
				
				String arma3Nome = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(25);
				System.out.println("Arma3Nome");
				System.out.println(arma3Nome);
				
				
				String arma3Dado = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(26);
				System.out.println("Arma3Dado");
				System.out.println(arma3Dado);
				
				String arma3Bonus = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(27);
				System.out.println("Arma3Bonus");
				System.out.println(arma3Bonus);
				
				String arma3Teste = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(28);
				System.out.println("Arma3Teste");
				System.out.println(arma3Teste);
				
				String arma4Nome = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(29);
				System.out.println("Arma4Nome");
				System.out.println(arma4Nome);
				
				String arma4Dado = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(30);
				System.out.println("Arma4Dado");
				System.out.println(arma4Dado);
				
				String arma4Bonus = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(31);
				System.out.println("Arma4Bonus");
				System.out.println(arma4Bonus);
				
				String arma4Teste = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(32);
				System.out.println("Arma4Teste");
				System.out.println(arma4Teste);
				
				// Recu_Itens
				
				String Recu_Itens = "";
				
				String Finaly_String = "";
				
				
				
				try{
					
					for(int linha_atual = 33; linha_atual < 42; linha_atual++) {
						
						
						Recu_Itens = Files.readAllLines(Paths.get("C:\\\\teste\\\\texto.txt")).get(linha_atual);
						System.out.println("Itens guardados");
						System.out.println(Recu_Itens);
						
						if(linha_atual == 33) {
						Finaly_String = Finaly_String  + Recu_Itens ;
						}else {
							Finaly_String = Finaly_String + "\n"  + Recu_Itens ;
						}
						
					}
					
					
					Recu_Itens = Finaly_String;
					
				}catch (IOException e1){
																			
					System.out.println("DESLIGA OTTO !!!");
				}
				
				
				
				
				
				
				
				// PROCESSO DE REPASSAR VALORES DO TXT PARA VARIAVEIS LOCAIS
				
				int recu_Destreza = Integer.parseInt(Destreza);
				int recu_Resistencia = Integer.parseInt(Resistencia);
				int recu_Inteligencia = Integer.parseInt(inteligencia);
				int recu_Força = Integer.parseInt(força);
				int recu_Vida = Integer.parseInt(Vida);
				int recu_Mana = Integer.parseInt(Mana);
				
				// PROCESANDO PONTOS REGIUSTRADOS NO TXT
				
				int recu_PDestreza = Integer.parseInt(Destreza_Points);
				int recu_PResistencia = Integer.parseInt(Resistencia_Points);
				int recu_PInteligencia = Integer.parseInt(Inteligencia_Points);
				int recu_PForça = Integer.parseInt(Força_Points);			
				int recu_PVida = Integer.parseInt(Vida_Points);
				int recu_PMana = Integer.parseInt(Mana_Points);
				
				
				
				
				elemento.setSelectedItem(Elemento);
				Raça.setSelectedItem(Raca);
				Vantagem.setSelectedItem(vantagem);
				Desvantagem.setSelectedItem(desvantagem);
				
				
				int Recu_XP_SAVE = Integer.parseInt(XP_SAVE);
				
				XP = Recu_XP_SAVE;
				XP_A.setText("XP Atual: "+ XP);
				
				// Arma1Nome Arma1Dado Arma1Bonus Arma1Teste
				
				Arma1Nome.setText(arma1Nome);
				Arma1Dado.setText(arma1Dado);
				Arma1Bonus.setText(arma1Bonus);
				Arma1Teste.setText(arma1Teste);
				
				Arma2Nome.setText(arma2Nome);
				Arma2Dado.setText(arma2Dado);
				Arma2Bonus.setText(arma2Bonus);
				Arma2Teste.setText(arma2Teste);
				
				Arma3Nome.setText(arma3Nome);
				Arma3Dado.setText(arma3Dado);
				Arma3Bonus.setText(arma3Bonus);
				Arma3Teste.setText(arma3Teste);
				
				Arma4Nome.setText(arma4Nome);
				Arma4Dado.setText(arma4Dado);
				Arma4Bonus.setText(arma4Bonus);
				Arma4Teste.setText(arma4Teste);
				
				
				// Itens
				
				Itens.setText(Recu_Itens);
				
				
				// EXIBINDO RESULTADOS COLETADOS
				
				//BONUS
				bonusJB1 = bonusJB1 + recu_Destreza *5;
				bonus1.setText("Bonus: "+bonusJB1 /5);
				// PONTO
				numeroJB1 = numeroJB1 + recu_PDestreza;
				ponto1.setText("ponto "+numeroJB1);
				//BONUS
				bonusJB2 = bonusJB2 + recu_Resistencia *5;
				bonus2.setText("Bonus: "+bonusJB2 /5);
				// PONTO
				numeroJB2 = numeroJB2 + recu_PResistencia;
				ponto2.setText("ponto "+numeroJB2);
				//BONUS
				bonusJB3 = bonusJB3 + recu_Inteligencia *5;
				bonus3.setText("Bonus: "+bonusJB3 /5);
				// PONTO
				numeroJB3 = numeroJB3 + recu_PInteligencia;
				ponto3.setText("ponto "+numeroJB3);
				//BONUS
				bonusJB4 = bonusJB4 + recu_Força *5;
				bonus4.setText("Bonus: "+bonusJB4 /5);
				// PONTO
				numeroJB4 = numeroJB4 + recu_PForça;
				ponto4.setText("ponto "+numeroJB4);
				//BONUS
				bonusJB5 = bonusJB5 + recu_Vida;
				bonus5.setText("Bonus: "+bonusJB5 );
				
				Vida_M.setText(""+bonusJB5 );
				Vida_A.setText(""+bonusJB5 );				
				// PONTO
				numeroJB5 = numeroJB5 + recu_PVida;
				ponto5.setText("ponto "+numeroJB5);
				//BONUS
				bonusJB6 = bonusJB6 + recu_Mana;
				bonus6.setText("Bonus: "+bonusJB6);
				
				Mana_M.setText(""+bonusJB6 );
				Mana_A.setText(""+bonusJB6 );
				// PONTO
				numeroJB6 = numeroJB6 + recu_PMana;
				ponto6.setText("ponto "+numeroJB6);
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("O arquivo não existe ou não pode ser deletado");
			}
			
		}if(e.getSource()== jb1) {

			
			bonusJB1 = bonusJB1 +1;
			numeroJB1 = numeroJB1 +1;
			bonus1.setText("Bonus: "+bonusJB1 /5);
			ponto1.setText("ponto "+numeroJB1);
			DIS.setText(" "+ (bonusJB1 /10 +1+"M"));
			
		}if(e.getSource()== jb2) {
		bonusJB1 = bonusJB1 -1;
		numeroJB1 = numeroJB1 -1;
		bonus1.setText("Bonus: "+bonusJB1 / 5);
		ponto1.setText("ponto "+numeroJB1);
		DIS.setText(" "+(bonusJB1 /10 +1+"M"));
		}
		if(e.getSource()== jb3) {
		
		bonusJB2 = bonusJB2 +1;
		numeroJB2 = numeroJB2 +1;
		bonus2.setText("Bonus: "+bonusJB2 / 5);
		ponto2.setText("ponto "+numeroJB2);
		
		RF.setText(""+(numeroJB2 /10 -1 ));
		}if(e.getSource()== jb4) {

		bonusJB2 = bonusJB2 -1;
		numeroJB2 = numeroJB2 -1;
		bonus2.setText("Bonus: "+bonusJB2  / 5);
		ponto2.setText("ponto "+numeroJB2);
		RF.setText(""+(numeroJB2 /10 -1 ));
		}if(e.getSource()== jb5) {

		bonusJB3 = bonusJB3 +1;
		numeroJB3 = numeroJB3 +1;
		bonus3.setText("Bonus: "+bonusJB3 / 5);
		ponto3.setText("ponto "+numeroJB3);
		RM.setText(""+(bonusJB3 /10 -2));
		}if(e.getSource()== jb6) {
		bonusJB3 = bonusJB3 -1;
		numeroJB3 = numeroJB3 -1;
		bonus3.setText("Bonus: "+bonusJB3/ 5);
		ponto3.setText("ponto "+numeroJB3);
		RM.setText(""+(bonusJB3 /10 -2));
		}if(e.getSource()== jb7) {
		bonusJB4 = bonusJB4 +1;
		numeroJB4 = numeroJB4 +1;
		bonus4.setText("Bonus: "+bonusJB4/ 5);
		ponto4.setText("ponto "+numeroJB4);
		}if(e.getSource()== jb8) {
		bonusJB4 = bonusJB4 -1;
		numeroJB4 = numeroJB4 -1;
		bonus4.setText("Bonus: "+bonusJB4 / 5);
		ponto4.setText("ponto "+numeroJB4);
		}if(e.getSource()== jb9) {
		bonusJB5 = bonusJB5 +2;
		bonus5.setText("Bonus: "+bonusJB5);

		Vida_M.setText(""+bonusJB5 );
		Vida_A.setText(""+bonusJB5 );
		numeroJB5 = numeroJB5 +1;
		ponto5.setText("ponto "+numeroJB5);
		}if(e.getSource()== jb10) {
		bonusJB5 = bonusJB5 -2;
		Vida_M.setText(""+bonusJB5 );
		Vida_A.setText(""+bonusJB5 );
		bonus5.setText("Bonus: "+bonusJB5);
		numeroJB5 = numeroJB5 -1;
		ponto5.setText("ponto "+numeroJB5);

		}if(e.getSource()== jb11) {
		
		bonusJB6 = bonusJB6 +2;
		numeroJB6 = numeroJB6 +1;
		
		Mana_M.setText(""+bonusJB6 );
		Mana_A.setText(""+bonusJB6 );			
		
		bonus6.setText("Bonus: "+bonusJB6);
		ponto6.setText("ponto: "+numeroJB6);
		}if(e.getSource()== jb12) {
		bonusJB6 = bonusJB6 -2;
		numeroJB6 = numeroJB6 -2;
		
		Mana_M.setText(""+bonusJB6 );
		Mana_A.setText(""+bonusJB6 );	
		
		bonus6.setText("Bonus: "+bonusJB6);
		ponto6.setText("ponto: "+numeroJB6);
		
	}
		
		if(e.getSource() == Menos_Atual_Vida ) {
			
			bonusJB5 = bonusJB5 -1;
			Vida_A.setText(""+bonusJB5 );
			
			

		}if(e.getSource() == Mais_Atual_Vida) {
			
			bonusJB5 = bonusJB5 +1;
			Vida_A.setText(""+bonusJB5 );
			
			

		}if(e.getSource() == Menos_MANA_Vida) {
			
			bonusJB6 = bonusJB6 -1;
			
			Mana_A.setText(""+bonusJB6 );	
			
			
		}if(e.getSource() == Mais_MANA_Vida) {
			
			bonusJB6 = bonusJB6 +1;
			
			Mana_A.setText(""+bonusJB6 );		
			
			
			
		}
		
		
		
		if(e.getSource() == XP1) {
		XP = XP +1;
		XP_A.setText("XP Atual: "+ XP);
	}if(e.getSource() == XP10) {
		XP = XP +10;
		XP_A.setText("XP Atual: "+ XP);
	}
	if(e.getSource() == XP100) {
		XP = XP +100;
		XP_A.setText("XP Atual: "+ XP);
	}if(e.getSource() == XP1000) {
		XP = XP +1000;
		XP_A.setText("XP Atual: "+ XP);
	}if(e.getSource() == XP_LIMP) {
		XP = 0;
		XP_A.setText("XP Atual: "+ XP);
		
		NIVEL.setText("Nível Atual: " + 0);
		
	}if(e.getSource() == verifique) {
		
		String ElementoSelecionado = elemento.getSelectedItem().toString();
		String RaçaSelecionada = Raça.getSelectedItem().toString();
		
		
		// CALCULANDO NIVEL 		
		
		if(XP >= 9) {
			NIVEL.setText("Nível Atual: " + 1);
		}
		if(XP > 10) {
			NIVEL.setText("Nível Atual: " + 2);
		}if(XP > 100) {
			NIVEL.setText("Nível Atual: " + 3);
		}if(XP > 200) {
			NIVEL.setText("Nível Atual: " + 4);
		}if(XP > 400) {
			NIVEL.setText("Nível Atual: " + 5);
		}if(XP > 600) {
			NIVEL.setText("Nível Atual: " + 6);
		}if(XP > 1000) {
			NIVEL.setText("Nível Atual: " + 7);
		}if(XP > 3200) {
			NIVEL.setText("Nível Atual: " + 8);
		}if(XP > 3800) {
			NIVEL.setText("Nível Atual: " + 9);
		}if(XP > 4500) {
			NIVEL.setText("Nível Atual: " + 10);
		}if(XP > 5700) {
			NIVEL.setText("Nível Atual: " + 11);
		}if(XP > 6800) {
			NIVEL.setText("Nível Atual: " + 12);
		}if(XP > 7900) {
			NIVEL.setText("Nível Atual: " + 13);
		}if(XP > 9000) {
			NIVEL.setText("Nível Atual: " + 14);
		}if(XP > 9600) {
			NIVEL.setText("Nível Atual: " + 15);
		}if(XP > 10000) {
			NIVEL.setText("Nível Atual: " + 16);
		}if(XP > 10800) {
			NIVEL.setText("Nível Atual: " + 17);
		}if(XP > 12000) {
			NIVEL.setText("Nível Atual: " + 18);
		}if(XP > 12900) {
			NIVEL.setText("Nível Atual: " + 19);
		}if(XP > 14500) {
			NIVEL.setText("Nível Atual: " + 20);
		}
		
		////hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
		
		if(ElementoSelecionado == "fogo") {
			
			if(XP > (-1)) {
				JBoxElemento1.setText("+2 de PDH");
				JBoxElemento2.setText("");
				JBoxElemento3.setText("");
				}if(XP > 200) {
						JBoxElemento1.setText("+4 de PDH");
						}if(XP > 600) {
							JBoxElemento1.setText("+4 de PDH");
							JBoxElemento2.setText("+5 de Vida");
						}if(XP > 3200) {
							JBoxElemento1.setText("+5 de PDH");
							JBoxElemento2.setText("+5 de Vida");
						}if(XP > 6800) {
							JBoxElemento1.setText("+7 de PDH");
							JBoxElemento2.setText("+5 de Vida");
						}if(XP > 9000) {
							JBoxElemento1.setText("+7 de PDH");
							JBoxElemento2.setText("+5 de Vida");
							JBoxElemento3.setText("+1 ataque extra");
							
						}if(XP >12000) {
							JBoxElemento1.setText("+9 de PDH");
							JBoxElemento2.setText("+5 de Vida");
							JBoxElemento3.setText("+1 ataque extra");
						}if(XP > 14500) {
							JBoxElemento1.setText("+9 de PDH");
							JBoxElemento2.setText("+15 de Vida");
							JBoxElemento3.setText("+1 ataque extra");
						}
		}if(ElementoSelecionado == "agua") {
			
			if(XP >= -1 ) {
			JBoxElemento1.setText("+5 de Mana");
			JBoxElemento2.setText("");
			JBoxElemento3.setText("");
			}if(XP > 200 ) {
				JBoxElemento1.setText("+5 de Mana");
				JBoxElemento2.setText("+2 PDH");
			}if(XP >  400 ) {
				JBoxElemento1.setText("+10 de Mana");
				JBoxElemento2.setText("+2 PDH");
			}if(XP >  3200 ) {
				JBoxElemento1.setText("+10 de Mana");
				JBoxElemento2.setText("+2 PDH");
				JBoxElemento3.setText("+1 Inteligencia");
			}if(XP > 4500) {
				JBoxElemento1.setText("+15 de Mana");
				JBoxElemento2.setText("+2 PDH");
				JBoxElemento3.setText("+1 Inteligencia");
			}if(XP > 7900) {
				JBoxElemento1.setText("+15 de Mana");
				JBoxElemento2.setText("+4 PDH");
				JBoxElemento3.setText("+1 Inteligencia");
			}if(XP >  9600) {
				JBoxElemento1.setText("+15 de Mana + 5 de Vida");
				JBoxElemento2.setText("+4 PDH");
				JBoxElemento3.setText("+1 Inteligencia");
			}if(XP > 12000) {
				JBoxElemento1.setText("+15 de Mana + 5 de Vida");
				JBoxElemento2.setText("+6 PDH");
				JBoxElemento3.setText("+1 Inteligencia");
			}if(XP > 14500) {
				JBoxElemento1.setText("+20 de Mana + 5 de Vida");
				JBoxElemento2.setText("+6 PDH");
				JBoxElemento3.setText("+1 Inteligencia");
			}
		}if(ElementoSelecionado == "terra") {
			if(XP >= -1 ) {
				JBoxElemento1.setText("+5 de Mana");
				JBoxElemento2.setText("");
				JBoxElemento3.setText("");
		  }if(XP > 10) {
				JBoxElemento1.setText("+5 de Mana +5 Vida");
				JBoxElemento2.setText("");
				JBoxElemento3.setText("");
		  }if(XP > 200) {
				JBoxElemento1.setText("+5 de Mana +5 Vida");
				JBoxElemento2.setText("+1 Força");
				JBoxElemento3.setText("");
		  }if(XP > 600) {
			  JBoxElemento1.setText("+5 de Mana +5 Vida");
				JBoxElemento2.setText("+1 Força");
				JBoxElemento3.setText("+2 Resistencia");
		  }if(XP > 3200) {
			  JBoxElemento1.setText("+5 de Mana +10 Vida");
				JBoxElemento2.setText("+1 Força");
				JBoxElemento3.setText("+2 Resistencia");
		  }if(XP > 4500) {
			  JBoxElemento1.setText("+5 de Mana +10 Vida");
				JBoxElemento2.setText("+1 Força");
				JBoxElemento3.setText("+4 Resistencia");
		  }if (XP > 6800) {
			  // LEVEL 12
			  JBoxElemento1.setText("+5 de Mana +10 Vida");
				JBoxElemento2.setText("+2 Força");
				JBoxElemento3.setText("+4 Resistencia");
		  }if(XP >  9000) {
			  JBoxElemento1.setText("+5 de Mana +15 Vida");
				JBoxElemento2.setText("+2 Força");
				JBoxElemento3.setText("+4 Resistencia");
		  }if(XP >  10000) {
			  JBoxElemento1.setText("+5 de Mana +15 Vida");
				JBoxElemento2.setText("+2 Força");
				JBoxElemento3.setText("+6 Resistencia");
			  
		  }if(XP >  12000) {
			  JBoxElemento1.setText("+5 de Mana +15 Vida");
				JBoxElemento2.setText("+3 Força");
				JBoxElemento3.setText("+6 Resistencia");
			  
		  }if(XP >  14500) {
			  JBoxElemento1.setText("+5 de Mana +15 Vida");
				JBoxElemento2.setText("+2 Força");
				JBoxElemento3.setText("+8 Resistencia");
			  
		  }
		}if(ElementoSelecionado == "Ar") {
			if(XP >=  -1) {
				JBoxElemento1.setText("+1 destreza");
				JBoxElemento2.setText("");
				JBoxElemento3.setText("");
			}if(XP > 200) {
				JBoxElemento1.setText("+1 destreza");
				JBoxElemento2.setText("+2 PDH");
				JBoxElemento3.setText("");
			}if(XP > 600) {
				 //LEVEL 6
				JBoxElemento1.setText("+1 destreza");
				JBoxElemento2.setText("+2 PDH");
				JBoxElemento3.setText("-1 em tempo de carga");
			}if(XP > 3200) {
				 
				JBoxElemento1.setText("+5 Mana");
				JBoxElemento2.setText("+2 PDH + 1 destreza");
				JBoxElemento3.setText("-1 em tempo de carga");
			}if(XP > 4500) {
				 
				JBoxElemento1.setText("+5 Mana");
				JBoxElemento2.setText("+2 PDH + 3 destreza");
				JBoxElemento3.setText("-1 em tempo de carga");
			}if(XP > 6800) {
				 
				JBoxElemento1.setText("+5 Mana");
				JBoxElemento2.setText("+2 PDH + 3 destreza");
				JBoxElemento3.setText("-2 em tempo de carga");
			}if(XP >  9000) {
				 
				JBoxElemento1.setText("+5 Mana");
				JBoxElemento2.setText("+2 PDH + 5 destreza");
				JBoxElemento3.setText("-2 em tempo de carga");
			}if(XP >  10000) {
				 
				JBoxElemento1.setText("+5 Mana");
				JBoxElemento2.setText("+4 PDH + 5 destreza");
				JBoxElemento3.setText("-2 em tempo de carga");
			}if(XP >  12000) {
				 
				JBoxElemento1.setText("+10 Mana");
				JBoxElemento2.setText("+4 PDH + 5 destreza");
				JBoxElemento3.setText("-2 em tempo de carga");
			}if(XP >  14500) {
				  JBoxElemento1.setText("+10 Mana");
					JBoxElemento2.setText("+4 PDH + 5 destreza");
					JBoxElemento3.setText("-6 em tempo de carga");
				  
			  }
		}
		
		if(RaçaSelecionada == "Humano") {
			
			
			JBoxRaca1.setText("Inicia com +5 V e +5 M");
			JBoxRaca2.setText("+3 de Vida Por nivel");
			JBoxRaca3.setText("+3 de Mana Por nivel");
		}if(RaçaSelecionada == "Meio Demonio") {
			
			
			JBoxRaca1.setText("Inicia com +5 V +4 M +1 A/f");
			JBoxRaca2.setText("+4 de Vida Por nivel");
			JBoxRaca3.setText("+1 de Resist a cada 2 niveis");
		}if(RaçaSelecionada == "Vampiro") {
			
			JBoxRaca1.setText("Inicia com +5 V +10 M -3 A/f");
			JBoxRaca2.setText("+1 de Vida a cada 2 níveis");
			JBoxRaca3.setText("+4 de Mana por nível");
		}if(RaçaSelecionada == "Asimar") {
			
			JBoxRaca1.setText("Inicia com -2 A/f +2 D +5 M");
			JBoxRaca2.setText("+3 de Vida a cada 2 níveis");
			JBoxRaca3.setText("+2 de mana por nível");
		}if(RaçaSelecionada == "Renacido") {
			
			JBoxRaca1.setText("Inicia com 10 V +2 a/m");
			JBoxRaca2.setText("+5 de vida por nível");
			JBoxRaca3.setText("+1 de a/m a cada 2 níveis");
			
			RM.setText(""+(bonusJB3 +2));
		}
		
	}
	
		
	}
	
	// METODO MAIN
	public static void main (String []args) {
		new ficha2();
	}

}
