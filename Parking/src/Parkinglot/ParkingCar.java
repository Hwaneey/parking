package Parkinglot;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



@SuppressWarnings("serial")
public class ParkingCar extends JFrame implements ActionListener{

	

	private JPanel panMonitor,panMenuLeft;
	public JPanel A1,A2,A3,A4,A5,A6,A7,A8,A9,A10;
	public JPanel B1,B2,B3,B4,B5,B6,B7,B8,B9,B10;
	private JButton btnA1,btnA2,btnA3,btnA4,btnA5,btnA6,btnA7,btnA8,btnA9,btnA10;
	private JButton btnB1,btnB2,btnB3,btnB4,btnB5,btnB6,btnB7,btnB8,btnB9,btnB10;
	private JLabel lblName,lblTime;
	private JButton btnHelp;
	private JButton btnExit;
	private JButton btnWhereMyCar;
	private JButton btnPay;
	private CurrentTime SetCurrentTime;
	private Component SetNameLable;
	private Help HP;
	private JLabel lblCarA1;
	private JLabel lblCarA2;
	private JLabel lblCarA3;
	private JLabel lblCarA4;
	private JLabel lblCarA5;
	private JLabel lblCarA6;
	private JLabel lblCarA7;
	private JLabel lblCarA8;
	private JLabel lblCarA9;
	private JLabel lblCarA10;
	private JLabel lblCarB1;
	private JLabel lblCarB2;
	private JLabel lblCarB3;
	private JLabel lblCarB4;
	private JLabel lblCarB5;
	private JLabel lblCarB6;
	private JLabel lblCarB7;
	private JLabel lblCarB8;
	private JLabel lblCarB9;
	private JLabel lblCarB10;
	private JLabel lblCarTA1;
	private JLabel lblCarTA2;
	private JLabel lblCarTA3;
	private JLabel lblCarTA4;
	private JLabel lblCarTA5;
	private JLabel lblCarTA6;
	private JLabel lblCarTA7;
	private JLabel lblCarTA8;
	private JLabel lblCarTA9;
	private JLabel lblCarTA10;
	private JLabel lblCarTB1;
	private JLabel lblCarTB2;
	private JLabel lblCarTB3;
	private JLabel lblCarTB4;
	private JLabel lblCarTB5;
	private JLabel lblCarTB6;
	private JLabel lblCarTB7;
	private JLabel lblCarTB8;
	private JLabel lblCarTB9;
	private JLabel lblCarTB10;
	private String Area;
	private ImageIcon imgCar;
	private JButton btnlog;
	private Log log;
	private DayPayTable dpt;
	private JPanel C1;
	private JPanel C2;
	private JPanel C3;
	private JPanel C4;
	private JPanel C5;
	private JPanel C6;
	private JPanel C7;
	private JPanel C8;
	private JPanel C9;
	private JPanel C10;
	private JPanel panMenuUp;
	private JPanel panMenucen;
	private JPanel empty;
	private JTextField tf;
	private JButton btn;
	private JButton btnC1;
	private JButton btnC2;
	private JButton btnC3;
	private JButton btnC4;
	private JButton btnC5;
	private JButton btnC6;
	private JButton btnC7;
	private JButton btnC8;
	private JButton btnC9;
	private JButton btnC10;
	private JLabel lblCarC1;
	private JLabel lblCarC2;
	private JLabel lblCarC3;
	private JLabel lblCarC4;
	private JLabel lblCarC5;
	private JLabel lblCarC6;
	private JLabel lblCarC7;
	private JLabel lblCarC8;
	private JLabel lblCarC9;
	private JLabel lblCarC10;
	private JLabel lblCarTC1;
	private JLabel lblCarTC2;
	private JLabel lblCarTC3;
	private JLabel lblCarTC4;
	private JLabel lblCarTC5;
	private JLabel lblCarTC6;
	private JLabel lblCarTC7;
	private JLabel lblCarTC8;
	private JLabel lblCarTC9;
	private JLabel lblCarTC10;
	private Component panMenudown;
	private Point ptFirst;



	public ParkingCar(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100, 100);;
		setSize(1435,670);
		//setBackground(Color.black);
		//기본레이아웃설정
		setMenuLeft();
		setMonitor();
		ImageIcon up = new ImageIcon("img/up...png");

