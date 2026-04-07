package com.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.service.AttachmentService")
public class ImageServiceImpl implements AttachmentService {

    public String downloadFile(byte[] fileData) {
        try {
            String outputFilePath = "downloaded_image.jpg";  
            
            File outputFile = new File(outputFilePath);
            
            try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
                outputStream.write(fileData); 
            }
            
            System.out.println("Image downloaded successfully at: " + outputFilePath);
            // Return success message
            return "File downloaded successfully!";
            
        } catch (IOException e) {
            e.printStackTrace();
            return "File download failed!";
        }
    }

	@Override
	public String uploadFile(String fileData) {
		System.out.println("File path: " + fileData);
        try {
            File file = new File(fileData);
            if (!file.exists()) {
                System.out.println("File not found..");
                return "File not found!";
            }
            // Read the file content (image) as bytes
            try (FileInputStream fileInputStream = new FileInputStream(file)) {
                byte[] fileBytes = fileInputStream.readAllBytes();
                System.out.println("File content length (in bytes): " + fileBytes.length);
                
                downloadFile(fileBytes);
                return "File uploaded successfully!";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "File upload failed!";
        }
	}

    
}
