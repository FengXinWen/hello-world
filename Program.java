package function;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.text.DecimalFormat; 
public class Program {
	public static void main(String[] args) {
		System.out.println("--------------��ѡ������---------------");
		System.out.println("1:����");
		System.out.println("2:Ӣ��");
		System.out.println("3:����");
		System.out.println("4:�˳�");
		@SuppressWarnings("resource")
		Scanner sc1=new Scanner(System.in);
		int choose=sc1.nextInt();
		switch(choose) {
		case 1:
			display();
			break;
		case 2:
			diisplay();
			break;
		case 3:
			ddisplay();
			break;
		case 4:
			return;
		}
	}
	public static void display() {
		int count=0;
		System.out.println("��Լ�ʮ�֣�һ����ʱ��Ϊ10s");
		System.out.println("1.�������������");
		System.out.println("2.������������");
		Scanner sc2=new Scanner(System.in);
		int c=sc2.nextInt();
		
		switch(c) {
		case 1:
			while(true) {
				//TimeTask tTask=new TimeTask();
				System.out.println("1.�ӷ�");
				System.out.println("2.����");
				//System.out.println("3.�˷�");
				//System.out.println("4.����");
				System.out.println("3.��ʾ�ܷ���");
				System.out.println("4.�˳�");
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				int x=sc.nextInt();
				switch(x) {
				case 1:
					Random rr=new Random();
					int f1=(int)(1+Math.random()*(9-1+1));
					int f2=(int)(10+Math.random()*(20-10+1));
					int d1=(int)(1+Math.random()*(9-1+1));
					int d2=(int)(10+Math.random()*(20-10+1));
					System.out.println("��һ�����ķ�����:"+f1);
					System.out.println("��һ�����ķ�ĸ��:"+f2);
					System.out.println("�ڶ������ķ�����:"+d1);
					System.out.println("�ڶ������ķ�ĸ��:"+d2);
					fenAdd(f1,f2,d1,d2);
					break;
				
				case 2:
					Random ro=new Random();
					int f3=(int)(1+Math.random()*(9-1+1));
					int f4=(int)(10+Math.random()*(20-10+1));
					int d3=(int)(1+Math.random()*(9-1+1));
					int d4=(int)(1+Math.random()*(20-10+1));
					System.out.println("��һ�����ķ�����:"+f3);
					System.out.println("��һ�����ķ�ĸ��:"+f4);
					System.out.println("�ڶ������ķ�����:"+d3);
					System.out.println("�ڶ������ķ�ĸ��:"+d4);
					fenJian(f3,f4,d3,d4);
					break;
				}
			}
		
			case 2:
			while(true) {
				//TimeTask tTask=new TimeTask();
				System.out.println("1.�ӷ�");
				System.out.println("2.����");
				System.out.println("3.�˷�");
				System.out.println("4.����");
				System.out.println("5.��ʾ�ܷ���");
				System.out.println("6.�˳�");
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				int x=sc.nextInt();
				Random r=new Random();
				switch(x) {
				case 1:
					timeVoid();
					//System.out.println("��������������:");
					int a=r.nextInt(100);
					int b=r.nextInt(100);
					//int a=sc.nextInt();
					//int b=sc.nextInt();
					System.out.println("����:"+a+"  "+"����"+b);
					add(a,b);
					while(true) {
						
					System.out.println("��������Ĵ�");
					int answer=sc.nextInt();
					if(answer==add(a,b)) {
						System.out.println("����ȷ");
						count=count+10;
						break;
					}
					else {
						System.out.println("�𰸴���");
						break;
					}
					}
					break;
				case 2:
					timeVoid();
					System.out.println("�����뱻�����ͼ�������˳��:");
					int a1=r.nextInt(100);
					int b1=r.nextInt(100);
					System.out.println("������:"+a1+"  "+"����"+b1);
					mul(a1,b1);
					while(true) {
						System.out.println("��������Ĵ�");
						int answer=sc.nextInt();
						if(answer==mul(a1,b1)) {
							System.out.println("����ȷ");
							count=count+10;
							break;
						}
						else {
							System.out.println("�𰸴���");
							break;
						}
						}
					break;
				case 3:
					timeVoid();
					System.out.println("��������������:");
					int a2=r.nextInt(100);
					int b2=r.nextInt(100);
					System.out.println("����:"+a2+"  "+"����"+b2);
					cheng(a2,b2);
					while(true) {
						System.out.println("��������Ĵ�");
						int answer=sc.nextInt();
						if(answer==cheng(a2,b2)) {
							System.out.println("����ȷ");
							count=count+10;
							break;
						}
						else {
							System.out.println("�𰸴���");
							break;
						}
						}
					break;
				case 4:
					timeVoid();
					System.out.println("�����뱻�����ͳ�������˳��:");
					int a3=r.nextInt(100);
					int b3=r.nextInt(50);
					System.out.println("������:"+a3+"  "+"����"+b3);
					chu(a3,b3);
					while(true) {
						System.out.println("��������Ĵ�");
						double answer=sc.nextDouble();
						if(answer==chu(a3,b3)) {
							System.out.println("����ȷ");
							count=count+10;
							break;
						}
						else {
							System.out.println("�𰸴���");
							break;
						}
						}
					break;
				case 5:
					System.out.println("�ܷ���:"+count);
					break;
				case 6:
					return;
				default:
						System.out.println("�������");
						break;
				}
			}
		default:
			System.out.println("�������");
			return;
		}
		
		
	}
	public static void diisplay() {
		int count=0;
		System.out.println("The answer is ten to one. The time is 10s");
		while(true) {
			//TimeTask tTask=new TimeTask();
			System.out.println("1.addition");
			System.out.println("2.subtraction");
			System.out.println("3.multiplication");
			System.out.println("4.division");
			System.out.println("5.Display total score");
			System.out.println("6.exit");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			Random r=new Random();
			switch(x) {
			case 1:
				timeVoid();
				//System.out.println("��������������:");
				int a=r.nextInt(100);
				int b=r.nextInt(100);
				//int a=sc.nextInt();
				//int b=sc.nextInt();
				System.out.println("Addend:"+a+"  "+"Addend"+b);
				add(a,b);
				while(true) {
					
				System.out.println("Please input your answer");
				double answer=sc.nextDouble();
				if(answer==add(a,b)) {
					System.out.println("The answer is right");
					count=count+10;
					break;
				}
				else {
					System.out.println("The answer is error");
					break;
				}
				}
				break;
			case 2:
				timeVoid();
				System.out.println("Please enter the minuend and meiosis (in order):");
				int a1=r.nextInt(100);
				int b1=r.nextInt(100);
				System.out.println("Minuend:"+a1+"  "+"Meiosis"+b1);
				mul(a1,b1);
				while(true) {
					System.out.println("Please input your answer");
					int answer=sc.nextInt();
					if(answer==mul(a1,b1)) {
						System.out.println("The answer is right");
						count=count+10;
						break;
					}
					else {
						System.out.println("The answer is error");
						break;
					}
					}
				break;
			case 3:
				timeVoid();
				System.out.println("Please enter two multipliers:");
				int a2=r.nextInt(100);
				int b2=r.nextInt(100);
				System.out.println("multiplier:"+a2+"  "+"multiplier"+b2);
				cheng(a2,b2);
				while(true) {
					System.out.println("Please input your answer");
					int answer=sc.nextInt();
					if(answer==cheng(a2,b2)) {
						System.out.println("The answer is right");
						count=count+10;
						break;
					}
					else {
						System.out.println("The answer is error");
						break;
					}
					}
				break;
			case 4:
				timeVoid();
				System.out.println("Please enter the dividend and divisor (in order):");
				int a3=r.nextInt(100);
				int b3=r.nextInt(100);
				System.out.println("Dividend:"+a3+"  "+"Divisor"+b3);
				chu(a3,b3);
				while(true) {
					System.out.println("Please input your answer");
					int answer=sc.nextInt();
					if(answer==chu(a3,b3)) {
						System.out.println("The answer is right");
						count=count+10;
						break;
					}
					else {
						System.out.println("The answer is error");
						break;
					}
					}
				break;
			case 5:
				System.out.println("Total fraction:"+count);
				break;
			case 6:
				return;
			default:
					System.out.println("Input error");
					break;
			}
		}	
	}
	
