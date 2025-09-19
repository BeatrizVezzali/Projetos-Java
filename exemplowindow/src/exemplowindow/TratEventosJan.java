package exemplowindow;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TratEventosJan extends WindowAdapter {
	public void windowClosing(WindowEvent evento) {
		System.exit(0);
	}

}
