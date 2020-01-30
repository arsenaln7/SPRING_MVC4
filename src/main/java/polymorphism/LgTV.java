package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
//	@Autowired
//	@Qualifier("apple")
//	@Resource(name="apple")
	@Autowired
	private Speaker speaker;
	
	public LgTV(){
		System.out.println("LGTV ===> ��ü����");
	}
	public void powerOn() {
		System.out.println("LGTV --- ���� �Ҵ�.");
	}
	
	public void powerOff(){
		System.out.println("LGTV --- ���� ����.");
	}
	
	public void volumeUp(){
		speaker.volumeUp();
		System.out.println("LGTV --- �Ҹ� �ø���.");
	}
	
	public void volumeDown(){
		speaker.volumeDown();
		System.out.println("LGTV --- �Ҹ� ������.");
	}
}
