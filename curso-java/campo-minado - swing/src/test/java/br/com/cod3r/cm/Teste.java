package test.java.br.com.cod3r.cm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Teste {

    @Test
    public void testarSeIgualADois(){
        int a = 1 + 1;
        assertEquals(2,a);
    }

    @Test
    public void testarSeIgualATres(){
        int a =2 + 10 - 9;
        assertEquals(3,a);
    }

}