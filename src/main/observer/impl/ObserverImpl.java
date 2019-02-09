package main.observer.impl;

import main.observer.Observer;

public class ObserverImpl implements Observer {

  private String name;

  public ObserverImpl(String name) {
    this.name = name;
  }

  @Override
  public void update(String str) {
    System.out.println(name + ":" + str);
  }
}
