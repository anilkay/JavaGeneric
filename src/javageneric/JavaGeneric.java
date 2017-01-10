/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javageneric;

import java.util.ArrayList;

/**
 *
 * @author anilkaynar
 */
class calisan <T> {
T maas;
String isim;
}
class Eleman {
int deger;
Eleman e;
    public Eleman() {
        deger=0;
        e=null;
    }
public Eleman(int d) {
        deger=d;
        e=null;
    }
    public Eleman(int deger, Eleman e) {
        this.deger = deger;
        this.e = e;
    }
    

}
class Bagliliste  {
    Eleman en;
    Bagliliste(int basla) {
    en= new Eleman(basla);
    }
    public void ekle(int f) {
        Eleman i=en;
        while(i.e!=null) {
              i=i.e;
        }
            Eleman b= new Eleman(f);
            i.e=b;
    }
    public void sil(int silinecek) {
            Eleman i=en;
            Eleman is=en.e;
            while(is.e!=null) {
            if(is.deger==silinecek) {
              i.e=is.e;
            }
            i=is;
            is=is.e;
            }
    }
}
class Stackk  <T>{
int index=-1;
public ArrayList <T> arr=new ArrayList<T>();;
public void push(T a) {
    arr.add(a);
    index++;
}
public T pop() {
    index--;
return arr.get(index+1);
}
}
public class JavaGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ArrayList a= new ArrayList();
        a.add("anil");
        a.add("kaynar");
        System.out.print(a.get(0));
        calisan <Double> anıl= new calisan();
        anıl.isim="Yanıl";
        anıl.maas=(double)123;
*/
        Stackk <Integer> at= new Stackk<>();
        at.push(17);
        at.push(44);
        at.push(88);
        at.push(33);
        at.push(12);
        int i=4;
        while(i>0) {
        System.out.println(at.pop());
         i--;
        }
       Bagliliste k=new Bagliliste(4);
       k.ekle(66);
       k.ekle(12);
       k.ekle(77);
       k.ekle(1);
       k.sil(77);
       k.ekle(44);
       k.sil(66);
       k.sil(44);
       k.ekle(12);
       while (k.en!=null) {
       System.out.println("Değer"+k.en.deger);
       k.en=k.en.e;
       }
    }
    
}
