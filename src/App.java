// Exemplo de Sobrescrita de Metodo: 
// classe Linguagem; 
class Linguagem{
    public void mostrarInformacao(){
        System.out.println("Her languague is: Italian");
    }
}
// classe Java que herda da classe Linguaguem
class Java extends Linguagem{
    public void mostrarInformacao(){
                System.out.println("Her languague is:Spanish");
                // o metodo eh sobrescrito na linha acima
    }
}
// Classe principal: APP
public class App {
    public static void main(String[] args) throws Exception {
        // instancia o objeto e chama a funcao: 
        Linguagem l1 = new Linguagem();
        l1.mostrarInformacao();

        Java j1 = new Java();
        j1.mostrarInformacao();





    }
}
