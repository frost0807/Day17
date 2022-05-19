package Day17_220519;

public class Birds extends Animal {
	private int flightSpeed;
	private int countOfWing;
	
	Birds(String name, int ih, int fs, int cow){
		this.name=name;
		this.intHp=ih;
		this.flightSpeed=fs;
		this.countOfWing=cow;
		}
	Birds(String name, float fh, int fs, int cow){
		this.name=name;
		this.floatHp=fh;
		this.flightSpeed=fs;
		this.countOfWing=cow;
		}
	public void Set_FS(int f) {int flightSpeed=f;}
	public void Set_COW(int c) {int countOfWing=c;}
	
	public int Get_Flight_Speed() {return flightSpeed;}
	public int Get_Count_Of_Wing() {return countOfWing;}
	
	public void Flying() {System.out.println("날고있는 중");}
	public void Eating() {System.out.println("먹는 중");}
	public void Landing() {System.out.println("착륙하는 중");}
	
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
		System.out.println("속도는 "+flightSpeed+"km/s");
		System.out.println("날개 갯수는 "+countOfWing+"개");
	}
}
