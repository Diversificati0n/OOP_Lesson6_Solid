package solid.isp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

// По терминалу мы можем платить через webmoney, по кредитке, но не может платить по номеру телефона
public class TerminalPaymentService implements Payable {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        throw new NotImplementedException();
    }
}
