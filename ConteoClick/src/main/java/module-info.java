module com.fanny.conteoclick {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fanny.conteoclick to javafx.fxml;
    exports com.fanny.conteoclick;
}
