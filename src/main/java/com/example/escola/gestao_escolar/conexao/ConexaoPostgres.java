package com.example.escola.gestao_escolar.conexao;

import java.sql.*;

public class ConexaoPostgres {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/escola";
        String user = System.getenv("POSTGRES_USER");
        String pwd = System.getenv("POSTGRES_PASSWORD");


        try (Connection connection = DriverManager.getConnection(url, user, pwd)) {
            System.out.println("Exibindo a tabela alunos");
            String sql = "SELECT * FROM alunos";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("\n| id | nome          | idade            ");
            System.out.println("-----+---------------+----------------");
            while (rs.next()) {
                System.out.printf(
                        "| %-2d | %-22s | %-3s |\n",
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("idade")

                );
            }
        } catch (SQLException error) {
            System.out.println("Erro ao conectar ao banco de dados: " + error);
        }
    }
}
