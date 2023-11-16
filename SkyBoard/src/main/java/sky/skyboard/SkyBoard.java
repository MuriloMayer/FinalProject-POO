package sky.skyboard;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.UIManager;

public class SkyBoard {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel( new FlatDarculaLaf());
        
        SkyboardPrincipal frame = new SkyboardPrincipal();
        frame.setVisible(true);



    };
}
