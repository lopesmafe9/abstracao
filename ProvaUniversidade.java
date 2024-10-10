public class ProvaUniversidade {
    private double nav1;
    private double nav2;

    // Construtor
    public ProvaUniversidade(double nav1, double nav2) {
        this.nav1 = nav1;
        this.nav2 = nav2;
    }

    // calcular a média
    public double calcularMedia() {
        return (getNav1() + getNav2()) / 2;
    }

    /**
     * @return the nav1
     */
    public double getNav1() {
        return nav1;
    }

    /**
     * @return the nav2
     */
    public double getNav2() {
        return nav2;
    }
}
