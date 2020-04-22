package site.abulin.simple.designpattern.observer;

/**
 * 被观察者
 */
public class Observer {

  private String name;

  public Observer(String name) {
    this.name = name;
  }

  // 订阅主题
  public void subscribe(Subject subject){
    subject.addToObserverList(this);
  }

  // 取消订阅主题
  public void unsubscribe(Subject subject){
    subject.removeFromObserverList(this);
  }

  /**
   * 接受变动
   */
  void receiveChanged(String change){
    System.out.println("被观察者[" + this.name + "]接受新事件: " + change);
  }
}
