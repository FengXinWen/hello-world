package function;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.text.DecimalFormat; 
public class Program {
	public static void main(String[] args) {
		System.out.println("--------------请选择语言---------------");
		System.out.println("1:中文");
		System.out.println("2:英文");
		System.out.println("3:日文");
		System.out.println("4:退出");
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
		System.out.println("答对加十分，一道题时间为10s");
		System.out.println("1.真分数四则运算");
		System.out.println("2.整数四则运算");
		Scanner sc2=new Scanner(System.in);
		int c=sc2.nextInt();
		
		switch(c) {
		case 1:
			while(true) {
				//TimeTask tTask=new TimeTask();
				System.out.println("1.加法");
				System.out.println("2.减法");
				//System.out.println("3.乘法");
				//System.out.println("4.除法");
				System.out.println("3.显示总分数");
				System.out.println("4.退出");
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
					System.out.println("第一个数的分子是:"+f1);
					System.out.println("第一个数的分母是:"+f2);
					System.out.println("第二个数的分子是:"+d1);
					System.out.println("第二个数的分母是:"+d2);
					fenAdd(f1,f2,d1,d2);
					break;
				
				case 2:
					Random ro=new Random();
					int f3=(int)(1+Math.random()*(9-1+1));
					int f4=(int)(10+Math.random()*(20-10+1));
					int d3=(int)(1+Math.random()*(9-1+1));
					int d4=(int)(1+Math.random()*(20-10+1));
					System.out.println("第一个数的分子是:"+f3);
					System.out.println("第一个数的分母是:"+f4);
					System.out.println("第二个数的分子是:"+d3);
					System.out.println("第二个数的分母是:"+d4);
					fenJian(f3,f4,d3,d4);
					break;
				}
			}
		
			case 2:
			while(true) {
				//TimeTask tTask=new TimeTask();
				System.out.println("1.加法");
				System.out.println("2.减法");
				System.out.println("3.乘法");
				System.out.println("4.除法");
				System.out.println("5.显示总分数");
				System.out.println("6.退出");
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				int x=sc.nextInt();
				Random r=new Random();
				switch(x) {
				case 1:
					timeVoid();
					//System.out.println("请输入两个加数:");
					int a=r.nextInt(100);
					int b=r.nextInt(100);
					//int a=sc.nextInt();
					//int b=sc.nextInt();
					System.out.println("加数:"+a+"  "+"加数"+b);
					add(a,b);
					while(true) {
						
					System.out.println("请输入你的答案");
					int answer=sc.nextInt();
					if(answer==add(a,b)) {
						System.out.println("答案正确");
						count=count+10;
						break;
					}
					else {
						System.out.println("答案错误");
						break;
					}
					}
					break;
				case 2:
					timeVoid();
					System.out.println("请输入被减数和减数（按顺序）:");
					int a1=r.nextInt(100);
					int b1=r.nextInt(100);
					System.out.println("被减数:"+a1+"  "+"减数"+b1);
					mul(a1,b1);
					while(true) {
						System.out.println("请输入你的答案");
						int answer=sc.nextInt();
						if(answer==mul(a1,b1)) {
							System.out.println("答案正确");
							count=count+10;
							break;
						}
						else {
							System.out.println("答案错误");
							break;
						}
						}
					break;
				case 3:
					timeVoid();
					System.out.println("请输入两个乘数:");
					int a2=r.nextInt(100);
					int b2=r.nextInt(100);
					System.out.println("乘数:"+a2+"  "+"乘数"+b2);
					cheng(a2,b2);
					while(true) {
						System.out.println("请输入你的答案");
						int answer=sc.nextInt();
						if(answer==cheng(a2,b2)) {
							System.out.println("答案正确");
							count=count+10;
							break;
						}
						else {
							System.out.println("答案错误");
							break;
						}
						}
					break;
				case 4:
					timeVoid();
					System.out.println("请输入被除数和除数（按顺序）:");
					int a3=r.nextInt(100);
					int b3=r.nextInt(50);
					System.out.println("被除数:"+a3+"  "+"除数"+b3);
					chu(a3,b3);
					while(true) {
						System.out.println("请输入你的答案");
						double answer=sc.nextDouble();
						if(answer==chu(a3,b3)) {
							System.out.println("答案正确");
							count=count+10;
							break;
						}
						else {
							System.out.println("答案错误");
							break;
						}
						}
					break;
				case 5:
					System.out.println("总分数:"+count);
					break;
				case 6:
					return;
				default:
						System.out.println("输入错误");
						break;
				}
			}
		default:
			System.out.println("输入错误");
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
				//System.out.println("请输入两个加数:");
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
		System.out.println("正解は非常に加え、1題を10s時間");
		while(true) {
			//TimeTask tTask=new TimeTask();
			System.out.println("1.加法");
			System.out.println("2.減算");
			System.out.println("3.乗法");
			System.out.println("4.乗法");
			System.out.println("5.総得点表示");
			System.out.println("6.名目");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			Random r=new Random();
			switch(x) {
			case 1:
				timeVoid();
				//System.out.println("请输入两个加数:");
				int a=r.nextInt(100);
				
				int b=r.nextInt(100);
				//int a=sc.nextInt();
				//int b=sc.nextInt();
				System.out.println("加数:"+a+"  "+"加数"+b);
				add(a,b);
				while(true) {
					
				System.out.println("あなたの答えを入力してくださ");
				double answer=sc.nextDouble();
				if(answer==add(a,b)) {
					System.out.println("答えは正しい");
					count=count+10;
					break;
				}
				else {
					System.out.println("答えは間違って");
					break;
				}
				}
				break;
			case 2:
				timeVoid();
				System.out.println("を入力してください被減数と減数（順）:");
				int a1=r.nextInt(100);
				int b1=r.nextInt(100);
				System.out.println("被減数:"+a1+"  "+"減数"+b1);
				mul(a1,b1);
				while(true) {
					System.out.println("あなたの答えを入力してください");
					int answer=sc.nextInt();
					if(answer==mul(a1,b1)) {
						System.out.println("答えは正しい");
						count=count+10;
						break;
					}
					else {
						System.out.println("答えは間違って");
						break;
					}
					}
				break;
			case 3:
				
				System.out.println("2つの乗数を入力して下さい:");
				int a2=r.nextInt(100);
				int b2=r.nextInt(100);
				System.out.println("乗数:"+a2+"  "+"乗数"+b2);
				cheng(a2,b2);
				while(true) {
					timeVoid();
					System.out.println("あなたの答えを入力してください");
					int answer=sc.nextInt();
					
					if(answer==cheng(a2,b2)) {
						System.out.println("答えは正しい");
						count=count+10;
						break;
					}
					else {
						System.out.println("答えは間違って");
						break;
					}
					}
				break;
			case 4:
				
				System.out.println("を入力してください被減数と減数（順）:");
				int a3=r.nextInt(100);
				int b3=r.nextInt(100);
				System.out.println("被減数:"+a3+"  "+"減数"+b3);
				chu(a3,b3);
				while(true) {
					timeVoid();
					System.out.println("あなたの答えを入力してください");
					int answer=sc.nextInt();
					if(answer==chu(a3,b3)) {
						System.out.println("答えは正しい");
						count=count+10;
						break;
					}
					else {
						System.out.println("答えは間違って");
						break;
					}
					}
				break;
			case 5:
				System.out.println("総分数:"+count);
				break;
			case 6:
				return;
			default:
					System.out.println("入力エラー");
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
	                System.out.println("到点啦！");
	                timer.cancel();
	            }
	        };
	        timer.schedule(tt, 10000);
	    }
    
