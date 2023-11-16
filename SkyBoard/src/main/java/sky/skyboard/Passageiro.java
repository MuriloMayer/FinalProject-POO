package sky.skyboard;

public class Passageiro extends Usuario {
    protected String passaporteId;
    protected String codPassagem;
    protected Boolean status;

    protected Object voo;

//    public Passageiro(String cargo, int id,String genero, String nome, String anoNascimento, String cpf, String passaporteId, String codPassagem){
//        super(cargo, id,genero, nome, anoNascimento, cpf);
//        this.passaporteId = passaporteId;
//        this.codPassagem = codPassagem;
//    }

    public Object getVoo() {
        return voo;
    }

    public void setVoo(Object voo) {
        this.voo = voo;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setPassaporteId(String passaporteId) {
        this.passaporteId = passaporteId;
    }

    public void setCodPassagem(String codPassagem) {
        this.codPassagem = codPassagem;
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
     public Boolean getStatus() {
         return status;
     }

     public String getCodPassagem(){
      return codPassagem;
    }

    
    public static void exibirPassageiros(Passageiro [] passageiros){
        for(Passageiro passageiro : passageiros){
            System.out.println(
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
