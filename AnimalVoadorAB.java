public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadeAsas;
    protected double envergaduraAsa;

    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public void setEnvergaduraAsa(double envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

    public int getQuantidadeAsas() {
        return quantidadeAsas;
    }

    public void setQuantidadeAsas(int quantidadeAsas) {
        this.quantidadeAsas = quantidadeAsas;
    }

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeAsas, double envergaduraAsa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa;
    }

    public abstract void voar();
}