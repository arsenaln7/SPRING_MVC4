package polymorphism;

public class SonyTV implements TV {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println(" SonyTV =======> ���� �Ҵ�");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println(" SonyTV =======> ���� ����.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println(" SonyTV =======> �Ҹ� �ø���.");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println(" SonyTV =======> �Ҹ� ������.");
	}

}
