public class ProvaUCB extends ProvaUniversidade {
    public ProvaUCB(double nav1, double nav2) {
        super(nav1, nav2);
    }

    // verificar se o aluno foi aprovado
    public boolean aprovado() {
        return calcularMedia() >= 7;
    }
}
