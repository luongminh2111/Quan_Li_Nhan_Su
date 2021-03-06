package query.MinhQuery.cau7;

import DAO.minh.DatabaseConnection7;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Cau7 implements Initializable {
    @FXML
    private TableView<Class7> table7;

    @FXML
    private TableColumn<Class7, String> mnvColumn;

    @FXML
    private TableColumn<Class7, String> hotenColumn;

    @FXML
    private TableColumn<Class7, String> sdtColumn;

    @FXML
    private TableColumn<Class7, String> quequanColumn;

    @FXML
    private TableColumn<Class7, String> tenTDHVColumn;

    @FXML
    private TableColumn<Class7, String> chucvuColumn;

    @FXML
    private TableColumn<Class7, String> tenPBColumn;

    ObservableList<Class7> listInf7 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //manv,hoten,ngaysinh,quequan,gioitinh,dantoc,sdt;
        mnvColumn.setCellValueFactory(new PropertyValueFactory<>("manv"));

        hotenColumn.setCellValueFactory(new PropertyValueFactory<>("hoten"));

        quequanColumn.setCellValueFactory(new PropertyValueFactory<>("quequan"));

        sdtColumn.setCellValueFactory(new PropertyValueFactory<>("sdt"));

        tenTDHVColumn.setCellValueFactory(new PropertyValueFactory<>("tentdhv"));

        chucvuColumn.setCellValueFactory(new PropertyValueFactory<>("tencv"));

        tenPBColumn.setCellValueFactory(new PropertyValueFactory<>("tenpb"));

        listInf7 = DatabaseConnection7.getInf7();
        table7.setItems(listInf7);
    }
}
