package first;

import java.io.Serializable;

public class Apple extends Farm implements Serializable{

	private transient int no;
	
	public Apple(String kind) {
		super(kind);
	}
	
	@Override
	public void feed() {
		System.out.println(super.getKind() + "는 하루에 물을 한번씩 줍니다.");
	}
}
