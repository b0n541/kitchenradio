package net.b0n541.kitchenradio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KitchenRadioApplication extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Kitchen Radio");

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label search = new Label("Search:");
		grid.add(search, 0, 1);

		TextField searchTextField = new TextField();
		grid.add(searchTextField, 1, 1);

		Scene scene = new Scene(grid, 800, 600);
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
