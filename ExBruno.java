import java.util.ArrayList;
public class ExBruno {
   /* 
    * 
      d. Método que retorna uma lista de elementos repetidos de l
        		 ArrayList<Integer> listRepeat(ArrayList< Integer > l)
    */
    public static ArrayList<Integer> exD (ArrayList<Integer> l){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        for(int i = 0; i < l.size(); i++) {
            Integer elemento = l.get(i);
            for(int j = 0; j < l.size(); j++){
                Integer elemento2 = l.get(j);
                if((i != j) && (elemento == elemento2) && (lista.get(i) != null)){
                    lista.add(l.get(i));
                    
                }
            }
        }
        return lista;
    }
}