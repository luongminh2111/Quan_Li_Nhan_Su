package query.HungQuery.cau5;
import DAO.hung.DatabaseConnectionQuery5;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

public class Cau5 implements Initializable {

    @FXML
    private TableView<Class5> table5;

    @FXML
    private TableColumn<Class5, String > maNVColumn;

    @FXML
    private TableColumn<Class5, String> hotenColumn;

    @FXML
    private TableColumn<Class5, Date> ngaysinhColumn;

    @FXML
    private TableColumn<Class5, String> sdtColumn;

    ObservableList<Class5> listInf5 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        maNVColumn.setCellValueFactory(new PropertyValueFactory<>("manv"));

        hotenColumn.setCellValueFactory(new PropertyValueFactory<>("hoten"));

        ngaysinhColumn.setCellValueFactory(new PropertyValueFactory<>("ngaysinh"));

        sdtColumn.setCellValueFactory(new PropertyValueFactory<>("sdt"));

        listInf5= DatabaseConnectionQuery5.getInf5();
        table5.setItems(listInf5);
    }
}
