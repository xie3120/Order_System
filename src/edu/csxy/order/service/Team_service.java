package edu.csxy.order.service;

import java.util.List;

import edu.csxy.order.Dao.C_Request_Dao;
import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.Dao.canteen_Dao;
import edu.csxy.order.Dao.food_Dao;
import edu.csxy.order.Dao.foodtype_Dao;
import edu.csxy.order.Dao.gathering_Dao;
import edu.csxy.order.Dao.lincense_Dao;
import edu.csxy.order.Dao.norms_Dao;
import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.Dao.permission_Dao;
import edu.csxy.order.Dao.promotion_Dao;
import edu.csxy.order.Dao.set_meal_Dao;
import edu.csxy.order.Dao.sign_Dao;
import edu.csxy.order.Dao.team_Dao;
import edu.csxy.order.Dao_impl.C_Request_impl;
import edu.csxy.order.Dao_impl.Norms_Dao_impl;
import edu.csxy.order.Dao_impl.business_Dao_impl;
import edu.csxy.order.Dao_impl.canteen_Dao_impl;
import edu.csxy.order.Dao_impl.food_Dao_impl;
import edu.csxy.order.Dao_impl.foodtype_Dao_impl;
import edu.csxy.order.Dao_impl.gathering_Dao_impl;
import edu.csxy.order.Dao_impl.lincense_Dao_impl;
import edu.csxy.order.Dao_impl.order_Dao_impl;
import edu.csxy.order.Dao_impl.permission_Dao_impl;
import edu.csxy.order.Dao_impl.promotion_Dao_impl;
import edu.csxy.order.Dao_impl.set_meal_Dao_impl;
import edu.csxy.order.Dao_impl.sign_Dao_impl;
import edu.csxy.order.Dao_impl.team_Dao_impl;
import edu.csxy.order.app_domain.Canteen;
import edu.csxy.order.app_domain.Food;
import edu.csxy.order.app_domain.Order;
import edu.csxy.order.app_domain.Set_meal;
import edu.csxy.order.app_domain.ShoppingCar;
import edu.csxy.order.service_domain.Canteen_Bean;
import edu.csxy.order.service_domain.Gathering_Bean;
import edu.csxy.order.service_domain.Lincense_Bean;
import edu.csxy.order.service_domain.Order_Bean;
import edu.csxy.order.service_domain.Set_meal_Bean;
import edu.csxy.order.service_domain.Sign_Bean;
import edu.csxy.order.service_domain.Team_Bean;


public class Team_service {
	team_Dao person=new team_Dao_impl();
	order_Dao order=new order_Dao_impl();
	canteen_Dao canteen=new canteen_Dao_impl();
	food_Dao food=new food_Dao_impl();
	lincense_Dao lincense=new lincense_Dao_impl();
	permission_Dao permission=new permission_Dao_impl();
	sign_Dao sign=new sign_Dao_impl();
	gathering_Dao gathering=new gathering_Dao_impl();
	norms_Dao norms=new Norms_Dao_impl();
	set_meal_Dao set_meal = new set_meal_Dao_impl();
	foodtype_Dao foodtype=new foodtype_Dao_impl();
	
	public List<Canteen> QueryAllCanteen(){
		return null;
		//查询所有餐厅
	}
	public Canteen QueryCanteen(String C_id){
		return null;
		//查询餐厅信息
	}
//	public void QueryAllOrder(){
//		//查询所有订单
//	}
	public List<Order> QueryOrder(String T_id){
		return null;
		//查询个人订单
	}
	
	public List<Order> QueryOrder(String T_id,String State){
		return null;
		//查询个人订单
	}
	
	public Order check_Order(int O_id){
		return null;
		//查看订单信息
	}
	
	public boolean CreateOrder(ShoppingCar shoppingCar){
		return false;
		//创建订单
	} 
	public boolean PayOrder(){
		return false;
		//支付订单
	}
	public boolean ManagerInfo(Team_Bean team_Bean){
		return false;
		//管理单位信息
	}
	public boolean EstimateOrder(String T_id,int O_id,String C_id,String Estlimate){
		return false;
		//评价订单
	}
	public List<Food> CheckFood(String C_id){
		return null;
		//查看菜品
	}
	public Canteen_Bean CheckCanreenInfo(String C_id,String L_id){
		return null;
		//查看餐厅信息
	}
	public Lincense_Bean CheckLinsenceInfo(String C_id,String L_id){
		return null;
		//查看执照信息
	}
	public Sign_Bean CheckSignPersonalInfo(String C_id,String C_sign_id){
		return null;
		//查看注册人信息
	}
	public Gathering_Bean CheckGatheringInfo(String C_id,String C_gathering_card){
		return null;
		//查看收款人信息
	}
	public boolean CreateSetMeal( Set_meal_Bean set_meal_Bean){
		return false;
		//创建用餐计划
	}

	public boolean ChangeSetMeal(Set_meal_Bean set_meal_Bean){
		return false;
		//修改用餐计划
	}
	
	public Set_meal checkSet_meal(int S_id){
		return null;
		//查看用餐计划信息
	}
	
	public List<Set_meal>getAllSet_Meal(String T_id){
		return null;
		//查询用餐计划
	}
	
	public List<Set_meal>getSet_Meal(String T_id,String state){
		return null;
		//根据状态查询用餐计划
	}
	
	public List<Set_meal>getSet_Meal(String T_id,String startTime,String endTime){
		return null;
		//根据时间查询用餐计划
	}
	
}
