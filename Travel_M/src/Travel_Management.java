import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;

public class Travel_Management {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSub_Total;
	private JTextField txtTotal;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicket_no;
	private JTextField txtPrice;
	private JTextField txtRoute;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travel_Management window = new Travel_Management();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Travel_Management() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Verdana", Font.BOLD, 22));
		frame.setBounds(0,0, 1370,700 );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(12, 13, 1328, 63);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Flight Ticket Booking Portal");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Type");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 24));
		lblNewLabel_1.setBounds(12, 89, 479, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rbtnStandard = new JRadioButton("Standard");
		rbtnStandard.setSelected(true);
		buttonGroup.add(rbtnStandard);
		rbtnStandard.setFont(new Font("Verdana", Font.BOLD, 22));
		rbtnStandard.setBounds(8, 171, 168, 25);
		frame.getContentPane().add(rbtnStandard);
		
		JRadioButton rbtnEconomy = new JRadioButton("Economy");
		buttonGroup.add(rbtnEconomy);
		rbtnEconomy.setFont(new Font("Verdana", Font.BOLD, 22));
		rbtnEconomy.setBounds(8, 224, 168, 25);
		frame.getContentPane().add(rbtnEconomy);
		
		JRadioButton rbtnFirst_class = new JRadioButton("First class");
		buttonGroup.add(rbtnFirst_class);
		rbtnFirst_class.setFont(new Font("Verdana", Font.BOLD, 22));
		rbtnFirst_class.setBounds(12, 280, 164, 25);
		frame.getContentPane().add(rbtnFirst_class);
		
		JRadioButton rbtnChild = new JRadioButton("Child");
		buttonGroup_2.add(rbtnChild);
		rbtnChild.setFont(new Font("Verdana", Font.BOLD, 22));
		rbtnChild.setBounds(398, 224, 95, 25);
		frame.getContentPane().add(rbtnChild);
		
		JRadioButton rbtnAdult = new JRadioButton("Adult");
		rbtnAdult.setSelected(true);
		buttonGroup_2.add(rbtnAdult);
		rbtnAdult.setFont(new Font("Verdana", Font.BOLD, 22));
		rbtnAdult.setBounds(398, 171, 95, 25);
		frame.getContentPane().add(rbtnAdult);
		
		JRadioButton rbtnReturn_Ticket = new JRadioButton("Return Ticket");
		buttonGroup_1.add(rbtnReturn_Ticket);
		rbtnReturn_Ticket.setFont(new Font("Verdana", Font.BOLD, 22));
		rbtnReturn_Ticket.setBounds(180, 224, 198, 25);
		frame.getContentPane().add(rbtnReturn_Ticket);
		
		JRadioButton rbtnSingle_Ticket = new JRadioButton("Single Ticket");
		buttonGroup_1.add(rbtnSingle_Ticket);
		rbtnSingle_Ticket.setSelected(true);
		rbtnSingle_Ticket.setFont(new Font("Verdana", Font.BOLD, 22));
		rbtnSingle_Ticket.setBounds(180, 171, 198, 25);
		frame.getContentPane().add(rbtnSingle_Ticket);
		
		JComboBox destination = new JComboBox();
		destination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Ahmedabad", "Dubai", "Hongkong", "London"}));
		destination.setFont(new Font("Verdana", Font.BOLD, 22));
		destination.setBounds(148, 341, 210, 36);
		frame.getContentPane().add(destination);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 138, 479, 22);
		frame.getContentPane().add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(12, 393, 479, 22);
		frame.getContentPane().add(separator_2);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Verdana", Font.BOLD, 22));
		lblTax.setBounds(12, 414, 90, 38);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSub_Total = new JLabel("Sub Total");
		lblSub_Total.setFont(new Font("Verdana", Font.BOLD, 22));
		lblSub_Total.setBounds(12, 475, 128, 37);
		frame.getContentPane().add(lblSub_Total);
		
		JLabel lbltotal = new JLabel("Total");
		lbltotal.setToolTipText("Total Cost of Ticket");
		lbltotal.setFont(new Font("Verdana", Font.BOLD, 22));
		lbltotal.setBounds(12, 525, 106, 37);
		frame.getContentPane().add(lbltotal);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Verdana", Font.BOLD, 17));
		txtTax.setBounds(201, 417, 157, 37);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSub_Total = new JTextField();
		txtSub_Total.setFont(new Font("Verdana", Font.BOLD, 17));
		txtSub_Total.setBounds(201, 477, 157, 37);
		frame.getContentPane().add(txtSub_Total);
		txtSub_Total.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Verdana", Font.BOLD, 17));
		txtTotal.setBounds(201, 527, 157, 37);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(12, 577, 479, 22);
		frame.getContentPane().add(separator_3);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				double tax=13;
				double Miles8=225.52;
				double Miles9=450.69;
				double Miles10=526.47;
				double Miles11=650.71;
				double totalcost,eco=225 , fclass =330.45;
				
