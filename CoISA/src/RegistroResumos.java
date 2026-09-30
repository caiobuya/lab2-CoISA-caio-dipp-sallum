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
        this.resumosGuardados[j] = resumo;
        this.guardaTema[j] = tema;

        if(j < tamanho){j++;} else{j = 0;}
    }
    public String[] pegaResumos(){
        return resumosGuardados;
    }
    public String imprimeResumos(){
        for(int i = 0; i < j; i++){
            if(i == 0){this.saidaTemas = guardaTema[i];}else{this.saidaTemas += " | " + guardaTema[i];}
        }
        return "- " + j + " resumo(s) casdatrado(s) \n" + "- " + saidaTemas;
    }
    public int conta(){
        return j;
    }
    public boolean temResumo(String tema){
        for(int i = 0; i < j; i++){
            if(tema.equals(guardaTema[i])){return true;}
        }
        return false;
    }

}
