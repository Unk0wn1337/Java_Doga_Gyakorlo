package hu.szamalk.model;

import java.util.*;

public class Feladat {
    private ArrayList<String> lista;
    private String[] tomb;
    private static Scanner sc = new Scanner(System.in);

    public Feladat() {
        this.lista = new ArrayList<>();
        this.tomb = new String[15];
    }

    public Feladat(int tombNagysaga) {
        this.tomb = new String[tombNagysaga];
        this.lista = new ArrayList<>();

    }

    public void bekeres(){
        System.out.println("adjon betűt");
        String s = sc.nextLine();
        tomb[0] = s;
        lista.add(s);
        for(int i = 1; i < 15; i++){
            System.out.println("adj masikat betűt");
            s= sc.nextLine();
            tomb[i] = s;
            lista.add(s);
        }

    }
    public void kiirLista(){
        String s = "";
        for(int i = 0; i < lista.size(); i++){
            if(i == lista.size()-1){
                s += lista.get(i);
            } else{
                s += lista.get(i)+"-";
            }
        }
        System.out.println(s);

    }

    public void kiirTomb(){
        String s = "";
        for(int i = 0; i < tomb.length; i++){
            if(i == tomb.length-1){
                s += tomb[i];
            } else{
                s += tomb[i]+"-";
            }
        }
        System.out.println(s);
    }

    public void amitTartalmaz(){
        String s = "";
        HashSet<String> db = new HashSet<>();
        for(String a : lista){
            db.add(a);
        }
        System.out.println(db);

    }
    public void sorbaRendez(){
        String s = "";
        TreeSet<String> db = new TreeSet<>();
        for(String a : lista){
            db.add(a);
        }
        System.out.println(db);

    }
    public void elofordulasSzamolas(){
        HashMap<String, Integer> db = new HashMap<>();
        for(String a : lista){
            db.put(a, db.getOrDefault(a,0)+1);
        }
        System.out.println(db);
    }





}
