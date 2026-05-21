package contribdesk;

public class TestArquivos {

    public static void main(String[] args) {
        //Criar objeto BancoDeMicrostock
        BancosDeMicrostock bm = new BancosDeMicrostock();
        
        //Atribuir valores da própria classe
        bm.setNomeBanco("ShutterStock");
        //Atribuir valores através de herança Arquivos
        bm.setTitulo("Flat design Illustration of a Classic Hot Dog");
        bm.setTipo("Vetor .EPS");
        bm.setStatus("Aprovado");
        bm.setDownloads(6);
        
        //Mostrar (precisa se repetir a cada atribuição de dados da mesma classe e atributos)
        bm.mostrarDados();
        System.out.println("");
        
        //Atribuir valores da própria classe
        bm.setNomeBanco("Adobe Stock");
        //Atribuir valores através de herança Arquivos
        bm.setTitulo("Flat design Illustration of a Classic Hot Dog");
        bm.setTipo("Vetor .EPS");
        bm.setStatus("Em análise");
        bm.setDownloads(0);
        
        //Mostrar últimos dados acima
        bm.mostrarDados();
        System.out.println("");
        
        //Atribuir valores da própria classe
        bm.setNomeBanco("ShutterStock");
        //Atribuir valores através de herança Arquivos
        bm.setTitulo("llustration of the top Portion of a Heap of Crispy French Fries in Flat Design");
        bm.setTipo("Vetor .EPS");
        bm.setStatus("Recusado");
        bm.setDownloads(0);
        
        //Mostrar últimos dados acima
        bm.mostrarDados();
        System.out.println("");
        
        //Atribuir valores da própria classe
        bm.setNomeBanco("Adobe Stock");
        //Atribuir valores através de herança Arquivos
        bm.setTitulo("llustration of the top Portion of a Heap of Crispy French Fries in Flat Design");
        bm.setTipo("Vetor .EPS");
        bm.setStatus("Aprovado");
        bm.setDownloads(3);
        
        //Mostrar últimos dados acima
        bm.mostrarDados();
    }
    
}
