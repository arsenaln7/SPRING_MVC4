package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
	/* -- List Ÿ�� ����
	 * private List<String> addressList;
	
	public void setAddressList(List<String> addressList){
		this.addressList=addressList;
	}
	
	public List<String> getAddressList(){
		return addressList;
	}*/
	
	/* -- set Ÿ�� ���� */
	
	/*private Set<String> addressList;
	
	public void setAddressList(Set<String> addressList){
		this.addressList=addressList;
	}*/
	
	/*-- Map Ÿ�� ���� */
	private Map<String, String> addressList; 
	public void setAddressList(Map<String, String> addressList){
		this.addressList=addressList;
	}
}
