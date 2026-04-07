package com.example.main;

import java.rmi.RemoteException;

import xsd.MNPProtocol.MNPFrame;
import xsd.MNPProtocol.MnpservicePort;

public class Project1 implements MnpservicePort{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Success");
		Project1 project = new Project1();
		xsd.MNPProtocol.MNPFrame frame = new xsd.MNPProtocol.MNPFrame();

        // Displaying the pre-existing version value from the MNPFrame
        try {
            project.send(frame);
        } catch (RemoteException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
		System.out.println();
	}

	@Override
	public void send(MNPFrame param) throws RemoteException {
		// TODO Auto-generated method stub
		  if (param == null) {
	            throw new RemoteException("MNPFrame parameter cannot be null");
	        }

	        // Process the MNPFrame object
	        System.out.println("Processing MNPFrame object:");
	        // Add specific logic here to handle the MNPFrame
	        System.out.println(param.getVersion()); // Replace with actual processing logic
		
	}

}
