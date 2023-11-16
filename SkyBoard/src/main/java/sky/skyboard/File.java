/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sky.skyboard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Murilo
 */
public class File {
    OutputStream osP;
    OutputStreamWriter oswP;
    BufferedWriter bwP;
    
    InputStream isP;
    InputStreamReader isrP;
    BufferedReader brP;
    
    OutputStream osB;
    OutputStreamWriter oswB;
    BufferedWriter bwB;
    
    InputStream isB;
    InputStreamReader isrB;
    BufferedReader brB;
    
    public File() {
        try {
            osP = new FileOutputStream("Passageiros.txt",true);
            oswP = new OutputStreamWriter(osP);
            bwP = new BufferedWriter(oswP);
            
            osB = new FileOutputStream("Bagagens.txt",true);
            oswB = new OutputStreamWriter(osB);
            bwB = new BufferedWriter(oswB);
            
            
            isP = new FileInputStream("Passageiros.txt");
            isrP = new InputStreamReader(isP);
            brP = new BufferedReader(isrP);
            
            isB = new FileInputStream("Bagagens.txt");
            isrB = new InputStreamReader(isB);
            brB = new BufferedReader(isrB);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void savePassenger(Passageiro passageiro) throws IOException {
        String object = passageiro.getNome()+","+passageiro.getCpf()+","+passageiro.getPassaporteId()+","+passageiro.getGenero()+","+passageiro.getAnoNascimento()+","+passageiro.getCodPassagem()+",";
        bwP.append(object);
        
        bwP.newLine();
        bwP.close();
        oswP.close();
        osP.close();
    }    
    public void saveBaggage(Bagagem bagagem) throws IOException {
        String object = bagagem.getNomeDono()+","+bagagem.getCpfDono()+","+bagagem.getCpfDono()+","+bagagem.getPassaporteDono()+","+bagagem.getPeso()+",";
        bwB.append(object);
        
        bwB.newLine();
        bwB.close();
        oswB.close();
        osB.close();
    }
    
    public  ArrayList<Bagagem> listBaggage() {
        Bagagem bagagem = new Bagagem();
        ArrayList<Bagagem> bagagens = new ArrayList<Bagagem>();
        String[] elementos;
        
        try {
            String line = brB.readLine();
            
                    while(line != null) {
                        elementos = line.split(",");
                        bagagem.setNomeDono(elementos[0]);
                        bagagem.setCpfDono(elementos[1]);
                        bagagem.setPassaporteDono(elementos[2]);
                        bagagem.setPeso(elementos[3]);
                        
                        bagagens.add(bagagem);
                        line = brB.readLine();
                        bagagem = new Bagagem();
                    }
                return bagagens;
        } catch (IOException ex) {
            System.out.println("Erro Ao Adicionar Linha");
            return null;
        }
        

    }
    
    
    public  ArrayList<Passageiro> listPassenger() {
        Passageiro passageiro = new Passageiro();
        ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();
        String[] elementos;
        
        try {
            String line = brP.readLine();
            
                    while(line != null) {
                        elementos = line.split(",");
                        passageiro.setNome(elementos[0]);
                        passageiro.setCpf(elementos[1]);
                        passageiro.setPassaporteId(elementos[2]);
                        passageiro.setGenero(elementos[3]);
                        passageiro.setAnoNascimento(elementos[4]);
                        passageiro.setCodPassagem(elementos[5]);
                        
                        passageiros.add(passageiro);
                        line = brP.readLine();
                        passageiro = new Passageiro();
                    }
                return passageiros;
        } catch (IOException ex) {
            System.out.println("Erro Ao Adicionar Linha");
            return null;
        }
        

    }
    
    
    
}
 