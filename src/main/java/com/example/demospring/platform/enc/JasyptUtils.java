package com.example.demospring.platform.enc;

import com.ulisesbocchio.jasyptspringboot.encryptor.DefaultLazyEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEByteEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;

public class JasyptUtils {
    public static String encryptPwd(String password, String value, String algorithm) {
        PooledPBEStringEncryptor encryptOr = new PooledPBEStringEncryptor();
        encryptOr.setConfig(cryptOr(password,algorithm));
        String result = encryptOr.encrypt(value);
        return result;
    }

    public static String decyptPwd(String password, String value, String algorithm) {
        PooledPBEStringEncryptor encryptOr = new PooledPBEStringEncryptor();
        encryptOr.setConfig(cryptOr(password,algorithm));
        String result = encryptOr.decrypt(value);
        return result;
    }

    public static SimpleStringPBEConfig cryptOr(String password, String algorithm) {
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(password);
        // StandardPBEByteEncryptor.DEFAULT_ALGORITHM
         config.setAlgorithm(algorithm);

        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        return config;
    }

    public static void main(String[] args) {
        // 加密
        System.out.println(encryptPwd("e9fbdb234534", "ZZB@sales_user_123!@#"
                ,StandardPBEByteEncryptor.DEFAULT_ALGORITHM ));
        // 解密
//     System.out.println(decyptPwd("e9fbdb2d3b21", "dcIXZ2hXkcuzbVwTjgOFoiYbeNtVUMtF9uzZZG7SQ0k="));
    }
}
