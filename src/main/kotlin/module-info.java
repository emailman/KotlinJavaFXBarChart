module com.example.kotlinjavafxbarchart {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.kotlinjavafxbarchart to javafx.fxml;
    exports com.example.kotlinjavafxbarchart;
}