///////////////////////////////////----LONDON--------------STANDARD-------------------////////////////////////////////////////
				
				 if((rbtnStandard.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnAdult.isSelected())//Adult singlestandard
						&& destination.getSelectedItem().equals("London"))
						{
					totalcost=(tax*Miles8)/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles8);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles8+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnStandard.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnAdult.isSelected())//Adult return standard
						&& destination.getSelectedItem().equals("London"))
						{
					totalcost=((tax*Miles8)/100)*2;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles8*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles8*2+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("Return");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnStandard.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnChild.isSelected())//Child Single standard
						&& destination.getSelectedItem().equals("London")) 
						{
					totalcost=(tax*Miles8)/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles8-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles8+totalcost-15));
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("Nil");//adult
					txtChild.setText("ONE");//child
						
						}
				else if((rbtnStandard.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnChild.isSelected())//child_return standard
						&& destination.getSelectedItem().equals("London"))
						{
					totalcost=tax*(Miles8*2-15)/100;
					String sTax=String.format("$%.2f", totalcost	);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles8*2-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles8*2+totalcost)-15);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("Return");
					txtAdult.setText("NIL");//Adult
					txtChild.setText("ONE");//child
						
						}
				
///////////////////////////////////----HONKONG--------------STANDARD-------------------////////////////////////////////////////
				
				else if((rbtnStandard.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult single standard
						&& destination.getSelectedItem().equals("Hongkong"))
						{
					totalcost=(tax*Miles9)/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles9);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles9+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				else if((rbtnStandard.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult return standard
						&& destination.getSelectedItem().equals("Hongkong"))
						{
					totalcost=((tax*Miles9)/100)*2;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles9*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles9*2+totalcost));
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("Return");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnStandard.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnChild.isSelected())//child single standard
						&& destination.getSelectedItem().equals("Hongkong"))
						{
					totalcost=(tax*Miles9)/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles9-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles9+totalcost-15));
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("Nil");//adult
					txtChild.setText("ONE");//child
						
						}
				else if((rbtnStandard.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnChild.isSelected())//child_return standard
						&& destination.getSelectedItem().equals("Hongkong"))
						{
					totalcost=tax*(Miles9*2-15)/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles9*2-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles9*2+totalcost)-15);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("Return");
					txtAdult.setText("NIL");//Adult
					txtChild.setText("ONE");//child
						
						}
///////////////////////////////////----DUBAI--------------STANDARD-------------------////////////////////////////////////////
				
				
				else if((rbtnStandard.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult single standard
						&& destination.getSelectedItem().equals("Dubai"))
						{
					totalcost=(tax*Miles10)/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles10);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles10+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				else if((rbtnStandard.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult return standard
						&& destination.getSelectedItem().equals("Dubai"))
						{
					totalcost=((tax*Miles10)/100)*2;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles10*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles10*2+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("Return");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				 
				else if((rbtnStandard.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnChild.isSelected())//child single standard
						&& destination.getSelectedItem().equals("Dubai"))
						{
					totalcost=(tax*Miles10)/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles10-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles10+totalcost-15));
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("Nil");//adult
					txtChild.setText("ONE");//child
						
						}
				else if((rbtnStandard.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnChild.isSelected())//child_return standard
						&& destination.getSelectedItem().equals("Dubai"))
						{
					totalcost=tax*(Miles10*2-15)/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles10*2-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles10*2+totalcost)-15);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("Return");
					txtAdult.setText("NIL");//Adult
					txtChild.setText("ONE");//child
						
						}
