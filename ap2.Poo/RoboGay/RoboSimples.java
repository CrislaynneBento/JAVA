public class RoboSimples {
    private String nome;
    private int x, y;
    private char direcao;

    public RoboSimples(String nome, int x, int y, char direcao) {
        this.nome = nome;
        this.x = x;
        this.y = y;
        this.direcao = direcao;
    }

    public RoboSimples(String nome) {
        this.nome = nome;
        this.direcao = 'N';
        this.x = 0;
        this.y = 0;
    }

    public RoboSimples() {
        this.nome = "";
        this.direcao = 'N';
        this.x = 0;
        this.y = 0;
    }

    public void mover() {
        mover(1);
    }

    public void mover(int passos) {
        switch (direcao) {
            case 'N':
                y = y + passos;
                break;
            case 'S':
                y = y - passos;
                break;
            case 'O':
                x = x - passos;
                break;
            case 'L':
                x = x + passos;
                break;
        }
    }

    public void mudarDirecao(char novaDirecao) {
        this.direcao = novaDirecao;
    }

    @Override
    public String toString() {
        String saida = "nome: " + nome + "\n" +
                "x: " + x + "\n" +
                "y: " + y + "\n" +
                "direcao: " + direcao + "\n";
        return saida;
    }
}