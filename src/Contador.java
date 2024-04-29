import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();//Requisita ao usuário o primeiro número
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();//Requisita ao usuário o segundo número

        try {
            contar(parametroUm, parametroDois);//tenta relaziar o método de contar, caso os parâmetros esperados estejam corretos

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage()); //Caso os parâmetros não estejam corretos, irá lançar a exceção personalizada
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //Método para validar se parametroUm é maior que parametroDois, se isso ocorrer ele irá lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        //Método para realizar o for e imprimir os números com base na variável contagem
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }

    }
}
