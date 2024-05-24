package Model;

import VIEW.Mensagem;
import DAO.ProdutoDAO;

public abstract class Item {

    // Atributos
    public int ID_produto;
    public String nome_produto;
    public double preco_produto;

    // Método Construtor de Item Vazio (para instanciar o objeto sem todas as caracteristicas)
    public Item() {
    }

    // Método Construtor de Item, inserindo dados
    public Item(int ID_produto, String nome_produto, double preco_produto) {
        this.ID_produto = ID_produto;
        this.nome_produto = nome_produto;
        this.preco_produto = preco_produto;
    }

    // Métodos GET e SET (obter e definir valor do campo)1
    public int getID_produto() {
        return ID_produto;
    }

    public void setID_produto(int ID_produto) {
        this.ID_produto = ID_produto;
    }

    public String getnome_produto() {
        return nome_produto;
    }

    public void setnome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getpreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(double preco_produto) {
    this.preco_produto = preco_produto;
}


}
