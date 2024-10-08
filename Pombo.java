public class Pombo extends AnimalVoadorAB {
    private int comidaIngerida;
    private int distanciaVoo;
    private int horasDormidas;

    public Pombo(String nome, int idade, String habitat, double altura, double peso, int quantidadeAsas, double envergaduraAsa) {
        super(nome, "Pombo", idade, habitat, altura, peso, quantidadeAsas, envergaduraAsa);
        this.comidaIngerida = 0;
        this.distanciaVoo = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        comidaIngerida += 1;
        System.out.println(nome + " comeu 1 unidade de comida.");
    }

    public int getComidaIngerida() {
        return comidaIngerida;
    }

    public void setComidaIngerida(int comidaIngerida) {
        this.comidaIngerida = comidaIngerida;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }

    public int getDistanciaVoo() {
        return distanciaVoo;
    }

    public void setDistanciaVoo(int distanciaVoo) {
        this.distanciaVoo = distanciaVoo;
    }

    @Override
    public void moverse() {
        voar();
    }

    @Override
    public void dormir() {
        horasDormidas += 5;
        System.out.println(nome + " dormiu por 5 horas.");
    }

    @Override
    public void voar() {
        distanciaVoo += 20;
        System.out.println(nome + " voou 20 unidades.");
    }
}