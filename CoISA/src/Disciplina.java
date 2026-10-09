import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] nota;
    private double valorNota;
    private double notaFinal;
    private int[] pesos;
    private int pesoTotal;

    /**
     * Constrói uma Disciplina a partir do nome da disciplina.
     * Toda disciplina começa com quatro notas zero.
     *
     * @param nomeDisciplina o nome da disciplina.
     */
    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.nota = new double[]{0, 0, 0, 0};
    }
    /**
     * Constrói uma Disciplina a partir do nome da disciplina e a quantidade de notas.
     * Toda disciplina começa com notas zero.
     *
     * @param nomeDisciplina o nome da disciplina.
     * @param quantidadeNotas a quantidade de notas.
     */
    public Disciplina(String nomeDisciplina, int quantidadeNotas){
        this.nomeDisciplina = nomeDisciplina;
        this.nota = new double[quantidadeNotas];
        for (int i = 0; i < quantidadeNotas; i++){this.nota[i] = 0;}
    }
    /**
     * Constrói uma Disciplina a partir do nome da disciplina, quantidade de notas e o peso de cada nota.
     * Toda disciplina começa com notas zero.
     *
     * @param nomeDisciplina o nome da disciplina.
     * @param quantidadeNotas a quantidade de notas.
     * @param pesos o peso que cada nota tem.
     */
    public Disciplina(String nomeDisciplina, int quantidadeNotas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.pesos = pesos;
        this.nota = new double[quantidadeNotas];
        for (int i = 0; i < quantidadeNotas; i++){
            this.nota[i] = 0;
            this.pesoTotal += this.pesos[i];
        }
    }
    /**
     * Cadastra por quantas horas aquela disciplina foi estudada.
     *
     * @param horasEstudo as horas de estudo.
     */
    public void cadastraHoras(int horasEstudo){
        this.horasEstudo = horasEstudo;
    }

    /**
     * Cadastra a nota recebida em determinada avaliação.
     *
     * @param nota a avaliação realizada.
     * @param valorNota o nota da avaliação.
     */
    public void cadastraNota(int nota, double valorNota){
        this.valorNota = valorNota;
        if (this.pesos.length != 0){
            this.notaFinal += valorNota * this.pesos[nota - 1];
            this.nota[nota - 1] = (double) this.valorNota * this.pesos[nota - 1];
        }else {
            this.notaFinal += valorNota;
            this.nota[nota - 1] = (double) this.valorNota;
        }
    }
    /**
     * Retorna o Boolean que representa se foi aprovado.
     *
     * @return um boolean se a média atingiu pelo menos 7.
     */
    public boolean aprovado(){
        if (this.pesos.length != 0){
            if (this.notaFinal / this.pesoTotal >= 7){return true;}
            else{return false;}
        }
        else{
            if (this.notaFinal / this.nota.length >= 7) {return true;}
            else {return false;}
        }
    }

    /**
     * Retorna a representação em texto da disciplina.
     * A representação segue o formato "NOME_DA_DISCIPLINA HORAS_DE_ESTUDO MEDIA NOTAS".
     *
     * @return a representação em String da disciplina.
     */
    @Override
    public String toString(){
        if (this.pesos.length != 0){
            return this.nomeDisciplina + " " + this.horasEstudo  + " " + (this.notaFinal / this.pesoTotal) + " " + Arrays.toString(this.nota);}
        else{
            return this.nomeDisciplina + " " + this.horasEstudo  + " " + (this.notaFinal / this.nota.length) + " " + Arrays.toString(this.nota);
        }
    }
}
