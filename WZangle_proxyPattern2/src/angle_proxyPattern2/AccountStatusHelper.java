package angle_proxyPattern2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class AccountStatusHelper extends UnicastRemoteObject implements AccountStatus {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private boolean Online = false;

	public AccountStatusHelper(boolean _Online) throws RemoteException {
		this.Online = _Online;
	}
	
	@Override
	public void OnlineStatus() throws RemoteException {
		System.out.println("���1��ʹ���˺���Ϸ�С���");
	}

	@Override
	public void OfflineStatus() throws RemoteException {
		System.out.println("���1�˳�������ҫ�˺ţ�");
	}

}