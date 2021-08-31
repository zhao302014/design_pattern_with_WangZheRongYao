package angle_proxyPattern2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
	public static int flag = 0;
	public static void main(String[] args){
		new Thread(new Runnable() {
			public void run() {
				try {
					AccountStatus accountStatus;
					accountStatus = (AccountStatus)Naming.lookup("rmi://127.0.0.1:9090/AccountStatusHelper");
					accountStatus.OnlineStatus();
					Thread.sleep(1000);
					if(flag == 1) {
						accountStatus.OfflineStatus();
					}
				} catch (NotBoundException | MalformedURLException | RemoteException | InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}).start();
		System.out.println("玩家2通过QQ登陆王者荣耀");
		flag = 1;
	}
}