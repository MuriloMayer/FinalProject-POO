import java.util.ArrayList;

public class Passageiro extends Usuario {
    protected String passaporteId;
    protected String codPassagem;

    public Passageiro(String cargo, int id,String genero, String nome, String anoNascimento, String cpf, String passaporteId, String codPassagem){
        super(cargo, id,genero, nome, anoNascimento, cpf);
        this.passaporteId = passaporteId;
        this.codPassagem = codPassagem;
    }

    public String getCargo(){
      return cargo;
    } 

    public int getId(){
      return id;
    } 

     public String getGenero(){
      return genero;
    }

  public String getNome(){
      return nome;
    }  

     public String getAnoNascimento(){
      return anoNascimento;
    }

     public String getCpf(){
      return cpf;
    }

     public String getPassaporteId(){
      return passaporteId;
    }

     public String getCodPassagem(){
      return codPassagem;
    }

    
    public static void exibirPassageiros(Passageiro [] passageiros){
        for(Passageiro passageiro : passageiros){
            System.out.println( "Cargo: " + passageiro.getCargo() + "\n" +
                                "ID: " + passageiro.getId() + "\n" +
                                "Gênero: " + passageiro.getGenero() + "\n" +
                                "Nome " + passageiro.getNome() + "\n" + 
                                "Ano de Nascimento: " + passageiro.getAnoNascimento() + "\n" + 
                                "CPF: " + passageiro.getCpf() + "\n" + 
                                "Id do Passaporte: " + passageiro.getPassaporteId() + "\n" + 
                                "Código da Passagem: " + passageiro.getCodPassagem() + "\n" +
                                "--------------------");
            
        }
    } 

    public void registrarVoo(){}

    public void checkOutPassageiro(){}
    
    public void editarCadastroPassageiro(){}

    public void cadastrarPassageiro(){}

    public void registrarBagagem(){}
    
}
