package contribdesk;

//Criação classe BancosMicrostock...
//...com herança da classe Arquivos.
public class BancosDeMicrostock extends Arquivos{
    //Atributos
    private String nomeBanco;
    
    //Métodos getters e setters
    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
    
    //Método para mostrar
    public void mostrarDados(){
        System.out.println("Banco de Microstock: " + this.nomeBanco);
        super.mostrarDados();
    }
}
