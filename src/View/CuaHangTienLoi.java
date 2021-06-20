/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class CuaHangTienLoi {
    
    
    public  CuaHangTienLoi(){
        
        QLNhanSu hang = new QLNhanSu();
        hang.setExtendedState(hang.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }
    public static void main(String[] args) {
        new CuaHangTienLoi();
    }
    
}
