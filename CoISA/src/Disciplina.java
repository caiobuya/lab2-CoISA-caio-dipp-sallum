public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] nota;
    private double valorNota;
    private double notaFinal;

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.nota = new double[]{0, 0, 0, 0};
    }
    public void cadastraHoras(int horasEstudo){
        this.horasEstudo = horasEstudo;
    }
    public void cadastraNota(int nota, double valorNota){
        this.valorNota = valorNota;
        this.nota[nota] = (double) this.valorNota;
    }
    public boolean aprovado(){
        for(int i = 0; i < 4; i ++){
            this.notaFinal += this.nota[i];
        }
        if(this.notaFinal / 4 >= 7){return true;}
        else{return false;}
    }
    public String toString(){
        return this.nomeDisciplina + this.horasEstudo + (this.notaFinal / 4) + this.nota;
    }
}
