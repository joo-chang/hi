package anonymous;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonTest extends Frame{
	public ButtonTest() {
		super("익명 클래스 테스트");
		Button btn = new Button("눌러!");
		add(btn);
		setSize(500,500);
		
		addWindowListener(new WindowListener
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonTest();
		
	}
}
