package site.abulin.simple.designpattern.observer;

public class ObserverTest {

  public static void main(String[] args) {
    // 定义2个主题
    Subject liudehua = new Subject("刘德华微博");
    Subject lixiaolong = new Subject("李小龙微博");
    // 定义5个粉丝
    Observer obs1 = new Observer("粉丝1");
    Observer obs2 = new Observer("粉丝2");
    Observer obs3 = new Observer("粉丝3");
    Observer obs4 = new Observer("粉丝4");
    Observer obs5 = new Observer("粉丝5");

    // 粉丝1、2、3关注刘德华
    obs1.subscribe(liudehua);
    obs2.subscribe(liudehua);
    obs3.subscribe(liudehua);
    // 粉丝4、5关注李小龙
    obs4.subscribe(lixiaolong);
    obs5.subscribe(lixiaolong);

    System.out.println("——————————————————————————————————————————————————————————");

    // ------------ 刘德华微博更新，粉丝1、2、3收到通知 ------------
    liudehua.notifyChanged("刘德华更新微博：今天天气真好，来一首《忘情水》！");

    System.out.println("———");

    // ------------ 李小龙微博更新，粉丝4、5、3收到通知 ------------
    lixiaolong.notifyChanged("李小龙更新微博：打遍天下无敌手！");

    System.out.println("——————————————————————————————————————————————————————————");

    // ------------ 粉丝1、2取消订阅刘德华，粉丝1订阅李小龙 ------------
    obs1.unsubscribe(liudehua);
    obs2.unsubscribe(liudehua);
    obs1.subscribe(lixiaolong);

    // ------------ 粉丝3 订阅李小龙 ------------
    obs3.subscribe(lixiaolong);

    // ------------ 粉丝3 订阅刘德华 ------------
    obs4.subscribe(liudehua);

    System.out.println("——————————————————————————————————————————————————————————");

    // ------------ 刘德华微博更新，粉丝1、2、3收到通知 ------------
    liudehua.notifyChanged("刘德华更新微博：一切都是天意一切都是命运！");

    System.out.println("———");

    // ------------ 李小龙微博更新，粉丝4、5、3收到通知 ------------
    lixiaolong.notifyChanged("李小龙更新微博：精忠报国！");
  }
}
