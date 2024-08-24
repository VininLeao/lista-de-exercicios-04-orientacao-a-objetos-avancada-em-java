public class Peixe extends AnimalMarinhoAB {
    private int comidaIngerida;
    private int distanciaNadada;
    private int horasDormidas;

    public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Peixe", idade, habitat, altura, peso);
        this.comidaIngerida = 0;
        this.distanciaNadada = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        comidaIngerida += 2;
        System.out.println(nome + " comeu 2 unidades de comida.");
    }

    @Override
    public void moverse() {
        nadar();
    }

    @Override
    public void dormir() {
        horasDormidas += 4;
        System.out.println(nome + " dormiu por 4 horas.");
    }

    @Override
    public void nadar() {
        distanciaNadada += 15;
        System.out.println(nome + " nadou 15 unidades.");
    }
}