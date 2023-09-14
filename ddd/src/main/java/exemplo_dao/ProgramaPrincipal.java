package exemplo_dao;

import java.sql.Connection;
import java.sql.SQLException;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Connection conexao = null;
		
		try {
			conexao = ConexaoBancoDados.obterConexao();
			System.out.println("Conexão obtida com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro ao obter uma conexão!" + e.getMessage());
			e.printStackTrace();
		}
		
		UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
		usuarioDAO.inserir(new Usuario(0, "Fernando", "fefe@gatinho.com.br"));
	}

}
