/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enesb
 */
package stack;

class node {

    int veri;
    node ileri;

    public node(int veri) {
        this.veri = veri;
        ileri = null;
    }

}

/**
 * stack yapısını integer üzerinden yapar
 */
public class integer {

    private node head;
    private int boyut;

    public integer() {
        head = null;
    }

    /**
     * stack in içi boşmu onu true false şeklinde döndürür
     */
    public boolean boşmu() {
        return boyut == 0;
    }

    /**
     * bu metot veriyi stack e ekler
     */
    public void phus(int veri) {
        node yeni = new node(veri);
        if (!boşmu()) {
            yeni.ileri = head;
        }
        head = yeni;
        boyut++;
    }

    /**
     * bu metot stack den veri siler ve çarıldığı yere gönderiri
     */
    public int pop() {
        boyut--;
        node tmp = head;
        head = tmp.ileri;
        return tmp.veri;
    }

    /**
     * bu metot stack in en tepesindeki veriyi size geri dödürür
     */
    public int peek() {
        return head.veri;
    }

    /**
     * bu metot stack veri yapısının içindeki elaman sayısını döndürür eyer 0
     * dönerse boş demektir
     */
    public int getboyut() {
        return boyut;
    }

    /**
     * verileri gösteriri
     */
    public void see() {
        node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.veri + " ---> ");
            tmp = tmp.ileri;
        }
        System.out.println("null");
    }
}
