public class RegistroTempoOnline {
    String nomeDisciplina;
    int tempoOnline;
    int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina){
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
        if (tempoOnline >= tempoOnlineEsperado){
            return true;
        }else {
            return false;
        }
    }
    public String toString(){
        return this.nomeDisciplina + this.tempoOnline + this.tempoOnlineEsperado;
    }
}
