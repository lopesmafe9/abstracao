public class ProvaFafifo extends ProvaUniversidade {
    public ProvaFafifo(double notaAV1, double notaAV2) {
        super(notaAV1, notaAV2);
    }

    //verificar se o aluno foi aprovado
    public boolean aprovado() {
        return calcularMedia() >= 6;
    }
}
