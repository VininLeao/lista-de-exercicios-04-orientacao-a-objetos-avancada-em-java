public class Elefante extends AnimalTerrestreAB {
    private int comidaIngerida;
    private int caminhoPercorrido;
    private int horasDormidas;

    public Elefante(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, "Elefante", idade, habitat, altura, peso, quantidadePatas);
        this.comidaIngerida = 0;
        this.caminhoPercorrido = 0;
        this.horasDormidas = 0;
    }

    public int getComidaIngerida() {
        return comidaIngerida;
    }

    public void setComidaIngerida(int comidaIngerida) {
        this.comidaIngerida = comidaIngerida;
    }

    public int getCaminhoPercorrido() {
        return caminhoPercorrido;
    }

    public void setCaminhoPercorrido(int caminhoPercorrido) {
        this.caminhoPercorrido = caminhoPercorrido;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }

    @Override
    public void comer() {
        comidaIngerida += 50;
        System.out.println(nome + " comeu 50 unidades de comida.");
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 2;
        System.out.println(nome + " se moveu 2 unidades.");
    }

    @Override
    public void dormir() {
        horasDormidas += 6;
        System.out.println(nome + " dormiu por 6 horas.");
    }
}