///////////////////////////////////----AHMEDABAD--------------STANDARD-------------------////////////////////////////////////////
				
				else if((rbtnStandard.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult single standard
						&& destination.getSelectedItem().equals("Ahmedabad"))
						{
					totalcost=(tax*Miles11)/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles11);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles11+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				else if((rbtnStandard.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult return standard
						&& destination.getSelectedItem().equals("Ahmedabad"))
						{
					totalcost=((tax*Miles11)/100)*2;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles11*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles11+totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("Return");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnStandard.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnChild.isSelected())//child single standard
						&& destination.getSelectedItem().equals("Ahmedabad"))
						{
					totalcost=(tax*Miles11)/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles11-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles11+totalcost)-15);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("Nil");//adult
					txtChild.setText("ONE");//child
						
						}
				else if((rbtnStandard.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnChild.isSelected())//child_return standard
						&& destination.getSelectedItem().equals("Ahmedabad"))
						{
					totalcost=(tax*Miles11)/100;
					String sTax=String.format("$%.2f", totalcost-15);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles11*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",((Miles11+totalcost)*2)-15);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Standard");
					txtTicket.setText("Return");
					txtAdult.setText("NIL");//Adult
					txtChild.setText("ONE");//child
						
						}
				 
	/////////////////////////////////////--------LONDON-----------ECONOMY---------------------/////////////////////////////////////////////////
				 
				else if((rbtnEconomy.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnAdult.isSelected())//Adult single Economy
						&& destination.getSelectedItem().equals("London"))
						{
					totalcost=(tax*(Miles8+eco))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles8+eco);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles8+eco+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnEconomy.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnAdult.isSelected())//Adult return Economy
						&& destination.getSelectedItem().equals("London"))
						{
					totalcost=((tax*(Miles8+eco))/100)*2;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles8+eco)*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles8+eco)*2+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("Return");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnEconomy.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnChild.isSelected())// childe single economy
						&& destination.getSelectedItem().equals("London"))
						{
					totalcost=(tax*(Miles8+eco))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles8+eco-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",((Miles8+eco)-15 + totalcost));
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("Nil");//adult
					txtChild.setText("ONE");//child
						
						}
				else if((rbtnEconomy.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnChild.isSelected())//child_return economy
						&& destination.getSelectedItem().equals("London"))
						{
					totalcost=(tax*(Miles8*2-15+eco))/100;
					String sTax=String.format("$%.2f", totalcost	);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles8*2+eco)-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles8*2+eco+totalcost)-15);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("Return");
					txtAdult.setText("NIL");//Adult
					txtChild.setText("ONE");//child
						
						}
/////////////////////////////////////--------HONKONG-----------ECONOMY---------------------/////////////////////////////////////////////////
				
				else if((rbtnEconomy.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnAdult.isSelected())//Adult single economy
						&& destination.getSelectedItem().equals("Hongkong"))
						{
					totalcost=(tax*(Miles9+eco))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles9+eco);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles9+eco+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				else if((rbtnEconomy.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult return economy
						&& destination.getSelectedItem().equals("Hongkong"))
						{
					totalcost=(tax*(Miles9+eco)/100)*2;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles9+eco)*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles9+eco)*2+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("Return");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnEconomy.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnChild.isSelected())//child single economy
						&& destination.getSelectedItem().equals("Hongkong"))
						{
					totalcost=(tax*(Miles9+eco))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles9+eco-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles9+eco)-15 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("Nil");//adult
					txtChild.setText("ONE");//child
						
						}
				else if((rbtnEconomy.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnChild.isSelected())//child_return
						&& destination.getSelectedItem().equals("Hongkong"))
						{
					totalcost=(tax*(Miles9*2-15+eco))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles9*2+eco)-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles9*2+eco+totalcost)-15);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("Return");
					txtAdult.setText("NIL");//Adult
					txtChild.setText("ONE");//child
						
						}
/////////////////////////////////////--------DUBAI-----------ECONOMY---------------------/////////////////////////////////////////////////
				
				else if((rbtnEconomy.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult single economy
						&& destination.getSelectedItem().equals("Dubai"))
						{
					totalcost=(tax*(Miles10+eco))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles10+eco);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles10+eco+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				else if((rbtnEconomy.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult return economy
						&& destination.getSelectedItem().equals("Dubai"))
						{
					totalcost=((tax*(Miles10+eco))/100)*2;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles10+eco)*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles10+eco)*2+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("Return");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnEconomy.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnChild.isSelected())//child single economy
						&& destination.getSelectedItem().equals("Dubai"))
						{
					totalcost=(tax*(Miles10+eco))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles10+eco-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles10+eco)-15 + totalcost);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("Nil");//adult
					txtChild.setText("ONE");//child
						
						}
				else if((rbtnEconomy.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnChild.isSelected())//child_return economy
						&& destination.getSelectedItem().equals("Dubai"))
						{
					totalcost=(tax*(Miles10*2-15+eco))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles10*2+eco)-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles10*2+eco+totalcost)-15);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("Return");
					txtAdult.setText("NIL");//Adult
					txtChild.setText("ONE");//child
						
						}
