public class Descanso {
    private int horas;
    private int semanas;
    /**
     * Constrói uma rotina de descanso.
     * O descanso começa com 0 horas descansadas e 0 semanas.
     */
    public Descanso(){
        this.horas = 0;
        this.semanas = 0;
    }
    /**
     * Define as horas descansadas ao longo da semana(s).
     *
     * @param horas as horas descansadas.
     */
    public void defineHorasDescanso(int horas){
        this.horas = horas;
    }
    /**
     * Define ao longo de quantas semanas as horas foram descansadas.
     *
     * @param semanas o período analisado, em semanas.
     */
    public void defineNumeroSemanas(int semanas){
        this.semanas = semanas;
    }
    /**
     * Retorna a String que representa se houve descanso suficiente ou não ao
     * longo das semanas.
     *
     * @return a representação em String se está descansado ou cansado.
     */
    public String getStatusGeral(){
        if (((this.semanas == 0) || (this.horas / this.semanas) < 26)){
            return "cansado";
        }else{
            return "descansado";
        }
    }
}