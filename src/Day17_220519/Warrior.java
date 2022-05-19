package Day17_220519;

import java.util.*;

public class Warrior extends Human{
	protected float strength;
	protected String typeOfWeapon;
	
	Warrior(String name, float floatHp, float floatMp, float floatStamina, float strength, String typeOfWeapon){
		super(name, floatHp, floatMp, floatStamina);
		this.strength=strength;
		this.typeOfWeapon=typeOfWeapon;
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
	public void set_Strength(float st){
		this.strength=st;
	}
	public void set_Weapon(String tOW){
		this.typeOfWeapon=tOW;
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
	public float get_Strength() {
		return strength;
	}
	public String get_Weapon() {
		return typeOfWeapon;
	}
	public String warrior_Attack() {
		return ("전사 "+name+"이(가)"+typeOfWeapon+"을 휘두릅니다.");
	}
	public String warrior_Defence() {
		return ("전사 "+name+"이(가)"+typeOfWeapon+"으로 막았습니다.");
	}
	public String warrior_Hurt(Monster m) {
		String result;
		if(m.floatDamage<floatHp) {
			floatHp-=m.floatDamage;
			result=("전사 "+name+"은(는) "+m.name+"의 공격을 받아 "+(m.floatDamage)+"의 데미지를 입었습니다. 남은체력은 "+"현재 전사의 체력은 "+floatHp+"몬스터의 체력은 "+m.floatHp);
		}
		else {
		floatHp=0.0f;
		result=die(name);
		}
		return result;
	}
}
