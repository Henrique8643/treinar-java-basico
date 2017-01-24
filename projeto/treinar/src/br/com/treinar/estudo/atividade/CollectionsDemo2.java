package br.com.treinar.estudo.atividade;
import java.util.*;

public class CollectionsDemo2 {

   public static void main(String[] args) {
      List<String> a1 = new ArrayList<>();
      a1.add("Bidu");
      a1.add("Maria Selma");
      a1.add("Henrique");      
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);
      
      for (String objeto : a1) {
		System.out.println(objeto.length());
	}

      List l1 = new LinkedList();
      l1.add("Zara");
      l1.add("Mahnaz");
      l1.add("Ayan");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);
   }
}
