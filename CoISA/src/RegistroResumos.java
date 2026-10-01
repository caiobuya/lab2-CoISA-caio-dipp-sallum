public class RegistroResumos {
    private String tema;
    private String conteudo;
    private String[] resumosGuardados;
    private int tamanho;
    private int j;
    private String resumo;
    private String[] guardaTema;
    private String saidaTemas;

    public RegistroResumos(int numeroDeResumos){
        this.tamanho = numeroDeResumos;
        this.resumosGuardados = new String[tamanho];
        this.guardaTema = new String[tamanho];
    }
    public void adiciona(String tema, String conteudo){
        this.resumo = tema + ": " + conteudo;
        this.resumosGuardados[j] = this.resumo;
        this.guardaTema[j] = tema;

        if(j < tamanho){j++;} else{j = 0;}
    }
    public String[] pegaResumos(){
        return this.resumosGuardados;
    }
    public String imprimeResumos(){
        for(int i = 0; i < j; i++){
            if(i == 0){this.saidaTemas = this.guardaTema[i];}else{this.saidaTemas += " | " + this.guardaTema[i];}
        }
        return "- " + j + " resumo(s) casdatrado(s) \n" + "- " + this.saidaTemas;
    }
    public int conta(){
        return j;
    }
    public boolean temResumo(String tema){
        for(int i = 0; i < j; i++){
            if(tema.equals(this.guardaTema[i])){return true;}
        }
        return false;
    }

}
