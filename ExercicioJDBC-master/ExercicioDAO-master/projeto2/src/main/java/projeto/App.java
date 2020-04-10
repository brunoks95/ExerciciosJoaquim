package projeto;
import projeto.persistencia.AlunoDAOMySQL;


public class App 
{
    public static void main( String[] args )
    {
        AlunoDAOMySQL mysqlDAO = new AlunoDAOMySQL();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario(mysqlDAO);
        interfaceUsuario.iniciar();
    }
    }

