package com.zsk;

import java.awt.Point;
import java.util.Scanner;

public class Player {
	public int chance;//玩家一共可猜次数
	public int score;//用户得分
	
	public Player() {
		chance=5;
		score=0;
	}
	
	public Point guessPosition() {
		Scanner in=new Scanner(System.in);
		System.out.print("输入你猜的战舰的坐标(范围在0-7，不包括7)：");	
		Point point=new Point(in.nextInt(), in.nextInt());
		chance--;
		return point;
	}

}
