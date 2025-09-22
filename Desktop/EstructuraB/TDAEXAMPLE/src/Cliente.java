import java.util.ArrayDeque;
import java.util.Deque;

public class Cliente {

    private int id;
    private String name;
    Deque<String> docs;

    Cliente(int id, String name){
        this.id=id;
        this.name=name;
        docs = new ArrayDeque<>();
    }

    public void addDoocument(String doc){
        docs.push(doc);
    }


    public void attendend(){
        while(!docs.isEmpty()){
            System.out.println("Documentos retirados "+ docs.pop());
        }
    }


}
