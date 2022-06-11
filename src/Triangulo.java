public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(String nome, String cor, double base, double altura) throws FiguraException {
        super(nome, cor);
        if (base % 2 != 0 || altura % 2 != 0) {
            throw new FiguraException("Os valores do triângulo não podem ser ímpares");
        }
        else if (base <= 0 || altura <= 0) {
            throw new RuntimeException("Valores negativos!");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
