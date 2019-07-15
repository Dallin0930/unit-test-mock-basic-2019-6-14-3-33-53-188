package cashregister;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
        //Printer printer =new Printer();
        FakePrinter fakePrinter=new FakePrinter();
        CashRegister  cashRegister= new CashRegister(printer);

        Purchase purchase= new Purchase();
        //when
        cashRegister.process(purchase);
        //then
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {


        //given
        FakePrinter fakePrinter=new FakePrinter();
        FakePurse fakepurse =new FakePurse();

        fakepurse.setStringThat("other");

        CashRegister cashRegister= new CashRegister(fakePrinter);

        //when
        cashRegister.process(fakepurse);
        //then
        Assertions.assertThrows(fakepurse.asString(),fakePrinter.process());





    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
         Printer printer= mock(Printer.class);
         Purchase purchase = mock(Purchase.class);

         when(purchase.asString()).thenReturn("test");
         CashRegister cashRegister= new CashRegister(purchase);
        //when
        cashRegister.process(printer);

        //then
        Assertions.equals()
    }

}
