package first;

public class Run {
	public static void main(String[] args) {
		Apple apple = new Apple("사과");
		
		if(apple instanceof Eatable) {
			System.out.println("사람이 먹을 수 있습니다.");
		}
		else {
			System.out.println("사람이 먹을 수 없습니다.");
		}
		
		apple.feed();
	}
}
