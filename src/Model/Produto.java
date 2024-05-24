package Model;

import java.util.*;
import DAO.ProdutoDAO;
import java.sql.SQLException;

public class Produto extends Item {

    // Atributos
    private String descricao_produto;
    private int qntd_estoque;
    private String data;
    private final ProdutoDAO dao;
    
    // Método Construtor de Item Vazio
    public Produto(){
       this.dao = new ProdutoDAO(); // inicializado não importa em qual construtor
    }
    
    // Método Construtor de Objeto, inserindo dados
    public Produto(String descricao_produto, int qntd_estoque) {
        this.descricao_produto = descricao_produto;
        this.qntd_estoque = qntd_estoque;
        this.dao = new ProdutoDAO(); // inicializado não importa em qual construtor
    }

    // Método Construtor usando também o construtor da SUPERCLASSE
    public Produto(String nome_produto, double preco_produto, int ID_produto, String descricao_produto, int qntd_estoque, String data) {
        super(ID_produto, nome_produto, preco_produto);
        this.descricao_produto = descricao_produto;
        this.qntd_estoque = qntd_estoque;
        this.data = data;
        System.out.println("aqui 0:"+data);
        this.dao = new ProdutoDAO(); // inicializado não importa em qual construtor
    }

    // Métodos GET e SET
    public String getdescricao_produto() {
        return descricao_produto;
    }

    public void setdescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public int getqntd_estoque() {
        return qntd_estoque;
    }

    public void setqntd_estoque(int qntd_estoque) {
        this.qntd_estoque = qntd_estoque;
    }
    
    public String getdata() {
        return data;
    }

    public void setdata(String data) {
        this.data = data;
    }

    // Override necessário para poder retornar os dados de Item no toString para Produto.
    @Override
    public String toString() {
        return "\n ID: " + this.getID_produto()
                + "\n Nome: " + this.getnome_produto()
                + "\n Preço: " + this.getpreco_produto()
                + "\n Descrição: " + this.getdescricao_produto()
                + "\n Quantidade no estoque:" + this.getqntd_estoque()
                + "\n Data de registro" + this.getdata()
                + "\n -----------";
    }

    /*
    
        ABAIXO OS MÉTODOS PARA USO JUNTO COM O DAO
        SIMULANDO A ESTRUTURA EM CAMADAS PARA USAR COM BANCOS DE DADOS.
    
     */

    // Retorna a Lista de Produto(objetos)
    public ArrayList getMinhaLista() {
        //return ProdutoDAO.MinhaLista;
        return dao.getMinhaLista();
    }

    // Cadastra novo produto
    public boolean InsertProdutoBD(String nome_produto, double preco_produto, String descricao_produto, int qntd_estoque) throws SQLException {
        int ID_produto = this.maiorID() + 1;
        Produto objeto = new Produto(nome_produto, preco_produto, ID_produto, descricao_produto, qntd_estoque,data);
        dao.InsertProdutoBD(objeto);
        return true;
    }

    
    // Deleta um produto específico pelo seu campo ID
    public boolean DeleteProdutoBD(int ID_produto) {
        dao.DeleteProdutoBD(ID_produto);
        return true;
    }

    // Edita um produto específico pelo seu campo ID
    public boolean UpdateProdutoBD(String nome_produto, String descricao_produto,  int ID_produto, double preco_produto, int qntd_estoque, String data) {
        Produto objeto = new Produto(nome_produto, preco_produto, ID_produto, descricao_produto, qntd_estoque, data);
        dao.UpdateProdutoBD(objeto);
        return true;
    }

    // carrega dados de um produto específico pelo seu ID
    public Produto carregaProduto(int ID_produto) {
        dao.carregaProduto(ID_produto);
        return null;
    }

    // retorna o maior ID da nossa base de dados
    public int maiorID() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.maiorID();
    }

}