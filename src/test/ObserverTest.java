package test;

import main.observer.Observer;
import main.observer.Subject;
import main.observer.impl.ObserverImpl;
import main.observer.impl.SubjectImpl;

public class ObserverTest {

  public static void main(String[] args) {
    Subject sub = new SubjectImpl();
    Observer obs1 = new ObserverImpl("观察者1");
    Observer obs2 = new ObserverImpl("观察者2");

    sub.registerObserver(obs1);
    sub.registerObserver(obs2);

    sub.notifyObservers("主题通知");
  }
}
