module com.example.mygui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mygui to javafx.fxml;
    exports com.example.mygui;
}