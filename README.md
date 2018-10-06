
<h1 align=center>WarShip战舰游戏</h1>
<h2>战舰游戏简介</h2>
游戏规则及描述：在游戏中玩家有5次机会猜出敌舰的坐标位置（横纵坐标都在0-7），战舰有身体、头部尾部之分，如果猜中身体坐标，则认为击中，直接胜利，如果击中头部或者尾部，则战舰的血量减一，知道机会用完，或者战舰被击沉，游戏结束，游戏运行截图如下
<div align=center style="float:left;display:inline-block"><img src="https://github.com/xyygudu/WarShip/blob/master/images/%244I1J%7D~~LBZW%7DO%7D6%60P)M0DO.png" width="500px"  alt="图片加载失败"/></div>
<div align=center style="float:right;display:inline-block"><img src="https://github.com/xyygudu/WarShip/blob/master/images/40Y70GH6%5BUYFS%24ZG69UZ9U0.png" width="500px"  alt="图片加载失败"/></div>
<h2>WarShip类</h2>
该类是战舰类，每一个战舰对象都拥有初始的生命值，和位置，在构造函数中，我们对战舰的位置进行初始化，且坐标是随机的，头部和尾部的横坐标分别是身体的横坐标+1和-1得到的，该类的方法可以获取战舰的各个关键部位的坐标
<h2>Playerp类</h2>
该类中定义了每一个玩家的得分和游戏次数属性，每个玩家规定只有5次猜测到机会，里面定义了一个方法，猜战舰的位置，没执行一次，允许玩游戏的次数－1
<h2>MainCtrl类</h2>
该类定义了一个方法用来判断击中战舰的哪个部位，并根据击中部位返回应该得的分数，击中身体得两分，并且胜利，击中其他部位得一分，战舰得生命值同时减一，然后main函数中通过循环让玩家猜测战舰得位置，最终将成绩输出在控制台中
