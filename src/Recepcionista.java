public class Recepcionista extends Usuario{
    private String email;
    private String senha;

    public Recepcionista(int id, String nome, String anoNascimento, String cpf, String email, String senha){
        super(id, nome, anoNascimento, cpf);
        this.email = email;
        this.senha = senha;
    }

    public void verificarVoo(){

    }

    public void verificarBagagem(){

    }

    public void cadastroRecepcionista(){
        
    }
    
}
