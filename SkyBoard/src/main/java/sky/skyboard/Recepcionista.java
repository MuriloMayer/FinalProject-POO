package sky.skyboard;

import java.util.ArrayList;

public class Recepcionista extends Usuario{
    private String email;
    private String senha;

    public Recepcionista(String cargo, int id,String genero, String nome, String anoNascimento, String cpf, String email, String senha){
        super(cargo, id,genero, nome, anoNascimento, cpf);
        this.email = email;
        this.senha = senha;
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

      public String getEmail(){
          return email;
      }

      public static void exibirRecepcionistas(Recepcionista [] recepcionistas){
        for(Recepcionista recepcionista : recepcionistas){
            System.out.println( "Cargo: " + recepcionista.getCargo() + "\n" +
                                "ID: " + recepcionista.getId() + "\n" +
                                "Gênero: " + recepcionista.getGenero() + "\n" +
                                "Nome " + recepcionista.getNome() + "\n" + 
                                "Ano de Nascimento: " + recepcionista.getAnoNascimento() + "\n" + 
                                "CPF: " + recepcionista.getCpf() + "\n" + 
                                "Email: " + recepcionista.getEmail() + "\n" + 
                                "--------------------");
            
        }
    } 

    public void mostrarInfo(){}

    public void verificarVoo(){}

    public void verificarBagagem(){}

    public void cadastroRecepcionista(){}
    
}
