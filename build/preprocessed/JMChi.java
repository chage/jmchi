/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;

/**
 * @author chage
 */
public class JMChi extends MIDlet implements javax.microedition.lcdui.CommandListener {
    private void initialize() {
        javax.microedition.lcdui.Display.getDisplay(this).setCurrent(get_helloTextBox());
    }

    public void commandAction(javax.microedition.lcdui.Command command, javax.microedition.lcdui.Displayable displayable) {
        if (displayable == helloTextBox) {
            if (command == exitCommand) {
                javax.microedition.lcdui.Display.getDisplay(this).setCurrent(null);
                destroyApp(true);
                notifyDestroyed();
            }
        }
    }

    private javax.microedition.lcdui.TextBox get_helloTextBox() {
        if (helloTextBox == null) {
            helloTextBox = new javax.microedition.lcdui.TextBox(null, "Chi~ Go Ahead, Make My Day.", 120, 0x0);
            helloTextBox.addCommand(get_exitCommand());
            helloTextBox.setCommandListener(this);
        }
        return helloTextBox;
    }

    private javax.microedition.lcdui.Command get_exitCommand() {
        if (exitCommand == null) {
            exitCommand = new javax.microedition.lcdui.Command("Exit", javax.microedition.lcdui.Command.EXIT,
                    1);
        }
        return exitCommand;
    }
    javax.microedition.lcdui.TextBox helloTextBox;
    javax.microedition.lcdui.Command exitCommand;

    public void startApp() {
	    initialize();
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
