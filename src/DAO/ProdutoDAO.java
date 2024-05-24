package DAO;

import Model.Item;
import Model.Produto;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoDAO {

    public static ArrayList<Produto> MinhaLista = new ArrayList<Produto>();

    public ProdutoDAO() {
    }

    // importa a data do banco de dados, retornando a data que o produto foi cadastrado
    public String data(){
        String data = "";
        try{
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT DATE_FORMAT(data, \"%d/%m/%Y\");   AS data FROM tb_produtos");
        }catch (SQLException ex){
            ex.printStackTrace();
        }return data;
    }


    public int maiorID() {
    int maiorID = 0;
    try {
        Statement stmt = this.getConexao().createStatement();
        ResultSet res = stmt.executeQuery("SELECT MAX(ID_produto) AS ID_produto FROM tb_produtos");
        if (res.next()) {
            maiorID = res.getInt("ID_produto");
        }
        stmt.close();
    } catch (SQLException ex) {
        // Trate a exceção de SQLException aqui
        ex.printStackTrace(); // Isso imprime o stack trace para ajudar na depuração
        // Ou você pode imprimir uma mensagem de erro ou fazer outro tratamento necessário
    }
    return maiorID;
}


    public Connection getConexao() {

        Connection connection = null;  //instância de conexão

        try {

            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conexão
            String server = "localhost"; //caminho do MySQL
            String database = "db_a3";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "V.xande11";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage() );
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    // Retorna a Lista de Produto(objetos)
    public ArrayList getMinhaLista() {
        
        MinhaLista.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT ID_produto, nome_produto, descricao_produto,preco_produto,qntd_estoque, DATE_FORMAT(data, \"%d/%m/%Y - %Hh\") as data  FROM tb_produtos");
            while (res.next()) {

                int ID_produto = res.getInt("ID_produto");
                String nome_produto = res.getString("nome_produto");
                String descricao_produto = res.getString("descricao_produto");
                double preco_produto = res.getDouble("preco_produto");
                int qntd_estoque = res.getInt("qntd_estoque");
                String data = res.getString("data");

                Produto objeto = new Produto(nome_produto, preco_produto, ID_produto, descricao_produto, qntd_estoque, data);

                MinhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

    // Cadastra novo aluno
    public boolean InsertProdutoBD(Produto objeto) {
        String sql = "INSERT INTO tb_produtos(ID_produto,nome_produto,descricao_produto,preco_produto,qntd_estoque) VALUES(?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getID_produto());
            stmt.setString(2, objeto.getnome_produto());
            stmt.setString(3, objeto.getdescricao_produto());
            stmt.setDouble(4, objeto.getpreco_produto());
            stmt.setInt(5, objeto.getqntd_estoque());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    // Deleta um aluno específico pelo seu campo ID
    public boolean DeleteProdutoBD(int ID_produto) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_produtos WHERE ID_produto = " + ID_produto);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }

    // Edita um aluno específico pelo seu campo ID
    public boolean UpdateProdutoBD(Produto objeto) {

        String sql = "UPDATE tb_produtos set nome_produto = ? ,descricao_produto = ? ,preco_produto = ? ,qntd_estoque = ? WHERE ID_produto = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getnome_produto());
            stmt.setString(2, objeto.getdescricao_produto());
            stmt.setDouble(3, objeto.getpreco_produto());
            stmt.setInt(4, objeto.getqntd_estoque());
            stmt.setInt(5, objeto.getID_produto());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }
 
    // carrega um item da tabela através do ID
    public Produto carregaProduto(int ID_produto) {
        
        Produto objeto = new Produto();
        objeto.setID_produto(ID_produto);
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_produtos WHERE ID_produto = " + ID_produto);
            res.next();

            objeto.setnome_produto(res.getString("nome_produto"));
            objeto.setdescricao_produto(res.getString("descricao_produto"));
            objeto.setPreco_produto(res.getDouble("preco_produto"));
            objeto.setqntd_estoque(res.getInt("qntd_estoque"));

            stmt.close();            
            
        } catch (SQLException erro) {
        } 
        return objeto;
    }
    
    // verifica a soma total de qntd_estoque e a guarda em totalEstoque;
    public int somarEstoque() {
        String sql = "SELECT SUM(qntd_estoque) AS total_estoque FROM tb_produtos";
        int totalEstoque = 0;

        try (PreparedStatement stmt = this.getConexao().prepareStatement(sql);
             ResultSet res = stmt.executeQuery()) {
            if (res.next()) {
                totalEstoque = res.getInt("total_estoque");
            }
        } catch (SQLException erro) {
            throw new RuntimeException("Erro ao somar estoque: " + erro.getMessage(), erro);
        }
        return totalEstoque;
    }
}