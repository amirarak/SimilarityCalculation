module com.example.similaritycalculate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.similaritycalculate to javafx.fxml;
    exports com.example.similaritycalculate;
}