package Day17_220519;

public class Inherit {

	public static void main(String[] args) {
		Birds sparrow=new Birds("잭스패로우", 99.3f, 60, 2);
		Fish salmon=new Fish("연한연어", 80, 10, 7);
		
		sparrow.Get_Status();
		salmon.Get_Status();
		System.out.println();
		sparrow.Flying();
		sparrow.Eating();
		sparrow.Landing();
		System.out.println();
		salmon.Swimming();
		salmon.Eating();
		salmon.Sleeping();
	}

}
