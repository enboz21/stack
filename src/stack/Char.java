/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author enesb
 */
public class Char {
    
    class node {

        char veri;
        node ileri;

        public node(char veri) {
            this.veri = veri;
            ileri = null;
        }

    }

    private node head;
    private int boyut;

    /**
     * char veri tipinde stack oluşturur
     */
    public Char() {
        head = null;
    }

    /**
     * stack in içi boşmu onu true false şeklinde döndürür
     *
     * @return boolean
     */
    public boolean boşmu() {
        return boyut == 0;
    }

    /**
     * bu metot veriyi stack e ekler
     *
     * @param veri
     */
    public void phus(char veri) {
        node yeni = new node(veri);
        if (!boşmu()) {
            yeni.ileri = head;
        }
        head = yeni;
        boyut++;
    }

    /**
     * bu metot stack den veri siler ve çarıldığı yere gönderiri
     *
     * @return char
     */
    public char pop() {
        boyut--;
        node tmp = head;
        head = tmp.ileri;
        return tmp.veri;
    }

    /**
     * bu metot stack in en tepesindeki veriyi size geri dödürür
     *
     * @return char
     */
    public char peek() {
        return head.veri;
    }

    /**
     * bu metot stack veri yapısının içindeki elaman sayısını döndürür eyer 0
     * dönerse boş demektir
     *
     * @return int(boyut)
     */
    public int getboyut() {
        return boyut;
    }

    /* *
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
