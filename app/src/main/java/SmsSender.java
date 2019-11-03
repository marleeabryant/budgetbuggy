import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

    public class SmsSender {
        // Find your Account Sid and Auth Token at twilio.com/console
        public static final String ACCOUNT_SID =
                "ACa8dbbfc6a368aea424d1fb77c74fe7dd";
        public static final String AUTH_TOKEN =
                "ac4cc6c24976c5f0071074f3c0587c82";

        public static void main(String[] args) {
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

            Message message = Message
                    .creator(new PhoneNumber("+13344626430"), // to
                            new PhoneNumber("+12015834890"), // from
                            "Where's Wallace?")
                    .create();

            System.out.println(message.getSid());
        }
    }
}
