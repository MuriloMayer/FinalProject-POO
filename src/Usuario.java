public class Usuario {
    protected int id;
    protected String nome;
    protected String anoNascimento;
    protected String cpf;

    public Usuario(int id, String nome, String anoNascimento, String cpf){
        this.id = id;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.cpf = cpf;
    }
}
