package com.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import jakarta.activation.DataHandler;
import jakarta.jws.WebService;

@WebService(endpointInterface = "com.service.AttachmentService")
public class AttachmentServiceImpl implements AttachmentService {

	@Override
	public String uploadFile(String filePath) {
        System.out.println("File path: " + filePath);
        try {
            // Create a File object based on the file path
            File file = new File(filePath);
            
            // Check if the file exists
            if (!file.exists()) {
            	System.out.println("File not found..");
                return "File not found!";
            }

            // Read the file content
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                StringBuilder fileContent = new StringBuilder();
                String line;
                
                //Encrypt and decrypt
                StringBuilder fileEncryptedContent = new StringBuilder();
                KeyGenerator keygenerator
                = KeyGenerator.getInstance("DES");
                SecretKey myDesKey = keygenerator.generateKey();
                // Creating object of Cipher
                Cipher desCipher;
                desCipher = Cipher.getInstance("DES");
     
                while ((line = reader.readLine()) != null) {
                    fileContent.append(line).append("\n");
                    
                    //Encrypt code
                    byte[] text = line.getBytes("UTF8");
                    desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
                    byte[] textEncrypted = desCipher.doFinal(text);
                    String s = new String(textEncrypted);
                    fileEncryptedContent.append(s).append("\n");
                    
                    //Decrypt code
                    desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
                    byte[] textDecrypted
                        = desCipher.doFinal(textEncrypted);
                    s = new String(textDecrypted);
                }
                
                System.out.println("File content : ");
                System.out.println(fileContent.toString());
                downloadFile(fileContent.toString());
                
                System.out.println("File Encryted : ");
                System.out.println(fileEncryptedContent.toString());
                downloadEncryptFile(fileEncryptedContent.toString());
                
                return "File uploaded successfully!";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "File upload failed!";
        }
    }

	
	public String downloadFile(String fileData) {
	    try {
	        String outputFilePath = "downloaded_file.txt"; // You can customize the output file name and path
	        File outputFile = new File(outputFilePath);
	        try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
	            outputStream.write(fileData.getBytes());
	        }
	        System.out.println("File downloaded successfully at: " + outputFilePath);
	        return "File downloaded successfully!";
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "File download failed!";
	    }
	}
	
	public String downloadEncryptFile(String fileData) {
	    try {
	        String outputFilePath = "downloaded_encrypt_file.txt"; // You can customize the output file name and path
	        File outputFile = new File(outputFilePath);
	        try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
	            outputStream.write(fileData.getBytes());
	        }
	        System.out.println("Encypted File downloaded successfully at: " + outputFilePath);
	        return "Encrypted File downloaded successfully!";
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "Encrypted File download failed!";
	    }
	}

}

