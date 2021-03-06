package query.TuanAnhQuery.cau9;
import DAO.tuanAnh.DatabaseConnectionQuery9;
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

public class Cau9 implements Initializable {
    @FXML
    private TableView<Class9> table9;

    @FXML
    private TableColumn<Class9, String> mNVColumn;

    @FXML
    private TableColumn<Class9, String> hoTenColumn;

    @FXML
    private TableColumn<Class9, Date> ngaySinhColumn;

    @FXML
    private TableColumn<Class9, String> queQuanColumn;

    @FXML
    private TableColumn<Class9, String> gioiTinhColumn;

    @FXML
    private TableColumn<Class9, String> danTocColumn;

    @FXML
    private TableColumn<Class9, String> sdtColumn;

    @FXML
    private TableColumn<Class9, String> maPBColumn;

    @FXML
    private TableColumn<Class9, String> maCVColumn;

    @FXML
    private TableColumn<Class9, String> maTDHVColumn;

    @FXML
    private TableColumn<Class9, String> bacLuongColumn;

    @FXML
    private TableColumn<Class9, Date> ngayKTColumn;

    ObservableList<Class9> listInf9 = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //manv, hoten,quequan,gioitinh,dantoc,sdt,mapb,macv,matdhv,bacluong,loaihd;
        mNVColumn.setCellValueFactory(new PropertyValueFactory<>("manv"));

        hoTenColumn.setCellValueFactory(new PropertyValueFactory<>("hoten"));

        ngaySinhColumn.setCellValueFactory(new PropertyValueFactory<>("ngaysinh"));

        queQuanColumn.setCellValueFactory(new PropertyValueFactory<>("quequan"));

        gioiTinhColumn.setCellValueFactory(new PropertyValueFactory<>("gioitinh"));

        danTocColumn.setCellValueFactory(new PropertyValueFactory<>("dantoc"));

        sdtColumn.setCellValueFactory(new PropertyValueFactory<>("sdt"));

        maPBColumn.setCellValueFactory(new PropertyValueFactory<>("mapb"));

        maCVColumn.setCellValueFactory(new PropertyValueFactory<>("macv"));

        maTDHVColumn.setCellValueFactory(new PropertyValueFactory<>("matdhv"));

        bacLuongColumn.setCellValueFactory(new PropertyValueFactory<>("bacluong"));

        ngayKTColumn.setCellValueFactory(new PropertyValueFactory<>("ngaykt"));

        listInf9 = DatabaseConnectionQuery9.getInf9();
        table9.setItems(listInf9);
    }
}
