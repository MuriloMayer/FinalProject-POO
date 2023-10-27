public class Passageiro extends Usuario {
    protected String passaporteId;
    protected String codPassagem;

    public Passageiro(String cargo, int id,String genero, String nome, String anoNascimento, String cpf, String passaporteId, String codPassagem){
        super(cargo, id,genero, nome, anoNascimento, cpf);
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
