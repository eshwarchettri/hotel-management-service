package com.collabera.hotelmanagementservice.utility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;
@Component
@Slf4j
public class EncryptionAndDecryption {

    private static final byte[] keyValue =
            new byte[]{'A', 'b', 'c', 'd', 'e', 'f', 'g',
                    'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'};

    public String encrypt(String strToEncrypt) {
        try {
            Key key = new SecretKeySpec(keyValue, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (Exception e) {
            log.error("Error while encrypting: " + e.toString());
        }
        return null;
    }


    public String decrypt(String strToDecrypt) {
        try {
            Key key = new SecretKeySpec(keyValue, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (Exception e) {
            log.error("Error while encrypting: " + e.toString());
        }
        return null;
    }
}
