public class Gato extends AnimalTerrestreAB {
    private int comidaIngerida;
    private int caminhoPercorrido;
    private int horasDormidas;

    public Gato(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, "Gato", idade, habitat, altura, peso, quantidadePatas);
        this.comidaIngerida = 0;
        this.caminhoPercorrido = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        comidaIngerida += 3;
        System.out.println(nome + " comeu 3 unidades de comida.");
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 5;
        System.out.println(nome + " se moveu 5 unidades.");
    }

    @Override
    public void dormir() {
        horasDormidas += 12;
        System.out.println(nome + " dormiu por 12 horas.");
    }
}