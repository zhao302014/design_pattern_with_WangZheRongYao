package angle_proxyPattern2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AccountStatus extends Remote {
	public void OnlineStatus() throws RemoteException;
	public void OfflineStatus() throws RemoteException;
}
