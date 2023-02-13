module com.example.provasonar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.provasonar to javafx.fxml;
    exports com.example.provasonar;
}