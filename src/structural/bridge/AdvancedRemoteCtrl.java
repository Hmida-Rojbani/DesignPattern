package structural.bridge;

public class AdvancedRemoteCtrl extends RemoteCtrl{ 
	
	public AdvancedRemoteCtrl(Device device) {
		super(device);

	}

	public void setChannel(int number) {
		device.setChannel(number);
	};

}
