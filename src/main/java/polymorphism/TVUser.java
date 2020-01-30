package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * 19.12.08 [���յ�] ���� ���α׷� SamsungTV tv = new SamsungTV(); tv.powerOn();
		 * tv.volumeUp(); tv.volumeDown(); tv.powerOff();
		 * 
		 * LgTV tv = new LgTV(); tv.turnOn(); tv.soundUp(); tv.soundDown();
		 * tv.turnOff();
		 */
		/*
		 * 19.12.08 [�������̽�] ���յ��� �� ���� ���α׷� TV tv = null; tv = new SamsungTV();
		 * tv.powerOn(); tv.volumeUp(); tv.volumeDown(); tv.powerOff();
		 * System.out.println("-----"); tv = new LgTV(); tv.powerOn();
		 * tv.volumeUp(); tv.volumeDown(); tv.powerOff(); } TV tv = null; tv =
		 * new SonyTV(); tv.powerOn(); tv.powerOff(); tv.volumeUp();
		 * tv.volumeDown();
		 */

		/*
		 * 19.12.08 [����������] ������ ������ �̿��� ������ BeanFactory factory = new
		 * BeanFactory(); TV tv = (TV) factory.getBean(args[0]); tv.powerOn();
		 * tv.powerOff(); tv.volumeUp(); tv.volumeDown();
		 */
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(LookUp) �Ѵ�.
		// 2-1. 2�� ������ ������ ���, pre-loading�� ���� �ڵ� ��ü ���� �ȴ�.
		/*
		 * TV tv = (TV)factory.getBean("tv"); tv.powerOn(); tv.volumeUp();
		 * tv.volumeDown(); tv.powerOff();
		 * 
		 * TV tv1= (TV)factory.getBean("lg"); tv1.powerOn(); tv1.volumeUp();
		 * tv1.volumeDown(); tv1.powerOff();
		 * 
		 * factory.close();
		 */
		/*19.12.10 �� �Ӽ�*/
		//2. ������ �����̳ʷκ��� �ʿ��� ��ü�� ��û�Ѵ�.
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3.������ �����̳ʸ� �����Ѵ�.
		factory.close();
	}
}