		panMenuUp = new JPanel(){
	     	 public void paintComponent(Graphics g) {
		         g.drawImage(up.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
		         
		         Dimension d = getSize();
		         g.drawImage(up.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
		         
		     	 }};
		panMenuUp.setPreferredSize(new Dimension(1280,35));
		panMenuUp.setBackground(new Color(89,89,89));
		
		panMenuUp.addMouseListener(new MouseListener() {
		
			

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				 ptFirst = e.getPoint();
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			 
		});
		panMenuUp.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
		        Point loc = e.getLocationOnScreen();
		        loc.x -= ptFirst.x;
		        loc.y -= ptFirst.y;
		        
		        setLocation(loc);//프레임창 움직이기

			}
		});
		panMenudown = new JPanel(){
	     	 public void paintComponent(Graphics g) {
		         g.drawImage(up.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
		         
		         Dimension d = getSize();
		         g.drawImage(up.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
		         
		     	 }};
		panMenudown.setPreferredSize(new Dimension(1280,55));
		panMenudown.setBackground(new Color(89,89,89));
		
		panMenucen = new JPanel();
		panMenucen.setPreferredSize(new Dimension(80,500));
		panMenucen.setBackground(Color.gray);
		
		add(panMenuUp, BorderLayout.NORTH);
		add(panMenuLeft, BorderLayout.WEST);
		add(panMonitor, BorderLayout.CENTER);
		add(panMenucen, BorderLayout.EAST);
		add(panMenudown, BorderLayout.SOUTH);
		setUndecorated(true);
		setResizable(false);
		setVisible(true);
	}

	
	ImageIcon backl = new ImageIcon("img/backl.png");
	private String t1;

	private void setMenuLeft() {
		panMenuLeft = new JPanel(){
	     	 public void paintComponent(Graphics g) {
		         g.drawImage(backl.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
		         
		         Dimension d = getSize();
		         g.drawImage(backl.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
		         
		     	 }};
		//panMenuLeft.setBackground(Color.WHITE);
		//panMenuLeft.setLayout(new FlowLayout());
		panMenuLeft.setLayout(new GridLayout(10, 1));
		//panMenuLeft.setBackground(new Color(89,89,89));
		
		JPanel NamePan = new JPanel();
		lblName = new JLabel("");
		lblName.setHorizontalAlignment(JLabel.CENTER);
		SetNameLable = new JLabel();
		NamePan.add(lblName);
		NamePan.setBackground(new Color(89,89,89));
		NamePan.add(SetNameLable);
		
		JPanel TimePane = new JPanel(new BorderLayout());
		lblTime = new JLabel("현재 시간");
		lblTime.setForeground(Color.white);
		lblTime.setHorizontalAlignment(JLabel.CENTER);//중앙정렬
		SetCurrentTime = new CurrentTime();
		SetCurrentTime.setForeground(Color.white);
		TimePane.add(lblTime);
		TimePane.add(SetCurrentTime,BorderLayout.SOUTH);
		TimePane.setForeground(Color.white);
		TimePane.setBackground(new Color(89,89,89));
		SetCurrentTime.setBackground(new Color(89,89,89));
		
		
		
		ImageIcon img0 = new ImageIcon("img/MenuButton/findbtn.png"); 
		ImageIcon img0rol = new ImageIcon("img/MenuButton/findbtnr.png"); 
		ImageIcon img0pre = new ImageIcon("img/MenuButton/findbtnp.png"); 
		
		
		
		ImageIcon img1 = new ImageIcon("img/MenuButton/cal.png"); 
		ImageIcon img1rol = new ImageIcon("img/MenuButton/calr.png"); 
		ImageIcon img1pre = new ImageIcon("img/MenuButton/calp.png"); 
		
		ImageIcon img2 = new ImageIcon("img/MenuButton/out.png"); //이걸로
		ImageIcon img2rol = new ImageIcon("img/MenuButton/outr.png"); //여기서부터
		ImageIcon img2pre = new ImageIcon("img/MenuButton/outp.png"); //
		
		
		
		ImageIcon img3 = new ImageIcon("img/MenuButton/help.png"); //이걸로
		ImageIcon img3rol = new ImageIcon("img/MenuButton/helpr.png"); //이걸로
		ImageIcon img3pre = new ImageIcon("img/MenuButton/helpp.png"); //이걸로
		
		ImageIcon img4 = new ImageIcon("img/MenuButton/exit.png"); //이걸로
		ImageIcon img4rol = new ImageIcon("img/MenuButton/exitr.png"); //이걸로
		ImageIcon img4pre = new ImageIcon("img/MenuButton/exitp.png"); //이걸로
		
		btnlog = new JButton(img1);
		btnlog.addActionListener(this);
		btnlog.setRolloverIcon(img1rol);
		btnlog.setPressedIcon(img1pre);
		btnlog.setBorderPainted(false); //JButton의 Border(외곽선)을 없애준다.    
		btnlog.setFocusPainted(false); //JButton의 내용영역 채우기 안함
		btnlog.setContentAreaFilled(false); //JButton이 선택(focus)되었을때 생기는 테두리 사용안함
		btnlog.setOpaque(false);
		
		btnWhereMyCar = new JButton(img0);
		btnWhereMyCar.setRolloverIcon(img0rol);
		btnWhereMyCar.setPressedIcon(img0pre);		
		btnWhereMyCar.setBorderPainted(false); //JButton의 Border(외곽선)을 없애준다.    
		btnWhereMyCar.setFocusPainted(false); //JButton의 내용영역 채우기 안함
		btnWhereMyCar.setContentAreaFilled(false); //JButton이 선택(focus)되었을때 생기는 테두리 사용안함
		btnWhereMyCar.setOpaque(false); //버튼 주변을 투명하게 만들어줌
	
		
		btnPay = new JButton(img2);
		btnPay.setBorderPainted(false);
		btnPay.setFocusPainted(false);
		btnPay.setContentAreaFilled(false);
		btnPay.setOpaque(false);
		btnPay.setRolloverIcon(img2rol);
		btnPay.setPressedIcon(img2pre);
		
		btnHelp = new JButton(img3);
		btnHelp.setBorderPainted(false);
		btnHelp.setFocusPainted(false);
		btnHelp.setContentAreaFilled(false);
		btnHelp.setOpaque(false);
		btnHelp.setRolloverIcon(img3rol);
		btnHelp.setPressedIcon(img3pre);
		
		btnExit = new JButton(img4);
		btnExit.setBorderPainted(false);
		btnExit.setFocusPainted(false);
		btnExit.setContentAreaFilled(false);
		btnExit.setOpaque(false);
		btnExit.addActionListener(this);
		btnExit.setRolloverIcon(img4rol);
		btnExit.setPressedIcon(img4pre);
		
		btnWhereMyCar.addActionListener(this);
		btnPay.addActionListener(this);
		btnHelp.addActionListener(this);
		btnExit.addActionListener(this);
		
		ImageIcon back = new ImageIcon("img/FindMyCar/back2.png");
		 empty =new JPanel(){
	     	 public void paintComponent(Graphics g) {
	         g.drawImage(back.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	         
	         Dimension d = getSize();
	         g.drawImage(back.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	         
	     	 }};
			empty.setBackground(Color.black);
			empty.setPreferredSize(new Dimension(260,40));
		empty.setLayout(null);

		JLabel lbl = new JLabel("차량번호를 입력해주세요");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setForeground(Color.white);
		
		tf = new JTextField(10);
		tf.setForeground(Color.white);
		tf.setBorder(javax.swing.BorderFactory.createEmptyBorder()); //텍스트바 테두리 없애기
		tf.setOpaque(false);
		tf.setBounds(85, 18, 140, 30);
		
		btn = new JButton(img0);
		btn.setRolloverIcon(img0rol);
		btn.setPressedIcon(img0pre);
		btn.setBackground(new Color(8989));
		btn.setBorderPainted(false);
		btn.setFocusPainted(false);
		btn.setContentAreaFilled(false);
		btn.setOpaque(false);
		btn.setBounds(240, 100, 40, 30);
		btn.addActionListener(this);
			
		
		
		
		///메뉴 붙히는부
		empty.add(tf);
		
		panMenuLeft.add(TimePane);
		//panMenuLeft.add(lbl);
		panMenuLeft.add(empty);
		add(btn);
		//empty.add(new FMC(""));
		panMenuLeft.add(btnlog);
			//
		//panMenuLeft.add(btnWhereMyCar);
		panMenuLeft.add(btnPay);
		panMenuLeft.add(btnHelp);		
		panMenuLeft.add(btnExit);
		
		
	}

	private void setMonitor() {
	     panMonitor = new JPanel();
	       panMonitor.setBackground(Color.gray);
	         panMonitor.setLayout(new GridLayout(3, 10));
	         // 0608 만듬
	         
	 		panMenucen = new JPanel();
			//panMenucen.setPreferredSize(new Dimension(10,500));
			panMenucen.setBackground(Color.gray);
		
	 		JPanel panMenucen1 = new JPanel();
			//panMenucen1.setPreferredSize(new Dimension(10,500));
			panMenucen1.setBackground(Color.gray);
			
	 		JPanel panMenucen2 = new JPanel();
			//panMenucen2.setPreferredSize(new Dimension(10,500));
			panMenucen2.setBackground(Color.gray);
	         
			
	         new ImageIcon("img/parking.png");
	         ImageIcon imgA1 = new ImageIcon("img/ParkingLot/parkingA1.png");
	         ImageIcon imgA2 = new ImageIcon("img/ParkingLot/parkingA2.png");
	         ImageIcon imgA3 = new ImageIcon("img/ParkingLot/parkingA3.png");
	         ImageIcon imgA4 = new ImageIcon("img/ParkingLot/parkingA4.png");
	         ImageIcon imgA5 = new ImageIcon("img/ParkingLot/parkingA5.png");
	         ImageIcon imgA6 = new ImageIcon("img/ParkingLot/parkingA6.png");
	         ImageIcon imgA7 = new ImageIcon("img/ParkingLot/parkingA7.png");
	         ImageIcon imgA8 = new ImageIcon("img/ParkingLot/parkingA8.png");
	         ImageIcon imgA9 = new ImageIcon("img/ParkingLot/parkingA9.png");
	         ImageIcon imgA10 = new ImageIcon("img/ParkingLot/parkingA10.png");
	         
	         ImageIcon imgB1 = new ImageIcon("img/ParkingLot/parkingB1.png");
	         ImageIcon imgB2 = new ImageIcon("img/ParkingLot/parkingB2.png");
	         ImageIcon imgB3 = new ImageIcon("img/ParkingLot/parkingB3.png");
	         ImageIcon imgB4 = new ImageIcon("img/ParkingLot/parkingB4.png");
	         ImageIcon imgB5 = new ImageIcon("img/ParkingLot/parkingB5.png");
	         ImageIcon imgB6 = new ImageIcon("img/ParkingLot/parkingB6.png");
	         ImageIcon imgB7 = new ImageIcon("img/ParkingLot/parkingB7.png");
	         ImageIcon imgB8 = new ImageIcon("img/ParkingLot/parkingB8.png");
	         ImageIcon imgB9 = new ImageIcon("img/ParkingLot/parkingB9.png");
	         ImageIcon imgB10 = new ImageIcon("img/ParkingLot/parkingB10.png");
	         
	         ImageIcon imgC1 = new ImageIcon("img/ParkingLot/parkingC1.png");
	         ImageIcon imgC2 = new ImageIcon("img/ParkingLot/parkingC2.png");
	         ImageIcon imgC3 = new ImageIcon("img/ParkingLot/parkingC3.png");
	         ImageIcon imgC4 = new ImageIcon("img/ParkingLot/parkingC4.png");
	         ImageIcon imgC5 = new ImageIcon("img/ParkingLot/parkingC5.png");
	         ImageIcon imgC6 = new ImageIcon("img/ParkingLot/parkingC6.png");
	         ImageIcon imgC7 = new ImageIcon("img/ParkingLot/parkingC7.png");
	         ImageIcon imgC8 = new ImageIcon("img/ParkingLot/parkingC8.png");
	         ImageIcon imgC9 = new ImageIcon("img/ParkingLot/parkingC9.png");
	         ImageIcon imgC10 = new ImageIcon("img/ParkingLot/parkingC10.png");
	         
	         imgCar = new ImageIcon("img/car5.png");
	       
	         // A열 주차공간 생성
	         A1 = new JPanel(){
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgA1.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgA1.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         A2 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgA2.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgA2.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         A3 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgA3.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgA3.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         A4 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgA4.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgA4.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         A5 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgA5.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgA5.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         A6 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgA6.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgA6.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         A7 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgA7.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgA7.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         A8 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgA8.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgA8.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         A9 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgA9.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgA9.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         A10 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgA10.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgA10.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         
	         //B열 주차공간 생성
	         B1 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgB1.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgB1.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         B2 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgB2.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgB2.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         B3 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgB3.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgB3.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         B4 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgB4.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgB4.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         B5 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgB5.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgB5.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         B6 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgB6.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgB6.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         B7 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgB7.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgB7.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         B8 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgB8.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgB8.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         B9 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgB9.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgB9.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         B10 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgB10.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgB10.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};  
	        
	       //C열 주차공간 생성
	         C1 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgC1.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgC1.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         C2 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgC2.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgC2.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         C3 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgC3.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgC3.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         C4 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgC4.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgC4.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         C5 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgC5.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                
	                 Dimension d = getSize();
	                 g.drawImage(imgC5.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         C6 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgC6.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgC6.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         C7 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgC7.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgC7.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         C8 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgC8.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgC8.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         C9 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgC9.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgC9.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};
	         C10 = new JPanel() {
	        	 public void paintComponent(Graphics g) {
	                 g.drawImage(imgC10.getImage(), 0, 0, null); //이미지 원래사이즈로 넣기
	                 
	                 Dimension d = getSize();
	                 g.drawImage(imgC10.getImage(), 0, 0, d.width, d.height, null); // 컴포넌트 사이즈에 맞게
	                 
	         }};  
	         //A열 주차등록버튼
	         btnA1 = new JButton(imgCar);
	         btnA1.setBackground(Color.GREEN);
	         btnA1.addActionListener(this);
	         btnA2 = new JButton(imgCar);
	         btnA2.setBackground(Color.GREEN);
	         btnA2.addActionListener(this);
	         btnA3 = new JButton(imgCar);
	         btnA3.setBackground(Color.GREEN);
	         btnA3.addActionListener(this);
	         btnA4 = new JButton(imgCar);
	         btnA4.setBackground(Color.GREEN);
	         btnA4.addActionListener(this);
	         btnA5 = new JButton(imgCar);
	         btnA5.setBackground(Color.GREEN);
	         btnA5.addActionListener(this);
	         btnA6 = new JButton(imgCar);
	         btnA6.setBackground(Color.GREEN);
	         btnA6.addActionListener(this);
	         btnA7 = new JButton(imgCar);
	         btnA7.setBackground(Color.GREEN);
	         btnA7.addActionListener(this);
	         btnA8 = new JButton(imgCar);
	         btnA8.setBackground(Color.GREEN);
	         btnA8.addActionListener(this);
	         btnA9 = new JButton(imgCar);
	         btnA9.setBackground(Color.GREEN);
	         btnA9.addActionListener(this);
	         btnA10 = new JButton(imgCar);
	         btnA10.setBackground(Color.GREEN);
	         btnA10.addActionListener(this);
	         
	         //B열 주차등록 버튼
	         btnB1 = new JButton(imgCar);
	         btnB1.setBackground(Color.GREEN);
	         btnB1.addActionListener(this);
	         btnB2 = new JButton(imgCar);
	         btnB2.setBackground(Color.GREEN);
	         btnB2.addActionListener(this);
	         btnB3 = new JButton(imgCar);
	         btnB3.setBackground(Color.GREEN);
	         btnB3.addActionListener(this);
	         btnB4 = new JButton(imgCar);
	         btnB4.setBackground(Color.GREEN);
	         btnB4.addActionListener(this);
	         btnB5 = new JButton(imgCar);
	         btnB5.setBackground(Color.GREEN);
	         btnB5.addActionListener(this);
	         btnB6 = new JButton(imgCar);
	         btnB6.setBackground(Color.GREEN);
	         btnB6.addActionListener(this);
	         btnB7 = new JButton(imgCar);
	         btnB7.setBackground(Color.GREEN);
	         btnB7.addActionListener(this);
	         btnB8 = new JButton(imgCar);
	         btnB8.setBackground(Color.GREEN);
	         btnB8.addActionListener(this);
	         btnB9 = new JButton(imgCar);
	         btnB9.setBackground(Color.GREEN);
	         btnB9.addActionListener(this);
	         btnB10 = new JButton(imgCar);
	         btnB10.setBackground(Color.GREEN);
	         btnB10.addActionListener(this);

	         //c열 버튼
	         btnC1 = new JButton(imgCar);
	         btnC1.setBackground(Color.GREEN);
	         btnC1.addActionListener(this);
	         btnC2 = new JButton(imgCar);
	         btnC2.setBackground(Color.GREEN);
	         btnC2.addActionListener(this);
	         btnC3 = new JButton(imgCar);
	         btnC3.setBackground(Color.GREEN);
	         btnC3.addActionListener(this);
	         btnC4 = new JButton(imgCar);
	         btnC4.setBackground(Color.GREEN);
	         btnC4.addActionListener(this);
	         btnC5 = new JButton(imgCar);
	         btnC5.setBackground(Color.GREEN);
	         btnC5.addActionListener(this);
	         btnC6 = new JButton(imgCar);
	         btnC6.setBackground(Color.GREEN);
	         btnC6.addActionListener(this);
	         btnC7 = new JButton(imgCar);
	         btnC7.setBackground(Color.GREEN);
	         btnC7.addActionListener(this);
	         btnC8 = new JButton(imgCar);
	         btnC8.setBackground(Color.GREEN);
	         btnC8.addActionListener(this);
	         btnC9 = new JButton(imgCar);
	         btnC9.setBackground(Color.GREEN);
	         btnC9.addActionListener(this);
	         btnC10 = new JButton(imgCar);
	         btnC10.setBackground(Color.GREEN);
	         btnC10.addActionListener(this);



	         //A열 버튼 삽입
	         A1.add(btnA1);
	         A2.add(btnA2);
	         A3.add(btnA3);
	         A4.add(btnA4);
	         A5.add(btnA5);
	         A6.add(btnA6);
	         A7.add(btnA7);
	         A8.add(btnA8);
	         A9.add(btnA9);    
	         A10.add(btnA10);


	         //B열 버튼삽입
	         B1.add(btnB1);
	         B2.add(btnB2);
	         B3.add(btnB3);
	         B4.add(btnB4);
	         B5.add(btnB5);
	         B6.add(btnB6);
	         B7.add(btnB7);
	         B8.add(btnB8);
	         B9.add(btnB9);
	         B10.add(btnB10);

	         C1.add(btnC1);
	         C2.add(btnC2);
	         C3.add(btnC3);
	         C4.add(btnC4);
	         C5.add(btnC5);
	         C6.add(btnC6);
	         C7.add(btnC7);
	         C8.add(btnC8);
	         C9.add(btnC9);
	         C10.add(btnC10);

	         //A1차량 번호 레이블 생성 해봅니다.
	         lblCarA1 = new JLabel("차량번호");
	         lblCarA1.setForeground(Color.white);
	         lblCarA2 = new JLabel("차량번호");
	         lblCarA2.setForeground(Color.white);
	         lblCarA3 = new JLabel("차량번호");
	         lblCarA3.setForeground(Color.white);
	         lblCarA4 = new JLabel("차량번호");
	         lblCarA4.setForeground(Color.white);
	         lblCarA5 = new JLabel("차량번호");
	         lblCarA5.setForeground(Color.white);
	         lblCarA6 = new JLabel("차량번호");
	         lblCarA6.setForeground(Color.white);
	         lblCarA7 = new JLabel("차량번호");
	         lblCarA7.setForeground(Color.white);
	         lblCarA8 = new JLabel("차량번호");
	         lblCarA8.setForeground(Color.white);
	         lblCarA9 = new JLabel("차량번호");
	         lblCarA9.setForeground(Color.white);
	         lblCarA10 = new JLabel("차량번호");
	         lblCarA10.setForeground(Color.white);

	         //B1차량 번호 레이블 생성 해봅니다.
	         lblCarB1 = new JLabel("차량번호");
	         lblCarB1.setForeground(Color.white);
	         lblCarB2 = new JLabel("차량번호");
	         lblCarB2.setForeground(Color.white);
	         lblCarB3 = new JLabel("차량번호");
	         lblCarB3.setForeground(Color.white);
	         lblCarB4 = new JLabel("차량번호");
	         lblCarB4.setForeground(Color.white);
	         lblCarB5 = new JLabel("차량번호");
	         lblCarB5.setForeground(Color.white);
	         lblCarB6 = new JLabel("차량번호");
	         lblCarB6.setForeground(Color.white);
	         lblCarB7 = new JLabel("차량번호");
	         lblCarB7.setForeground(Color.white);
	         lblCarB8 = new JLabel("차량번호");
	         lblCarB8.setForeground(Color.white);
	         lblCarB9 = new JLabel("차량번호");
	         lblCarB9.setForeground(Color.white);
	         lblCarB10 = new JLabel("차량번호");
	         lblCarB10.setForeground(Color.white);

	         lblCarC1 = new JLabel("차량번호");
	         lblCarC1.setForeground(Color.white);
	         lblCarC2 = new JLabel("차량번호");
	         lblCarC2.setForeground(Color.white);
	         lblCarC3 = new JLabel("차량번호");
	         lblCarC3.setForeground(Color.white);
	         lblCarC4 = new JLabel("차량번호");
	         lblCarC4.setForeground(Color.white);
	         lblCarC5 = new JLabel("차량번호");
	         lblCarC5.setForeground(Color.white);
	         lblCarC6 = new JLabel("차량번호");
	         lblCarC6.setForeground(Color.white);
	         lblCarC7 = new JLabel("차량번호");
	         lblCarC7.setForeground(Color.white);
	         lblCarC8 = new JLabel("차량번호");
	         lblCarC8.setForeground(Color.white);
	         lblCarC9 = new JLabel("차량번호");
	         lblCarC9.setForeground(Color.white);
	         lblCarC10 = new JLabel("차량번호");
	         lblCarC10.setForeground(Color.white);
	         
	         
	         //판넬에A1carnumber레이블삽
	         A1.add(lblCarA1);
	         A2.add(lblCarA2);
	         A3.add(lblCarA3);
	         A4.add(lblCarA4);
	         A5.add(lblCarA5);
	         A6.add(lblCarA6);
	         A7.add(lblCarA7);
	         A8.add(lblCarA8);
	         A9.add(lblCarA9);
	         A10.add(lblCarA10);

	         //판넬B1carnumer레이블 삽
	         B1.add(lblCarB1);
	         B2.add(lblCarB2);
	         B3.add(lblCarB3);
	         B4.add(lblCarB4);
	         B5.add(lblCarB5);
	         B6.add(lblCarB6);
	         B7.add(lblCarB7);
	         B8.add(lblCarB8);
	         B9.add(lblCarB9);
	         B10.add(lblCarB10);

	         //판넬C1carnumer레이블 삽
	         C1.add(lblCarC1);
	         C2.add(lblCarC2);
	         C3.add(lblCarC3);
	         C4.add(lblCarC4);
	         C5.add(lblCarC5);
	         C6.add(lblCarC6);
	         C7.add(lblCarC7);
	         C8.add(lblCarC8);
	         C9.add(lblCarC9);
	         C10.add(lblCarC10);

	         //A1 입차 시간 확인 lable
	         lblCarTA1 = new JLabel("");
	         lblCarTA2 = new JLabel("");
	         lblCarTA3 = new JLabel("");
	         lblCarTA4 = new JLabel("");
	         lblCarTA5 = new JLabel("");
	         lblCarTA6 = new JLabel("");
	         lblCarTA7 = new JLabel("");
	         lblCarTA8 = new JLabel("");
	         lblCarTA9 = new JLabel("");
	         lblCarTA10 = new JLabel("");


	         //B1 입차 시간 확인 lable
	         lblCarTB1 = new JLabel("");
	         lblCarTB2 = new JLabel("");
	         lblCarTB3 = new JLabel("");
	         lblCarTB4 = new JLabel("");
	         lblCarTB5 = new JLabel("");
	         lblCarTB6 = new JLabel("");
	         lblCarTB7 = new JLabel("");
	         lblCarTB8 = new JLabel("");
	         lblCarTB9 = new JLabel("");
	         lblCarTB10 = new JLabel("");
	         
	         
	         //C
	         lblCarTC1 = new JLabel("");
	         lblCarTC2 = new JLabel("");
	         lblCarTC3 = new JLabel("");
	         lblCarTC4 = new JLabel("");
	         lblCarTC5 = new JLabel("");
	         lblCarTC6 = new JLabel("");
	         lblCarTC7 = new JLabel("");
	         lblCarTC8 = new JLabel("");
	         lblCarTC9 = new JLabel("");
	         lblCarTC10 = new JLabel("");


	         //입차 시간 레이블 삽입
	         /*
	         A1.add(lblCarTA1);
	         A2.add(lblCarTA2);
	         A3.add(lblCarTA3);
	         A4.add(lblCarTA4);
	         A5.add(lblCarTA5);
	         A6.add(lblCarTA6);
	         A7.add(lblCarTA7);
	         A8.add(lblCarTA8);
	         A9.add(lblCarTA9);
	         A10.add(lblCarTA10);
	         B1.add(lblCarTB1);
	         B2.add(lblCarTB2);
	         B3.add(lblCarTB3);
	         B4.add(lblCarTB4);
	         B5.add(lblCarTB5);
	         B6.add(lblCarTB6);
	         B7.add(lblCarTB7);
	         B8.add(lblCarTB8);
	         B9.add(lblCarTB9);
	         B10.add(lblCarTB10);
*/


	         // A열 주차공간 등록
	         panMonitor.add(panMenucen);
	         panMonitor.add(A1);
	         panMonitor.add(A2);
	         panMonitor.add(A3);
	         panMonitor.add(A4);
	         panMonitor.add(A5);
	         panMonitor.add(A6);
	         panMonitor.add(A7);
	         panMonitor.add(A8);
	         panMonitor.add(A9);
	         panMonitor.add(A10);
	         // B열 주차공간 등록
	         panMonitor.add(panMenucen1);
	         panMonitor.add(B1);
	         panMonitor.add(B2);
	         panMonitor.add(B3);
	         panMonitor.add(B4);
	         panMonitor.add(B5);
	         panMonitor.add(B6);
	         panMonitor.add(B7);
	         panMonitor.add(B8);
	         panMonitor.add(B9);
	         panMonitor.add(B10);
	         
	         panMonitor.add(panMenucen2);
	         panMonitor.add(C1);
	         panMonitor.add(C2);
	         panMonitor.add(C3);
	         panMonitor.add(C4);
	         panMonitor.add(C5);
	         panMonitor.add(C6);
	         panMonitor.add(C7);
	         panMonitor.add(C8);
	         panMonitor.add(C9);
	         panMonitor.add(C10);






	}
	

	public String GetArea() {
		return this.Area;
	}
	




	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		//왼쪽 메뉴 구현부
		if(obj == btnHelp)
		{if(HP==null) {//help창이 안켜져있는경우 킬려고 사용
			HP =new Help("도움말");
		}
		else {//켜져있는경우 도움말 창 끄고 다시키기
			HP.dispose();
			HP =new Help("도움말");
		}
		
		}
		else if(obj == btnExit)
		{
			System.exit(0);
		}
		else if(obj == btnPay)
		{
			new Pay("정산", this);
		}
		
		else if(obj == btn){
			
			t1 = tf.getText().trim();
			
			if(tf.getText().isEmpty() == false) {
				if(4>tf.getText().length() == false) { //영진수정 차량번호  7자리 이상
								new FMC("차량찾기", tf);	
				}
				else {
					JOptionPane.showMessageDialog(null, "4자리 입력해주세요","입력오류",JOptionPane.ERROR_MESSAGE);
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "차량번호를 입력해주세요!","알림", JOptionPane.WARNING_MESSAGE);
			}
	
		
		}
		
		
		
		
		
		
		
		   else if(obj == btnA1)
	       {
			  new InsertCar("차량 번호 입력",this);
			  Area = "A1";
	       }
	       else if(obj == btnA2)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "A2";
	       }
	       else if(obj == btnA3)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "A3";
	       }
	       else if(obj == btnA4)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "A4";
	       }
	       else if(obj == btnA5)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "A5";
	       }
	       else if(obj == btnA6)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "A6";
	       }
	       else if(obj == btnA7)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "A7";
	       }
	       else if(obj == btnA8)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "A8";
	       }
	       else if(obj == btnA9)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "A9";
	       }
	       else if(obj == btnA10)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "A10";
	       }
	       else if(obj == btnB1)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "B1";
	       }
	       else if(obj == btnB2)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "B2";
	       }
	       else if(obj == btnB3)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "B3";
	       }
	       else if(obj == btnB4)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "B4";
	       }
	       else if(obj == btnB5)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "B5";
	       }
	       else if(obj == btnB6)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "B6";
	       }
	       else if(obj == btnB7)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "B7";
	       }
	       else if(obj == btnB8)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "B8";
	       }
	       else if(obj == btnB9)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "B9";
	       }
	       else if(obj == btnB10)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "B10";
	       }
	       else if(obj == btnC1)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "C1";
	       }
	       else if(obj == btnC2)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "C2";
	       }
	       else if(obj == btnC3)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "C3";
	       }
	       else if(obj == btnC4)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "C4";
	       }
	       else if(obj == btnC5)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "C5";
	       }
	       else if(obj == btnC6)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "C6";
	       }
	       else if(obj == btnC7)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "C7";
	       }
	       else if(obj == btnC8)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "C8";
	       }	       
	       else if(obj == btnC9)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "C9";
	       }
	       else if(obj == btnC10)
	       {
	    	   new InsertCar("차량 번호 입력",this);
	    	   Area = "C10";
	       }
