package Homework02.Adapter.ClassAdapter;

import Homework02.Adapter.ThirdEncrypt;

public class EncryptorClassAdaptor extends ThirdEncrypt implements MyClassEncryptor {
    @Override
    public void encrypt(String password) {
        thirdEncryptMethod(password);
    }
}
