package Day17_220519;

public class Human {
	protected String name;
	protected float floatHp, floatMp, floatStamina;
	
	Human(){}
	
	Human(String name, float fH, float fM, float fS){
		this.name=name;
		this.floatHp=fH;
		this.floatMp=fM;
		this.floatStamina=fS;
	}
	
	public String walk(String name){
		return (name+"가 걷습니다.");
	}
	public String run(String name){
		return (name+"가 달립니다.");
	}
	public String die(String name){
		return (name+"가 죽었습니다.");
	}
	public void set_Name(String name){
		this.name=name;
	}
	public void set_Hp(float fH){
		this.floatHp=fH;
	}
	public void set_Mp(float fM){
		this.floatMp=fM;
	}
	public void set_Stamina(float fS){
		this.floatStamina=fS;
	}
	public String get_Name(){
		return this.name;
	}
	public float get_Hp(){
		return this.floatHp;
	}
	public float get_Mp(){
		return this.floatMp;
	}
	public float get_Stamina(){
		return this.floatStamina;
	}
}
