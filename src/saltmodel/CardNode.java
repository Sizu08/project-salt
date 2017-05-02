package saltmodel;

import java.awt.List;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import saltcontroller.Row;

public class CardNode extends ImageView {

	public String name = "我が名はめぐみん";
	public String color = "Red";
	public String side = "Weiss";
	public String Rarity = "TD";
	public String type = "Character";
	public int level = 3;
	public int power = 10000;
	public int cost = 2;
	public int soul = 2;
	public String trait1 = "冒険者 (Adventurer)";
	public String trait2 = "魔法 (Magic)";
	public String triggers = "Soul";
	public String effect = "[A] When this is placed from hand to the Stage, this gains +X Power for the turn. X = 500 times # of your Characters with either ::Adventurer:: or ::Magic::. [A] When this is placed from hand to the Stage, you may choose a Character in your Waiting Room with either ::Adventurer:: or ::Magic:: and return it to your hand. ";
	public String flavor = "blah";
	
	ArrayList list;
	
	public CardNode(Image image) {
		super(image);
		
		
		// TODO Auto-generated constructor stub
	}
	
	
}
