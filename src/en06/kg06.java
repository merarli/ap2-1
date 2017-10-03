package en06;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by C0116289 on 2017/05/22.
 */
public class kg06 extends JFrame{
    private JButton button1;
    private JTextArea textArea;

    public kg06() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String text ="iii";
                textArea.append(text+"\n");

            }
        });
    }
}
