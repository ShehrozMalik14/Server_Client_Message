
import java.util.Scanner;

public class MsgSystem {

    Scanner sc = new Scanner(System.in);

    Contacts [] contact = new Contacts[4];
    static int[] count ;
    Message[][] myMsg ;
    MethodBody m1;

    MsgSystem(){

        contact[0] = new Contacts("03234238205","Hamza");
        contact[1] = new Contacts("03444666213","Shehroz");
        contact[2] = new Contacts("03088999822","Muzamil");
        contact[3] = new Contacts("03364462213","hamas");

        count = new int[contact.length];
        myMsg = new Message[contact.length][500];
        m1 = new MethodBody(this);

    }

    public void sendMsg(String recNo, String content, boolean status) {
        m1.methodSendMsg(recNo, content, status);
    }

    public void contactList() {
        m1.methodContactList();
    }

    public void receiverMsgs() {
        m1.methodReciverMsgs();
    }

    public void statusHistory() {
        m1.methodStatusHistory();
    }

    public void addContact() {
        m1.methodAddContact();
    }

    public void deleteContact() {
        m1.methodDeleteContact();
    }

}
