# AddPraise
my code

这份代码可以完成一件点赞功能！！！

基于Selenium和手机浏览器实现的，暂时只能运行在android上

QQ空间网页版难以实现自动登录，所以以手机版QQ空间为突破口，但是在电脑打开的手机版QQ空间无法点击，猜想的原因可能是，
在手机上是触屏的，触点比较大，鼠标点击触点很小。

主要思路
1、adb连接手机 用Selenium驱动手机浏览器
2、自动登录
3、用正则表达式匹配出“赞”这个控件的位置，然后click
4、while循环

要用到的东西比较多和杂

1、Selenium，Selenium-ide
2、Selenium-dirver.apk
等等
