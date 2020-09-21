package com.app.greengrocer.controller.fx;


import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import org.springframework.stereotype.Component;

@Component
public class MenuBuilder {

  private MenuBar menuBar = null;

  public void addMenu(String name) {
    menuBar.getMenus().add(new Menu(name));
  }

  public MenuBar init() {
    menuBar = new MenuBar();
    return menuBar;
  }

  public MenuBar getMenuBar() {
    return menuBar;
  }
}
