package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../../../resources/fxml/headMainUI.fxml"));
        // fxml/testFX.fxml을 불러온다.
        Parent root = loader.load();

        // 기본 타이틀바 제거
//        primaryStage.initStyle(StageStyle.UNDECORATED);

        // GUI에 보일 프로그램 제목을 설정한다.
        primaryStage.setTitle("Pickypal");

        // 화면을 설정한다. 두번째 파라미터는 프로그램의 Width, 세번째는 Height를 설정한다
        primaryStage.setScene(new Scene(root, 1024, 768));

        // 화면을 보여주는 작업을 실행한다
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}