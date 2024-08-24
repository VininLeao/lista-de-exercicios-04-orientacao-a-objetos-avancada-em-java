public class Cachorro extends AnimalTerrestreAB {
    private int comidaIngerida;
    private int caminhoPercorrido;
    private int horasDormidas;

    public Cachorro(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, "Cachorro", idade, habitat, altura, peso, quantidadePatas);
        this.comidaIngerida = 0;
        this.caminhoPercorrido = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        comidaIngerida += 5;
        System.out.println(nome + " comeu 5 unidades de comida.");
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
    public void moverse() {
        caminhoPercorrido += 10;
        System.out.println(nome + " se moveu 10 unidades.");
    }

    @Override
    public void dormir() {
        horasDormidas += 8;
        System.out.println(nome + " dormiu por 8 horas.");
    }
}