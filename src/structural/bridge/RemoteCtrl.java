package structural.bridge;

public  class RemoteCtrl {

	protected Device device;
	
	public RemoteCtrl(Device device) {
		super();
		this.device = device;
	}

	public  void turnOn() {
		device.turnOn();
	}

	public  void turnOff() {
		device.turnOff();
	}
}
