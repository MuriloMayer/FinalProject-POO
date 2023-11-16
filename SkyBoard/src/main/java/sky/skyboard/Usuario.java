package sky.skyboard;


public class Usuario {
    protected String cargo;
    protected int id;
    protected String genero;
    protected String nome;
    protected String anoNascimento;
    protected String cpf;

//    public Usuario(String cargo, int id,String genero, String nome, String anoNascimento, String cpf){
//        this.cargo = cargo;
//        this.id = id;
//        this.genero = genero;
//        this.nome = nome;
//        this.anoNascimento = anoNascimento;
//        this.cpf = cpf;
//    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoNascimento(String anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrarInfo(){}
}