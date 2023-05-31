module com.example.lanekalkulatorhimsin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lanekalkulatorhimsin to javafx.fxml;
    exports com.example.lanekalkulatorhimsin;
}