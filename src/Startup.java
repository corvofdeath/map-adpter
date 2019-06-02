import adpters.ListMapAdpter;
import adpters.MapListAdpter;

import java.util.ArrayList;
import java.util.HashMap;

public class Startup {

    public static void main(String[] args) {

        MapListAdpter<String> mapAdpter = new MapListAdpter<>(new HashMap<>());
        ListMapAdpter<String> listAdpter = new ListMapAdpter<>(new ArrayList<>());


        listAdpter.put("Key", "Filipe");
        listAdpter.put("Key", "Teste");
        listAdpter.put("Key", "Thiago");

        System.out.println("List->Map Adpter: ");
        System.out.println("Contem valor 'Filipe'? " + listAdpter.containsValue("Filipe"));
        System.out.println("Get: " + listAdpter.get("Teste"));
        System.out.println("Esta vazia? " + listAdpter.isEmpty());
        System.out.println("Remover: " + listAdpter.remove("Thiago"));
        System.out.println("Tamanho: " + listAdpter.size());
        System.out.println("");

        mapAdpter.add("Filipe");
        mapAdpter.add("Thiago");
        mapAdpter.add("Teste");

        System.out.println("Map->List Adpter: ");
        System.out.println("Contem valor 'Filipe'? " + mapAdpter.contains("Filipe"));
        System.out.println("Get: " + mapAdpter.get(1));
        System.out.println("Esta vazia? " + mapAdpter.isEmpty());
        System.out.println("Remover: " + mapAdpter.remove("Thiago"));
        System.out.println("Tamanho: " + mapAdpter.size());
    }
}
