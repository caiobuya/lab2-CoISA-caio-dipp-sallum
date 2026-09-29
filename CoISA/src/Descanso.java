public class Descanso {
    private int horas;
    private int semanas;

    public Descanso(){
        this.horas = 0;
        this.semanas = 0;
    }
    public void defineHorasDescanso(int horas){
        this.horas += horas;
    }
    public void defineNumeroSemanas(int semanas){
        this.semanas = semanas;
    }
    public String getStatusGeral(){
        if (this.horas / this.semanas < 26){
            return "cansado";
        }else{
            return "descansado";
        }
    }
}