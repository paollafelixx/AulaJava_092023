package exemplo_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
	
	private Connection conexao;
	
	public UsuarioDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public void inserir(Usuario usuario) {
		try {
			PreparedStatement ps = conexao.prepareStatement("INSERT INTO <tabela> VALUES(?,?");
		    ps.setString(1, usuario.getNome());
		    ps.setString(2, usuario.getEmail());
		    System.out.println("Cliente inserido com sucesso!");
		} catch (SQLException e) {
			System.out.println("Cliente não inserido : " + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public void fecharConexao() {
		System.out.println("Fechando conexão...");
		try {
			conexao.close();
			System.out.println("Conexão fechada!");
		} catch (SQLException e) {
			System.err.println("Conexão NÃO fechada!");
			e.printStackTrace();
		}
	}

}
