package haedFirst.Observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AngelListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Don't do it");
	}
}
class DevilListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("come on,do it!");
	}
}