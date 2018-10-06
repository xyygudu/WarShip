package com.zsk;

import java.awt.Point;

public class MainCtrl {
	
	/**
	 * 判断是否击中，并返回得分
	 * @param point 用户输入的point
	 * @param warShip 战舰类，包括战舰的位置，血量
	 * @return
	 */
	public static int judgehit(Point point,WarShip warShip) {
		int score=0;//记录得分
		//击中身体
		if(point.equals(warShip.getBodyPoint())) {
			//如果击中身体
			score+=2;
			warShip.setLife(0);
		}
		//击中头部
		if(point.equals(warShip.getHeadPoint())){
			score+=1;
			System.out.println("战舰已经受伤加油！");
			warShip.life--;
		}
		//击中尾部
		if(point.equals(warShip.getFootPoint())) {
			score+=1;
			System.out.println("战舰已经受伤加油！");
			warShip.life--;
		}
		return score;
	}
	
	public static void main(String[] args) {
		WarShip warShip=new WarShip();
		Player player=new Player();
		int chance= player.chance;
		//用户猜战舰位置
		for (int i = chance; i >0; i--) {
			Point guessPoint=player.guessPosition();
			
			player.score+=MainCtrl.judgehit(guessPoint, warShip);
			if(warShip.life<=0) {
				System.out.println("你已经胜利");
				break;
			}else {
				System.out.println("加油，你还有"+i+"机会");
			}
		}
		if(warShip.life>0) {
			System.out.println("你失败了");
		}
		System.out.println("你的最终得分为："+player.score);

	}

}
