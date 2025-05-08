package com.example.cadastroempresa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sistema de Cadastro para Pequenas Empresas");

        Button btnClientes = new Button("Cadastro de Clientes");
        Button btnProdutos = new Button("Cadastro de Produtos");
        Button btnPedidos = new Button("Cadastro de Pedidos");
        Button btnRelatorios = new Button("Gerar Relatórios");

        VBox menu = new VBox(20, btnClientes, btnProdutos, btnPedidos, btnRelatorios);
        menu.setStyle("-fx-padding: 40; -fx-alignment: center; -fx-spacing: 20;");

        btnClientes.setOnAction(e -> abrirTelaClientes());
        btnProdutos.setOnAction(e -> abrirTelaProdutos());
        btnPedidos.setOnAction(e -> abrirTelaPedidos());
        btnRelatorios.setOnAction(e -> abrirTelaRelatorios());

        primaryStage.setScene(new Scene(menu, 400, 400));
        primaryStage.show();
    }

    private void abrirTelaClientes() {
        System.out.println("Abrindo tela de clientes...");
    }

    private void abrirTelaProdutos() {
        System.out.println("Abrindo tela de produtos...");
    }

    private void abrirTelaPedidos() {
        System.out.println("Abrindo tela de pedidos...");
    }

    private void abrirTelaRelatorios() {
        System.out.println("Abrindo tela de relatórios...");
    }

    public static void main(String[] args) {
        launch(args);
    }
}

