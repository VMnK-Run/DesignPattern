package Homework02.Adapter.ObjectAdapter;

import Homework02.Adapter.ThirdEncrypt;

public class EncryptorObjectAdaptor extends MyObjectEncryptor{
    private ThirdEncrypt thirdEncrypt;
    @Override
    public void encrypt(String password) {
        thirdEncrypt.thirdEncryptMethod(password);
    }
}
