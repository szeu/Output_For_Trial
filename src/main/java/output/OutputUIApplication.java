package output;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OutputUIApplication extends Application{
	static Student student1 = new Student("SAFFRON, Corgipoo", "20004488", "CorgipooSAF@connect.ust.hk", 26, 80, false, false, false, "");
	static Student student2 = new Student("HYSSOP, Chamois", "20023331", "ChamoisHYS@connect.ust.hk", 27, 85, false, false, false, "");
	static Student student3 = new Student("CHRYSANTHEMUM, Abelisaurus", "20067232", "AbelisaurusCHR@connect.ust.hk", 57, 60, false, false, false, "");
	static Student student4 = new Student("ORCHID, Uranus", "20153166", "UranusORC@connect.ust.hk", 89, 45, false, false, false, "");
	static Student student5 = new Student("MARJORAM, Coral", "20169289", "CoralMAR@connect.ust.hk", 62, 85, false, false, false, "");
	static Student student6 = new Student("ANAHEIM, Alligator", "20182694", "AlligatorANA@connect.ust.hk", 31, 50, true, false, false, "");
	static Student student7 = new Student("TULIP, Cristina", "20603796", "CristinaTUL@connect.ust.hk", 95, 30, false, false, false, "");
	
	static ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(student1, student2, student3, student4, student5, student6, student7));
	
	static Team team1 = new Team(1, new ArrayList<Student>(Arrays.asList(student1, student3, student7)), 2);
	static Team team2 = new Team(2, new ArrayList<Student>(Arrays.asList(student2, student4, student5, student6)), 1);
	
	static ArrayList<Team> teams = new ArrayList<Team>(Arrays.asList(team1, team2));
	
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/requestUI.fxml"));
		VBox root = (VBox) loader.load();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Output");
		stage.show();
	}
	
	public static void run(String arg[]) {
		Application.launch(arg);
	}
	
}
