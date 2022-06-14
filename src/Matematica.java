import java.util.ArrayList;
import java.util.List;

public class Matematica {

    public static void main(String[] args) throws FiguraException {

        List<Figura> listaFigura = new ArrayList<Figura>();

        try {
            listaFigura.add(new Retangulo("Retângulo", "Verde", -10, 12));
        } catch (FiguraException | RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Primeiro try/catch");
        }

        try {
            listaFigura.add(new Circulo("Círculo", "Vermelho", 4));
        } catch (FiguraException | RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Segundo try/catch");
        }

        try {
            listaFigura.add(new Triangulo("Triângulo", "Amarelo", 20, 14));
        } catch (FiguraException | RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terceito try/catch");
        }

        System.out.println();
        
        for (Figura x : listaFigura) {
            System.out.println("A figura " + x.getNome() + " tem área igual a: " + String.format("%.3fmm²%n",x.calcularArea()));
        }
    }


}
