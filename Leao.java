public class Leao extends AnimalTerrestreAB {
    private int comidaIngerida;
    private int caminhoPercorrido;
    private int horasDormidas;

    public Leao(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, "Leão", idade, habitat, altura, peso, quantidadePatas);
        this.comidaIngerida = 0;
        this.caminhoPercorrido = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        comidaIngerida += 15;
        System.out.println(nome + " comeu 15 unidades de comida.");
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 8;
        System.out.println(nome + " se moveu 8 unidades.");
    }

    @Override
    public void dormir() {
        horasDormidas += 10;
        System.out.println(nome + " dormiu por 10 horas.");
    }
}