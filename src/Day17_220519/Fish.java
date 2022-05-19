package Day17_220519;

public class Fish extends Animal {
	private int swimmingSpeed;
	private int countOfFin;
	
	Fish(String name, int ih, int ss, int cof){
		this.name=name;
		this.intHp=ih;
		this.swimmingSpeed=ss;
		this.countOfFin=cof;
		}
	Fish(String name, float fh, int ss, int cof){
		this.name=name;
		this.floatHp=fh;
		this.swimmingSpeed=ss;
		this.countOfFin=cof;
		}
	public void Set_SS(int s) {int swimmingSpeed=s;}
	public void Set_COF(int c) {int countOfFin=c;}
	
	public int Get_Swimming_Speed() {return swimmingSpeed;}
	public int Get_Count_Of_Fin() {return countOfFin;}
	
	public void Swimming() {System.out.println("헤엄치는 중");}
	public void Eating() {System.out.println("먹는 중");}
	public void Sleeping() {System.out.println("자는 중");}
	
	public void Get_Status() {
		System.out.println("이름은 "+name);
		if(intHp!=0)
		{
			System.out.println("체력은 "+intHp);
		}
		else
		{
			System.out.println("체력은 "+floatHp);
		}
		System.out.println("속도는 "+swimmingSpeed+"노트");
		System.out.println("지느러미 갯수는 "+countOfFin+"개");
	}
}