package be.intec;

import be.intec.memento.Editor;
import be.intec.memento.History;

public class Main {

    public static void main(String[] args) {

        User user = new User("Rahime");

        user.sayHello();

        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();

        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);

        System.out.println(account.getBalance());

        MailService mailService = new MailService();
        mailService.sendEmail();

        TextBox textBox = new TextBox();
        textBox.enable();

        drawUIcontrol(new TextBox());

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }

    public static void drawUIcontrol(UIControl control){

        control.draw();
    }

    public static TaxCalculator getCalculator() {

        return new TaxCalculator2020();
    }
}
