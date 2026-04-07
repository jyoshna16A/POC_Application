package xsd.mnpprotocol;

public class MnpClient implements MnpservicePort{
	
	
	@Override
	public String send(String message) {
		// TODO Auto-generated method stub
		System.out.println("Response from the Soap Ui : " + message);
		return message;
	}
	
	@Override
	public MNPFrame send1(MNPFrame mnpFrame) {
		System.out.println("Version : "  + mnpFrame.getVersion());
		
		return mnpFrame;
	}

}
