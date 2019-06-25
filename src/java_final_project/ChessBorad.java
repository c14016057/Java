package java_final_project;
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;
public class ChessBorad extends JLabel{
	public ChessBorad(){
		setSize(1100,1000);
		setBackground(Color.YELLOW);
		setLayout(null);
		setLocation(0, 0);
		try{
			ImageIcon icon=new ImageIcon("chessborad.png");
			setIcon(icon);
		}catch(Exception e){
			e.printStackTrace();
		}
		/*System board*/
	/*	JPanel systemp=new JPanel();
		systemp.setBackground(Color.orange);
		systemp.setSize(200,1000);
		systemp.setLocation(900, 0);
		add(systemp);*/
		/**/
		JLabel turnLabel=new JLabel("輪到:");
		Font f=new Font("標楷體",Font.BOLD,30);
		turnLabel.setFont(f);
		turnLabel.setSize(150,100);
		turnLabel.setLocation(910, 500);
		add(turnLabel);
		/*restart button*/
		JButton restart=new RestartButton(this);
		add(restart);
		/*test button*/
		JButton test=new TestButton(this);
		add(test);
		/*computer button*/
		JButton computer=new ComputerButton(this);
		add(computer);
		
		
		
		/**/
		Chess ch1=new Car(this,Color.black,0,0);
		Chess ch2=new Horse(this,Color.black,100,0);
		Chess ch3=new Elephant(this,Color.black,200,0);
		Chess ch4=new Scholar(this,Color.black,300,0);
		Chess ch5=new King(this,Color.black,400,0);
		Chess ch6=new Scholar(this,Color.black,500,0);
		Chess ch7=new Elephant(this,Color.black,600,0);
		Chess ch8=new Horse(this,Color.black,700,0);
		Chess ch9=new Car(this,Color.black,800,0);
		Chess ch10=new Cannon(this,Color.black,100,200);
		Chess ch11=new Cannon(this,Color.black,700,200);
		Chess ch12=new Soldier(this,Color.black,0,300);
		Chess ch13=new Soldier(this,Color.black,200,300);
		Chess ch14=new Soldier(this,Color.black,400,300);
		Chess ch15=new Soldier(this,Color.black,600,300);
		Chess ch16=new Soldier(this,Color.black,800,300);
 
		
		
		add(ch1);
		allChess[0]=ch1;
		add(ch2);
		allChess[1]=ch2;
		add(ch3);
		allChess[2]=ch3;
		add(ch4);
		allChess[3]=ch4;
		add(ch5);
		allChess[4]=ch5;
		add(ch6);
		allChess[5]=ch6;
		add(ch7);
		allChess[6]=ch7;
		add(ch8);
		allChess[7]=ch8;
		add(ch9);
		allChess[8]=ch9;
		add(ch10);
		allChess[9]=ch10;
		add(ch11);
		allChess[10]=ch11;
		add(ch12);
		allChess[11]=ch12;
		add(ch13);
		allChess[12]=ch13;
		add(ch14);
		allChess[13]=ch14;
		add(ch15);
		allChess[14]=ch15;
		add(ch16);
		allChess[15]=ch16;
		Chess ch17=new Car(this,Color.red,0,900);
		Chess ch18=new Horse(this,Color.red,100,900);
		Chess ch19=new Elephant(this,Color.red,200,900);
		Chess ch20=new Scholar(this,Color.red,300,900);
		Chess ch21=new King(this,Color.red,400,900);
		Chess ch22=new Scholar(this,Color.red,500,900);
		Chess ch23=new Elephant(this,Color.red,600,900);
		Chess ch24=new Horse(this,Color.red,700,900);
		Chess ch25=new Car(this,Color.red,800,900);
		Chess ch26=new Cannon(this,Color.red,100,700);
		Chess ch27=new Cannon(this,Color.red,700,700);
		Chess ch28=new Soldier(this,Color.red,0,600);
		Chess ch29=new Soldier(this,Color.red,200,600);
		Chess ch30=new Soldier(this,Color.red,400,600);
		Chess ch31=new Soldier(this,Color.red,600,600);
		Chess ch32=new Soldier(this,Color.red,800,600);
 
		
		
		add(ch17);
		allChess[16]=ch17;
		add(ch18);
		allChess[17]=ch18;
		add(ch19);
		allChess[18]=ch19;
		add(ch20);
		allChess[19]=ch20;
		add(ch21);
		allChess[20]=ch21;
		add(ch22);
		allChess[21]=ch22;
		add(ch23);
		allChess[22]=ch23;
		add(ch24);
		allChess[23]=ch24;
		add(ch25);
		allChess[24]=ch25;
		add(ch26);
		allChess[25]=ch26;
		add(ch27);
		allChess[26]=ch27;
		add(ch28);
		allChess[27]=ch28;
		add(ch29);
		allChess[28]=ch29;
		add(ch30);
		allChess[29]=ch30;
		add(ch31);
		allChess[30]=ch31;
		add(ch32);
		allChess[31]=ch32;
		int temp=32;
		Nothing[] norow1=new Nothing[9];
		for(int i=0;i<9;i++){
			norow1[i]=new Nothing(this,0+100*i,100);
			allChess[temp]=norow1[i];
			temp++;
			add(norow1[i]);
		}
		Nothing[] norow2=new Nothing[9];
		for(int i=0;i<9;i++){
			if(i!=1&&i!=7){
				norow2[i]=new Nothing(this,0+100*i,200);
				allChess[temp]=norow2[i];
				temp++;
				add(norow2[i]);
			}			
		}
		Nothing[] norow3=new Nothing[5];
		for(int i=0;i<4;i++){
			norow3[i]=new Nothing(this,100+200*i,300);
			allChess[temp]=norow3[i];
			temp++;
			add(norow3[i]);
						
		}
		Nothing[] norow4=new Nothing[9];
		for(int i=0;i<9;i++){
			norow4[i]=new Nothing(this,0+100*i,400);
			allChess[temp]=norow4[i];
			temp++;
			add(norow4[i]);
		}
		Nothing[] norow5=new Nothing[9];
		for(int i=0;i<9;i++){
			norow5[i]=new Nothing(this,0+100*i,500);
			allChess[temp]=norow5[i];
			temp++;
			add(norow5[i]);
		}
		Nothing[] norow6=new Nothing[5];
		for(int i=0;i<4;i++){
			norow6[i]=new Nothing(this,100+200*i,600);
			allChess[temp]=norow6[i];
			temp++;
			add(norow6[i]);
						
		}
		Nothing[] norow7=new Nothing[9];
		for(int i=0;i<9;i++){
			if(i!=1&&i!=7){
				norow7[i]=new Nothing(this,0+100*i,700);
				allChess[temp]=norow7[i];
				temp++;
				add(norow7[i]);
			}			
		}
		Nothing[] norow8=new Nothing[9];
		for(int i=0;i<9;i++){
			norow8[i]=new Nothing(this,0+100*i,800);
			allChess[temp]=norow8[i];
			temp++;
			add(norow8[i]);
		}
	
		
	
	}
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D gg=(Graphics2D)g;
		gg.setStroke(new BasicStroke(10.0F,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
		gg.setColor(Color.cyan);
		if(signaled==1){
			gg.drawOval(fromX+10, fromY+10, 80, 80);
		}
		if(turn==Color.red && testMode==0){
			gg.setColor(Color.red);
			gg.drawOval(1000, 510, 80, 80);
		}
		else if(testMode==0){
			gg.setColor(Color.black);
			gg.drawOval(1000, 510, 80, 80);
		}
		/*for(int i=0;i<10;i++) gg.drawLine(50, 50+i*100, 850, 50+i*100);
		gg.drawLine(50, 50, 50, 950);
		gg.drawLine(850, 50, 850, 950);
		for(int i=0;i<7;i++) gg.drawLine(150+i*100, 50, 150+i*100, 450);
		for(int i=0;i<7;i++) gg.drawLine(150+i*100, 550, 150+i*100, 950);
		gg.drawLine(350, 50, 550, 250);
		gg.drawLine(550, 50, 350, 250);
		gg.drawLine(350, 750, 550, 950);
		gg.drawLine(550, 750, 350, 950);
		gg.setStroke(new BasicStroke(30.0F,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
		gg.drawLine(150, 250, 150, 250);
		gg.drawLine(750, 250, 750, 250);
		gg.drawLine(150, 750, 150, 750);
		gg.drawLine(750, 750, 750, 750);
		for(int i=0;i<5;i++) gg.drawLine(50+200*i, 350, 50+200*i, 350);
		for(int i=0;i<5;i++) gg.drawLine(50+200*i, 650, 50+200*i, 650);*/
	}
	public void restartClick(){
		for(int i=0;i<90;i++) allChess[i].recover();
		
		while(eaten>0){
			eaten--;
			nothingChess[eaten].setVisible(false);
		}
		
		turn=Color.red;
		signaled=0;
		testMode=0;
		computerMode=0;
		repaint();
		
		//for(int i=0;i<32;i++) System.out.printf("%d (%d %d) %s\n", i,allChess[i].get_X(),allChess[i].get_Y(),allChess[i].visible);
		
		
	}
	public void testClick(){
		testMode=1;
		repaint();
	}
	public void computerClick(){
		computerMode=1;
		computerThink();
	}
    private void computerThink(){
    	int tx=0,ty;
    	double power,max=-200;   	
    	for(int i=0;i<90;i++) allChess[i].fixState();
    	Chess dist=allChess[0],from=allChess[0];
    	
    	for(int i=0;i<32;i++){
    		for(int mm=0;mm<90;mm++) allChess[mm].recoverState();
    		if(allChess[i].visible  &&  allChess[i].color==Color.black){
    			for(int j=0;j<90;j++){
    				//if(allChess[i].leagleMove(allChess[j].get_X(), allChess[j].get_Y())) tx=1;
    				//System.out.printf("%d %d \n",allChess[j].get_X(),allChess[j].get_Y());
    				for(int m=0;m<90;m++) allChess[m].recoverState();
        			fromX=allChess[i].get_X();
        			fromY=allChess[i].get_Y();
    				destX=allChess[j].get_X();
                    destY=allChess[j].get_Y();
                    destColor=allChess[j].color;
                    destChess=allChess[j];
    				if(   (allChess[j].color!=Color.black || allChess[j].visible==false)   &&   allChess[i].leagleMove(allChess[j].get_X(), allChess[j].get_Y())) {
                        power=0;
                        //System.out.println("lemu");
    					for(int k=0;k<3000;k++){
    						for(int l=0;l<90;l++) allChess[l].recoverState();
    						tx=allChess[i].get_X();
    						ty=allChess[i].get_Y();
    						allChess[i].newXY(allChess[j].get_X(), allChess[j].get_Y());
    						allChess[j].newXY(tx, ty); 
    						allChess[j].visible=false;
    						smartRandom(9);
    						//System.out.printf("checkp= %f\n", checkP());
    						power=power+checkP()/3000;
    					}
    					if(power>max){
    						max=power;
    						dist=allChess[j];
    						from=allChess[i];
    						for(int kk=0;kk<90;kk++) allChess[kk].recoverState();
    						System.out.printf("test:%d (%d %d) to %d(%d %d) max= %f\n",i,allChess[i].get_X(),allChess[i].get_Y(),j,allChess[j].get_X(),allChess[j].get_Y(),max);
    					}
    				}
    			}
    		}
    	}
    	for(int mmm=0;mmm<90;mmm++) allChess[mmm].recoverState();
    	System.out.printf("from %d %d to %d %d\n",from.get_X(),from.get_Y(),dist.get_X(),dist.get_Y());
  
    }
    private void smartRandom(int step){
    	Color now=Color.red,temp;
    	Color next=Color.black;
    	int canStep,tx,ty,bre=0;
    	Random ran = new Random();
       //(ran.nextInt(42));
         for(int s=0;s<step;s++){
    		canStep=0;
    		bre=0;
 lable2:   	for(int i=0;i<32;i++){
    			if(allChess[i].color==now && allChess[i].visible==true){
    				fromX=allChess[i].get_X();
        			fromY=allChess[i].get_Y();
    				for(int j=0;j<90;j++){
    					destX=allChess[j].get_X();
                        destY=allChess[j].get_Y();
                        destColor=allChess[j].color;
                        destChess=allChess[j];
    					if((allChess[j].color!=now||allChess[j].visible==false) && allChess[i].leagleMove(allChess[j].get_X(), allChess[j].get_Y())) {
    						canStep++;
    						if(allChess[j].power-allChess[i].power>=3 && allChess[j].visible==true) {
    							//System.out.printf("%d %d to %d %d\n",allChess[i].get_X(),allChess[i].get_Y(),allChess[j].get_X(),allChess[j].get_Y());
    							tx=allChess[i].get_X();
        						ty=allChess[i].get_Y();
        						allChess[i].newXY(allChess[j].get_X(), allChess[j].get_Y());
        						allChess[j].newXY(tx, ty); 
        						allChess[j].visible=false;
                                bre=1;
                                break lable2;
    						}
    					}
    				}
    			}
    		}
    		//System.out.printf("can step=%d\n",canStep);
    		canStep=ran.nextInt(canStep+1);
lable:  	for(int i=0;i<32;i++){
	            if(bre==1) break lable;
    			if(allChess[i].color==now && allChess[i].visible==true){
    				fromX=allChess[i].get_X();
        			fromY=allChess[i].get_Y();
    				for(int j=0;j<90;j++){
    					destX=allChess[j].get_X();
                        destY=allChess[j].get_Y();
                        destColor=allChess[j].color;
                        destChess=allChess[j];
    					if((allChess[j].color!=now||allChess[j].visible==false) && allChess[i].leagleMove(allChess[j].get_X(), allChess[j].get_Y())) canStep--;
    					if(canStep==0){
    						//System.out.printf("%d %d to %d %d\n",allChess[i].get_X(),allChess[i].get_Y(),allChess[j].get_X(),allChess[j].get_Y());
    						tx=allChess[i].get_X();
    						ty=allChess[i].get_Y();
    						allChess[i].newXY(allChess[j].get_X(), allChess[j].get_Y());
    						allChess[j].newXY(tx, ty); 
    						allChess[j].visible=false;
    						break lable;
    					}
    				}
    			}
    		}
    		temp=now;
    		now=next;
    		next=temp;
    	}
    }
    private double checkP(){
    	int black=0;
    	int red=0;
    	int point=0;
        for(int i=0;i<90;i++){
        	if(allChess[i].visible && allChess[i].color!=Color.yellow){
        		if(allChess[i] instanceof King &&allChess[i].color==Color.red) point=100;
        		else if(allChess[i] instanceof King &&allChess[i].color==Color.black) point=1000;
        		else if(allChess[i] instanceof Scholar ) point=3;
        		else if(allChess[i] instanceof Elephant ) point=3;
        		else if(allChess[i] instanceof Car ) point=10;
        		else if(allChess[i] instanceof Horse ) point=6;
        		else if(allChess[i] instanceof Cannon ) point=6;
        		else if(allChess[i] instanceof Soldier ) point=2;
        		
        		if(allChess[i].color==Color.red) red=red+point;
        		else black=black+point;
        	}
        }
    	return black-red;
    }
	public void getSignal(Chess ch,int x,int y,Color co){
		if(signaled==0 && !(co==Color.yellow) && (co==turn||testMode==1)){
			fromX=x;
			fromY=y;
			fromColor=co;
			fromChess=ch;
			signaled=1;
			repaint();
			System.out.println("SIGNAL 1");
		}
		else if(signaled==1){
			destX=x;
			destY=y;
			destChess=ch;
			destColor=co;
			if(co==Color.yellow &&fromChess.leagleMove(x, y)){
				//destX=x;
				//destY=y;
				//destChess=ch;
				fromChess.mysetLocation(destX, destY);
				ch.mysetLocation(fromX, fromY);
				signaled=0;
				if(turn==Color.red) turn=Color.black;
				else turn=Color.red;
				repaint();
				System.out.println("Signal 0");
						
			}	
			else if(co==Color.yellow&&!fromChess.leagleMove(x, y)){
				signaled=0;
				repaint();
				System.out.println("Signal 0");
			}
			else if(co==fromColor){
				signaled=0;
				repaint();
				System.out.println("Signal 0");
			}
			else if(co!=fromColor&&fromChess.leagleMove(x, y)){
				ch.mysetLocation(fromX, fromY);
				ch.myhide();
				fromChess.mysetLocation(x, y);
				nothingChess[eaten]=new Nothing(this,fromX,fromY);
				nothingChess[eaten].setDown(ch);
				add(nothingChess[eaten]);
				if(turn==Color.red) turn=Color.black;
				else turn=Color.red;
				signaled=0;
				repaint();
				System.out.println("Signal 0");
				eaten++;
				
			}
			
			
			/**/
			else{
				signaled=0;
				repaint();
				System.out.println("Signal 0");
			}
		
		
		}
		else{
			signaled=0;
			repaint();
			System.out.println("Signal 0");
		}
		
	}
	public boolean leagleMove(Chess ch,int x,int y){
		if(ch instanceof Horse){
			if((x-ch.X)==-200 && chessExist(ch.X-100,ch.Y)==0) return true; 
			else if((x-ch.X)==200 && chessExist(ch.X+100,ch.Y)==0) return true;
			else if((y-ch.Y)==-200 && chessExist(ch.X,ch.Y-100)==0) return true;
			else if((y-ch.Y)==200 && chessExist(ch.X,ch.Y+100)==0) return true;
		}
		else if(ch instanceof Cannon){
			int stX,stY,enX,enY;
			stX=fromX;
			stY=fromY;
			enX=destX;
			enY=destY;
			if(destColor==Color.yellow||destChess.visible==false){//||destChess.visible==false
				if(stX-enX<0){
					stX=stX+100;
					while(stX<enX){
						if(chessExist(stX,stY)==1) return false;
						stX=stX+100;
					}
					return true;
				}
				else if(stX-enX>0){
					stX=stX-100;
					while(stX>enX){
						if(chessExist(stX,stY)==1) return false;
						stX=stX-100;
					}
					return true;
				}
				else if(stY-enY<0){
					stY=stY+100;
					while(stY<enY){
						if(chessExist(stX,stY)==1) return false;
						stY=stY+100;
					}
					return true;
				}
				else if(stY-enY>0){
					stY=stY-100;
					while(stY>enY){
						if(chessExist(stX,stY)==1) return false;
						stY=stY-100;
					}
					return true;
				}
			}
			else{
				int temp=0;
				if(stX-enX<0){
					stX=stX+100;
					while(stX<enX){
						temp=temp+chessExist(stX,stY);
						stX=stX+100;
					}
				}
				else if(stX-enX>0){
					stX=stX-100;
					while(stX>enX){
						temp=temp+chessExist(stX,stY);
						stX=stX-100;
					}
				}
				else if(stY-enY<0){
					stY=stY+100;
					while(stY<enY){
						temp=temp+chessExist(stX,stY);
						stY=stY+100;
					}
				}
				else if(stY-enY>0){
					stY=stY-100;
					while(stY>enY){
						temp=temp+chessExist(stX,stY);
						stY=stY-100;
					}
				}
				if(temp==1) return true;
			}
		}
		else if(ch instanceof Elephant){
			if(chessExist( (x+ch.X)/2 ,(y+ch.Y)/2  )==0) return true;
			else return false;
		}
		else if(ch instanceof Car){
			int stX,stY,enX,enY;
			stX=fromX;
			stY=fromY;
			enX=destX;
			enY=destY;
			if(ch.color==destColor && destChess.visible==true) return false;
			if(stX-enX<0){
				stX=stX+100;
				while(stX<enX){
					if(chessExist(stX,stY)==1) return false;
					stX=stX+100;
				}
				return true;
			}
			else if(stX-enX>0){
				stX=stX-100;
				while(stX>enX){
					if(chessExist(stX,stY)==1) return false;
					stX=stX-100;
				}
				return true;
			}
			else if(stY-enY<0){
				stY=stY+100;
				while(stY<enY){
					if(chessExist(stX,stY)==1) return false;
					stY=stY+100;
				}
				return true;
			}
			else if(stY-enY>0){
				stY=stY-100;
				while(stY>enY){
					if(chessExist(stX,stY)==1) return false;
					stY=stY-100;
				}
				return true;
			}
		}
		
		return false;
	}
	private int chessExist(int x,int y){
		for(int i=0;i<32;i++){
			if(allChess[i].X==x &&allChess[i].Y==y && allChess[i].visible==true) return 1;
		}
		return 0;
	}
	
	private Chess[] nothingChess=new Chess[32];
	private int eaten=0;
	private int fromX;
	private int fromY;
	private Color fromColor;
	private Chess fromChess;
	private int destX;
	private int destY;
	private Color destColor;
	private Chess destChess;
	private int signaled=0;
	private Chess[] allChess=new Chess[90];
	private Color turn=Color.red;
	private int testMode=0;
	private int computerMode=0;
}

