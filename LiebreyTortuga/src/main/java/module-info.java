module com.fanny.liebreytortuga {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fanny.liebreytortuga to javafx.fxml;
    exports com.fanny.liebreytortuga;
}
