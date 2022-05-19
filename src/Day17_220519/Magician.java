package Day17_220519;

import java.util.*;

public class Magician extends Human{
	protected String typeOfMagic, typeOfStaff;
	protected float intelligence;
	
	Magician(String name, float floatHp, float floatMp, float floatStamina, float intelligence, String typeOfMagic, String typeOfStaff){
		super(name, floatHp, floatMp, floatStamina);
		this.intelligence=intelligence;
		this.typeOfMagic=typeOfMagic;
		this.typeOfStaff=typeOfStaff;
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
	public void set_Intelligence(float intel){
		this.intelligence=intel;
	}
	public void set_Magic(String tOM){
		this.typeOfMagic=tOM;
	}
	public void set_Staff(String tOS){
		this.typeOfStaff=tOS;
	}
	public String get_Name(){
		return name;
	}
	public float get_Hp() {
		return floatHp;
	}
	public float get_Mp() {
		return floatMp;
	}
	public float get_Stamina() {
		return floatStamina;
	}
	public float get_Intelligence(){
		return intelligence;
	}
	public String get_Magic() {
		return typeOfMagic;
	}
	public String get_Staff() {
		return typeOfStaff;
	}
	public String magician_Cast() {
		return ("마법사 "+name+"이(가) "+typeOfStaff+"을(를) 들어올려 "+typeOfMagic+"마법을 시전합니다.");
	}
	public String magician_Barrier() {
		return ("마법사 "+name+"이(가) "+typeOfStaff+"을(를) 들어올려 "+typeOfMagic+"속성의 배리어를 생성합니다.");
	}
	public String magician_Hurt(Monster m) {
		String result;
		if(m.floatDamage<floatHp) {
			floatHp-=m.floatDamage;
			result=("마법사 "+name+"은(는) "+m.name+"의 공격을 받아 "+(m.floatDamage)+"의 데미지를 입었습니다. 남은체력은 "+"현재 마법사의 체력은 "+floatHp+"몬스터의 체력은 "+m.floatHp);
		}
		else {
		floatHp=0.0f;
		result=die(name);
		}
		return result;
	}
}
