package contribdesk;

//Criação classe Arquivos
public class Arquivos {
    //Atributos
    private String titulo;
    private String tipo;
    private String status;
    private int downloads;
    
    //Métodos getters e setters
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getStatus(){
    return this.status;
    }
    
    public int getBownloads(){
        return this.downloads;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public void setDownloads(int downloads){
        this.downloads = downloads;
    }
    
    //Método para mostrar
    public void mostrarDados(){
        System.out.println("Arquivo: " + this.titulo);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Status de envio: " + this.status);
        System.out.println("Número de downloads: " + this.downloads);
    }
}
