public abstract class AnimalTerrestreAB extends AnimalAB {
    protected int quantidadePatas;

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadePatas = quantidadePatas;
    }

}
