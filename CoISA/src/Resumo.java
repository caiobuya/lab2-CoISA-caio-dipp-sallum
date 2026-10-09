public class Resumo {

    private String tema;
    private String conteudo;

    /**
     * Contrói um resumo com tema e conteúdo.
     *
     * @param tema o tema do resumo.
     * @param conteudo o conteúdo do resumo.
     */
    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna em texto o tema do resumo.
     *
     * @return em String o tema.
     */
    public String getTema(){return this.tema;}

    /**
     * Retorna em texto o conteudo.
     *
     * @return em String o conteudo.
     */
    public String getConteudo(){return this.conteudo;}
}
