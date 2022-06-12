import java.util.ArrayList;
import java.util.List;

public class Matematica {

    public static void main(String[] args) throws FiguraException {

        List<Figura> listaFigura = new ArrayList<Figura>();

        try {
            Figura classeRetangulo = new Retangulo("Retângulo", "Verde", -10, 12);
            listaFigura.add(classeRetangulo);
        } catch (FiguraException | RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Primeiro try/catch");
        }

        try {
            Figura classeCirculo = new Circulo("Círculo", "Vermelho", 4);
            listaFigura.add(classeCirculo);
        } catch (FiguraException | RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Segundo try/catch");
        }

        try {
            Figura classeTriangulo = new Triangulo("Triângulo", "Amarelo", 20, 14);
            listaFigura.add(classeTriangulo);
        } catch (FiguraException | RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terceito try/catch");
        }

        for (Figura x : listaFigura) {
            System.out.println("A figura " + x.getNome() + " tem área igual a: " + String.format("%.3fmm²%n",x.calcularArea()));
        }
    }


}
