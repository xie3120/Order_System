package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Gathering_Bean;

public interface gathering_Dao {
	//��ѯ�տ�����Ϣ
	public List<Gathering_Bean> getGatherInfo(int C_id);
	
	//д���տ�����Ϣ
	public void setGatheringInfo(Gathering_Bean Gathering_Bean);

}