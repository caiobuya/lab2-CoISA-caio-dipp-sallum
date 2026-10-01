public class RegistroResumos {

    private Resumo[] resumos;
    private int posicao;
    private String saidaTemas;

    public RegistroResumos(int numeroDeResumos){
        this.resumos = new Resumo[numeroDeResumos];
        this.posicao = 0;
    }
    public void adiciona(String tema, String conteudo){
        this.resumos[posicao % this.resumos.length] = new Resumo(tema, conteudo);

        posicao++;
    }
    public String[] pegaResumos(){
        String[] tempResumos = new String[conta()];
        for (int i = 0; i < conta(); i++){
            tempResumos[i] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
        }
        return tempResumos;
    }
    public String imprimeResumos(){
        for(int i = 0; i < posicao; i++){
            if(i == 0){this.saidaTemas = this.resumos[i].getTema();}
            else{this.saidaTemas += " | " + this.resumos[i].getTema();}
        }
        return "- " + posicao + " resumo(s) casdatrado(s) \n" + "- " + this.saidaTemas;
    }
    public int conta(){
        if(posicao >= this.resumos.length){return this.resumos.length;}
        else{return posicao;}

    }
    public boolean temResumo(String tema){
        for(int i = 0; i < posicao; i++){
            if(tema.equals(this.resumos[i].getTema())){return true;}
        }
        return false;
    }

}
