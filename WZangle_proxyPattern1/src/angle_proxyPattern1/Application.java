package angle_proxyPattern1;

import java.net.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
 
public class Application {
	ImageComponent imageComponent;
	JFrame frame = new JFrame("王者荣耀页面加载模拟");
    JMenuBar menuBar;  
    JMenu menu;   	 
	Hashtable<String, String> cds = new Hashtable<String, String>();
 
	public static void main (String[] args) throws Exception {
		new Application();
	}
 
	public Application() throws Exception{
		cds.put("王者首页", "https://graph.baidu.com/resource/126029c103ffff3795c2c01577338115.jpg");
		cds.put("王者模拟战","https://graph.baidu.com/resource/126cb98ad7a209b65c44701577338030.jpg");
        cds.put("无限乱斗","https://graph.baidu.com/resource/12611c1da836e79b2398701577338223.jpg");
        cds.put("梦境大作战","https://graph.baidu.com/resource/126a905124f61eaabb7ff01577338291.jpg");
        cds.put("火焰山大作战","https://graph.baidu.com/resource/12694ce534e244577a20b01577338346.jpg");
        cds.put("克隆大作战","https://graph.baidu.com/resource/12682b0f434812cf5613a01577338523.jpg");
        cds.put("契约之战","https://graph.baidu.com/resource/126e137611a3bc598acc701577338585.jpg");
 
        URL initialURL = new URL((String)cds.get("王者首页"));

		menuBar = new JMenuBar();
		menu = new JMenu("王者荣耀界面");
        menuBar.add(menu);
        
        frame.setJMenuBar(menuBar);
 
		for(Enumeration<String> e = cds.keys(); e.hasMoreElements();) {
			String name = (String)e.nextElement();
        	JMenuItem menuItem = new JMenuItem(name);
        	menu.add(menuItem); 
        	menuItem.addActionListener(new ActionListener() {
          		  public void actionPerformed(ActionEvent event) {
           		     imageComponent.setIcon(new ImageProxy(getPicUrl(event.getActionCommand())));
					frame.repaint();
           	      }
        	});
		}
 		
 
		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
	}
 
	URL getPicUrl(String name) {
		try {
			return new URL((String)cds.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