//	       else if(obj == btnWhereMyCar)
//	       {
//	    	   new FMC("차량 위치 검색");
//	       }
	        else if(obj ==btnlog) {
	        	{if(log==null) {//help창이 안켜져있는경우 킬려고 사용
	    			log =new Log("로그창");
	    		}
	    		else {//켜져있는경우 도움말 창 끄고 다시키기
	    			log.dispose();
	    			log =new Log("로그창");
	        }
	        	}}
	       
        	
	}


	public JLabel getLblCarA1() {
		return lblCarA1;
	}




	public void setLblCarA1(JLabel lblCarA1) {
		this.lblCarA1 = lblCarA1;
	}




	public JLabel getLblCarA2() {
		return lblCarA2;
	}




	public void setLblCarA2(JLabel lblCarA2) {
		this.lblCarA2 = lblCarA2;
	}




	public JLabel getLblCarA3() {
		return lblCarA3;
	}




	public void setLblCarA3(JLabel lblCarA3) {
		this.lblCarA3 = lblCarA3;
	}




	public JLabel getLblCarA4() {
		return lblCarA4;
	}




	public void setLblCarA4(JLabel lblCarA4) {
		this.lblCarA4 = lblCarA4;
	}




	public JLabel getLblCarA5() {
		return lblCarA5;
	}




	public void setLblCarA5(JLabel lblCarA5) {
		this.lblCarA5 = lblCarA5;
	}




	public JLabel getLblCarA6() {
		return lblCarA6;
	}




	public void setLblCarA6(JLabel lblCarA6) {
		this.lblCarA6 = lblCarA6;
	}




	public JLabel getLblCarA7() {
		return lblCarA7;
	}




	public void setLblCarA7(JLabel lblCarA7) {
		this.lblCarA7 = lblCarA7;
	}




	public JLabel getLblCarA8() {
		return lblCarA8;
	}




	public void setLblCarA8(JLabel lblCarA8) {
		this.lblCarA8 = lblCarA8;
	}




	public JLabel getLblCarA9() {
		return lblCarA9;
	}




	public void setLblCarA9(JLabel lblCarA9) {
		this.lblCarA9 = lblCarA9;
	}




	public JLabel getLblCarA10() {
		return lblCarA10;
	}




	public void setLblCarA10(JLabel lblCarA10) {
		this.lblCarA10 = lblCarA10;
	}




	public JLabel getLblCarB1() {
		return lblCarB1;
	}




	public void setLblCarB1(JLabel lblCarB1) {
		this.lblCarB1 = lblCarB1;
	}




	public JLabel getLblCarB2() {
		return lblCarB2;
	}




	public void setLblCarB2(JLabel lblCarB2) {
		this.lblCarB2 = lblCarB2;
	}




	public JLabel getLblCarB3() {
		return lblCarB3;
	}




	public void setLblCarB3(JLabel lblCarB3) {
		this.lblCarB3 = lblCarB3;
	}




	public JLabel getLblCarB4() {
		return lblCarB4;
	}




	public void setLblCarB4(JLabel lblCarB4) {
		this.lblCarB4 = lblCarB4;
	}




	public JLabel getLblCarB5() {
		return lblCarB5;
	}




	public void setLblCarB5(JLabel lblCarB5) {
		this.lblCarB5 = lblCarB5;
	}




	public JLabel getLblCarB6() {
		return lblCarB6;
	}




	public void setLblCarB6(JLabel lblCarB6) {
		this.lblCarB6 = lblCarB6;
	}




	public JLabel getLblCarB7() {
		return lblCarB7;
	}




	public void setLblCarB7(JLabel lblCarB7) {
		this.lblCarB7 = lblCarB7;
	}




	public JLabel getLblCarB8() {
		return lblCarB8;
	}




	public void setLblCarB8(JLabel lblCarB8) {
		this.lblCarB8 = lblCarB8;
	}




	public JLabel getLblCarB9() {
		return lblCarB9;
	}




	public void setLblCarB9(JLabel lblCarB9) {
		this.lblCarB9 = lblCarB9;
	}




	public JLabel getLblCarB10() {
		return lblCarB10;
	}

	
	
	public void setLblCarB10(JLabel lblCarB10) {
		this.lblCarB10 = lblCarB10;
	}

	public JLabel getLblCarC1() {
		return lblCarC1;
	}

