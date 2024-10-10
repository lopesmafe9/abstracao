public class Teste {
    public static void main(String[] args) {
        ProvaUCB provaUCB = new ProvaUCB(7.2, 9.0);
        System.out.println("Aluno da UCB: " + (provaUCB.aprovado() ? "Aprovado" : "Reprovado"));

        ProvaFafifo provaFafifo = new ProvaFafifo(5.2, 4.5);
        System.out.println("Aluno da Fafifo: " + (provaFafifo.aprovado() ? "Aprovado" : "Reprovado"));
    }
}
