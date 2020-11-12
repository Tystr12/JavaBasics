import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyDemoKeyListener implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Key Typed: " + e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		  if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			  
		  } else {
			  System.out.println("no access");
		  }
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Key released: " + e.getKeyChar());

	}

}
