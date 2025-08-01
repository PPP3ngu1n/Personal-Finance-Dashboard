module org.example.personalfinancedashboard {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.personalfinancedashboard to javafx.fxml;
    exports org.example.personalfinancedashboard;
}