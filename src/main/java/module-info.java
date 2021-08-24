module com.example.oop_javafx_demo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.oop_javafx_demo2 to javafx.fxml;
    exports com.example.oop_javafx_demo2;
}