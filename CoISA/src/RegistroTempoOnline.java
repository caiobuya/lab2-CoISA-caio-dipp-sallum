public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoOnlineEsperado;

    /**
     * Constrói um registro com o nome da disciplina.
     * O registro começa com 120 horas esperadas de estudo e 0 horas investidas.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina){
        this.tempoOnlineEsperado = 120;
        this.tempoOnline = 0;
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * Constrói um registro com o nome da disciplina e o tempo online esperado.
     * O registro começa com o tempo online de 0 horas.
     *
     * @param nomeDisciplina o nome da disciplina.
     * @param tempoOnlineEsperado o tempo online esperado.
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * Adiciona o tempo online no registro.
     *
     * @param tempoOnline o tempo online.
     */
    public void adicionaTempoOnline(int tempoOnline){
        this.tempoOnline += tempoOnline;
    }

    /**
     * Retorna se a meta de tempo online esperado foi atingido.
     *
     * @return um boolean indicando se a meta foi atingida.
     */
    public boolean atingiuMetaTempoOnline(){
        if (this.tempoOnline >= this.tempoOnlineEsperado){return true;}
        else{return false;}
    }

    /**
     * Retorna a representação em texto do registro.
     * A representação segue o formato "NOME_DA_DISCIPLINA TEMPO_ONLINE/TEMPO_ONLINE_ESPERADO".
     *
     * @return a representação em String do registro.
     */
    @Override
    public String toString(){
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
    }
}
