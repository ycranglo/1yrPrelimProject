import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel JPane;
	private JRadioButton rdoPepperoni,rdoHamAndCheese,rdoHawaiian, rdoLarge,rdoMedium,rdoSmallSized;
	private JButton btnCreateOrder,btnNewOrder;
	private JLabel lblPizza1;
	private JLabel lblPizza2;
	private JLabel lblPizza3;
	private JLabel lblPizza4;
	private JLabel lblPizza5;
	private JLabel lblPizza6,lblPizzaAdd;
	private JCheckBox chkPepper,chkOnions,chkBlankOlives,chkGreenPeppers,chkExtraCheese;
	private JLabel lblPizzaAdd1;
	private JLabel lblPizzaAdd2;
	private JLabel lblPizzaAdd3;
	private JLabel lblPizzaAdd4;
	private JLabel lblSelectFlavor;
	private JLabel lblAddOns;
	private JLabel lblSized;
	private JTextField txtBgColor1;
	private JLabel lblPricesLarge, lblPricesMedium,lblPricesSmall;
	private JLabel lblPepperPrice;
	private JLabel lblOnionPrice;
	private JLabel lblBlackOlivePrice;
	private JLabel lblGreenpepperPrice;
	private JLabel lblCheesePrice;
	private JTextField txtBgColor2;
	private JTextField txtBgColor3;
	 private JTextArea txtADisplay;
	 
	  	int Price=0;
		
		 String Flavor,Size;
		 private JTextField textField;
	 
	
	 
	
	
			
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("PIIZZAHATS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 751);
		JPane = new JPanel();
		JPane.setBackground(new Color(139, 0, 0));
		JPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(JPane);
		JPane.setLayout(null);
		setLocationRelativeTo(null);
		
		 btnCreateOrder = new JButton("CREATE ORDER");
		 btnCreateOrder.setFont(new Font("Arial Black", Font.BOLD, 12));
		 btnCreateOrder.setForeground(new Color(0, 0, 0));
		 

		 btnCreateOrder.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		
		 		int BlackOlives= 15;
		 		 int pepper =5;
		 		 int onions=10;
		 		 int ExtraCheese=25;
		 		 int GreenPeppper=20;
		 		 int ToppingsAdd=0;
		 		 String TopingsName="";
		 		 
		 		 /*
		 		  * execute code inside of block, dito gagana lahat basta chineck.
		 		  */
				 if(chkPepper.isSelected()==true) {
					 ToppingsAdd=ToppingsAdd+pepper;	 
					 TopingsName=TopingsName+"        "+"\n"+"                   pepper"+"\n";
				 } if(chkOnions.isSelected()==true) {
					 ToppingsAdd=ToppingsAdd+onions;
					 TopingsName=TopingsName+"        "+"\n"+"                   onions"+"\n";
				 } if(chkBlankOlives.isSelected()==true) {
					 ToppingsAdd=ToppingsAdd+BlackOlives;	
					 TopingsName=TopingsName+"        "+"\n"+"                   BlackOlives"+"\n";
				 } if(chkGreenPeppers.isSelected()==true) {
					 ToppingsAdd=ToppingsAdd+GreenPeppper;	
					 TopingsName=TopingsName+"        "+"\n"+"                   GreenPeppper"+"\n";
				 } if(chkExtraCheese.isSelected()==true) {
					 ToppingsAdd=ToppingsAdd+ExtraCheese;
					 TopingsName=TopingsName+"        "+"\n"+"                   ExtraCheese"+"\n";
				 }
				 
				 /*
				  * execute code, kapag na satisfy yung dalawang statement(if and if else) mag r-run yung sa loob.
				  */
				
					if(rdoSmallSized.isSelected()==true&& rdoHawaiian.isSelected()==true) {
		 				 Flavor="HAWAIIAN";
		 			 	Price = 90;
		 		       	Size="SMALL-SIZED";	
					} else if(rdoMedium.isSelected()==true&& rdoHawaiian.isSelected()==true) {
		 				 Flavor="HAWAIIAN";
		 			 	Price = 110;
		 		       	Size="MEDUIM-SIZED";	
		 			} else if(rdoLarge.isSelected()==true&& rdoHawaiian.isSelected()==true){
		 				 Flavor="HAWAIIAN";
			 			 	Price = 130;
			 		       	Size="LARGE-SIZED";
		 			}else if(rdoSmallSized.isSelected()==true&& rdoHamAndCheese.isSelected()==true) {
		 				 Flavor="HAM AND CHEESE";
			 			 	Price = 110;
			 		       	Size="SMALL-SIZED";
		 			}else if(rdoMedium.isSelected()==true&& rdoHamAndCheese.isSelected()==true) {
		 				 Flavor="HAM AND CHEESE";
			 			 	Price = 130;
			 		       	Size="MEDUIM-SIZED";
		 			}else if(rdoLarge.isSelected()==true&& rdoHamAndCheese.isSelected()==true) {
		 				 Flavor="HAM AND CHEESE";
			 			 	Price = 150;
			 		       	Size="LARGE-SIZED";
		 			}else if(rdoSmallSized.isSelected()==true&& rdoPepperoni.isSelected()==true) {
		 				 Flavor="PEPPIRONI";
			 			 	Price = 130;
			 		       	Size="SMALL-SIZED";
		 			}else if(rdoMedium.isSelected()==true && rdoPepperoni.isSelected()==true) {
		 				 Flavor="PEPPIRONI";
			 			 	Price = 150;
			 		       	Size="MEDUIM-SIZED";
		 			}else if(rdoLarge.isSelected()==true&&rdoPepperoni.isSelected()==true) {
		 				 Flavor="PEPPIRONI";
			 			 	Price = 170;
			 		       	Size="LARGE-SIZED";	      
		 			} 
					/*
					 * ilagay lang jan kung ano ibig sabihin nung \n enter or new line.
					 * tapos, yung size naman, yun yung size ng pizza
					 * tapos yung toppings den na inadd niya.
					 * yung price all, yan yung price ng size tapos yung toppings, kung magkano yung toppings.
					 * 
					 */
					 int PriceAll=Price+ToppingsAdd;
					 txtADisplay.append("\n"+"\n"+"\n"+""
				              + "PIZZA FLAVOR        :"+Flavor+
				              "\n"+"\n"+"\n"+"PIZA SIZE                  :"+Size
				              +"\n"+"\n"+"\n"+"ADD ONS        :"
				              +"\n"+TopingsName
				              +"\n"+"\n"+"\n"+"TOTAL PRICE   :"+"₱"+PriceAll);
					 btnCreateOrder.setEnabled(false);
					 btnNewOrder.setEnabled(true);
					 
		 	}
		 	
		 }						
		 );
		 btnCreateOrder.setBackground(new Color(238, 232, 170));
		btnCreateOrder.setBounds(164, 637, 197, 48);
		JPane.add(btnCreateOrder);
		
		 rdoHawaiian = new JRadioButton("HAWAIIAN");
		 rdoHawaiian.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		/*
		 		 * ayan set text lang yan kung magkano, kapag sinelect yung  flavor
		 		 */
		 		lblPricesSmall.setText("₱ 90 ");
		 		lblPricesMedium.setText("₱ 110 ");
		 		lblPricesLarge.setText("₱ 130 ");
         

		 	}
		 });
		 rdoHawaiian.setSelected(true);
		 rdoHawaiian.setBackground(new Color(238, 232, 170));
		rdoHawaiian.setBounds(19, 64, 144, 31);
		JPane.add(rdoHawaiian);
		/*
 		 * ayan set text lang yan kung magkano, kapag sinelect yung  flavor
 		 */
		 rdoHamAndCheese = new JRadioButton("HAM AND CHEESE");
		 rdoHamAndCheese.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		lblPricesSmall.setText("₱ 110 ");
		 		lblPricesMedium.setText("₱ 130 ");
		 		lblPricesLarge.setText("₱ 150 ");
		 	
		 	}
		 });
		 rdoHamAndCheese.setBackground(new Color(238, 232, 170));
		rdoHamAndCheese.setBounds(19, 98, 144, 31);
		JPane.add(rdoHamAndCheese);
		
		 rdoPepperoni = new JRadioButton("PEPPIRONI");
		 rdoPepperoni.addActionListener(new ActionListener() {
			 /*
		 		 * ayan set text lang yan kung magkano, kapag sinelect yung  flavor
		 		 */
		 	public void actionPerformed(ActionEvent e) {
		 		lblPricesSmall.setText("₱ 130 ");
		 		lblPricesMedium.setText("₱ 150 ");
		 		lblPricesLarge.setText("₱ 170 ");
		 		
		 	
		 	}
		 });
		 rdoPepperoni.setBackground(new Color(238, 232, 170));
		rdoPepperoni.setBounds(19, 132, 144, 31);
		JPane.add(rdoPepperoni);
		/*
		 * lahat ng flavor ay ginurupo para isa lang ang pwede piliin.
		 */
		ButtonGroup Flavor = new ButtonGroup();
		Flavor.add(rdoHamAndCheese);
		Flavor.add( rdoHawaiian);
		Flavor.add(rdoPepperoni);
		
		
		
		
		 lblPizza1 = new JLabel("");
		Image PicScreen=new ImageIcon(this.getClass().getResource("/PiZA.png")).getImage();
		lblPizza1.setIcon(new ImageIcon(PicScreen));
		lblPizza1.setBounds(169, 72, 41, 23);
		JPane.add(lblPizza1);
		
		lblPizza2 = new JLabel("");
		Image PicScreen1=new ImageIcon(this.getClass().getResource("/pizzaQ.png")).getImage();
		lblPizza2.setIcon(new ImageIcon(PicScreen1));
		lblPizza2.setBounds(169, 98, 32, 31);
		JPane.add(lblPizza2);
		
		lblPizza3 = new JLabel("");
		Image PicScreen2=new ImageIcon(this.getClass().getResource("/pizzaw.png")).getImage();
		lblPizza3.setIcon(new ImageIcon(PicScreen2));
		lblPizza3.setBounds(169, 140, 32, 23);
		JPane.add(lblPizza3);
		
		 rdoSmallSized = new JRadioButton("SMALL-SIZED");
		 rdoSmallSized.setSelected(true);
		 rdoSmallSized.setBackground(new Color(238, 232, 170));
		rdoSmallSized.setBounds(336, 64, 144, 31);
		JPane.add(rdoSmallSized);
		
		 rdoMedium = new JRadioButton("MEDUIM-SIZED");
		 rdoMedium.setBackground(new Color(238, 232, 170));
		rdoMedium.setBounds(336, 98, 144, 31);
		JPane.add(rdoMedium);
		
		 rdoLarge = new JRadioButton("LARGE-SIZED");
		 rdoLarge.setBackground(new Color(238, 232, 170));
		rdoLarge.setBounds(336, 132, 144, 31);
		JPane.add(rdoLarge);
		/*
		 * lahat ng flavor ay ginurupo para isa lang ang pwede piliin.
		 */
		ButtonGroup Sized = new ButtonGroup();
		 Sized.add(rdoSmallSized);
		 Sized.add( rdoMedium);
		 Sized.add(rdoLarge);
	   
		 
		 lblPizza4 = new JLabel("");
		 Image PicScreen3=new ImageIcon(this.getClass().getResource("/pizzae.png")).getImage();
		 lblPizza4.setIcon(new ImageIcon(PicScreen3));
		 lblPizza4.setBounds(484, 64, 48, 39);
		 JPane.add(lblPizza4);
		 
		 lblPizza5 = new JLabel("");
		 Image PicScreen4=new ImageIcon(this.getClass().getResource("/pizzae.png")).getImage();
		 lblPizza5.setIcon(new ImageIcon(PicScreen4));
		 lblPizza5.setBounds(486, 132, 46, 39);
		 JPane.add(lblPizza5);
		 
		 lblPizza6 = new JLabel("");
		 Image PicScreen5=new ImageIcon(this.getClass().getResource("/pizzae.png")).getImage();
		 lblPizza6.setIcon(new ImageIcon(PicScreen5));
		 lblPizza6.setBounds(486, 98, 46, 39);
		 JPane.add(lblPizza6);
		 
		  chkPepper = new JCheckBox("PEPPER");
		  
		
		 chkPepper.setBackground(new Color(238, 232, 170));
		 chkPepper.setBounds(19, 297, 144, 31);
		 JPane.add(chkPepper);
		 
		 chkOnions = new JCheckBox("ONIONS");
		 chkOnions.setBackground(new Color(238, 232, 170));
		 chkOnions.setBounds(19, 327, 144, 31);
		 JPane.add(chkOnions);
		 
		  chkBlankOlives = new JCheckBox("BLANK OLIVES");
		 chkBlankOlives.setBackground(new Color(238, 232, 170));
		 chkBlankOlives.setBounds(19, 361, 144, 31);
		 JPane.add(chkBlankOlives);
		 
		  chkGreenPeppers = new JCheckBox("GREEN PEPPERS");
		 chkGreenPeppers.setBackground(new Color(238, 232, 170));
		 chkGreenPeppers.setBounds(19, 395, 144, 31);
		 JPane.add(chkGreenPeppers);
		 
		 chkExtraCheese = new JCheckBox("EXTRA CHEESE");
		 chkExtraCheese.setBackground(new Color(238, 232, 170));
		 chkExtraCheese.setBounds(19, 429, 144, 31);
		 JPane.add(chkExtraCheese);
		 
		 lblPizzaAdd = new JLabel("");
		 Image PicScreen6=new ImageIcon(this.getClass().getResource("/peeper.png")).getImage();
		 lblPizzaAdd.setIcon(new ImageIcon(PicScreen6));
		 lblPizzaAdd.setBounds(170, 293, 32, 31);
		 JPane.add(lblPizzaAdd);
		 
		 lblPizzaAdd1 = new JLabel("");
							
		 lblPizzaAdd1.setBounds(169, 327, 32, 31);
		 JPane.add(lblPizzaAdd1);
		 
		 lblPizzaAdd2 = new JLabel("");
		 Image PicScreen8=new ImageIcon(this.getClass().getResource("/Olives.png")).getImage();
		 lblPizzaAdd2.setIcon(new ImageIcon(PicScreen8));
		 lblPizzaAdd2.setBounds(169, 361, 32, 31);
		 JPane.add(lblPizzaAdd2);
		 
		 lblPizzaAdd3 = new JLabel("");
		 Image PicScreen9=new ImageIcon(this.getClass().getResource("/GreenPepper.png")).getImage();
		 lblPizzaAdd3.setIcon(new ImageIcon(PicScreen9));
		 lblPizzaAdd3.setBounds(169, 395, 32, 31);
		 JPane.add(lblPizzaAdd3);
		 
		 lblPizzaAdd4 = new JLabel("");
		 Image PicScreen10=new ImageIcon(this.getClass().getResource("/cheese.png")).getImage();
		 lblPizzaAdd4.setIcon(new ImageIcon(PicScreen10));
		 lblPizzaAdd4.setBounds(170, 429, 40, 31);
		 JPane.add(lblPizzaAdd4);
		 
		 lblSelectFlavor = new JLabel("SELECT FLAVOR");
		 lblSelectFlavor.setFont(new Font("Arial Black", Font.BOLD, 12));
		 lblSelectFlavor.setHorizontalAlignment(SwingConstants.CENTER);
		 lblSelectFlavor.setBounds(19, 43, 141, 14);
		 JPane.add(lblSelectFlavor);
		 
		 lblAddOns = new JLabel("SELECT ADD-ONS");
		 lblAddOns.setForeground(Color.BLACK);
		 lblAddOns.setHorizontalAlignment(SwingConstants.CENTER);
		 lblAddOns.setFont(new Font("Arial Black", Font.BOLD, 12));
		 lblAddOns.setBounds(19, 272, 141, 14);
		 JPane.add(lblAddOns);
		 
		 lblSized = new JLabel("SELECT SIZE");
		 lblSized.setHorizontalAlignment(SwingConstants.CENTER);
		 lblSized.setFont(new Font("Arial Black", Font.BOLD, 12));
		 lblSized.setBounds(336, 43, 144, 14);
		 JPane.add(lblSized);
		 
		 txtBgColor1 = new JTextField();
		 txtBgColor1.setEnabled(false);
		 txtBgColor1.setBackground(new Color(240, 230, 140));
		 txtBgColor1.setBounds(19, 48, 229, 157);
		 JPane.add(txtBgColor1);
		 txtBgColor1.setColumns(10);
		 
		  lblPricesSmall = new JLabel("");
		  lblPricesSmall.setText("\u20B1 90 ");
	 	
		 lblPricesSmall.setBounds(107, 527, 67, 14);
		 JPane.add(lblPricesSmall);
		 
		  lblPricesMedium = new JLabel(""); 
	 		lblPricesMedium.setText("\u20B1 110 ");
		 lblPricesMedium.setBounds(107, 572, 67, 14);
		 JPane.add(lblPricesMedium);
		 
		  lblPricesLarge = new JLabel("");
	 		lblPricesLarge.setText("\u20B1 130 ");
		 lblPricesLarge.setBounds(107, 619, 67, 14);
		 JPane.add(lblPricesLarge);
		 
		 lblPepperPrice = new JLabel("₱  5");
		 lblPepperPrice.setHorizontalAlignment(SwingConstants.CENTER);
		 lblPepperPrice.setBounds(198, 297, 41, 23);
		 JPane.add(lblPepperPrice);
		 
		 lblOnionPrice = new JLabel("   \u20B1 10");
		 lblOnionPrice.setBounds(198, 327, 46, 23);
		 JPane.add(lblOnionPrice);
		 
		 lblBlackOlivePrice = new JLabel("   \u20B1 15");
		 lblBlackOlivePrice.setBounds(198, 361, 46, 23);
		 JPane.add(lblBlackOlivePrice);
		 
		 lblGreenpepperPrice = new JLabel("   \u20B1 20");
		 lblGreenpepperPrice.setBounds(198, 395, 46, 23);
		 JPane.add(lblGreenpepperPrice);
		 
		 lblCheesePrice = new JLabel("   \u20B1 25");
		 lblCheesePrice.setBounds(198, 429, 46, 23);
		 JPane.add(lblCheesePrice);
		 
		 txtBgColor2 = new JTextField();
		 txtBgColor2.setEnabled(false);
		 txtBgColor2.setColumns(10);
		 txtBgColor2.setBackground(new Color(240, 230, 140));
		 txtBgColor2.setBounds(287, 28, 290, 157);
		 JPane.add(txtBgColor2);
		 
		 txtBgColor3 = new JTextField();
		 txtBgColor3.setEnabled(false);
		 txtBgColor3.setColumns(10);
		 txtBgColor3.setBackground(new Color(240, 230, 140));
		 txtBgColor3.setBounds(10, 269, 229, 237);
		 JPane.add(txtBgColor3);
		 
		  txtADisplay = new JTextArea();
		  txtADisplay.setEditable(false);
		  txtADisplay.setFont(new Font("Serif", Font.PLAIN, 12));
		 txtADisplay.setBounds(287, 196, 290, 419);
		 JPane.add(txtADisplay);
		 
		 JLabel lblPriceName1 = new JLabel("SMALL    :");
		 lblPriceName1.setBounds(23, 519, 61, 31);
		 JPane.add(lblPriceName1);
		 
		 JLabel lblPriceName3 = new JLabel("MEDIUM  :");
		 lblPriceName3.setBounds(23, 564, 61, 31);
		 JPane.add(lblPriceName3);
		 
		 JLabel lblPriceName2 = new JLabel("LARGE    :");
		 lblPriceName2.setBounds(23, 611, 61, 31);
		 JPane.add(lblPriceName2);
		 
		 textField = new JTextField();
		 textField.setEnabled(false);
		 textField.setColumns(10);
		 textField.setBackground(new Color(240, 230, 140));
		 textField.setBounds(10, 518, 144, 133);
		 JPane.add(textField);
		 
		  btnNewOrder = new JButton("NEW ORDER");
		 btnNewOrder.setEnabled(false);
		 btnNewOrder.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		/*
		 		 * nagbubura naman ito ng text area. pati napipindot yung create button, pati hindi napipindot yung new button.
		 		 */
		 		txtADisplay.setText(null);
		 		btnCreateOrder.setEnabled(true);
		 		 btnNewOrder.setEnabled(false);
		 		chkPepper.setSelected(false);
		 		chkOnions.setSelected(false);
		 		chkBlankOlives.setSelected(false);
		 		chkGreenPeppers.setSelected(false);
		 		chkExtraCheese.setSelected(false);
		 	}
		 });
		 btnNewOrder.setForeground(Color.BLACK);
		 btnNewOrder.setFont(new Font("Arial Black", Font.BOLD, 12));
		 btnNewOrder.setBackground(new Color(238, 232, 170));
		 btnNewOrder.setBounds(380, 637, 197, 48);
		 JPane.add(btnNewOrder);
	}
}