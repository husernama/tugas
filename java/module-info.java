module com.example.mod {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mod to javafx.fxml;
    exports com.example.mod;
}