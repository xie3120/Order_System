package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Team_Bean;

public interface team_Dao {
	//��ѯ��ҵ�û���Ϣ
	public List<Team_Bean> getTeamInfo();
	
	public void setTeamInfo(List<String> Team_Bean);

}