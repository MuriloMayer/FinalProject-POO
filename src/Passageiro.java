public class Passageiro extends Usuario {
    protected int passaporteId;
    protected int codPassagem;

    public Passageiro(int id, String nome, String anoNascimento, String cpf, int passaporteId, int codPassagem){
        super(id, nome, anoNascimento, cpf);
        this.passaporteId = passaporteId;
        this.codPassagem = codPassagem;
    }

    public void registrarVoo(){

    }

    public void checkOutPassageiro(){

    }
    
    public void editarCadastroPassageiro(){

    }

    public void cadastrarPassageiro(){

    }

    public void registrarBagagem(){

    }
    
}