/////////////////////////////////////--------AHMEDABAD-----------ECONOMY---------------------/////////////////////////////////////////////////
				
				else if((rbtnEconomy.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult single economy
						&& destination.getSelectedItem().equals("Ahmedabad"))
						{
					totalcost=(tax*(Miles11+eco))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles11+eco);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles11+eco+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				else if((rbtnEconomy.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult return economy
						&& destination.getSelectedItem().equals("Ahmedabad"))
						{
					totalcost=((tax*(Miles11+eco))/100)*2;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles11+eco)*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles11+eco)*2+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("Return");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnEconomy.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnChild.isSelected())//child single economy
						&& destination.getSelectedItem().equals("Ahmedabad"))
						{
					totalcost=(tax*(Miles11+eco))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles11+eco-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles11+eco)-15 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("Nil");//adult
					txtChild.setText("ONE");//child
						
						}
				else if((rbtnEconomy.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnChild.isSelected())//child_return economy
						&& destination.getSelectedItem().equals("Ahmedabad"))
						{
					totalcost=(tax*(Miles11*2-15+eco))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles11*2+eco)-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles11*2+eco+totalcost)-15);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("ECONOMY");
					txtTicket.setText("Return");
					txtAdult.setText("NIL");//Adult
					txtChild.setText("ONE");//child
						
						}
	//////////////////////////////------LONDON-------------First Class------------------------/////////////////////////////////////
				 
				else if((rbtnFirst_class.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnAdult.isSelected())//Adult single First class
						&& destination.getSelectedItem().equals("London"))
						{
					totalcost=(tax*(Miles8+fclass))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles8+fclass);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles8+fclass+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnFirst_class.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnAdult.isSelected())//Adult return First class
						&& destination.getSelectedItem().equals("London"))
						{
					totalcost=((tax*(Miles8+fclass))/100)*2;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles8+fclass)*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles8+fclass)*2+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("Return");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnFirst_class.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnChild.isSelected())//child single First class
						&& destination.getSelectedItem().equals("London"))
						{
					totalcost=(tax*(Miles8+fclass))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles8+fclass-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles8+fclass)-15+ totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("Nil");//adult
					txtChild.setText("ONE");//child
						
						}
				else if((rbtnFirst_class.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnChild.isSelected())//child_return First class
						&& destination.getSelectedItem().equals("London"))
						{
					totalcost=(tax*(Miles8*2-15+fclass))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles8*2+fclass)-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles8*2+fclass+totalcost)-15);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("Return");
					txtAdult.setText("NIL");//Adult
					txtChild.setText("ONE");//child
						
						}
				
		///////////////////////////////////////------HONKING-------------First Class------------------------/////////////////////////////////////
				
				else if((rbtnFirst_class.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult single First Class
						&& destination.getSelectedItem().equals("Hongkong"))
						{
					totalcost=(tax*(Miles9+fclass))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles9+fclass);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles9+fclass+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				else if((rbtnFirst_class.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult return First Class
						&& destination.getSelectedItem().equals("Hongkong"))
						{
					totalcost=((tax*(Miles9+fclass))/100)*2;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles9+fclass)*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles9+fclass)*2+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("Return");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnFirst_class.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnChild.isSelected())//child single First Class
						&& destination.getSelectedItem().equals("Hongkong"))
						{
					totalcost=(tax*(Miles9+fclass))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles9+fclass-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles9+fclass)-15+ totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("Nil");//adult
					txtChild.setText("ONE");//child
						
						}
				else if((rbtnFirst_class.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnChild.isSelected())//child_return First Class
						&& destination.getSelectedItem().equals("Hongkong"))
						{
					totalcost=(tax*(Miles9))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles9*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",((Miles9+totalcost)*2)-5);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("Return");
					txtAdult.setText("NIL");//Adult
					txtChild.setText("ONE");//child
						
						}
		//////////////////////////////------DUBAI-------------First Class------------------------/////////////////////////////////////		
				
				else if((rbtnFirst_class.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult single First Class
						&& destination.getSelectedItem().equals("Dubai"))
						{
					totalcost=(tax*(Miles10+fclass))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles10+fclass);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles10+fclass+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				else if((rbtnFirst_class.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult return First Class
						&& destination.getSelectedItem().equals("Dubai"))
						{
					totalcost=((tax*(Miles10+fclass))/100)*2;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles10+fclass)*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles10+fclass)*2+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("Return");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnFirst_class.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnChild.isSelected())//child single First Class
						&& destination.getSelectedItem().equals("Dubai"))
						{
					totalcost=(tax*(Miles10+fclass))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles10+fclass-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles10+fclass)-15+ totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("Nil");//adult
					txtChild.setText("ONE");//child
						
						}
				else if((rbtnFirst_class.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnChild.isSelected())//child_return First Class
						&& destination.getSelectedItem().equals("Dubai"))
						{
					totalcost=(tax*(Miles10*2-15+fclass))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles10*2+fclass)-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles10*2+fclass+totalcost)-15);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("Return");
					txtAdult.setText("NIL");//Adult
					txtChild.setText("ONE");//child
						
						}
