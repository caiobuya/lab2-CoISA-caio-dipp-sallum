import java.util.Arrays;

public class RegistroResumos {

    private Resumo[] resumos;
    private int posicao;
    private String saidaTemas;

    /**
     * Contrói um array de tamanho desejado que guarda os resumos.
     *
     * @param numeroDeResumos o número de resumos que podem ser guardados.
     */
    public RegistroResumos(int numeroDeResumos){
        this.resumos = new Resumo[numeroDeResumos];
        this.posicao = 0;
    }

    /**
     * Cria um resumo com tema e conteúdo que será adicionado no array resumos.
     *
     * @param tema o tema do resumo.
     * @param conteudo o conteúdo do resumo.
     */
    public void adiciona(String tema, String conteudo){
        this.resumos[posicao % this.resumos.length] = new Resumo(tema, conteudo);

        posicao++;
    }

    /**
     * Retorna um array de texto dos resumos guardados.
     * Segue o formato "TEMA: CONTEÚDO"
     *
     * @return um array de String dos temas e conteúdos guardados.
     */
    public String[] pegaResumos(){
        String[] tempResumos = new String[conta()];
        for (int i = 0; i < conta(); i++){
            tempResumos[i] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
        }
        return tempResumos;
    }

    /**
     * Retorna a quantidade de resumos cadastrados e os seus temas.
     * Segue o formato "- QUANTIDADE_DE_RESUMOS resumo(s) cadastrados(s)
     *                  - TEMAS" TEMAS são separados por " | "
     *
     * @return representação em String dos temas e a quantidade de resumos.
     */
    public String imprimeResumos(){
        for(int i = 0; i < posicao; i++){

            if(i == 0){this.saidaTemas = this.resumos[i].getTema();}

            else{this.saidaTemas += " | " + this.resumos[i].getTema();}
        }
        return "- " + conta() + " resumo(s) cadastrado(s) \n" + "- " + this.saidaTemas;
    }

    /**
     * Retorna um inteiro indicando quantos resumos estão guardados.
     *
     * @return int da quantidade de resumo guardados.
     */
    public int conta(){
        if(posicao >= this.resumos.length){return this.resumos.length;}
        else{return posicao;}

    }

    /**
     * Verifica se há um resumo a partir do tema.
     *
     * @param tema o tema do resumo.
     * @return um boolean se o resumo existe ou não.
     */
    public boolean temResumo(String tema){
        for(int i = 0; i < posicao; i++){
            if(tema.equals(this.resumos[i].getTema())){return true;}
        }
        return false;
    }

    /**
     * Retorna um array de texto contendo os temas dos resumos que possuem a
     * palavra chave no conteúdo.
     *
     * @param chaveDeBusca a palavra para procurar.
     * @return um array de String contendo os temas correspondentes.
     */
    public String[] busca(String chaveDeBusca){
        int iTemas = 0;
        String[] tempTemas = new String[conta()];

        for(int i = 0; i < conta(); i++){
        String[] palavrasConteudo = this.resumos[i].getConteudo().split(" ");

            for(String palavra: palavrasConteudo){
                if (palavra.toLowerCase().equals(chaveDeBusca.toLowerCase())){
                    tempTemas[iTemas] = this.resumos[i].getTema();
                    iTemas++;
                }
            }
        }
        String[] out = new String[iTemas];
        for(int i = 0; i < iTemas; i++){out[i] = tempTemas[i];}
        Arrays.sort(out);
        return out;
    }
}
