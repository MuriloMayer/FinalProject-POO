public class Usuario {
    protected String cargo;
    protected int id;
    protected String genero;
    protected String nome;
    protected String anoNascimento;
    protected String cpf;

    public Usuario(String cargo, int id,String genero, String nome, String anoNascimento, String cpf){
        this.cargo = cargo;
        this.id = id;
        this.genero = genero;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.cpf = cpf;
    }
}
