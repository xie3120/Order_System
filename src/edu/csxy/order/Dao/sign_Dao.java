package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Sign_Bean;

public interface sign_Dao {
	//д��ǩԼ����Ϣ
	public void setSignInfo(Sign_Bean sign_Bean);
	
	//��ѯǩԼ����Ϣ
	public Sign_Bean getSignInfo(int C_id);

}