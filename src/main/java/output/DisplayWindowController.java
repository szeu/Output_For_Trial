package output;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

public class DisplayWindowController {

    @FXML
    private TableColumn<?, ?> energy_content_column;

    @FXML
    private TableView<?> energy_table;

    @FXML
    private TableColumn<?, ?> energy_title_column;

    @FXML
    private TreeTableColumn<?, ?> leader_column;

    @FXML
    private Label searching_id;

    @FXML
    private Label searching_name;

    @FXML
    private Label team_number;

    @FXML
    private TreeTableColumn<?, ?> teammates_column;

    @FXML
    private TreeTableView<?> teammates_table;

}
