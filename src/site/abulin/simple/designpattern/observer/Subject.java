package site.abulin.simple.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者主题
 */
public class Subject {
  // 主题名称
  private String name;

  public Subject(String name) {
    this.name = name;
  }

  // 观察者列表
  private List<Observer> observerList = new ArrayList<>();

  // 添加到观察者列表
  public void addToObserverList(Observer observer){
    observerList.add(observer);
  }

  // 从观察者列表移除
  public void removeFromObserverList(Observer observer){
    observerList.remove(observer);
  }

  public void notifyChanged(String change){
    for(Observer obs : observerList){
      obs.receiveChanged(change);
    }
  }
}
