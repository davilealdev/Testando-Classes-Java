import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lutador davi = new Lutador();
        davi.nome = "Davi";
        davi.idade = 18;
        davi.forca = 1200;

        System.out.println(davi.nome + " é o lutador! ele tem " + davi.idade + " Anos"  );

        System.out.print(davi.nome + " tem " + davi.forca + " de Força "  );
        if(davi.forca <= 300 ){
            System.out.println("Logo " + davi.nome + " é Fraco");
        } else if (davi.forca <= 500 ){
            System.out.println("Logo Sua Força é Média");
        }
        else if (davi.forca <= 900){
            System.out.println("Logo " + davi.nome + " é Muito Forte");
        } else {
            System.out.println("Logo ele é um Deus");
        }

        System.out.println("Você quer Atacar? [Y/N]");
        String attack = scanner.nextLine();
        if (attack.equals("Y") || attack.equals("y") ){
            davi.atacar();
        }

    scanner.close();
    }
}

class Lutador{
    String nome;
    int idade;
    int forca;

    void atacar() {
        System.out.println(nome + " Atacou");
    }

}