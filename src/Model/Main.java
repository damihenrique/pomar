package Model;

import View.Inicial;

public class Main {

    public static void main(String[] args){
        
        Pomar p = new Pomar();
        Inicial inif = new Inicial(p);
        inif.setVisible(true);
        inif.setLocationRelativeTo(null);
    }  
}
