package com.app.greengrocer.controller.fx;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ScreenController {

  @Autowired
  private MenuBuilder menuBuilder;

  public void initialize(Stage primaryStage) {
    Scene homeScene = prepareHomeScene();
    primaryStage.setTitle("Green Grocer");
    primaryStage.initStyle(StageStyle.DECORATED);
    primaryStage.setScene(homeScene);
    primaryStage.setFullScreen(true);
    primaryStage.show();
  }

  private Scene prepareHomeScene() {
    menuBuilder.init();
    menuBuilder.addMenu("ADMIN");
    return new Scene(new VBox(menuBuilder.getMenuBar()));
  }
}
