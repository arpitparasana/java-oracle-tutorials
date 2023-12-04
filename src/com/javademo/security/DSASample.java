package com.javademo.security;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;

public class DSASample {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        
        // generate keypair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // sign data
        Signature signature = Signature.getInstance("SHA256withDSA");
        signature.initSign(keyPair.getPrivate());
        byte[] data = "Hello World with Digital Signature!!".getBytes();
        signature.update(data);
        byte[] digitalSignature = signature.sign();

        // verify signature
        signature.initVerify(keyPair.getPublic());
        signature.update(data);
        boolean verified = signature.verify(digitalSignature);

        System.out.println("Digital signature verified: " + verified);

    }
}