	public static void ddisplay() {
		int count=0;
		System.out.println("����Ϸǳ��˼Ӥ���1�}��10s�r�g");
		while(true) {
			//TimeTask tTask=new TimeTask();
			System.out.println("1.�ӷ�");
			System.out.println("2.�p��");
			System.out.println("3.�\��");
			System.out.println("4.�\��");
			System.out.println("5.�t�õ��ʾ");
			System.out.println("6.��Ŀ");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			Random r=new Random();
			switch(x) {
			case 1:
				timeVoid();
				//System.out.println("��������������:");
				int a=r.nextInt(100);
				
				int b=r.nextInt(100);
				//int a=sc.nextInt();
				//int b=sc.nextInt();
				System.out.println("����:"+a+"  "+"����"+b);
				add(a,b);
				while(true) {
					
				System.out.println("���ʤ��δ𤨤��������Ƥ�����");
				double answer=sc.nextDouble();
				if(answer==add(a,b)) {
					System.out.println("�𤨤�������");
					count=count+10;
					break;
				}
				else {
					System.out.println("�𤨤��g�`�ä�");
					break;
				}
				}
				break;
			case 2:
				timeVoid();
				System.out.println("���������Ƥ����������p���Ȝp����혣�:");
				int a1=r.nextInt(100);
				int b1=r.nextInt(100);
				System.out.println("���p��:"+a1+"  "+"�p��"+b1);
				mul(a1,b1);
				while(true) {
					System.out.println("���ʤ��δ𤨤��������Ƥ�������");
					int answer=sc.nextInt();
					if(answer==mul(a1,b1)) {
						System.out.println("�𤨤�������");
						count=count+10;
						break;
					}
					else {
						System.out.println("�𤨤��g�`�ä�");
						break;
					}
					}
				break;
			case 3:
				
				System.out.println("2�Ĥ΁\�������������¤���:");
				int a2=r.nextInt(100);
				int b2=r.nextInt(100);
				System.out.println("�\��:"+a2+"  "+"�\��"+b2);
				cheng(a2,b2);
				while(true) {
					timeVoid();
					System.out.println("���ʤ��δ𤨤��������Ƥ�������");
					int answer=sc.nextInt();
					
					if(answer==cheng(a2,b2)) {
						System.out.println("�𤨤�������");
						count=count+10;
						break;
					}
					else {
						System.out.println("�𤨤��g�`�ä�");
						break;
					}
					}
				break;
			case 4:
				
				System.out.println("���������Ƥ����������p���Ȝp����혣�:");
				int a3=r.nextInt(100);
				int b3=r.nextInt(100);
				System.out.println("���p��:"+a3+"  "+"�p��"+b3);
				chu(a3,b3);
				while(true) {
					timeVoid();
					System.out.println("���ʤ��δ𤨤��������Ƥ�������");
					int answer=sc.nextInt();
					if(answer==chu(a3,b3)) {
						System.out.println("�𤨤�������");
						count=count+10;
						break;
					}
					else {
						System.out.println("�𤨤��g�`�ä�");
						break;
					}
					}
				break;
			case 5:
				System.out.println("�t����:"+count);
				break;
			case 6:
				return;
			default:
					System.out.println("��������`");
					break;
			}
		}	
	}
	public static int add(int x,int y) {
		int number=x+y;
		return number;
	}
	public static int mul(int x,int y) {
		int number=x-y;
		return number;
	}
	public static int cheng(int x,int y) {
		int number=x*y;
		return number;
	}
	public static double chu(int x,int y) {
		DecimalFormat df= new DecimalFormat("######0.00");  
		double number=x/y;
		df.format(number);
		return number;
	}
    public static void timeVoid(){
	        final Timer timer = new Timer();
	        TimerTask tt=new TimerTask() { 
	            @Override
	
	            public void run() {
	                System.out.println("��������");
	                timer.cancel();
	            }
	        };
	        timer.schedule(tt, 10000);
	    }
    
