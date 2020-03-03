package hospitalfantasy;

import java.util.ArrayList;
import java.util.Random;

public class Paciente implements Observavel {

    public String nome;
    public int temperatura;
    public int batimentos;

    ArrayList<Responsavel> listaderesponsaveis;
    
    Paciente(String nome, int temperatura, int batimentos){
        this.nome = nome;
        this.temperatura = temperatura;
        this.batimentos = batimentos;
        listaderesponsaveis = new ArrayList<>();
        
    }
    
    @Override
    public void addResp(Responsavel a) {
        this.listaderesponsaveis.add(a);
    }

    @Override
    public void deleteResp(Responsavel a) {

        int posicao = this.listaderesponsaveis.indexOf(a);
        if (posicao >= 0) {
            this.listaderesponsaveis.remove(posicao);
        } else {
            System.out.println("Responsável do paciente não encontrado no prontúario");
        }
    }

    @Override
    public void notificar() {

        verificar();
        
        for(Responsavel obs : listaderesponsaveis){
            
            obs.atualizar();
        
        if((this.temperatura < 36) || (this.temperatura > 39)){
            System.out.println("                ||||||Atenção||||||\n O paciente "+ this.nome+" está com a temperatura de "+ this.temperatura+"ºC\n");
            
        } 
        
        
        if((this.batimentos < 50) || (this.batimentos > 120)){
            System.out.println("                ||||||Atenção||||||\n O paciente "+ this.nome+" está com "+ this.batimentos+" batimentos por minuto.\n");
            
        }
    }
        
    }

    public void verificar() {

        Random temperatura = new Random();
        int valor = temperatura.nextInt(10) + 33;
        Random batimentos = new Random();
        int valor2 = batimentos.nextInt(120) + 40;
        
        this.temperatura = valor;
        this.batimentos = valor2;

    }

}


