package Br.Com.ByteBank.Banco.Teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Br.Com.ByteBank.Banco.Modelo.Cliente;
import Br.Com.ByteBank.Banco.Modelo.ContaCorrente;

public class TesteSeriallizacao {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Lucas Kato");
        cliente.setProfissao("Dev");
        cliente.setCpf("2345678911");
        // String nome = "Lucas Kato";

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