    public static void score() {
    	while(true) {
			//TimeTask tTask=new TimeTask();
			System.out.println("1.�ӷ�");
			System.out.println("2.����");
			System.out.println("3.�˷�");
			System.out.println("4.����");
			System.out.println("5.��ʾ�ܷ���");
			System.out.println("6.�˳�");
		
			@SuppressWarnings("resource")
			Scanner sc4=new Scanner(System.in);
			int c=sc4.nextInt();
    	Random ra=new Random();
    	int f_1=ra.nextInt(50)+1;
    	int f_2=ra.nextInt(100)+51;
    	int f_3=ra.nextInt(50)+1;
    	int f_4=ra.nextInt(100)+51;
    	switch(c) {
    	case 1:
    		break;
    	case 2:
    		break;
    	case 3:
    		break;
    	case 4:
    		break;
    	case 5:
    		break;
    	case 6:
    		return;
    	}
    	}
    }
    	public static void fenAdd(int f1,int f2,int d1,int d2) {
    		//�����Լ��
    		//����С������
    		int a=dob(f2,d2);//��С������
    		int fenzi=0;
    		int fenmu=0;
    		fenzi=f1*(a/f2)+d1*(a/d2);
    		fenmu=a;
    		int x=lcm(fenzi,fenmu);
    		fenzi=fenzi/x;
    		fenmu=fenmu/x;
    		System.out.println("���ǣ�"+fenzi+"/"+fenmu);
    	}
    	
    	
    	public static void fenJian(int f1,int f2,int d1,int d2) {
    		
    		int a=dob(f2,d2);//��С������
    		int fenzi=0;
    		int fenmu=0;
    		fenzi=f1*(a/f2)-d1*(a/d2);
    		fenmu=a;
    		int x=lcm(fenzi,fenmu);
    		fenzi=fenzi/x;
    		fenmu=fenmu/x;
    		System.out.println("���ǣ�"+fenzi+"/"+fenmu);
    		
    	}
    	public static int min(int m,int n) {
    		if(m>n) {
    			return n;
    		}
    		else {
    			return m;
    		}
    	}
    	
    	
    	//�����Լ��
    	public static int lcm(int m,int n) {
    		int s=1;
    		for(int i=1;i<=min(m,n);i++) {
    			for(int j=1;i<=i;j++) {
    				if(m%j==0 && n%j==0)
    				m=m/j;
    				n=n/j;
    				s=s*j;
    			}
    		}
    		return s;
    		
    	}
    	
    	//����С������
    	
    	public static int dob(int m,int n) {
    		int b=lcm(m,n)*(m/lcm(m,n))*(n/lcm(m,n));
    		return b;
    	}
    }

