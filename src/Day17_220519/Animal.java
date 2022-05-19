package Day17_220519;

//이건 모든 동물에 대한 특성을 지정한 클래스다.
public class Animal {
	protected String name;
	protected int intHp;
	protected float floatHp;
	
	public void Set_Name(String n) {this.name=n;}
	public void Set_HP(int ih) {this.intHp=ih;}
	public void Set_HP(float fh) {this.floatHp=fh;}
	
	public String Get_Name() {return name;}
	public int Get_HP() {return intHp;}
}