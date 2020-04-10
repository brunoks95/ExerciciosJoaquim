package projeto.persistencia;

import projeto.entidades.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAOMySQL implements AlunoDAO {
    private String readSQL = "SELECT * FROM alunoDAO";
    private String read1SQL = "SELECT * FROM alunoDAO WHERE nome LIKE 'A%'";
    private final MySQLConnection mysql = new MySQLConnection();



    @Override
    public List<Aluno> read() {
        Connection conexao = mysql.getConnection();
        List<Aluno> alunos = new ArrayList();

        try {
            PreparedStatement stm = conexao.prepareStatement(readSQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setTia(rs.getLong("tia"));
                aluno.setNome(rs.getString("nome"));
                aluno.setCurso(rs.getString("curso"));
                alunos.add(aluno);
            }

            return alunos;

        } catch (final SQLException ex) {
            System.out.println("Falha de conexão com a base de dados!");
            ex.printStackTrace();
        } catch (final Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                conexao.close();
            } catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        return alunos;
    }
    @Override
    public List<Aluno> read1() {
        Connection conexao = mysql.getConnection();
        List<Aluno> alunos = new ArrayList();

        try {
            PreparedStatement stm = conexao.prepareStatement(read1SQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setTia(rs.getLong("tia"));
                aluno.setNome(rs.getString("nome"));
                aluno.setCurso(rs.getString("curso"));
                alunos.add(aluno);
            }

            return alunos;

        } catch (final SQLException ex) {
            System.out.println("Falha de conexão com a base de dados!");
            ex.printStackTrace();
        } catch (final Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                conexao.close();
            } catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        return alunos;
    }





}
