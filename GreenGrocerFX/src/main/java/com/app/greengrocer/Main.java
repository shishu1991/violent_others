package com.app.greengrocer;

import com.app.greengrocer.controller.fx.ScreenController;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main extends Application {

  private static Logger logger = LoggerFactory.getLogger(Main.class);

  @Override
  public void start(Stage primaryStage){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
    logger.info("Prepairing stage.");
    context.getBean(ScreenController.class).initialize(primaryStage);
    logger.info("Application Launched successfully.");
  }

  @Override
  public void stop() throws Exception {
    super.stop();
    logger.info("Exiting Green grocer...");
  }

  public static void main(String[] args) {
    logger.info("Launching Green grocer...");
    launch(args);
  }
}
