import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] nota;
    private double valorNota;
    private double notaFinal;
    private int[] pesos;
    private int pesoTotal;

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.nota = new double[]{0, 0, 0, 0};
    }
    public Disciplina(String nomeDisciplina, int quantidadeNotas){
        this.nomeDisciplina = nomeDisciplina;
        this.nota = new double[quantidadeNotas];
        for (int i = 0; i < quantidadeNotas; i++){
            this.nota[i] = 0;
        }
    }
    public Disciplina(String nomeDisciplina, int quantidadeNotas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.pesos = pesos;
        this.nota = new double[quantidadeNotas];
        for (int i = 0; i < quantidadeNotas; i++){
            this.nota[i] = 0;
            this.pesoTotal += this.pesos[i];
        }
    }
    public void cadastraHoras(int horasEstudo){
        this.horasEstudo = horasEstudo;
    }
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

    @Override
    public String toString(){
        if (this.pesos.length != 0){
            return this.nomeDisciplina + " " + this.horasEstudo  + " " + (this.notaFinal / this.pesoTotal) + " " + Arrays.toString(this.nota);}
        else{
            return this.nomeDisciplina + " " + this.horasEstudo  + " " + (this.notaFinal / this.nota.length) + " " + Arrays.toString(this.nota);
        }
    }
}
