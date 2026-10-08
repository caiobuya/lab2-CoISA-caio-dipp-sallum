public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoOnlineEsperado;
    // Os atributos estão adequados, mas é bom deixar eles privados por uma questão de segurança.

    public RegistroTempoOnline(String nomeDisciplina){
        this.tempoOnlineEsperado = 120;
        this.nomeDisciplina = nomeDisciplina;
    }
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }
    public void adicionaTempoOnline(int tempoOnline){
        this.tempoOnline += tempoOnline;
    }
    public boolean atingiuMetaTempoOnline(){
        if (this.tempoOnline >= this.tempoOnlineEsperado){return true;}
        else{return false;}
    }
    @Override
    public String toString(){
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
    }
}
