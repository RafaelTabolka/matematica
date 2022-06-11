public class Circulo extends Figura{

    private double raio;
    private final double pi = Math.PI;


    public Circulo(String nome, String cor,double raio) throws FiguraException {
        super(nome, cor);
        if (raio % 2 != 0) {
            throw new FiguraException("Os valores do círculo não podem ser ímpares");
        }
        else if (raio <= 0) {
            throw new RuntimeException("Número negativo!");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return pi * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }
}
