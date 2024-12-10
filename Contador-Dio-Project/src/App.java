import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o Primeiro numero: ");
        int par1 = scn.nextInt();

        System.out.println("Digite o Segundo numero: ");
        int par2 = scn.nextInt();

        try{
            contar(par1, par2);
        }
        catch(Exception e){
            System.out.println("Numeros Invalidos");
        }
    }
    static void contar(int par1 , int par2) throws ParametrosInvalidosException{
        int contagem = 0 ;
        if(par1 > par2)
            throw new ParametrosInvalidosException();

        for (int i = par1 ; i < par2 ; i++)
            contagem++;

        System.out.println("Contagem : " + contagem);

    }
}
