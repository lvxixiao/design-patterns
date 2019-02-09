package main.observer.impl;

import main.observer.Observer;
import main.observer.Subject;

import java.util.ArrayList;

public class SubjectImpl implements Subject {

  private ArrayList<Observer> observers;

  public SubjectImpl() {
    observers = new ArrayList();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if(i >= 0) {
      observers.remove(i);
    }
  }

  @Override
  public void notifyObservers(String str) {
    for ( Observer o: observers) {
      o.update(str);
    }
  }
}
