package Day17_220519;

import java.util.*;

public class Monster {
	String name, attackType;
	float floatHp, floatDamage;
	
	Monster(String name, float floatHp, float floatDamage, String attackType){
		this.name=name;
		this.floatHp=floatHp;
		this.floatDamage=floatDamage;
		this.attackType=attackType;
	}
	
	public void set_name(String name) {
		this.name=name;
	}
	public void set_Hp(float fH) {
		this.floatHp=fH;
	}
	public void set_Damage(float fD) {
		this.floatDamage=fD;
	}
	public void set_attackType(String aT) {
		this.attackType=aT;
	}
	public String get_Name() {
		return name;
	}
	public float get_Hp() {
		return floatHp;
	}
	public float get_Damage() {
		return floatDamage;
	}
	public String get_attackType() {
		return attackType;
	}
	public String monster_Attack() {
		return ("몬스터 "+name+"이(가) "+attackType+"을(를) 합니다.");
	}
	public String monster_Hurt(Warrior war) {
		String result;
		if((war.strength*war.floatStamina)/10.0f<floatHp) {
			floatHp-=(war.strength*war.floatStamina)/10.0f;
			result=("몬스터 "+name+"은(는) "+war.name+"의 공격을 받아 "+((war.strength*war.floatStamina)/10.0f)+"의 데미지를 입었습니다. 현재 전사의 체력은 "+war.floatHp+" 몬스터의 체력은 "+floatHp);
		}
		else {
			floatHp=0.0f;
		result=("몬스터 "+name+"은(는) "+war.name+"의 공격을 받아 죽었습니다.");
		}
		return result;
	}
	public String monster_Hurt(Magician mag) {
		String result;
		if((mag.intelligence*mag.floatStamina)/10.0f<floatHp) {
			floatHp-=(mag.intelligence*mag.floatStamina)/10.0f;
			result=("몬스터 "+name+"은(는) "+mag.name+"의 공격을 받아 "+((mag.intelligence*mag.floatStamina)/10.0f)+"의 데미지를 입었습니다. 현재 전사의 체력은 "+mag.floatHp+" 몬스터의 체력은 "+floatHp);
		}
		else {
		floatHp=0.0f;
		result=("몬스터 "+name+"은(는) "+mag.name+"의 공격을 받아 죽었습니다.");
		}
		return result;
	}
}