    public static void score() {
    	while(true) {
			//TimeTask tTask=new TimeTask();
			System.out.println("1.加法");
			System.out.println("2.减法");
			System.out.println("3.乘法");
			System.out.println("4.除法");
			System.out.println("5.显示总分数");
			System.out.println("6.退出");
		
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
    		//求最大公约数
    		//求最小公倍数
    		int a=dob(f2,d2);//最小公倍数
    		int fenzi=0;
    		int fenmu=0;
    		fenzi=f1*(a/f2)+d1*(a/d2);
    		fenmu=a;
    		int x=lcm(fenzi,fenmu);
    		fenzi=fenzi/x;
    		fenmu=fenmu/x;
    		System.out.println("答案是："+fenzi+"/"+fenmu);
    	}
    	
    	
    	public static void fenJian(int f1,int f2,int d1,int d2) {
    		
    		int a=dob(f2,d2);//最小公倍数
    		int fenzi=0;
    		int fenmu=0;
    		fenzi=f1*(a/f2)-d1*(a/d2);
    		fenmu=a;
    		int x=lcm(fenzi,fenmu);
    		fenzi=fenzi/x;
    		fenmu=fenmu/x;
    		System.out.println("答案是："+fenzi+"/"+fenmu);
    		
    	}
    	public static int min(int m,int n) {
    		if(m>n) {
    			return n;
    		}
    		else {
    			return m;
    		}
    	}
    	
    	
    	//求最大公约数
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
    	
    	//求最小公倍数
    	
    	public static int dob(int m,int n) {
    		int b=lcm(m,n)*(m/lcm(m,n))*(n/lcm(m,n));
    		return b;
    	}
    }

