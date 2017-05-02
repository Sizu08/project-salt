package saltview;

import java.io.FileInputStream;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import saltmodel.CardNode;

public class SaltController {
	
	@FXML
	private GridPane gridList;
	
	private CardNode cardNode;
	
	@FXML
	private ImageView imageTab;
	
	@FXML
	private TableColumn tableValue;
	
	@FXML
	private TableColumn tableAttr;
	
	@FXML
	private TableView cardTable;
	
	FileInputStream input;
	
	@FXML
	private void handleExit(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("asdf");
		alert.showAndWait();
	}
	
	@FXML
	private void handleLoad(ActionEvent event) throws Exception {
		
		 input = new FileInputStream("c:/resources/image1.jpg");
		 Image image = new Image(input);
		 cardNode = new CardNode(image);
		 cardNode.setFitHeight(150);
		 cardNode.setPreserveRatio(true);
		 
		 cardNode.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			 
			 @Override
			 public void handle(MouseEvent mouseEvent) {
				 imageTab.setImage(image);
				 //System.out.println(cardNode.name);
				 
				 
			 }
		 }
				 
		);
		 gridList.add(cardNode,0,0);
		 
		 /*
		 input = new FileInputStream("c:/resources/image2.jpg");
		 image = new Image(input);
		 cardNode = new ImageView(image);
		 cardNode.setFitHeight(150);
		 cardNode.setPreserveRatio(true);
		 gridList.add(cardNode, 1, 0);
		 */
	}
	
}
