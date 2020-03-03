
package hospitalfantasy;


public class Responsavel implements Observador{

    public String nome;
    public String cargo;
    
    
           
    Responsavel(String nome, String cargo, Paciente paciente){
        this.nome = nome;
        this.cargo = cargo;
        paciente.addResp(this);
        
    }
    
    
    @Override
    public void atualizar() {
        
        System.out.println("||||||||| Informações para o(a) "+ this.cargo +" " + this.nome + " |||||||||\n");
        
    }
    
    
    
}
