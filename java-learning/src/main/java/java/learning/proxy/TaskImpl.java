package java.learning.proxy;

public class TaskImpl implements Task {

	@Override
	public void setData(String data) {
		System.out.println(data + " data is saved");
	}

	@Override
	public int getCalData(int x) {
		return x*10;
	}

}
