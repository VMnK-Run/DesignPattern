package Homework02.Adapter;

import Homework02.Adapter.ClassAdapter.EncryptorClassAdaptor;
import Homework02.Adapter.ClassAdapter.MyClassEncryptor;
import Homework02.Adapter.ObjectAdapter.EncryptorObjectAdaptor;
import Homework02.Adapter.ObjectAdapter.MyObjectEncryptor;

public class Test {
    public static void main(String[] args) {
        System.out.println("Adapter模式测试");
        MyClassEncryptor classEncryptor = new EncryptorClassAdaptor();
        classEncryptor.encrypt("111");

        MyObjectEncryptor objectEncryptor = new EncryptorObjectAdaptor();
        objectEncryptor.encrypt("222");
    }
}
