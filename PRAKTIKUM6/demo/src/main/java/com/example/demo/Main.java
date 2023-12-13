package com.example.demo;

import com.example.demo.Mahasiswa;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> table = new TableView<>();

        TableColumn<Mahasiswa, String> nimColoum = new TableColumn<>("NIM");
        nimColoum.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> namaColoum = new TableColumn<>("Nama");
        namaColoum.setCellValueFactory(new PropertyValueFactory<>("nama"));

        table.getColumns().addAll(nimColoum, namaColoum);

        ObservableList<Mahasiswa> data = FXCollections.observableArrayList(
                new Mahasiswa(1, "Aldira Putri Sholeha", "2210817220024"),
                new Mahasiswa(2, "Virzha Alghifari", "2210817220001"),
                new Mahasiswa(3, "Najib Alifian Karimi", "2210817220002"),
                new Mahasiswa(4, "Artika Meilia Dyah P", "2210817220003"),
                new Mahasiswa(5, "Familinda Eka", "2210817220004"),
                new Mahasiswa(6, "Muhammad Aldibaranur Faiq", "2210817220005"),
                new Mahasiswa(7, "Muhammad Aldivaro Akbar", "2210817220006"),
                new Mahasiswa(8, "Aldila Glenny Revinawati", "2210817220007"),
                new Mahasiswa(9, "Juli Indra Buana", "2210817220008"),
                new Mahasiswa(10, "Muhammad Zayyan", "2210817220009")
        );

        table.setItems(data);

        Scene scene = new Scene(table, 300, 275);

        primaryStage.setTitle("Daftar Mahasiswa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
