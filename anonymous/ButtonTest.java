package anonymous;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonTest extends Frame{
	public ButtonTest() {
		super("�͸� Ŭ���� �׽�Ʈ");
		Button btn = new Button("����!");
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
