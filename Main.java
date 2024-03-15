import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.executar();
        ArrayList<Integer> sampleLista = new ArrayList<Integer>();
        sampleLista.add(34);
        sampleLista.add(34);
        sampleLista.add(12);
        sampleLista.add(12);
        sampleLista.add(3);
        sampleLista.add(35);
        sampleLista.add(10);
        sampleLista.add(3);
        sampleLista.add(4);
        sampleLista.add(4);
        sampleLista.add(11);
        sampleLista.add(10);
        System.out.println(ExBruno.exD(sampleLista));
    }
}