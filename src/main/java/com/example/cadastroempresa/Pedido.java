package com.example.cadastroempresa;

import java.util.Date;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<Produto> listaProdutos;
    private Date data;
    private double total;

    public Pedido(Cliente cliente, List<Produto> listaProdutos, Date data){
        this.cliente = cliente;
        this.listaProdutos = listaProdutos;
        this.data = data;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
        calcularTotal();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    private void calcularTotal() {
        this.total = 0;
        for (Produto produto : listaProdutos) {
            this.total += produto.getPreco() * produto.getQuantidade();
        }
    }

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
        calcularTotal();
    }

    public void removerProduto(Produto produto) {
        listaProdutos.remove(produto);
        calcularTotal();
    }

}
