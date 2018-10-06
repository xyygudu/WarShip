package com.zsk;

import java.awt.Point;
import java.util.Random;

public class WarShip {
	private Point bodyPoint;//战舰身体位置（击中就炸毁）
	private Point headPoint;//战舰头部（击中受伤）
	private Point footPoint;//战舰尾部，击中受伤
	
	public int life;//设置战舰生命值
	
	public WarShip() {
		Random random=new Random();
		//设置战舰的位置是随机的[0-7)
		int bodyX=random.nextInt(7);
		int bodyY=random.nextInt(7);
		bodyPoint=new Point(bodyX, bodyY);
		//bodyPoint的后一个点为headPoint
		headPoint=new Point(bodyX+1, bodyY);
		footPoint=new Point(bodyX-1, bodyY);
		System.out.println("为便于测试，打印bodyPoint点："+bodyPoint);
		life=2;
	}
	
	public int getLife() {
		return life;
	}
	
	//设置战舰的血量
	public void setLife(int life) {
		this.life = life;
	}
	public Point getBodyPoint() {
		return bodyPoint;
	}
	public Point getHeadPoint() {
		return headPoint;
	}
	public Point getFootPoint() {
		return footPoint;
	}
	

}
