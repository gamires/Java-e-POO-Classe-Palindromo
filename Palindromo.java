import java.util.Scanner;

public class Palindromo {
    private String texto;

    // Construtor padrão
    public Palindromo() {
        this.texto = "";
    }

    // Método para verificar se é palíndromo
    public boolean verificar() {
        String textoLimpo = texto.replace(" ", "").toLowerCase();
        int inicio = 0;
        int fim = textoLimpo.length() - 1;

        while (inicio < fim) {
            if (textoLimpo.charAt(inicio) != textoLimpo.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Palindromo p = new Palindromo();

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = input.nextLine();

        p.texto = entrada; // Atribui diretamente (para simplificar)

        if (p.verificar()) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo.");
        }

        input.close();
    }
}