///추가
	public void setLblCarC1(JLabel lblCarC1) {
		this.lblCarC1 = lblCarC1;
	}

	public JLabel getLblCarC2() {
		return lblCarC2;
	}


	public void setLblCarC2(JLabel lblCarC2) {
		this.lblCarC2 = lblCarC2;
	}
	
	public JLabel getLblCarC3() {
		return lblCarC3;
	}


	public void setLblCarC3(JLabel lblCarC3) {
		this.lblCarC3 = lblCarC3;
	}

	public JLabel getLblCarC4() {
		return lblCarC4;
	}


	public void setLblCarC4(JLabel lblCarC4) {
		this.lblCarC4 = lblCarC4;
	}
	
	public JLabel getLblCarC5() {
		return lblCarC5;
	}


	public void setLblCarC5(JLabel lblCarC5) {
		this.lblCarC5 = lblCarC5;
	}
	
	public JLabel getLblCarC6() {
		return lblCarC6;
	}


	public void setLblCarC6(JLabel lblCarC6) {
		this.lblCarC6 = lblCarC6;
	}
	

	public JLabel getLblCarC7() {
		return lblCarC7;
	}


	public void setLblCarC7(JLabel lblCarC7) {
		this.lblCarC7 = lblCarC7;
	}

	public JLabel getLblCarC8() {
		return lblCarC8;
	}


	public void setLblCarC8(JLabel lblCarC8) {
		this.lblCarC8 = lblCarC8;
	}
	
	public JLabel getLblCarC9() {
		return lblCarC9;
	}


	public void setLblCarC9(JLabel lblCarC9) {
		this.lblCarC9 = lblCarC9;
	}

	public JLabel getLblCarC10() {
		return lblCarC10;
	}


	public void setLblCarC10(JLabel lblCarC10) {
		this.lblCarC10 = lblCarC10;
	}
	

	
	
	public JLabel getLblCarTA1() {
		return lblCarTA1;
	}




	public void setLblCarTA1(JLabel lblCarTA1) {
		this.lblCarTA1 = lblCarTA1;
	}




	public JLabel getLblCarTA2() {
		return lblCarTA2;
	}




	public void setLblCarTA2(JLabel lblCarTA2) {
		this.lblCarTA2 = lblCarTA2;
	}




	public JLabel getLblCarTA3() {
		return lblCarTA3;
	}




	public void setLblCarTA3(JLabel lblCarTA3) {
		this.lblCarTA3 = lblCarTA3;
	}




	public JLabel getLblCarTA4() {
		return lblCarTA4;
	}




	public void setLblCarTA4(JLabel lblCarTA4) {
		this.lblCarTA4 = lblCarTA4;
	}




	public JLabel getLblCarTA5() {
		return lblCarTA5;
	}




	public void setLblCarTA5(JLabel lblCarTA5) {
		this.lblCarTA5 = lblCarTA5;
	}




	public JLabel getLblCarTA6() {
		return lblCarTA6;
	}




	public void setLblCarTA6(JLabel lblCarTA6) {
		this.lblCarTA6 = lblCarTA6;
	}




	public JLabel getLblCarTA7() {
		return lblCarTA7;
	}




	public void setLblCarTA7(JLabel lblCarTA7) {
		this.lblCarTA7 = lblCarTA7;
	}




	public JLabel getLblCarTA8() {
		return lblCarTA8;
	}




	public void setLblCarTA8(JLabel lblCarTA8) {
		this.lblCarTA8 = lblCarTA8;
	}




	public JLabel getLblCarTA9() {
		return lblCarTA9;
	}




	public void setLblCarTA9(JLabel lblCarTA9) {
		this.lblCarTA9 = lblCarTA9;
	}




	public JLabel getLblCarTA10() {
		return lblCarTA10;
	}




	public void setLblCarTA10(JLabel lblCarTA10) {
		this.lblCarTA10 = lblCarTA10;
	}




	public JLabel getLblCarTB1() {
		return lblCarTB1;
	}




	public void setLblCarTB1(JLabel lblCarTB1) {
		this.lblCarTB1 = lblCarTB1;
	}




	public JLabel getLblCarTB2() {
		return lblCarTB2;
	}




	public void setLblCarTB2(JLabel lblCarTB2) {
		this.lblCarTB2 = lblCarTB2;
	}




	public JLabel getLblCarTB3() {
		return lblCarTB3;
	}




	public void setLblCarTB3(JLabel lblCarTB3) {
		this.lblCarTB3 = lblCarTB3;
	}




	public JLabel getLblCarTB4() {
		return lblCarTB4;
	}




	public void setLblCarTB4(JLabel lblCarTB4) {
		this.lblCarTB4 = lblCarTB4;
	}




	public JLabel getLblCarTB5() {
		return lblCarTB5;
	}




	public void setLblCarTB5(JLabel lblCarTB5) {
		this.lblCarTB5 = lblCarTB5;
	}




	public JLabel getLblCarTB6() {
		return lblCarTB6;
	}




	public void setLblCarTB6(JLabel lblCarTB6) {
		this.lblCarTB6 = lblCarTB6;
	}




	public JLabel getLblCarTB7() {
		return lblCarTB7;
	}




	public void setLblCarTB7(JLabel lblCarTB7) {
		this.lblCarTB7 = lblCarTB7;
	}




	public JLabel getLblCarTB8() {
		return lblCarTB8;
	}




	public void setLblCarTB8(JLabel lblCarTB8) {
		this.lblCarTB8 = lblCarTB8;
	}




	public JLabel getLblCarTB9() {
		return lblCarTB9;
	}




	public void setLblCarTB9(JLabel lblCarTB9) {
		this.lblCarTB9 = lblCarTB9;
	}




	public JLabel getLblCarTB10() {
		return lblCarTB10;
	}




	public void setLblCarTB10(JLabel lblCarTB10) {
		this.lblCarTB10 = lblCarTB10;
	}


	public JLabel getLblCarTC1() {
		return lblCarTC1;
	}

	public void setLblCarTC1(JLabel lblCarTC1) {
		this.lblCarTC1 = lblCarTC1;
	}

	public JLabel getLblCarTC2() {
		return lblCarTC2;
	}

	public void setLblCarTC2(JLabel lblCarTC2) {
		this.lblCarTC2 = lblCarTC2;
	}
	public JLabel getLblCarTC3() {
		return lblCarTC3;
	}

	public void setLblCarTC3(JLabel lblCarTC3) {
		this.lblCarTC3 = lblCarTC3;
	}
	public JLabel getLblCarTC4() {
		return lblCarTC4;
	}

	public void setLblCarTC4(JLabel lblCarTC4) {
		this.lblCarTC4 = lblCarTC4;
	}
	public JLabel getLblCarTC5() {
		return lblCarTC5;
	}

	public void setLblCarTC5(JLabel lblCarTC5) {
		this.lblCarTC5 = lblCarTC5;
	}
	public JLabel getLblCarTC6() {
		return lblCarTC6;
	}

	public void setLblCarTC6(JLabel lblCarTC6) {
		this.lblCarTC6 = lblCarTC6;
	}
	public JLabel getLblCarTC7() {
		return lblCarTC7;
	}

	public void setLblCarTC7(JLabel lblCarTC7) {
		this.lblCarTC7 = lblCarTC7;
	}
	public JLabel getLblCarTC8() {
		return lblCarTC8;
	}

	public void setLblCarTC8(JLabel lblCarTC8) {
		this.lblCarTC8 = lblCarTC8;
	}
	public JLabel getLblCarTC9() {
		return lblCarTC9;
	}

	public void setLblCarTC9(JLabel lblCarTC9) {
		this.lblCarTC9 = lblCarTC9;
	}
	public JLabel getLblCarTC10() {
		return lblCarTC10;
	}

	public void setLblCarTC10(JLabel lblCarTC10) {
		this.lblCarTC10 = lblCarTC10;
	}
	
	/////////////
	public JButton getBtnA1() {
		return btnA1;
	}

	public void setBtnA1(JButton btnA1) {
		this.btnA1 = btnA1;
	}




	public JButton getBtnA2() {
		return btnA2;
	}




	public void setBtnA2(JButton btnA2) {
		this.btnA2 = btnA2;
	}




	public JButton getBtnA3() {
		return btnA3;
	}




	public void setBtnA3(JButton btnA3) {
		this.btnA3 = btnA3;
	}




	public JButton getBtnA4() {
		return btnA4;
	}




	public void setBtnA4(JButton btnA4) {
		this.btnA4 = btnA4;
	}




	public JButton getBtnA5() {
		return btnA5;
	}




	public void setBtnA5(JButton btnA5) {
		this.btnA5 = btnA5;
	}




	public JButton getBtnA6() {
		return btnA6;
	}




	public void setBtnA6(JButton btnA6) {
		this.btnA6 = btnA6;
	}




	public JButton getBtnA7() {
		return btnA7;
	}




	public void setBtnA7(JButton btnA7) {
		this.btnA7 = btnA7;
	}




	public JButton getBtnA8() {
		return btnA8;
	}




	public void setBtnA8(JButton btnA8) {
		this.btnA8 = btnA8;
	}




	public JButton getBtnA9() {
		return btnA9;
	}




	public void setBtnA9(JButton btnA9) {
		this.btnA9 = btnA9;
	}




	public JButton getBtnA10() {
		return btnA10;
	}




	public void setBtnA10(JButton btnA10) {
		this.btnA10 = btnA10;
	}




	public JButton getBtnB1() {
		return btnB1;
	}




	public void setBtnB1(JButton btnB1) {
		this.btnB1 = btnB1;
	}




	public JButton getBtnB2() {
		return btnB2;
	}




	public void setBtnB2(JButton btnB2) {
		this.btnB2 = btnB2;
	}




	public JButton getBtnB3() {
		return btnB3;
	}




	public void setBtnB3(JButton btnB3) {
		this.btnB3 = btnB3;
	}




	public JButton getBtnB4() {
		return btnB4;
	}




	public void setBtnB4(JButton btnB4) {
		this.btnB4 = btnB4;
	}




	public JButton getBtnB5() {
		return btnB5;
	}




	public void setBtnB5(JButton btnB5) {
		this.btnB5 = btnB5;
	}




	public JButton getBtnB6() {
		return btnB6;
	}




	public void setBtnB6(JButton btnB6) {
		this.btnB6 = btnB6;
	}




	public JButton getBtnB7() {
		return btnB7;
	}




	public void setBtnB7(JButton btnB7) {
		this.btnB7 = btnB7;
	}




	public JButton getBtnB8() {
		return btnB8;
	}




	public void setBtnB8(JButton btnB8) {
		this.btnB8 = btnB8;
	}




	public JButton getBtnB9() {
		return btnB9;
	}




	public void setBtnB9(JButton btnB9) {
		this.btnB9 = btnB9;
	}




	public JButton getBtnB10() {
		return btnB10;
	}




	public void setBtnB10(JButton btnB10) {
		this.btnB10 = btnB10;
	}
	//추가
	public JButton getBtnC1() {
		return btnC1;
	}
	public void setBtnC1(JButton btnC1) {
		this.btnC1 = btnC1;
	}

	public JButton getBtnC2() {
		return btnC2;
	}
	public void setBtnC2(JButton btnC2) {
		this.btnC2 = btnC2;
	}

	public JButton getBtnC3() {
		return btnC3;
	}
	public void setBtnC3(JButton btnC3) {
		this.btnC3 = btnC3;
	}

	public JButton getBtnC4() {
		return btnC4;
	}
	public void setBtnC4(JButton btnC4) {
		this.btnC4 = btnC4;
	}

	public JButton getBtnC5() {
		return btnC5;
	}
	public void setBtnC5(JButton btnC5) {
		this.btnC5 = btnC5;
	}

	public JButton getBtnC6() {
		return btnC6;
	}
	public void setBtnC6(JButton btnC6) {
		this.btnC6 = btnC6;
	}

	public JButton getBtnC7() {
		return btnC7;
	}
	public void setBtnC7(JButton btnC7) {
		this.btnC7 = btnC7;
	}

	public JButton getBtnC8() {
		return btnC8;
	}
	public void setBtnC8(JButton btnC8) {
		this.btnC8 = btnC8;
	}

	public JButton getBtnC9() {
		return btnC9;
	}
	public void setBtnC9(JButton btnC9) {
		this.btnC9 = btnC9;
	}

	public JButton getBtnC10() {
		return btnC10;
	}
	public void setBtnC10(JButton btnC10) {
		this.btnC10 = btnC10;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public JPanel getA1() {
		return A1;
	}




	public void setA1(JPanel a1) {
		A1 = a1;
	}




	public JPanel getA2() {
		return A2;
	}




	public void setA2(JPanel a2) {
		A2 = a2;
	}




	public JPanel getA3() {
		return A3;
	}




	public void setA3(JPanel a3) {
		A3 = a3;
	}




	public JPanel getA4() {
		return A4;
	}




	public void setA4(JPanel a4) {
		A4 = a4;
	}




	public JPanel getA5() {
		return A5;
	}




	public void setA5(JPanel a5) {
		A5 = a5;
	}




	public JPanel getA6() {
		return A6;
	}




	public void setA6(JPanel a6) {
		A6 = a6;
	}




	public JPanel getA7() {
		return A7;
	}




	public void setA7(JPanel a7) {
		A7 = a7;
	}




	public JPanel getA8() {
		return A8;
	}




	public void setA8(JPanel a8) {
		A8 = a8;
	}




	public JPanel getA9() {
		return A9;
	}




	public void setA9(JPanel a9) {
		A9 = a9;
	}




	public JPanel getA10() {
		return A10;
	}




	public void setA10(JPanel a10) {
		A10 = a10;
	}




	public JPanel getB1() {
		return B1;
	}




	public void setB1(JPanel b1) {
		B1 = b1;
	}




	public JPanel getB2() {
		return B2;
	}




	public void setB2(JPanel b2) {
		B2 = b2;
	}




	public JPanel getB3() {
		return B3;
	}




	public void setB3(JPanel b3) {
		B3 = b3;
	}




	public JPanel getB4() {
		return B4;
	}




	public void setB4(JPanel b4) {
		B4 = b4;
	}




	public JPanel getB5() {
		return B5;
	}




	public void setB5(JPanel b5) {
		B5 = b5;
	}




	public JPanel getB6() {
		return B6;
	}




	public void setB6(JPanel b6) {
		B6 = b6;
	}




	public JPanel getB7() {
		return B7;
	}




	public void setB7(JPanel b7) {
		B7 = b7;
	}




	public JPanel getB8() {
		return B8;
	}




	public void setB8(JPanel b8) {
		B8 = b8;
	}




	public JPanel getB9() {
		return B9;
	}




	public void setB9(JPanel b9) {
		B9 = b9;
	}




	public JPanel getB10() {
		return B10;
	}




	public void setB10(JPanel b10) {
		B10 = b10;
	}
	//추가
	public JPanel getC1() {
		return C1;
	}
	public void setC1(JPanel c1) {
		C1 = c1;
	}
	public JPanel getC2() {
		return C2;
	}
	public void setC2(JPanel c2) {
		C2 = c2;
	}
	public JPanel getC3() {
		return C3;
	}
	public void setC3(JPanel c3) {
		C3 = c3;
	}
	public JPanel getC4() {
		return C4;
	}
	public void setC4(JPanel c4) {
		C4 = c4;
	}
	public JPanel getC5() {
		return C5;
	}
	public void setC5(JPanel c5) {
		C5 = c5;
	}
	public JPanel getC6() {
		return C6;
	}
	public void setC6(JPanel c6) {
		C6 = c6;
	}
	public JPanel getC7() {
		return C7;
	}
	public void setC7(JPanel c7) {
		C7 = c7;
	}
	public JPanel getC8() {
		return C8;
	}
	public void setC8(JPanel c8) {
		C8 = c8;
	}
	public JPanel getC9() {
		return C9;
	}
	public void setC9(JPanel c9) {
		C9 = c9;
	}
	public JPanel getC10() {
		return C10;
	}
	public void setC10(JPanel c10) {
		C10 = c10;
	}
	

	
}






		