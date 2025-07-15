package springapp.gui;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // XML을 대신할 설정
public class AppConfig {
	
	@Bean
	public JTextField name() {
		return new JTextField(15);
	}
	@Bean
	public JTextField email() {
		return new JTextField(15);
	}
	@Bean
	public JButton bt() {
		return new JButton("버튼");
	}
	
	@Bean
	public MyWin myWin() {
		MyWin win = new MyWin(name(),email(),bt());
		return win;
	}
}
