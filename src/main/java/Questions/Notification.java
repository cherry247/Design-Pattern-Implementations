package Questions;

/* A NotificationService can send alerts via Email, SMS, or Push notification. 
The sending strategy should be swappable at runtime — without changing NotificationService code.
 Add a new WhatsApp strategy without touching existing classes. */

interface NotificationStrategry {

    void sendMessage(String message, String recipent);
    
}


class Email implements NotificationStrategry {

    public void sendMessage(String mesg, String sent){
        System.out.println("Email to " + sent + ": " + mesg);
    }
}

class SMS implements NotificationStrategry {

    public void sendMessage(String mesg, String sent){
        System.out.println("SMS to " + sent + ": " + mesg);
    }
}

class NotificationService{

    private NotificationStrategry notificationStrategry;

    public void setStrategy(NotificationStrategry notificationStrategry){
        this.notificationStrategry = notificationStrategry;
    }

    public void notify(String msg, String to){
        notificationStrategry.sendMessage(msg, to);
    }
}

class notification{
    public static void main(String[] args) {
        NotificationService ns = new NotificationService();
        ns.setStrategy(new Email());
        ns.notify("blaj blaj blaj","shaili@gmail.com");
    }
}

