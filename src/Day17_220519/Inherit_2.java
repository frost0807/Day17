package Day17_220519;

import java.util.*;

public class Inherit_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("본인의 클래스를 입력해주세요. 전사 or 마법사");
		String classCheck=sc.next();
		
		if(classCheck.equals("전사"))
		{
			System.out.println("전사를 선택하셨습니다. 아이디를 입력해주세요.");
			String id=sc.next();
			System.out.println("입력하신 아이디는 "+id+"입니다. 무기를 선택해주세요 칼, 도끼, 창");
			String weapon=sc.next();
			while(weapon.equals("칼")==false&&weapon.equals("도끼")==false&&weapon.equals("창")==false) {
				System.out.println("무기를 잘못 입력하셨습니다. 다시 입력해주세요");
				weapon=sc.next();
			}
			
			System.out.println(weapon+"을(를) 선택하셨습니다. 마지막으로 스탯을 랜덤하게 설정합니다.");
			Random rand= new Random();
			Warrior war1= new Warrior(id, (rand.nextFloat(50)+100.0f), 0, (rand.nextFloat(20)+10.0f), (rand.nextFloat(10)+10.0f), weapon);
			System.out.println("스탯이 설정 되었습니다.");
			System.out.println("아이디 : "+war1.get_Name());
			System.out.println("체력 : "+war1.get_Hp());
			System.out.println("마나 : "+war1.get_Mp());
			System.out.println("스태미나 : "+war1.get_Stamina());
			System.out.println("힘 : "+war1.get_Strength());
			System.out.println("무기 : "+war1.get_Weapon());
			
			while(true) {
				System.out.println("취할 행동을 선택해주세요 걷기, 달리기");
				String action=sc.next();
				while(action.equals("걷기")==false&&action.equals("달리기")==false) {
					System.out.println("잘못된 입력입니다. 다시 입력해주세요");
					action=sc.next();
				}
				if(action.equals("걷기")) {
					System.out.println(war1.walk(war1.name));
				}
				else if(action.equals("달리기")) {
					System.out.println(war1.run(war1.name));
				}
				else {}
				
				if(rand.nextInt(2)==1)
				{
					System.out.println("몬스터를 맞닥뜨렸습니다.");
					break;
				}
				else {
					System.out.println("아무일도 없었습니다.");
				}
			}
			
			
			String monName=null;
			String monAttack=null;
			
			switch(rand.nextInt(3)) {
			case 0:
				monName="슬라임";
				break;
				
			case 1:
				monName="골렘";
				break;
				
			case 2:
				monName="오크";
				break;
			
			case 3:
				monName="스켈레톤";
				break;				
			}
			
			switch(rand.nextInt(1)) {
			case 0:
				monAttack="몸통박치기";
				break;
				
			case 1:
				monAttack="깔아뭉개기";
				break;			
			}
			System.out.println("전투를 시작합니다. 몬스터의 스탯이 랜덤하게 설정되었습니다.");
			
			Monster mon1=new Monster(monName, (rand.nextFloat(50)+100.0f), (rand.nextFloat(10)+20.0f), monAttack);
			System.out.println(war1.get_Name()+"의 체력은 "+war1.get_Hp()+"이고 현재 공격력은 "+((war1.strength*war1.floatStamina)/10.f)+"입니다.\n");
			System.out.println("몬스터는 "+mon1.get_Name()+"이고 체력은 "+mon1.get_Hp()+" 공격력은 "+mon1.get_Damage()+"입니다.");
			
			while(true) {
				System.out.println("---------------------");
				System.out.println(war1.name+"의 공격차례");
				System.out.println("---------------------");
				System.out.println(war1.warrior_Attack()+"\n"+mon1.monster_Hurt(war1));
				if(mon1.floatHp==0.0f) {
					break;
				}
				System.out.println("---------------------");
				System.out.println(mon1.name+"의 공격차례");
				System.out.println("---------------------");
				System.out.println(mon1.monster_Attack()+"\n"+war1.warrior_Hurt(mon1));
				if(war1.floatHp==0.0f) {
					break;
				}
			}
		}
		else if(classCheck.equals("마법사"))
		{
			System.out.println("마법사를 선택하셨습니다. 아이디를 입력해주세요.");
			String id=sc.next();
			System.out.println("입력하신 아이디는 "+id+"입니다. 지팡이를 선택해주세요 신선의지팡이, 마법사의지팡이, 환술사의지팡이");
			String staff=sc.next();
			while(staff.equals("신선의지팡이")==false&&staff.equals("마법사의지팡이")==false&&staff.equals("환술사의지팡이")==false) {
				System.out.println("지팡이를 잘못 입력하셨습니다. 다시 입력해주세요");
				staff=sc.next();
			}
			System.out.println("사용할 마법의 종류를 입력해주세요 화염, 바람, 번개");
			String magic=sc.next();
			while(magic.equals("화염")==false&&magic.equals("바람")==false&&magic.equals("번개")==false) {
				System.out.println("마법을 잘못 입력하셨습니다. 다시 입력해주세요");
				magic=sc.next();
			}
			
			System.out.println(staff+"을(를) 선택하셨습니다. 마지막으로 스탯을 랜덤하게 설정합니다.");
			Random rand= new Random();
			Magician mag1= new Magician(id, (rand.nextFloat(50)+100.0f), (rand.nextFloat(50)+100.0f), (rand.nextFloat(20)+10.0f), (rand.nextFloat(10)+10.0f), magic, staff);
			System.out.println("스탯이 설정 되었습니다.");
			System.out.println("아이디 : "+mag1.get_Name());
			System.out.println("체력 : "+mag1.get_Hp());
			System.out.println("마나 : "+mag1.get_Mp());
			System.out.println("스태미나 : "+mag1.get_Stamina());
			System.out.println("지능 : "+mag1.get_Intelligence());
			System.out.println("무기 : "+mag1.get_Staff());
			System.out.println("마법 : "+mag1.get_Magic());
			
			while(true) {
				System.out.println("취할 행동을 선택해주세요 걷기, 달리기");
				String action=sc.next();
				while(action.equals("걷기")==false&&action.equals("달리기")==false) {
					System.out.println("잘못된 입력입니다. 다시 입력해주세요");
					action=sc.next();
				}
				if(action.equals("걷기")) {
					System.out.println(mag1.walk(mag1.name));
				}
				else if(action.equals("달리기")) {
					System.out.println(mag1.run(mag1.name));
				}
				else {}
				
				if(rand.nextInt(2)==1)
				{
					System.out.println("몬스터를 맞닥뜨렸습니다.");
					break;
				}
				else {
					System.out.println("아무일도 없었습니다.");
				}
			}
			
			
			String monName=null;
			String monAttack=null;
			
			switch(rand.nextInt(3)) {
			case 0:
				monName="슬라임";
				break;
				
			case 1:
				monName="골렘";
				break;
				
			case 2:
				monName="오크";
				break;
			
			case 3:
				monName="스켈레톤";
				break;				
			}
			
			switch(rand.nextInt(1)) {
			case 0:
				monAttack="몸통박치기";
				break;
				
			case 1:
				monAttack="깔아뭉개기";
				break;			
			}
			System.out.println("전투를 시작합니다. 몬스터의 스탯이 랜덤하게 설정되었습니다.");
			
			Monster mon1=new Monster(monName, (rand.nextFloat(50)+100.0f), (rand.nextFloat(10)+20.0f), monAttack);
			System.out.println(mag1.get_Name()+"의 체력은 "+mag1.get_Hp()+"이고 현재 공격력은 "+((mag1.intelligence*mag1.floatStamina)/10.f)+"입니다.\n");
			System.out.println("몬스터는 "+mon1.get_Name()+"이고 체력은 "+mon1.get_Hp()+" 공격력은 "+mon1.get_Damage()+"입니다.");
			
			while(true) {
				System.out.println("---------------------");
				System.out.println(mag1.name+"의 공격차례");
				System.out.println("---------------------");
				System.out.println(mag1.magician_Cast()+"\n"+mon1.monster_Hurt(mag1));
				if(mon1.floatHp==0.0f) {
					break;
				}
				System.out.println("---------------------");
				System.out.println(mon1.name+"의 공격차례");
				System.out.println("---------------------");
				System.out.println(mon1.monster_Attack()+"\n"+mag1.magician_Hurt(mon1));
				if(mag1.floatHp==0.0f) {
					break;
				}
			}
		}
	}
}