//////////////////////////////------AHMEDABAD-------------First Class------------------------/////////////////////////////////////
				else if((rbtnFirst_class.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult single First Class
						&& destination.getSelectedItem().equals("Ahmedabad"))
						{
					totalcost=(tax*(Miles11+fclass))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles11+fclass);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",Miles11+fclass+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				else if((rbtnFirst_class.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnAdult.isSelected())//adult return First Class
						&& destination.getSelectedItem().equals("Ahmedabad"))
						{
					totalcost=((tax*(Miles11+fclass))/100)*2;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles11+fclass)*2);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles11+fclass)*2+totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("Return");
					txtAdult.setText("One");
					txtChild.setText("NIL");
						
						}
				
				else if((rbtnFirst_class.isSelected())&& (rbtnSingle_Ticket.isSelected())&&(rbtnChild.isSelected())//child single First Class
						&& destination.getSelectedItem().equals("Ahmedabad"))
						{
					totalcost=(tax*(Miles11+fclass))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",Miles11+fclass-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles11+fclass)-15+ totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("Nil");//adult
					txtChild.setText("ONE");//child
						
						}
				else if((rbtnFirst_class.isSelected())&& (rbtnReturn_Ticket.isSelected())&&(rbtnChild.isSelected())//child_return First Class
						&& destination.getSelectedItem().equals("Ahmedabad"))
						{
					totalcost=(tax*(Miles11*2-15+fclass))/100;
					String sTax=String.format("$%.2f", totalcost);
					txtTax.setText(sTax);
					String SubTotal=String.format("$%.2f",(Miles11*2+fclass)-15);
					txtSub_Total.setText(SubTotal);
					String Total=String.format("$%.2f",(Miles11*2+fclass+totalcost)-15);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("Return");
					txtAdult.setText("NIL");//Adult
					txtChild.setText("ONE");//child
						
						}
			}
		});
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//---------------Time-------------------
				
				Calendar  timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				txtTime.setText(tTime.format(timer.getTime()));
				
				//-----------------Date-------------------
				SimpleDateFormat tDate=new SimpleDateFormat("dd-MMM-yyyy");
				txtDate.setText(tDate.format(timer.getTime()));
				
				txtFrom.setText("Toronto");
				txtTo.setText((String) destination.getSelectedItem()+"*");
				
				//----------------Random Number Generator---------------
				int num1;
				String a1	="";
				num1=	1325+(int)(Math.random()*4238);
				a1 +=num1+1325;
				txtTicket_no.setText(a1);
				txtRoute.setText("ANY");
				  
			}
		});
		btnTotal.setFont(new Font("Verdana", Font.BOLD, 22));
		btnTotal.setToolTipText("Total Cost of Ticket");
		btnTotal.setBounds(8, 592, 106, 36);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Verdana", Font.BOLD, 22));
		btnReset.setToolTipText("Reset System");
			
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTax.setText(null);
				txtSub_Total.setText(null);
				txtTotal.setText(null);
				rbtnEconomy.setSelected(false);
				rbtnFirst_class.setSelected(false);
				rbtnReturn_Ticket.setSelected(false);
				rbtnSingle_Ticket.setSelected(false);
				rbtnStandard.setSelected(false);
				rbtnAdult.setSelected(false);
				rbtnChild.setSelected(false);
				destination.setSelectedItem("Destination");
				txtAdult.setText(null);
				txtChild.setText(null);
				txtClass.setText(null);
				txtDate.setText(null);
				txtFrom.setText(null);
				txtPrice.setText(null);
				txtRoute.setText(null);
				txtTicket_no.setText(null);
				txtTicket.setText(null);
				txtTime.setText(null);
				txtTo.setText(null);
			}
		});
		btnReset.setBounds(197, 592, 104, 36);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Verdana", Font.BOLD, 22));
		btnExit.setToolTipText("Exit System");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm you want to exit","Travelling System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
						{
					System.exit(0);
						}
			}
		});
		btnExit.setBounds(386, 592, 106, 36);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(525, 85, 18, 476);
		frame.getContentPane().add(separator_4);
		
		txtClass = new JTextField();
		txtClass.setFont(new Font("Verdana", Font.BOLD, 17));
		txtClass.setBounds(575, 157, 116, 36);
		frame.getContentPane().add(txtClass);
		txtClass.setColumns(10);
		
		txtTicket = new JTextField();
		txtTicket.setFont(new Font("Verdana", Font.BOLD, 17));
		txtTicket.setBounds(752, 160, 116, 36);
		frame.getContentPane().add(txtTicket);
		txtTicket.setColumns(10);
		
		txtAdult = new JTextField();
		txtAdult.setFont(new Font("Verdana", Font.BOLD, 17));
		txtAdult.setBounds(942, 157, 116, 36);
		frame.getContentPane().add(txtAdult);
		txtAdult.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Class");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 22));
		lblNewLabel_2.setBounds(585, 90, 69, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Verdana", Font.BOLD, 22));
		lblTicket.setBounds(759, 96, 90, 25);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblNewLabel_3 = new JLabel("Adult");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 22));
		lblNewLabel_3.setBounds(957, 96, 69, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(555, 138, 756, 22);
		frame.getContentPane().add(separator_5);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Verdana", Font.BOLD, 22));
		lblChild.setBounds(1151, 96, 69, 25);
		frame.getContentPane().add(lblChild);
		
		txtChild = new JTextField();
		txtChild.setFont(new Font("Verdana", Font.BOLD, 17));
		txtChild.setColumns(10);
		txtChild.setBounds(1138, 157, 116, 36);
		frame.getContentPane().add(txtChild);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Verdana", Font.BOLD, 22));
		lblFrom.setBounds(575, 248, 69, 36);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Verdana", Font.BOLD, 22));
		lblTo.setBounds(575, 325, 69, 36);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Verdana", Font.BOLD, 22));
		lblDate.setBounds(575, 400, 69, 36);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Verdana", Font.BOLD, 22));
		lblTime.setBounds(575, 488, 69, 36);
		frame.getContentPane().add(lblTime);
		
		txtFrom = new JTextField();
		txtFrom.setFont(new Font("Verdana", Font.BOLD, 17));
		txtFrom.setColumns(10);
		txtFrom.setBounds(716, 248, 152, 36);
		frame.getContentPane().add(txtFrom);
		
		txtTo = new JTextField();
		txtTo.setFont(new Font("Verdana", Font.BOLD, 17));
		txtTo.setColumns(10);
		txtTo.setBounds(716, 327, 152, 36);
		frame.getContentPane().add(txtTo);
		
		txtDate = new JTextField();
		txtDate.setFont(new Font("Verdana", Font.BOLD, 17));
		txtDate.setColumns(10);
		txtDate.setBounds(716, 402, 152, 36);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setFont(new Font("Verdana", Font.BOLD, 17));
		txtTime.setColumns(10);
		txtTime.setBounds(716, 490, 152, 36);
		frame.getContentPane().add(txtTime);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(967, 206, 18, 393);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Verdana", Font.BOLD, 22));
		lblTicketNo.setBounds(1032, 226, 128, 36);
		frame.getContentPane().add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Verdana", Font.BOLD, 22));
		lblPrice.setBounds(1032, 330, 106, 31);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Verdana", Font.BOLD, 22));
		lblRoute.setBounds(1033, 448, 90, 25);
		frame.getContentPane().add(lblRoute);
		
		txtTicket_no = new JTextField();
		txtTicket_no.setFont(new Font("Verdana", Font.BOLD, 17));
		txtTicket_no.setColumns(10);
		txtTicket_no.setBounds(1033, 275, 157, 38);
		frame.getContentPane().add(txtTicket_no);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Verdana", Font.BOLD, 17));
		txtPrice.setColumns(10);
		txtPrice.setBounds(1033, 377, 157, 38);
		frame.getContentPane().add(txtPrice);
		
		txtRoute = new JTextField();
		txtRoute.setFont(new Font("Verdana", Font.BOLD, 17));
		txtRoute.setColumns(10);
		txtRoute.setBounds(1033, 489, 157, 38);
		frame.getContentPane().add(txtRoute);
		
		
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(12, 321, 479, 22);
		frame.getContentPane().add(separator_6);
	}
}
