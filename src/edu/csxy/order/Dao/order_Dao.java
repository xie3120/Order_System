package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Order_Bean;

public interface order_Dao {
	//新增订单
	public boolean AddOrder(Order_Bean order_Bean);
	
	//订单状态修改
	public boolean changeOrderState(String O_id,String O_state);
	//修改订单价格
	public boolean changeOrderPrice(String O_id,float O_price);
	
	//查询订单信息
	public Order_Bean getOrderInfo(String O_id);
	
	//查询餐厅所有订单信息
	public List<Order_Bean> getCanteenOrderInfo(String C_id);
	
	//查询所有个人订单信息
	public List<Order_Bean> getPersonOrderInfo(String P_id);
	
	//查询所有单位订单信息
	public List<Order_Bean> getTeamOrderInfo(String T_id);
	
	//查询订餐计划内所包含的订单
	public List<Order_Bean> getSetMealOrderInfo(String S_id);
	
	//根据状态查询所有餐厅订单信息
	public List<Order_Bean> getCanteenOrderInfo(String C_id,String O_state);
	
	//根据状态查询所有个人订单信息
	public List<Order_Bean> getPersonOrderInfo(String P_id,String O_state);
	
	//根据状态查询所有单位订单信息
	public List<Order_Bean> getTeamOrderInfo(String T_id,String O_state);
	
	//根据状态查询计划所包含的订单
	public List<Order_Bean> getSetMealOrderInfo(String S_id,String O_state);
	//根据订单号获取P_id
	public String getPid(String O_id);
	//根据订单返回U_id
	public String getTid(String O_id);
	//插入t_id
	public boolean insertTid(String O_id,String T_id);
	
	//插入p_id
	public boolean insertPid(String O_id,String P_id);
	
	//将菜品与订单关联
	public boolean addFoodIntoOrder(String O_id,String F_id,int count,String norms);
	//评价订单
	public boolean estimateOrder(String estimate,String O_id);
	//处理订单订单
	public boolean processOrder(int state,String O_id );
}
