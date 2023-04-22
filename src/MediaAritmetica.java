public class MediaAritmetica implements ICalcMedia {
    @Override
    public double calcularMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }

    @Override
    public boolean verificarAprovacao(double media) {
        return media >= 5.0;
    }
}
